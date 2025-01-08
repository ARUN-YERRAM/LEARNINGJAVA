import java.util.*;

public class GeneralBranchAndBound {
    static class Node {
        String value;
        int cost;
        List<String> path;

        Node(String value, int cost, List<String> path) {
            this.value = value;
            this.cost = cost;
            this.path = new ArrayList<>(path);
            this.path.add(value);
        }
    }

    public static List<String> generalBranchAndBound(String start, String goal, Map<String, List<String>> graph, Map<String, Integer> costs, boolean isLC) {
        Queue<Node> queue = isLC ? new PriorityQueue<>(Comparator.comparingInt(node -> node.cost)) : new LinkedList<>();
        queue.add(new Node(start, 0, new ArrayList<>()));

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.value.equals(goal)) {
                return current.path;
            }

            List<String> neighbors = graph.getOrDefault(current.value, new ArrayList<>());
            for (String neighbor : neighbors) {
                if (!current.path.contains(neighbor)) {
                    int newCost = current.cost + costs.getOrDefault(neighbor, 0);
                    queue.add(new Node(neighbor, newCost, current.path));
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("D", "E"));
        graph.put("C", Arrays.asList("F"));
        graph.put("E", Arrays.asList("G"));

        Map<String, Integer> costs = new HashMap<>();
        costs.put("A", 0);
        costs.put("B", 1);
        costs.put("C", 2);
        costs.put("D", 3);
        costs.put("E", 4);
        costs.put("F", 5);
        costs.put("G", 6);

        System.out.println("LC: " + generalBranchAndBound("A", "G", graph, costs, true));
        System.out.println("FIFO: " + generalBranchAndBound("A", "G", graph, costs, false));
    }
}
