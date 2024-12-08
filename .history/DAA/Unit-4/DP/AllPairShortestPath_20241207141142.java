/*
The all pair shortest path algorithm is also known as Floyd-Warshall algorithm is used to 
find all pair shortest path problem from a given weighted graph. 
As a result of this algorithm, it will generate a matrix, 
which will represent the minimum distance from any node to all other nodes in the graph.

Input format
--------------
Enter Number of Vertices
Enter Distance Matrix

output format:
---------------
Print The Shortest Distance Matrix


case=1
input=
4
0 99 3 99
2 0 99 99
99 7 0 7
6 99 99 0
output=
0 10 3 10 
2 0 5 12 
9 7 0 7 
6 16 9 0 

case =2
input =
5
0 4 5 6 99
99 0 5 99 10
1 99 0 3 99
2 99 99 0 1
1 99 99 99 0
output =
0 4 5 6 7
6 0 5 8 9
1 5 0 3 4
2 6 7 0 1
1 5 6 7 0

case =3
input =
7
0 9 9 2 9 5 5
99 0 7 3 1 7 4
4 99 0 1 4 4 8
99 99 99 0 5 8 9
99 99 99 99 0 5 2
99 99 99 99 2 0 4
99 99 6 99 99 99 0
output =
0 9 9 2 7 5 5
11 0 7 3 1 6 3
4 13 0 1 4 4 6
17 26 13 0 5 8 7
12 21 8 9 0 5 2
14 23 10 11 2 0 4
10 19 6 7 10 10 0

*/

import java.util.*;
public class Test {

    public static void floydWarshall(int[][] graph, int n) {
        // Distance matrix initialization with input graph values
        int[][] dist = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                dist[i][j] = graph[i][j];

        // Floyd-Warshall algorithm
        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    if (dist[i][k] != 99 && dist[k][j] != 99 && dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];

        // Print the result matrix
        printSolution(dist, n);
    }

    public static void printSolution(int[][] dist, int n) {
        // System.out.println("The shortest distance matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dist[i][j] == 99) 
                    System.out.print("99 ");
                else
                    System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Number of Vertices:");
        int n = sc.nextInt();

        // System.out.println("Enter Distance Matrix:");
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                graph[i][j] = sc.nextInt();

        // Run Floyd-Warshall algorithm
        floydWarshall(graph, n);

        sc.close();
    }
}

