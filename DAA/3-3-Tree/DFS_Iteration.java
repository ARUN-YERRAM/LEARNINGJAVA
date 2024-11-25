/*DFS graph uisng iteration

The non-recursive implementation of DFS is similar to the non-recursive 
implementation of BFS but differs from it in two ways:

It uses a stack instead of a queue.
The DFS should mark discovered only after popping the vertex, not before pushing 
it.
It uses a reverse iterator instead of an iterator to produce the same results as 
recursive DFS.

The time complexity of DFS traversal is O(V + E), where V and E are the total 
number of vertices and edges in the graph, respectively. 
Please note that O(E) may vary between O(1) and O(V2), depending on how dense 
the graph is.

The space complexity is the maximum size of the stack at any point of time. 
Since this can extend to V slots for a linear graph, the maximum space complexity 
is O(V).


input=
enter number of vertices and edges
6
6
enter edges
0
1
0
2
1
3
2
3
3
4
3
5
enter source for DFS traversal
0
output=
Following is Depth First Traversal:
0 2 3 5 4 1

*/
import java.util.*;

public class DFS_Iteration { // Rename class to match the actual name
    private int V; // No. of vertices
    private LinkedList<Integer>[] adjListArray; // Adjacency List

    // Constructor
    DFS_Iteration(int V) {
        this.V = V;
        adjListArray = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    // Function to add an edge into an undirected graph
    void addEdge(int v, int w) {
        adjListArray[v].add(w);
        adjListArray[w].add(v); // For undirected graph
    }

    // A function used by DFS
    void DFSUtil(int v, boolean visited[]) {
        // Create a stack for DFS
        Stack<Integer> stack = new Stack<>();
        stack.push(v);

        while (!stack.isEmpty()) {
            v = stack.pop();

            // Visit the popped vertex (only if it's not visited)
            if (!visited[v]) {
                System.out.print(v + " ");
                visited[v] = true;
            }

            // Get all adjacent vertices of the popped vertex s
            // If an adjacent has not been visited, push it to the stack
            Iterator<Integer> i = adjListArray[v].listIterator(); // Use listIterator()
            while (i.hasNext()) {
                int n = i.next(); // Use next() instead of previous()
                if (!visited[n]) {
                    stack.push(n);
                }
            }
        }
    }

    // The function to do DFS traversal.
    void DFS(int v) {
        // Mark all the vertices as not visited
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of vertices and edges");
        int V = scanner.nextInt();
        int E = scanner.nextInt();

        DFS_Iteration g = new DFS_Iteration(V); // Use the correct class name

        System.out.println("Enter edges");
        for (int i = 0; i < E; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            g.addEdge(u, v);
        }

        System.out.println("Enter source for DFS traversal");
        int source = scanner.nextInt();

        System.out.println("Following is Depth First Traversal:");
        g.DFS(source);
    }
}