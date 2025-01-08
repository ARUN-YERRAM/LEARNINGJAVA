import java.util.*;

public class FIFOBB {
    static class Node {
        String value;
        List<String> path;

        Node(String value, List<String> path) {
            this.value = value;
            this.path = new ArrayList<>(path);
            this.path.add(value);
        }
    }

    public static List<String> fifoBranchAndBound(String start, String goal, Map<String, List<String>> graph) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(start, new ArrayList<>()));

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.value.equals(goal)) {
                return current.path;
            }

            List<String> neighbors = graph.getOrDefault(current.value, new ArrayList<>());
            for (String neighbor : neighbors) {
                if (!current.path.contains(neighbor)) {
                    queue.add(new Node(neighbor, current.path));
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

        List<String> path = fifoBranchAndBound("A", "G", graph);
        System.out.println(path != null ? path : "No path found");
    }
}
