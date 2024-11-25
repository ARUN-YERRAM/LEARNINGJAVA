/*1.	Breadth-First Search or BFS Algorithm


You are given an undirected graph represented by vertices and edges. 
Your task is to implement Breadth-First Search (BFS) traversal from a given 
starting vertex. 
The graph is represented using an adjacency list, and you need to traverse 
the graph starting from a specified vertex.

Input Format:
--------------
Line-1: An integer V, the number of vertices.
Line-2: An integer E, the number of edges.
Line-3 to E: The next E lines contain two integers source and destination, 
representing an edge between the two vertices in the graph.
Line-E+1: The starting vertex S from which BFS traversal should begin.

Output Format:
---------------
Line-1: Print the vertices visited in BFS order starting from the given vertex S.

Constraints:
------------
*1 ≤ V ≤ 100
*0 ≤ E ≤ V * (V - 1)
*0 ≤ source, destination, S < V

Sample Input-1:
---------------
5
8
0 1
0 4
1 0
1 2
1 3
1 4
2 3
3 4
0

Sample Output-1:
-----------------
0 1 4 2 3 

Sample Input-1:
---------------
4
4
0 1
0 2
1 3
2 3
2

Sample Output-2:
----------------
2 0 3 1 
*/

import java.util.*;

public class Bffs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int v = sc.nextInt();  
        int e = sc.nextInt(); 
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v + 1);
        for (int i = 0; i <= v; i++)
            adj.add(new ArrayList<>());
        
        
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        
        int start = sc.nextInt(); 
        
        int[] vis = new int[v + 1];
        Arrays.fill(vis, -1);

        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        vis[start] = 1;
        
        System.out.print(start + " ");
        
        while (!q.isEmpty()) {
            int ele = q.poll();
            
            for (int it : adj.get(ele)) {
                if (vis[it] == -1) {
                    q.offer(it);
                    vis[it] = 1;
                    System.out.print(it + " ");
                }
            }
        }
    }
}

