// A school kid named John Doe, wants to find the value of N^P
// Pth power of a number N.

// You will be given two integers N and P.
// Your task is to help John DOe to find the value of N^P.

// NOTE:
// ---------
// Value of N and P can be both positive and negative


// Input Format:
// -------------
// Line-1: Two integers N and P, where N is the number and P is the power

// Output Format:
// --------------
// Line-1: Print a float number, N power P


// Sample Input-1:
// ---------------
// 3 2

// Sample Output-1:
// ----------------
// 9.000000


// Sample Input-2:
// ---------------
// 2 -3

// Sample Output-2:
// ----------------
// 0.125000


import java.util.Scanner;

public class Power{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read N and P from the input
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        
        // Calculate N^P
        double result = Math.pow(N, P);
        
        // Print the result with six decimal places
        System.out.printf("%.6f\n", result);
        
        scanner.close();
    }
}
