
import java.util.*;

class HamiltonianCycle {
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
    int hamCycle(int graph[][]) {
        path = new int[V];
        Arrays.fill(path, -1);

        // Start the path at vertex 0
        path[0] = 0;

        if (!hamCycleUtil(graph, path, 1)) {
            System.out.println("\nSolution does not exist");
            return 0;
        }

        printSolution(path);
        return 1;
    }

    // Print the Hamiltonian Cycle
    void printSolution(int path[]) {
        System.out.println("Solution Exists: Following is one Hamiltonian Cycle");
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
        HamiltonianCycle obj = new HamiltonianCycle();
        obj.hamCycle(graph);
    }
}
