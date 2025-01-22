/*
You are tasked with building a protective boundary around a series of military camps 
situated along the border, represented as a binary tree structure. 
Each node in this binary tree represents a military camp identified by a unique ID. 
The main base camp is the root of this binary tree, with connections to other camps.

The goal is to help the Indian Army establish a secure boundary (S.H.I.E.L.D) around 
these camps. 
This boundary should be defined by the camps located at the edge of the binary tree, 
traced in an anti-clockwise direction, starting from the root.

The boundary should include:
	-Left Boundary: The camps forming the left edge of the tree, excluding leaf camps.
	-Leaf Nodes: All camps that are leaf nodes, traversed from left to right.
	-Right Boundary: The camps forming the right edge of the tree, excluding the root 
	and leaf camps, added in reverse order.

You need to implement a method that outputs the IDs of the military camps located 
on this boundary.

Input Format:
-------------
Line-1: Space-separated integers representing the IDs of the military camps in 
level order (top to bottom, left to right). Use -1 to denote a null or missing node.

Output Format:
--------------
Line-1: A list of integers representing the military camp IDs that form the 
boundary, in anti-clockwise order.

Constraints:
------------
 * The tree may have between 1 and 10,000 nodes.
 * Camp IDs are unique integers.
 * -1 indicates a missing (null) node.

Sample Input-1:
---------------
Enter values for the tree in level-order (use -1 for null):
5 2 4 7 9 8 1

Sample Output-1:
----------------
Boundary Traversal: [5, 2, 7, 9, 8, 1, 4]

Sample Input-2:
---------------
Enter values for the tree in level-order (use -1 for null):
11 2 13 4 25 6 -1 -1 -1 7 18 9 10

Sample Output-2:
----------------
Boundary Traversal: [11, 2, 4, 7, 18, 9, 10, 6, 13]

Sample Input-3:
---------------
Enter values for the tree in level-order (use -1 for null):
1

Sample Output-3:
----------------
Boundary Traversal: [1]

NOTE:
------
The input should be parsed and constructed into a binary tree, and your code 
should handle large trees efficiently.
The boundary traversal should be handled with care, ensuring leaf nodes are 
only counted once in the output list.
*/
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BoundaryTraversal {
    // Build the binary tree from level-order input
    public static TreeNode buildTree(int[] levelOrder) {
        if (levelOrder.length == 0 || levelOrder[0] == -1) return null;

        TreeNode root = new TreeNode(levelOrder[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (!queue.isEmpty() && i < levelOrder.length) {
            TreeNode current = queue.poll();
            if (levelOrder[i] != -1) {
                current.left = new TreeNode(levelOrder[i]);
                queue.offer(current.left);
            }
            i++;
            if (i < levelOrder.length && levelOrder[i] != -1) {
                current.right = new TreeNode(levelOrder[i]);
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }

    // Check if a node is a leaf
    private static boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    // Get the left boundary excluding leaves
    private static void getLeftBoundary(TreeNode node, List<Integer> boundary) {
        while (node != null) {
            if (!isLeaf(node)) boundary.add(node.val);
            node = (node.left != null) ? node.left : node.right;
        }
    }

    // Get the right boundary excluding leaves in reverse order
    private static void getRightBoundary(TreeNode node, List<Integer> boundary) {
        List<Integer> temp = new ArrayList<>();
        while (node != null) {
            if (!isLeaf(node)) temp.add(node.val);
            node = (node.right != null) ? node.right : node.left;
        }
        Collections.reverse(temp);
        boundary.addAll(temp);
    }

    // Collect all leaf nodes in left-to-right order
    private static void getLeaves(TreeNode node, List<Integer> boundary) {
        if (node == null) return;
        if (isLeaf(node)) {
            boundary.add(node.val);
            return;
        }
        getLeaves(node.left, boundary);
        getLeaves(node.right, boundary);
    }

    // Main function for boundary traversal
    public static List<Integer> boundaryTraversal(TreeNode root) {
        List<Integer> boundary = new ArrayList<>();
        if (root == null) return boundary;

        if (!isLeaf(root)) boundary.add(root.val); // Add root if not a leaf
        getLeftBoundary(root.left, boundary);     // Add left boundary
        getLeaves(root, boundary);                // Add leaf nodes
        getRightBoundary(root.right, boundary);   // Add right boundary

        return boundary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values for the tree in level-order (use -1 for null):");
        String[] input = scanner.nextLine().split(" ");
        int[] levelOrder = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        TreeNode root = buildTree(levelOrder);
        List<Integer> result = boundaryTraversal(root);

        System.out.println("Boundary Traversal: " + result);
    }
}