import java.util.*;

public class KruskalMST {
    public static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
        List<Edge> edges = new ArrayList<>();
        List<Edge> mstEdges = new ArrayList<>(); // To store edges of the MST

        // Create the list of all edges
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                int adjNode = adj.get(i).get(j).get(0);
                int wt = adj.get(i).get(j).get(1);
                int node = i;
                edges.add(new Edge(node, adjNode, wt));
            }
        }

        // Sort edges by weight
        Collections.sort(edges);

        // Initialize the Disjoint Set
        DisjointSet ds = new DisjointSet(V);
        int mstWt = 0;

        // Traverse through all sorted edges
        for (Edge edge : edges) {
            int wt = edge.weight;
            int u = edge.src;
            int v = edge.dest;

            // Check if including this edge creates a cycle
            if (ds.findUPar(u) != ds.findUPar(v)) {
                mstWt += wt;
                mstEdges.add(edge); // Add edge to MST
                ds.unionByRank(u, v);
            }
        }
        // Print MST edges
        System.out.println("Edges in the MST:");
        for (Edge e : mstEdges) {
            System.out.println(e.src + " -- " + e.dest + " == " + e.weight);
        }

        return mstWt;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        int[][] edges = {{0, 1, 2}, {0, 2, 1}, {1, 2, 1}, {2, 3, 2}, {3, 4, 1}, {4, 2, 2}};

        // Build adjacency list
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];

            ArrayList<Integer> tmp1 = new ArrayList<>();
            ArrayList<Integer> tmp2 = new ArrayList<>();
            tmp1.add(v);
            tmp1.add(w);

            tmp2.add(u);
            tmp2.add(w);

            adj.get(u).add(tmp1);
            adj.get(v).add(tmp2);
        }

        int mstWt = spanningTree(V, adj);
        System.out.println("The sum of all the edge weights: " + mstWt);
    }
}



class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();

    public DisjointSet(int n) {
        for (int i = 0; i <= n; i++) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }

    public int findUPar(int node) {
        if (node == parent.get(node)) {
            return node;
        }
        int ulp = findUPar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }

    public void unionByRank(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (rank.get(ulp_u) < rank.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
        } else if (rank.get(ulp_v) < rank.get(ulp_u)) {
            parent.set(ulp_v, ulp_u);
        } else {
            parent.set(ulp_v, ulp_u);
            int rankU = rank.get(ulp_u);
            rank.set(ulp_u, rankU + 1);
        }
    }

    public void unionBySize(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (size.get(ulp_u) < size.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
        } else {
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
        }
    }
}

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    Edge(int _src, int _dest, int _wt) {
        this.src = _src;
        this.dest = _dest;
        this.weight = _wt;
    }

    // Comparator for sorting edges by weight
    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }
}



