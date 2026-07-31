import java.util.*;

class Solution {
    public int lengthOfLongestAP(Integer[] arr) {

        int n = arr.length;

        if (n <= 2)
            return n;

        HashMap<Integer, Integer>[] dp = new HashMap[n];

        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
        }

        int ans = 2;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                int diff = arr[i] - arr[j];

                int len = dp[j].getOrDefault(diff, 1) + 1;

                dp[i].put(diff, len);

                ans = Math.max(ans, len);
            }
        }

        return ans;
    }
}