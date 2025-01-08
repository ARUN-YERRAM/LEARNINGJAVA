import java.util.ArrayList;
import java.util.List;

class AllPairsShortestPath {

    // Recursive function to print the path of the given vertex `u` from source vertex `v`
    private static void printPath(int[][] path, int v, int u, List<Integer> route) {
        if (path[v][u] == v) {
            return;
        }
        printPath(path, v, path[v][u], route);
        route.add(path[v][u]);
    }

    // Function to print the shortest cost with path information between all pairs of vertices
    private static void printSolution(int[][] path, int n) {
        for (int v = 0; v < n; v++) {
            for (int u = 0; u < n; u++) {
                if (u != v && path[v][u] != -1) {
                    List<Integer> route = new ArrayList<>();
                    route.add(v);
                    printPath(path, v, u, route);
                    route.add(u);
                    System.out.printf("The shortest path from %d —> %d is %s\n", v, u, route);
                }
            }
        }
    }

    // Function to run the Floyd–Warshall algorithm
    public static void floydWarshall(int[][] adjMatrix) {
        if (adjMatrix == null || adjMatrix.length == 0) {
            return;
        }

        int n = adjMatrix.length;
        int[][] cost = new int[n][n];
        int[][] path = new int[n][n];

        // Initialize cost and path
        for (int v = 0; v < n; v++) {
            for (int u = 0; u < n; u++) {
                cost[v][u] = adjMatrix[v][u];
                if (v == u) {
                    path[v][u] = 0;
                } else if (cost[v][u] != Integer.MAX_VALUE) {
                    path[v][u] = v;
                } else {
                    path[v][u] = -1;
                }
            }
        }

        // Run Floyd–Warshall algorithm
        for (int k = 0; k < n; k++) {
            for (int v = 0; v < n; v++) {
                for (int u = 0; u < n; u++) {
                    if (cost[v][k] != Integer.MAX_VALUE && cost[k][u] != Integer.MAX_VALUE 
                            && (cost[v][k] + cost[k][u] < cost[v][u])) {
                        cost[v][u] = cost[v][k] + cost[k][u];
                        path[v][u] = path[k][u];
                    }
                }

                // Check for negative-weight cycles
                if (cost[v][v] < 0) {
                    System.out.println("Negative-weight cycle found!!");
                    return;
                }
            }
        }

        // Print the shortest path between all pairs of vertices
        printSolution(path, n);
    }

    public static void main(String[] args) {
        // Define infinity
        int I = Integer.MAX_VALUE;

        // Given adjacency matrix representation of the graph
        int[][] adjMatrix = {
            { 0, I, -2, I },
            { 4, 0, 3, I },
            { I, I, 0, 2 },
            { I, -1, I, 0 }
        };

        // Run Floyd–Warshall algorithm
        floydWarshall(adjMatrix);
    }
}
