class Solution {
    public int minMen(int[] arr) {

        int n = arr.length;
        int[] reach = new int[n];

        for (int i = 0; i < n; i++)
            reach[i] = -1;

        // Build intervals
        for (int i = 0; i < n; i++) {

            if (arr[i] < 0)   // treat any negative value as unavailable
                continue;

            int left = Math.max(0, i - arr[i]);
            int right = Math.min(n - 1, i + arr[i]);

            reach[left] = Math.max(reach[left], right);
        }

        int ans = 0;
        int currEnd = 0;
        int farthest = -1;
        int i = 0;

        while (currEnd < n) {

            while (i <= currEnd && i < n) {
                farthest = Math.max(farthest, reach[i]);
                i++;
            }

            if (farthest < currEnd)
                return -1;

            ans++;

            if (farthest >= n - 1)
                return ans;

            currEnd = farthest + 1;
        }

        return ans;
    }
}