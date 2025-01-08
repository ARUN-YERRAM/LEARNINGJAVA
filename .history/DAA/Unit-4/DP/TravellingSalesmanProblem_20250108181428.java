import java.util.Arrays;

public class TravellingSalesmanProblem {

    // Define a large constant for infinity
    static final int INF = Integer.MAX_VALUE;

    // Function to solve TSP using dynamic programming
    public static int tsp(int[][] graph, int start) {
        int n = graph.length;
        int VISITED_ALL = (1 << n) - 1;

        // DP table where dp[mask][i] represents the minimum cost to visit all nodes in "mask" ending at node "i"
        int[][] dp = new int[1 << n][n];

        // Initialize dp table with INF
        for (int[] row : dp) {
            Arrays.fill(row, INF);
        }

        // Base case: Starting node
        dp[1 << start][start] = 0;

        // Iterate through all subsets of nodes
        for (int mask = 0; mask < (1 << n); mask++) {
            for (int u = 0; u < n; u++) {
                if ((mask & (1 << u)) != 0) { // If u is in the current subset
                    for (int v = 0; v < n; v++) {
                        if ((mask & (1 << v)) == 0 && graph[u][v] != INF) { // If v is not in the subset
                            int newMask = mask | (1 << v);
                            dp[newMask][v] = Math.min(dp[newMask][v], dp[mask][u] + graph[u][v]);
                        }
                    }
                }
            }
        }

        // Find the minimum cost to return to the starting node
        int minCost = INF;
        for (int u = 0; u < n; u++) {
            if (u != start && graph[u][start] != INF) {
                minCost = Math.min(minCost, dp[VISITED_ALL][u] + graph[u][start]);
            }
        }

        return minCost;
    }

    public static void main(String[] args) {
        // Graph represented as an adjacency matrix
        int[][] graph = {
            {0, 10, 15, 20},
            {10, 0, 35, 25},
            {15, 35, 0, 30},
            {20, 25, 30, 0}
        };

        int startNode = 0;
        System.out.println("The minimum cost is: " + tsp(graph, startNode));
    }
}
