import java.util.Scanner;

public class MinProductSubset {
    public static int minProductSubset(int[] arr) {
        int n = arr.length;

        if (n == 1) return arr[0]; // If there's only one element

        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;
        int product = 1;
        int countNegatives = 0, countZeros = 0;

        for (int num : arr) {
            if (num == 0) {
                countZeros++;
                continue; // Ignore zeros in product calculation
            }
            if (num < 0) {
                countNegatives++;
                maxNegative = Math.max(maxNegative, num);
            }
            if (num > 0) {
                minPositive = Math.min(minPositive, num);
            }
            product *= num;
        }

        // If all elements are zero
        if (countZeros == n) return 0;

        // If there are no negatives and no zeros, return the smallest positive
        if (countNegatives == 0) return minPositive;

        // If there are even number of negatives, exclude the largest negative
        if (countNegatives % 2 == 0 && countNegatives != 0) {
            product /= maxNegative;
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Minimum Product of Subset: " + minProductSubset(arr));
    }
}
