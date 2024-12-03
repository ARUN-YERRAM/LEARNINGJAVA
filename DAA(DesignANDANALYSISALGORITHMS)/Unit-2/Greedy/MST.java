import java.util.*;

public class MST {
    static final int V = 9; // Number of vertices in the graph

    // Utility function to find the vertex with the minimum key value that is not yet included in MST
    int minKey(int key[], Boolean mstSet[]) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // Function to print the constructed MST stored in parent[]
    void printMST(int parent[], int graph[][]) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }

    // Function to construct and print MST for a graph represented using an adjacency matrix representation
    void primMST(int graph[][]) {
        int parent[] = new int[V];  // Array to store the constructed MST
        int key[] = new int[V];     // Key values used to pick minimum weight edge in the cut
        Boolean mstSet[] = new Boolean[V]; // To represent the set of vertices included in MST

        // Initialize all keys as INFINITE and mstSet[] as false
        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(mstSet, false);

        key[0] = 0;  // Make the first vertex the root of the MST
        parent[0] = -1; // First node is always the root of MST

        // The MST will have V vertices
        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mstSet); // Pick the minimum key vertex from the set of vertices not yet included in MST

            mstSet[u] = true; // Add the picked vertex to the MST Set

            // Update key value and parent index of the adjacent vertices of the picked vertex
            for (int v = 0; v < V; v++) {
                // graph[u][v] is non-zero only for adjacent vertices of u
                // mstSet[v] is false for vertices not yet included in MST
                // Update the key only if graph[u][v] is smaller than key[v]
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        // Print the constructed MST
        printMST(parent, graph);
    }

    public static void main(String[] args) {
        MST t = new MST();
        int graph[][] = new int[][]{
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        t.primMST(graph); // Call the primMST function
    }
}
