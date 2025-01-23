import java.util.Scanner;

class Mergesort_iterative {

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    private static void iterativeMergeSort(int[] arr) {
        int n = arr.length;

        for (int currSize = 1; currSize < n; currSize *= 2) {
            for (int left = 0; left < n - 1; left += 2 * currSize) {
                int mid = Math.min(left + currSize - 1, n - 1);
                int right = Math.min(left + 2 * currSize - 1, n - 1);

                merge(arr, left, mid, right);
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

        iterativeMergeSort(nums);

        System.out.print("Sorted Array is : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
