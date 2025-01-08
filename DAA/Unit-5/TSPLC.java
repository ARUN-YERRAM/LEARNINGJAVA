import java.util.PriorityQueue;

class TSPLCNode implements Comparable<TSPLCNode> {
    int level;
    int cost;
    int bound;
    int[] path;

    TSPLCNode(int level, int cost, int bound, int[] path) {
        this.level = level;
        this.cost = cost;
        this.bound = bound;
        this.path = path.clone();
    }

    @Override
    public int compareTo(TSPLCNode other) {
        return Integer.compare(this.bound, other.bound);
    }
}

public class TSPLC {
    public static int tspLC(int[][] costMatrix) {
        int n = costMatrix.length;
        PriorityQueue<TSPLCNode> pq = new PriorityQueue<>();
        int[] initialPath = new int[n + 1];
        pq.add(new TSPLCNode(0, 0, calculateBound(costMatrix, initialPath, 0), initialPath));

        int minCost = Integer.MAX_VALUE;

        while (!pq.isEmpty()) {
            TSPLCNode current = pq.poll();

            if (current.bound >= minCost) continue;

            if (current.level == n - 1) {
                int tourCost = current.cost + costMatrix[current.path[current.level]][0];
                minCost = Math.min(minCost, tourCost);
                continue;
            }

            for (int i = 0; i < n; i++) {
                if (!visited(i, current.path, current.level)) {
                    int[] newPath = current.path.clone();
                    newPath[current.level + 1] = i;
                    int newCost = current.cost + costMatrix[current.path[current.level]][i];
                    int newBound = calculateBound(costMatrix, newPath, current.level + 1);

                    if (newBound < minCost) {
                        pq.add(new TSPLCNode(current.level + 1, newCost, newBound, newPath));
                    }
                }
            }
        }
        return minCost;
    }

    private static int calculateBound(int[][] costMatrix, int[] path, int level) {
        int bound = 0;
        boolean[] visited = new boolean[costMatrix.length];
        for (int i = 0; i <= level; i++) {
            visited[path[i]] = true;
        }

        for (int i = 0; i < costMatrix.length; i++) {
            if (!visited[i]) {
                int minCost = Integer.MAX_VALUE;
                for (int j = 0; j < costMatrix.length; j++) {
                    if (i != j && !visited[j]) {
                        minCost = Math.min(minCost, costMatrix[i][j]);
                    }
                }
                bound += minCost;
            }
        }
        return bound;
    }

    private static boolean visited(int city, int[] path, int level) {
        for (int i = 0; i <= level; i++) {
            if (path[i] == city) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] costMatrix = {
            {0, 10, 15, 20},
            {10, 0, 35, 25},
            {15, 35, 0, 30},
            {20, 25, 30, 0}
        };

        System.out.println("Minimum cost (LC): " + tspLC(costMatrix));
    }
}
