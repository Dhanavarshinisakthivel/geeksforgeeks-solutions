import java.util.*;

class Solution {
    public int getMinDiff(int[] arr, int k) {
        int n = arr.length;

        Arrays.sort(arr);

        int ans = arr[n - 1] - arr[0];

        int small = arr[0] + k;
        int large = arr[n - 1] - k;

        for (int i = 0; i < n - 1; i++) {

            if (arr[i + 1] - k < 0)
                continue;

            int min = Math.min(small, arr[i + 1] - k);
            int max = Math.max(large, arr[i] + k);

            ans = Math.min(ans, max - min);
        }

        return ans;
    }
}