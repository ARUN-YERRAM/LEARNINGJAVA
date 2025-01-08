import java.util.PriorityQueue;

class KnapsackLCNode implements Comparable<KnapsackLCNode> {
    int level;
    int profit;
    int weight;
    double bound;

    KnapsackLCNode(int level, int profit, int weight, double bound) {
        this.level = level;
        this.profit = profit;
        this.weight = weight;
        this.bound = bound;
    }

    @Override
    public int compareTo(KnapsackLCNode other) {
        return Double.compare(other.bound, this.bound); // Max-heap based on bound
    }
}

public class KnapsackLC {
    public static int knapsackLC(int[] profits, int[] weights, int capacity) {
        int n = profits.length;
        PriorityQueue<KnapsackLCNode> pq = new PriorityQueue<>();
        pq.add(new KnapsackLCNode(-1, 0, 0, calculateBound(profits, weights, capacity, -1, 0, 0)));

        int maxProfit = 0;

        while (!pq.isEmpty()) {
            KnapsackLCNode current = pq.poll();

            if (current.level == n - 1 || current.bound <= maxProfit) continue;

            KnapsackLCNode next = new KnapsackLCNode(
                    current.level + 1, current.profit, current.weight,
                    calculateBound(profits, weights, capacity, current.level + 1, current.weight, current.profit)
            );
            pq.add(next);

            int newWeight = current.weight + weights[current.level + 1];
            if (newWeight <= capacity) {
                int newProfit = current.profit + profits[current.level + 1];
                maxProfit = Math.max(maxProfit, newProfit);
                pq.add(new KnapsackLCNode(
                        current.level + 1, newProfit, newWeight,
                        calculateBound(profits, weights, capacity, current.level + 1, newWeight, newProfit)
                ));
            }
        }

        return maxProfit;
    }

    private static double calculateBound(int[] profits, int[] weights, int capacity, int level, int weight, int profit) {
        if (weight >= capacity) return 0;

        double bound = profit;
        int totalWeight = weight;
        for (int i = level + 1; i < profits.length; i++) {
            if (totalWeight + weights[i] <= capacity) {
                totalWeight += weights[i];
                bound += profits[i];
            } else {
                bound += profits[i] * ((double) (capacity - totalWeight) / weights[i]);
                break;
            }
        }
        return bound;
    }

    public static void main(String[] args) {
        int[] profits = {10, 10, 12, 18};
        int[] weights = {2, 4, 6, 9};
        int capacity = 15;

        System.out.println("Maximum profit: " + knapsackLC(profits, weights, capacity));
    }
}
