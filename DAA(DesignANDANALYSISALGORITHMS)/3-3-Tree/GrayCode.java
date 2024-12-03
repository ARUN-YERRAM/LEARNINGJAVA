import java.util.*;

class GrayCode {
    // Generate Gray Code sequence
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();

        // Start with 0 in the sequence
        result.add(0);

        // Keeps track of the numbers already in the sequence
        Set<Integer> isPresent = new HashSet<>();
        isPresent.add(0);

        // Generate the Gray Code sequence recursively
        grayCodeHelper(result, n, isPresent);
        return result;
    }

    // Helper function for Gray Code generation
    private boolean grayCodeHelper(List<Integer> result, int n, Set<Integer> isPresent) {
        // Base case: if all 2^n numbers are in the result, return true
        if (result.size() == (1 << n))
            return true;

        int current = result.get(result.size() - 1);

        // Try toggling each bit in the current number
        for (int i = 0; i < n; i++) {
            int next = current ^ (1 << i); // Toggle the i-th bit

            if (!isPresent.contains(next)) {
                isPresent.add(next);
                result.add(next);

                // If a valid sequence is found, stop further exploration
                if (grayCodeHelper(result, n, isPresent))
                    return true;

                // Backtrack
                isPresent.remove(next);
                result.remove(result.size() - 1);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bits for Gray Code: ");
        int N = sc.nextInt();

        // Generate and print the Gray Code sequence
        List<Integer> grayCodeSequence = new GrayCode().grayCode(N);
        System.out.println("\nGray Code Sequence:");
        for (int code : grayCodeSequence) {
            System.out.println(code);
        }

        sc.close();
    }
}
