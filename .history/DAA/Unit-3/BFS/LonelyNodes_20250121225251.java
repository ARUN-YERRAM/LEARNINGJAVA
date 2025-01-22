/*

In a binary tree, a lonely node is a node that is the only child of its parent node. 
The root of the tree is not lonely because it does not have a parent node.
Given the root of a binary tree, return an array containing the values of all lonely nodes in the tree.
Return the list in any order.

Example 1:	
Input: root = [1,2,3,null,4]
Output: [4]
Explanation: Light blue node is the only lonely node.
Node 1 is the root and is not lonely.
Nodes 2 and 3 have the same parent and are not lonely.

 
Example 2:
Input: root = [7,1,4,6,null,5,3,null,null,null,null,null,2]
Output: [6,2]
Explanation: Light blue nodes are lonely nodes. Please remember that order doesn’t matter, 
[2,6] is also an acceptable answer.

 
Example 3:
Input: root = [11,99,88,77,null,null,66,55,null,null,44,33,null,null,22]
Output: [77,55,33,66,44,22]
Explanation: Nodes 99 and 88 share the same parent. Node 11 is the root. All other nodes are lonely.

Example 4:
Input: root = [197]
Output: []
Example 5:
Input: root = [31,null,78,null,28]
Output: [78,28]



case =1
input =2 3 4 -1 5
output =[5]

case =2
input =11 99 88 77 -1 -1 66 55 -1 -1 -1 -1 -1 -1 44
output =[44, 55, 66, 77]

case =3
input =11 99 88 77 -1 -1 66 55 -1 -1 -1 -1 -1 -1 44 33 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 22
output =[22, 33, 44, 55, 66, 77]

case =4
input =7 1 4 6 -1 5 3 -1 -1 -1 -1 -1 2
output =[2, 6]

case =5
input =31 -1 78 -1 -1 -1 28
output =[28, 78]

case =6
input =76
output =[]

*/


import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class LonelyNodes {

    public static List<Integer> findLonelyNodes(TreeNode root) {
        List<Integer> lonelyNodes = new ArrayList<>();
        if (root == null) {
            return lonelyNodes;
        }
        

        dfs(root, lonelyNodes);
        Collections.sort(lonelyNodes);
        return lonelyNodes;
    }

    private static void dfs(TreeNode node, List<Integer> lonelyNodes) {
        if (node == null) {
            return;
        }

        //System.out.println("Visiting node: " + node.val);

        // Check if the node has only one child and add that child to the list
        if (node.left != null && node.right == null) {
            //System.out.println("Lonely node found: " + node.left.val);
            lonelyNodes.add(node.left.val);
        } else if (node.right != null && node.left == null) {
            //System.out.println("Lonely node found: " + node.right.val);
            lonelyNodes.add(node.right.val);
        }

        // performing recursion on the left and right children
        dfs(node.left, lonelyNodes);
        dfs(node.right, lonelyNodes);
    }

    // Method to create a tree from user input
    public static TreeNode createTreeFromInput(Scanner scanner) {
        String[] values = scanner.nextLine().split(" ");
        if (values.length == 0 || values[0].equals("-1")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (i < values.length) {
            TreeNode current = queue.poll();

            // Process left child
            if (i < values.length) {
                if (!values[i].equals("-1")) {
                    TreeNode leftChild = new TreeNode(Integer.parseInt(values[i]));
                    current.left = leftChild;
                    queue.add(leftChild);
                    //System.out.println("  Left child: " + leftChild.val);
                } else {
                    //System.out.println("  Left child: null");
                    queue.add(null);
                }
                i++;
            }

            // Process right child
            if (i < values.length) {
                if (!values[i].equals("-1")) {
                    TreeNode rightChild = new TreeNode(Integer.parseInt(values[i]));
                    current.right = rightChild;
                    queue.add(rightChild);
                    //System.out.println("  Right child: " + rightChild.val);
                } else {
                    //System.out.println("  Right child: null");
                    queue.add(null);
                }
                i++;
            }
        }        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeNode root = createTreeFromInput(scanner);

        List<Integer> result = findLonelyNodes(root);
        System.out.println(result);
        scanner.close();
    }
}