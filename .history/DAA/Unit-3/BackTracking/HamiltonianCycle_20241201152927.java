/*Hamiltonian Cycle or Circuit in a graph G is a cycle that visits every vertex 
of G exactly once and returns to the starting vertex.

->If graph contains a Hamiltonian cycle, it is called Hamiltonian graph otherwise 
it is non-Hamiltonian.
->Finding a Hamiltonian Cycle in a graph is a well-known NP-complete problem, 
which means that there’s no known efficient algorithm to solve it for all types 
of graphs. However, it can be solved for small or specific types of graphs.
->The Hamiltonian Cycle problem has practical applications in various fields, 
such as logistics, network design, and computer science.
   
->Hamiltonian Path in a graph G is a path that visits every vertex of G exactly 
once and Hamiltonian Path doesn’t have to return to the starting vertex. 
It’s an open path.
  
  
case=1
input=
5                                                                                                                       
0 1 0 1 0                                                                                                               
1 0 1 1 1                                                                                                               
0 1 0 0 1                                                                                                               
1 1 0 0 1                                                                                                               
0 1 1 1 0
output=
0 1 2 4 3 0  

case=2
input=
5                                                                                                                       
0 1 0 1 0                                                                                                               
1 0 1 1 1                                                                                                               
0 1 0 0 1                                                                                                               
1 1 0 0 0                                                                                                               
0 1 1 0 0                                                                                                               
output=                                                                                                                      
No Solution                                                                                            

  
*/

import java.util.*;

class Test {
    static int V; // Number of vertices
    int path[];

    // Check if vertex v can be added to the Hamiltonian Cycle
    boolean isSafe(int v, int graph[][], int path[], int pos) {
        // Check if v is adjacent to the last vertex in the path
        if (graph[path[pos - 1]][v] == 0)
            return false;

        // Check if v is already included in the path
        for (int i = 0; i < pos; i++)
            if (path[i] == v)
                return false;

        return true;
    }

    // Utility function to solve the Hamiltonian Cycle problem
    boolean hamCycleUtil(int graph[][], int path[], int pos) {
        // Base case: All vertices are included in the path
        if (pos == V) {
            // Check if the last vertex is connected to the first vertex
            return graph[path[pos - 1]][path[0]] == 1;
        }

        // Try different vertices as the next candidate
        for (int v = 1; v < V; v++) {
            if (isSafe(v, graph, path, pos)) {
                path[pos] = v;

                // Recursively build the rest of the path
                if (hamCycleUtil(graph, path, pos + 1))
                    return true;

                // Backtrack if adding vertex v doesn't lead to a solution
                path[pos] = -1;
            }
        }
        return false; // No vertex can be added to the path
    }

    // Main function to solve the Hamiltonian Cycle problem
    boolean hamCycle(int graph[][]) {
        path = new int[V];
        Arrays.fill(path, -1);

        // Start the path at vertex 0
        path[0] = 0;

        if (!hamCycleUtil(graph, path, 1)) {
            System.out.println("No Solution");
            return false;
        }

        printSolution(path);
        return true;
    }

    // Print the Hamiltonian Cycle
    void printSolution(int path[]) {
        for (int i = 0; i < V; i++)
            System.out.print(path[i] + " ");
        // Print the first vertex again to complete the cycle
        System.out.println(path[0]);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input number of vertices
        V = sc.nextInt();
        int graph[][] = new int[V][V];

        // Input the adjacency matrix
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                graph[i][j] = sc.nextInt();

        // Create an object and solve the problem
        Test obj = new Test();
        obj.hamCycle(graph);
    }
}

