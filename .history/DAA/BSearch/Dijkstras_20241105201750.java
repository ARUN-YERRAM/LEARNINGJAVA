/*
Shortest Paths Using Dijkstra's Algorithm
Given a directed graph represented by an adjacency matrix, where each entry graph[i][j] represents the weight of the edge from vertex i to vertex j. If graph[i][j] is 0, it means there is no direct edge between i and j.

Your task is to determine the shortest paths from a given source vertex to all other vertices using Dijkstra’s algorithm.

Input Format:
-------------
Line-1: An integer N, representing the number of vertices in the graph.
Next-N lines: Each line contains N space-separated integers representing the adjacency matrix graph.
Last-line: An integer src, representing the source vertex.

Output Format:
--------------
A line that says: "Vertex 		Distance from Source".
Followed by N lines, each containing the vertex number and its shortest distance from the source.

Constraints:
------------
*1 <= N <= 100
*0 <= graph[i][j] <= 1000
*0 <= src < N
*All weights are non-negative integers.

Sample Input-1:
---------------
5
0 6 5 0 13
6 0 12 9 5
5 12 0 0 0
0 9 0 0 7
13 5 0 7 0
2

Sample Output-1:
----------------
Vertex           Distance from Source
0                5
1                11
2                0
3                20
4                16

Sample Input-2:
---------------
9
0 4 0 0 0 0 0 8 0
4 0 8 0 0 0 0 11 0
0 8 0 7 0 4 0 0 2
0 0 7 0 9 14 0 0 0
0 0 0 9 0 10 0 0 0
0 0 4 14 10 0 2 0 0
0 0 0 0 0 2 0 1 6
8 11 0 0 0 0 1 0 7
0 0 2 0 0 0 6 7 0
5

Sample Output-2:
----------------
Vertex           Distance from Source
0                11
1                12
2                4
3                11
4                10
5                0
6                2
7                3
8                6
*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Da
{
/* A utility function to find the vertex with minimum distance value, from the set of
vertices not yet included in shortest path tree */
private int V;
        int minDistance(int dist[], Boolean sptSet[])
        {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;
        for (int v = 0; v < V; v++)
        {
        if (sptSet[v] == false && dist[v] <= min)
        {
        min = dist[v];
        min_index = v;
        }
}
        return min_index;
}
// A utility function to print the constructed distance array
// Print the constructed distance array
void printSolution(int dist[], int src)
    {
    System.out.println("Vertex \t Distance from Source " + src);
    for (int i = 0; i < V; i++)
    System.out.println(i + " \t " + dist[i]);
    }
    /* Function that implements Dijkstra's single source shortest path algorithm for a graph
    represented using adjacency matrix representation*/
void dijkstra(int graph[][], int src)
    {
    int dist[] = new int[V]; // The output array. dist[i] will hold
    /* the shortest distance from src to i.
    sptSet[i] will true if vertex i is included in shortest path tree or shortest distance
    from src to i is finalized */
    Boolean sptSet[] = new Boolean[V];
    // Initialize all distances as INFINITE and stpSet[] as false
    for (int i = 0; i < V; i++)
    {
    dist[i] = Integer.MAX_VALUE;
    sptSet[i] = false;
    }
    // Distance of source vertex from itself is always 0
    dist[src] = 0;
    // Find shortest path for all vertices
    for (int count = 0; count < V - 1; count++)
    {
    /* Pick the minimum distance vertex from the set of vertices not yet
    processed. u is always equal to src in first iteration.*/
    int u = minDistance(dist, sptSet);
    // Mark the picked vertex as processed
    sptSet[u] = true;
    // Update dist value of the adjacent vertices of the picked vertex.
    for (int v = 0; v < V; v++)
    {
    /* Update dist[v] only if is not in sptSet, there is an edge from u to
    v, and total weight of path from src to v through u is smaller than
    current value of dist[v] */
    if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE
    && dist[u] + graph[u][v] < dist[v])
    {
    dist[v] = dist[u] + graph[u][v];
    }
    }
    }
    // print the constructed distance array
    printSolution(dist, src);
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int r = sc.nextInt();
Da t = new Da();
t.V = r;
int[][] graph = new int[r][r];
for(int i=0;i<r;i++){
for(int j=0;j<r;j++)
graph[i][j]=sc.nextInt();
}
int srcVertex = sc.nextInt();
t.dijkstra(graph, srcVertex);
}
}