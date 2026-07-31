class Solution {
    public int maximumPoints(int arr[][]) {

        int n = arr.length;

        int[] dp = new int[3];

        // First day
        dp[0] = arr[0][0];
        dp[1] = arr[0][1];
        dp[2] = arr[0][2];

        // Remaining days
        for (int i = 1; i < n; i++) {

            int[] temp = new int[3];

            temp[0] = arr[i][0] + Math.max(dp[1], dp[2]);

            temp[1] = arr[i][1] + Math.max(dp[0], dp[2]);

            temp[2] = arr[i][2] + Math.max(dp[0], dp[1]);

            dp = temp;
        }

        return Math.max(dp[0], Math.max(dp[1], dp[2]));
    }
}