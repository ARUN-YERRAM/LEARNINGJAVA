import java.util.*;

public class Dijkstra {

    // Function to find the vertex with minimum distance
    static int minDistance(int dist[], Boolean sptSet[], int V) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int v = 0; v < V; v++) {
            if (!sptSet[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // Function to implement Dijkstra's algorithm
    static void dijkstra(int graph[][], int src, int V) {
        int dist[] = new int[V];  // Array to store the shortest distance from source
        Boolean sptSet[] = new Boolean[V]; // Array to mark vertices included in shortest path tree

        // Initialize all distances as infinity and sptSet[] as false
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(sptSet, false);
        dist[src] = 0;  // Distance from source to source is always 0

        // Find the shortest path for all vertices
        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, sptSet, V);  // Get vertex with minimum distance
            sptSet[u] = true;  // Mark it as processed

            // Update dist value of adjacent vertices
            for (int v = 0; v < V; v++) {
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE  && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        // Print the constructed distance array
        printSolution(dist, V);
    }

    // Utility function to print the constructed distance array
    static void printSolution(int dist[], int V) {
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int V = 9;  // Number of vertices
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

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.dijkstra(graph, 0, V);  // Source vertex is 0
    }
}