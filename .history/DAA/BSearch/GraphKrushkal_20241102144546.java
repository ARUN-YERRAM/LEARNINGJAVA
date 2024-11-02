


/*
Kruskal's Algorithm
You are given a connected, undirected, and weighted graph with V vertices and 
E edges. 
Your task is to implement Kruskal's Algorithm to find the Minimum Spanning Tree 
(MST) of the given graph. 
The graph is represented using an edge list, where each edge connects two 
vertices with a specific weight.

Kruskal’s Algorithm is a greedy algorithm that sorts all the edges in 
non-decreasing order of their weight and picks the smallest edge, as long as it 
doesn’t form a cycle with the already included edges in the MST. The algorithm 
stops when exactly V-1 edges have been added to the MST.

Input Format:
--------------
Line-1: Two integers V and E, where V is the number of vertices and E is the 
number of edges.
Line-2 to E: Three integers each: u, v, and w, where u is the source vertex, 
v is the destination vertex, and w is the weight of the edge connecting u and v.

Output Format:
---------------
Line-1: An integer, the Minimum Cost of the spanning tree.

Constraints:
------------
*2 ≤ V ≤ 100
*1 ≤ E ≤ V(V-1)/2
*The graph is connected and undirected.
*Weights of the edges are positive integers.

Sample Input-1:
---------------
4 5
0 1 10
0 2 6
0 3 5
1 3 15
2 3 4

Sample Output-1:
----------------
19

Sample Input-2:
---------------
3 3
0 1 1
1 2 2
0 2 3

Sample Output-2:
----------------
3
*/


import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

class DisjointSet {
    int[] parent, rank;

    public DisjointSet(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int u) {
        if (parent[u] != u) {
            parent[u] = find(parent[u]);
        }
        return parent[u];
    }

    public void union(int u, int v) {
        int rootU = find(u);
        int rootV = find(v);
        if (rootU != rootV) {
            if (rank[rootU] > rank[rootV]) {
                parent[rootV] = rootU;
            } else if (rank[rootU] < rank[rootV]) {
                parent[rootU] = rootV;
            } else {
                parent[rootV] = rootU;
                rank[rootU]++;
            }
        }
    }
}

public class Graph{

    public static int kruskalMST(int V, int E, List<Edge> edges) {
        Collections.sort(edges);
        DisjointSet ds = new DisjointSet(V);
        int mstWeight = 0;
        int edgesIncluded = 0;

        for (Edge edge : edges) {
            if (edgesIncluded == V - 1) break;
            int u = edge.src;
            int v = edge.dest;
            if (ds.find(u) != ds.find(v)) {
                ds.union(u, v);
                mstWeight += edge.weight;
                edgesIncluded++;
            }
        }

        return mstWeight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int E = scanner.nextInt();
        List<Edge> edges = new ArrayList<>();

        for (int i = 0; i < E; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            edges.add(new Edge(u, v, w));
        }

        int result = kruskalMST(V, E, edges);
        System.out.println(result);
        scanner.close();
    }
}




