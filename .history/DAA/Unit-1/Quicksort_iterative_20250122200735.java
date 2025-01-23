import java.util.Scanner;
import java.util.Stack;

class Quicksort_iterative {

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partition index
    }

    private static void quickSortIterative(int[] arr, int low, int high) {
        Stack<int[]> stack = new Stack<>();

        // Push initial range (low, high) to the stack
        stack.push(new int[]{low, high});

        while (!stack.isEmpty()) {
            // Pop the current range
            int[] range = stack.pop();
            int left = range[0];
            int right = range[1];

            // Partition the array and get the pivot index
            if (left < right) {
                int pivotIndex = partition(arr, left, right);

                // Push left part (left, pivotIndex - 1)
                stack.push(new int[]{left, pivotIndex - 1});

                // Push right part (pivotIndex + 1, right)
                stack.push(new int[]{pivotIndex + 1, right});
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Given Array is : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        quickSortIterative(nums, 0, n - 1);

        System.out.print("Sorted Array is : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
