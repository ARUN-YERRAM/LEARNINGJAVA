// public class PrintSubSetSum {
//     private static void printSubSetSum(int[] arr, int idx, int currSum) {
//         if(idx == arr.length) {
//             System.out.println(currSum);
//             return;
//         }
//         printSubSetSum(arr, idx+1, currSum + arr[idx]);
//         printSubSetSum(arr, idx+1, currSum);
//     }
//     public static void main(String[] args) {
//         int[] arr = {2, 4, 5};
//         printSubSetSum(arr, 0, 0);
//     }
// }