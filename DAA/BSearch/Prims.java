/*
Prim's Minimum Spanning Tree (MST) Algorithm
You are given an undirected, connected graph with N vertices and M edges, 
represented as an adjacency matrix. 
Your task is to construct the Minimum Spanning Tree (MST) of this graph using 
Prim's algorithm. 
The MST is a subgraph that connects all the vertices together, without any 
cycles, and with the minimum possible total edge weight.

The adjacency matrix of the graph is a 2D array, where graph[i][j] represents 
the weight of the edge between vertex i and vertex j. 
If there is no edge between vertex i and vertex j, the value will be 0.

Your goal is to write a program that reads the adjacency matrix from input and 
outputs the edges in the MST along with their respective weights.

Input Format:
-------------
Line-1: Line-1 contains an integer N, the number of vertices in the graph.
Line-2 to N: Each line contain N integers representing the adjacency matrix of 
the graph.

Output Format:
--------------
Print the edges of the MST and their corresponding weights in the 
format: Vertex1 - Vertex2 Weight.

Sample Input-1:
---------------
5
0 2 0 6 0
2 0 3 8 5
0 3 0 0 7
6 8 0 0 9
0 5 7 9 0

Sample Output-1:
----------------
Edge 	Weight
0 - 1	2
1 - 2	3
0 - 3	6
1 - 4	5

Explanation:
The graph has 5 vertices, and the minimum spanning tree is constructed by 
connecting the vertices with the least total weight.
The algorithm starts from the vertex with the smallest weight and continues 
to add edges with the least cost that connect the remaining unvisited vertices.

Constraints:
-------------
*1 <= N <= 1000
*0 <= weight of edge <= 10^4
*The graph is connected and undirected.
*/


// Prim's Algorithm

import java.util.*;

public class PrimsAlgorithm {

    // Method to find the vertex with the minimum key value not yet included in the MST
    private static int minKey(int[] key, boolean[] mstSet, int n) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < n; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // Method to implement Prim's MST algorithm
    public static void primMST(int[][] graph) {
        int n = graph.length;
        int[] parent = new int[n]; // Array to store the MST
        int[] key = new int[n];    // Key values to pick the minimum weight edge
        boolean[] mstSet = new boolean[n]; // Set of vertices included in the MST

        // Initialize all keys to infinity and mstSet[] to false
        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(mstSet, false);

        // Start from the first vertex
        key[0] = 0;
        parent[0] = -1; // The first node is the root, so it has no parent

        // The MST will have n-1 edges
        for (int count = 0; count < n - 1; count++) {
            int u = minKey(key, mstSet, n);
            mstSet[u] = true;

            // Update key and parent arrays for adjacent vertices
            for (int v = 0; v < n; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        // Print the constructed MST
        System.out.println("Edge \tWeight");
        for (int i = 1; i < n; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the number of vertices
        System.out.println("Enter the number of vertices:");
        int n = scanner.nextInt();

        // Reading the adjacency matrix
        System.out.println("Enter the adjacency matrix:");
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        // Calling Prim's algorithm
        primMST(graph);
    }
}