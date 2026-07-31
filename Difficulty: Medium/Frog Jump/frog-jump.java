class Solution {
    public int minCost(int height[]) {

        int n = height.length;

        if (n == 1)
            return 0;

        int prev2 = 0; // dp[i-2]
        int prev1 = 0; // dp[i-1]

        for (int i = 1; i < n; i++) {

            int oneStep = prev1 + Math.abs(height[i] - height[i - 1]);

            int twoStep = Integer.MAX_VALUE;

            if (i > 1) {
                twoStep = prev2 + Math.abs(height[i] - height[i - 2]);
            }

            int current = Math.min(oneStep, twoStep);

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}