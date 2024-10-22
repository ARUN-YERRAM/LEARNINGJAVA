public class OA{
    public static void main(String[] args){
        long sum = 0;

        // First loop: handle small values of k from 1 to sqrt(n)
        long k;
        for (k = 1; k * k <= n; k++) {
            sum += n / k;
        }

        // Second loop: handle large values of k indirectly
        for (long v = n / k; v >= 1; v--) {
            long low = n / (v + 1) + 1;  // First k such that floor(n/k) = v
            long high = n / v;  // Last k such that floor(n/k) = v
            sum += v * (high - low + 1);
        }

        return sum;
    }
}