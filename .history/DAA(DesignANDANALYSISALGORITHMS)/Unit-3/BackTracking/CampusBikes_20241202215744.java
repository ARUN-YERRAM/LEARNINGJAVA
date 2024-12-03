
/*
KCR Chief Minister of Telangana Government has passed a new G.O to Telangana
police for safety of Telangana people. 
In this regard he announced new Vehicles to be released for all the stations 
working for this mission especially.
Here we have a 2D mesh, there are P police officers and V vehicles, with P<=V.
Each police officer and vehicle is a 2D coordinate on this mesh.
Here the government has assigned a unique vehicle to each police officer.

Now create a method which prints the minimum possible sum of distances between 
each police officer and their assigned vehicle.

Here the distance is between police officer Pi and vehicle Vi assigned to him.
And distance between Pi, Vi is calculated as follows: |Pi.x - Vi.x| + |Pi.y - Vi.y|

Input Format:
-------------
Line-1: Two integers P and V, number of police officers and vehicles.
Next P lines: Two space separated integers co-ordinates of Police officers.
Next V lines: Two space separated integers co-ordinates of Vehicles.

Output Format:
--------------
Print an integer, the minimum possible sum of distances.


Sample Input-1:
---------------
3 3
0 1		// co-ordinates of police
1 2
1 3
4 5		// co-ordinates of vehicles
2 5
3 6

Sample Output-1:
----------------
17


Sample Input-2:
---------------
2 2
0 0		// co-ordinates of police
2 1
1 2		// co-ordinates of vehicles
3 3

Sample Output-2:
----------------
6
*/

import java.util.*;

public class CampusBikes{

    public int minimumSumOfDistances(int[][] police, int[][] vehicles) {
        int p = police.length;
        int v = vehicles.length;
        int[][] dp = new int[p][1 << v]; // Memoization array

        for (int[] row : dp) Arrays.fill(row, -1); // Initialize memoization with -1

        return assignVehicles(police, vehicles, 0, 0, dp);
    }

    private int assignVehicles(int[][] police, int[][] vehicles, int policeIndex, int used, int[][] dp) {
        if (policeIndex == police.length) {
            return 0; // All police officers have been assigned
        }

        if (dp[policeIndex][used] != -1) {
            return dp[policeIndex][used]; // Return memoized result
        }

        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < vehicles.length; i++) {
            if ((used & (1 << i)) == 0) { // Check if vehicle `i` is not already assigned
                int distance = Math.abs(police[policeIndex][0] - vehicles[i][0]) +
                               Math.abs(police[policeIndex][1] - vehicles[i][1]);

                int newDistance = distance + assignVehicles(police, vehicles, policeIndex + 1, used | (1 << i), dp);

                minDistance = Math.min(minDistance, newDistance);
            }
        }

        dp[policeIndex][used] = minDistance;
        return minDistance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt(); // Number of police officers
        int v = sc.nextInt(); // Number of vehicles

        int[][] police = new int[p][2];
        for (int i = 0; i < p; i++) {
            police[i][0] = sc.nextInt();
            police[i][1] = sc.nextInt();
        }

        int[][] vehicles = new int[v][2];
        for (int i = 0; i < v; i++) {
            vehicles[i][0] = sc.nextInt();
            vehicles[i][1] = sc.nextInt();
        }

        CampusBikes solver = new CampusBikes();
        System.out.println(solver.minimumSumOfDistances(police, vehicles));
    }
}



/*
KCR Chief Minister of Telangana Government has passed a new G.O to Telangana
police for safety of Telangana people. 
In this regard he announced new Vehicles to be released for all the stations 
working for this mission especially.
Here we have a 2D mesh, there are P police officers and V vehicles, with P<=V.
Each police officer and vehicle is a 2D coordinate on this mesh.
Here the government has assigned a unique vehicle to each police officer.

Now create a method which prints the minimum possible sum of distances between 
each police officer and their assigned vehicle.

Here the distance is between police officer Pi and vehicle Vi assigned to him.
And distance between Pi, Vi is calculated as follows: |Pi.x - Vi.x| + |Pi.y - Vi.y|

Input Format:
-------------
Line-1: Two integers P and V, number of police officers and vehicles.
Next P lines: Two space separated integers co-ordinates of Police officers.
Next V lines: Two space separated integers co-ordinates of Vehicles.

Output Format:
--------------
Print an integer, the minimum possible sum of distances.


Sample Input-1:
---------------
3 3
0 1		// co-ordinates of police
1 2
1 3
4 5		// co-ordinates of vehicles
2 5
3 6

Sample Output-1:
----------------
17


Sample Input-2:
---------------
2 2
0 0		// co-ordinates of police
2 1
1 2		// co-ordinates of vehicles
3 3

Sample Output-2:
----------------
6
*/

import java.util.*;

public class CampusBikes{

    public int minimumSumOfDistances(int[][] police, int[][] vehicles) {
        int p = police.length;
        int v = vehicles.length;
        int[][] dp = new int[p][1 << v]; // Memoization array

        for (int[] row : dp) Arrays.fill(row, -1); // Initialize memoization with -1

        return assignVehicles(police, vehicles, 0, 0, dp);
    }

    private int assignVehicles(int[][] police, int[][] vehicles, int policeIndex, int used, int[][] dp) {
        if (policeIndex == police.length) {
            return 0; // All police officers have been assigned
        }

        if (dp[policeIndex][used] != -1) {
            return dp[policeIndex][used]; // Return memoized result
        }

        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < vehicles.length; i++) {
            if ((used & (1 << i)) == 0) { // Check if vehicle `i` is not already assigned
                int distance = Math.abs(police[policeIndex][0] - vehicles[i][0]) +
                               Math.abs(police[policeIndex][1] - vehicles[i][1]);

                int newDistance = distance + assignVehicles(police, vehicles, policeIndex + 1, used | (1 << i), dp);

                minDistance = Math.min(minDistance, newDistance);
            }
        }

        dp[policeIndex][used] = minDistance;
        return minDistance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt(); // Number of police officers
        int v = sc.nextInt(); // Number of vehicles

        int[][] police = new int[p][2];
        for (int i = 0; i < p; i++) {
            police[i][0] = sc.nextInt();
            police[i][1] = sc.nextInt();
        }

        int[][] vehicles = new int[v][2];
        for (int i = 0; i < v; i++) {
            vehicles[i][0] = sc.nextInt();
            vehicles[i][1] = sc.nextInt();
        }

        CampusBikes solver = new CampusBikes();
        System.out.println(solver.minimumSumOfDistances(police, vehicles));
    }
}



