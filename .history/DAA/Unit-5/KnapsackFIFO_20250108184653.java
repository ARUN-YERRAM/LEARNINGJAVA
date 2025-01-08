import java.util.LinkedList;
import java.util.Queue;

class KnapsackNode {
    int level;
    int profit;
    int weight;

    KnapsackNode(int level, int profit, int weight) {
        this.level = level;
        this.profit = profit;
        this.weight = weight;
    }
}

public class KnapsackFIFO {
    public static int knapsackFIFO(int[] profits, int[] weights, int capacity) {
        int n = profits.length;
        Queue<KnapsackNode> queue = new LinkedList<>();
        queue.add(new KnapsackNode(-1, 0, 0));

        int maxProfit = 0;

        while (!queue.isEmpty()) {
            KnapsackNode current = queue.poll();

            if (current.level == n - 1) continue;

            KnapsackNode next = new KnapsackNode(current.level + 1, current.profit, current.weight);
            queue.add(next);

            int newWeight = current.weight + weights[current.level + 1];
            if (newWeight <= capacity) {
                int newProfit = current.profit + profits[current.level + 1];
                queue.add(new KnapsackNode(current.level + 1, newProfit, newWeight));
                maxProfit = Math.max(maxProfit, newProfit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] profits = {10, 10, 12, 18};
        int[] weights = {2, 4, 6, 9};
        int capacity = 15;

        System.out.println("Maximum profit: " + knapsackFIFO(profits, weights, capacity));
    }
}
