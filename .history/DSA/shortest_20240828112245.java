import java.util.*;

public class Dijkstra {
    static final long INF = Long.MAX_VALUE; // Representing infinity

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of nodes
        int m = sc.nextInt(); // Number of edges

        // Adjacency list representation of the graph
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // Reading the graph edges
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            adj.get(u).add(new Pair(v, w));
        }

        // Distance array
        long[] dist = new long[n + 1];
        Arrays.fill(dist, INF);
        dist[1] = 0;

        // Priority queue (distance, node)
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingLong(p -> p.distance));

        pq.add(new Pair(1, 0)); // Start from node 1 with distance 0

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            long d = current.distance;
            int u = current.node;

            if (d > dist[u]) continue;

            for (Pair edge : adj.get(u)) {
                int v = edge.node;
                long w = edge.distance;

                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }

        // Output distances
        for (int i = 1; i <= n; i++) {
            if (dist[i] == INF) {
                System.out.print("INF ");
            } else {
                System.out.print(dist[i] + " ");
            }
        }
        System.out.println();
    }

    // Helper class to represent a pair of (node, distance)
    static class Pair {
        int node;
        long distance;

        Pair(int node, long distance) {
            this.node = node;
            this.distance = distance;
        }
    }
}
