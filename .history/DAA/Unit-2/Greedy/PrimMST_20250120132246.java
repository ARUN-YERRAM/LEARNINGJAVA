import java.util.*;

class Pair {
    int node;
    int distance;

    public Pair(int distance, int node) {
        this.node = node;
        this.distance = distance;
    }
}

public class PrimMST {
    // Function to find the sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int[] parent) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y) -> x.distance - y.distance);

        int[] vis = new int[V];
        int[] key = new int[V];
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        pq.add(new Pair(0, 0));

        parent[0] = -1; // Root of MST
        int sum = 0;

        while (!pq.isEmpty()) {
            int wt = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            if (vis[node] == 1) continue; // Skip if already visited
            vis[node] = 1; // Mark the node as visited
            sum += wt;

            for (int i = 0; i < adj.get(node).size(); i++) {
                int adjNode = adj.get(node).get(i).get(0);
                int edW = adj.get(node).get(i).get(1);
                if (vis[adjNode] == 0 && edW < key[adjNode]) {
                    key[adjNode] = edW;
                    parent[adjNode] = node; // Update parent of adjNode
                    pq.add(new Pair(edW, adjNode));
                }
            }
        }
        return sum;
    }

    // Function to print the edges of the MST.
    static void printMST(int[] parent, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
        System.out.println("Edges in the MST:");
        for (int i = 1; i < parent.length; i++) {
            for (ArrayList<Integer> edge : adj.get(i)) {
                if (edge.get(0) == parent[i]) {
                    System.out.println("Node " + parent[i] + " - Node " + i + " with weight " + edge.get(1));
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        int[][] edges = {
            {0, 1, 2}, {0, 2, 1}, {1, 2, 1}, {2, 3, 2}, {3, 4, 1}, {4, 2, 2}
        };

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges to the adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            ArrayList<Integer> tmp1 = new ArrayList<>();
            ArrayList<Integer> tmp2 = new ArrayList<>();
            tmp1.add(v);
            tmp1.add(w);

            tmp2.add(u);
            tmp2.add(w);

            adj.get(u).add(tmp1);
            adj.get(v).add(tmp2);
        }

        int[] parent = new int[V];
        int sum = spanningTree(V, adj, parent);
        System.out.println("The sum of all the edge weights: " + sum);
        printMST(parent, adj);
    }
}
