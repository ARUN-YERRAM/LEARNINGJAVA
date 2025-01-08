public class OptimalBST {

    // Function to compute the cost of the Optimal Binary Search Tree
    public static int optimalBST(int[] keys, int[] freq, int n) {
        int[][] cost = new int[n + 1][n + 1];

        // Cost for a single key
        for (int i = 0; i < n; i++) {
            cost[i][i] = freq[i];
        }

        // Chain lengths (number of keys in the chain) from 2 to n
        for (int chainLen = 2; chainLen <= n; chainLen++) {
            for (int i = 0; i <= n - chainLen; i++) {
                int j = i + chainLen - 1;
                cost[i][j] = Integer.MAX_VALUE;

                // Sum of frequencies in this range
                int freqSum = sum(freq, i, j);

                // Try all roots and find the minimum cost
                for (int r = i; r <= j; r++) {
                    int c = ((r > i) ? cost[i][r - 1] : 0) + 
                            ((r < j) ? cost[r + 1][j] : 0) + 
                            freqSum;
                    if (c < cost[i][j]) {
                        cost[i][j] = c;
                    }
                }
            }
        }
        return cost[0][n - 1];
    }

    // Function to sum frequencies between low and high indices
    private static int sum(int[] freq, int low, int high) {
        int total = 0;
        for (int i = low; i <= high; i++) {
            total += freq[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int[] keys = {10, 20, 30, 40};
        int[] freq = {3, 3, 1, 1};

        int n = keys.length;
        System.out.println("Cost of Optimal BST is: " + optimalBST(keys, freq, n));
    }
}
