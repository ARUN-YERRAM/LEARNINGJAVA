import java.util.ArrayList;
import java.util.List;

public class KnapsackSetMethod {

    static class Pair {
        int value, weight;

        Pair(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    // Function to solve 0/1 Knapsack using Set Representation
    public static int knapsackSetMethod(int[] values, int[] weights, int capacity) {
        List<Pair> currentSet = new ArrayList<>();
        currentSet.add(new Pair(0, 0)); // Initial set with zero value and weight

        for (int i = 0; i < values.length; i++) {
            List<Pair> newSet = new ArrayList<>();
            for (Pair pair : currentSet) {
                int newValue = pair.value + values[i];
                int newWeight = pair.weight + weights[i];

                // Only add the new pair if weight is within capacity
                if (newWeight <= capacity) {
                    newSet.add(new Pair(newValue, newWeight));
                }
            }

            // Merge and purge the sets
            currentSet.addAll(newSet);
            currentSet = mergeAndPurge(currentSet);
        }

        // Find the maximum value from the final set
        int maxValue = 0;
        for (Pair pair : currentSet) {
            maxValue = Math.max(maxValue, pair.value);
        }
        return maxValue;
    }

    // Function to merge and purge dominated states
    private static List<Pair> mergeAndPurge(List<Pair> set) {
        set.sort((a, b) -> a.weight == b.weight ? b.value - a.value : a.weight - b.weight);
        List<Pair> result = new ArrayList<>();

        int maxValue = -1;
        for (Pair pair : set) {
            if (pair.value > maxValue) {
                result.add(pair);
                maxValue = pair.value;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] values = {10, 12, 14, 16};
        int[] weights = {9, 8, 12, 14};
        int capacity = 25;

        System.out.println("Maximum value: " + knapsackSetMethod(values, weights, capacity));
    }
}
