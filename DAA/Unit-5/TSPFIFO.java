import java.util.LinkedList;
import java.util.Queue;

class TSPNode {
    int level;
    int cost;
    int[] path;

    TSPNode(int level, int cost, int[] path) {
        this.level = level;
        this.cost = cost;
        this.path = path.clone();
    }
}

public class TSPFIFO {
    public static int tspFIFO(int[][] costMatrix) {
        int n = costMatrix.length;
        Queue<TSPNode> queue = new LinkedList<>();
        queue.add(new TSPNode(0, 0, new int[n + 1]));

        int minCost = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            TSPNode current = queue.poll();

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
                    queue.add(new TSPNode(current.level + 1, newCost, newPath));
                }
            }
        }
        return minCost;
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

        System.out.println("Minimum cost (FIFO): " + tspFIFO(costMatrix));
    }
}
