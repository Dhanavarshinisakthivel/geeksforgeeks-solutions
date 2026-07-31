import java.util.*;

class Solution {
    public long findMinSum(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);

        long sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += Math.abs(a[i] - b[i]);
        }

        return sum;
    }
}