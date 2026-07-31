class Solution {
    public int minSwaps(int arr[]) {

        int n = arr.length;

        int[][] temp = new int[n][2];

        // Store value and original index
        for (int i = 0; i < n; i++) {
            temp[i][0] = arr[i];
            temp[i][1] = i;
        }

        // Sort by value
        Arrays.sort(temp, (a, b) -> a[0] - b[0]);

        boolean visited[] = new boolean[n];

        int swaps = 0;

        for (int i = 0; i < n; i++) {

            // Already sorted or visited
            if (visited[i] || temp[i][1] == i)
                continue;

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {

                visited[j] = true;

                j = temp[j][1];

                cycleSize++;
            }

            if (cycleSize > 1)
                swaps += cycleSize - 1;
        }

        return swaps;
    }
}