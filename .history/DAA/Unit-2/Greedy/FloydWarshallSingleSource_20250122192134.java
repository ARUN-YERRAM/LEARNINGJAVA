import java.util.*;

public class FloydWarshallSingleSource {

    // Function to implement Floyd-Warshall algorithm for shortest paths
    static int[] floydWarshallSingleSource(int graph[][], int V, int src) {
        int dist[][] = new int[V][V];

        // Step 1: Initialize the distance array
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
            }
        }

        // Step 2: Update distances using intermediate vertices
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE 
                        && dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // Step 3: Check for negative weight cycles
        for (int i = 0; i < V; i++) {
            if (dist[i][i] < 0) {
                System.out.println("Graph contains a negative weight cycle");
                return null;
            }
        }
        
        printSolution(dist, V);
        // Return the distances for the given source vertex
        return dist[src];
    }

    static void printSolution(int dist[][], int V) {
        System.out.println("Shortest distances between every pair of vertices:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (dist[i][j] == Integer.MAX_VALUE) {
                    System.out.print("INF ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 4;  // Number of vertices
        int src = 0; // Source vertex
        int graph[][] = {
            {0, 3, Integer.MAX_VALUE, 7},
            {8, 0, 2, Integer.MAX_VALUE},
            {5, Integer.MAX_VALUE, 0, 1},
            {2, Integer.MAX_VALUE, Integer.MAX_VALUE, 0}
        };

        FloydWarshallSingleSource fw = new FloydWarshallSingleSource();
        int[] result = fw.floydWarshallSingleSource(graph, V, src);

        if (result != null) {
            System.out.println("Shortest distances from source " + src + ":");
            
            for (int i = 0; i < V; i++) {
                System.out.println("To vertex " + i + " \t\t\t " + (result[i] == Integer.MAX_VALUE ? "INF" : result[i]));
            }
        }
    }
}
