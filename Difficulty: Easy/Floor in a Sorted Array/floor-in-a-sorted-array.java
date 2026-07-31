class Solution {
    static int findFloor(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                ans = mid;       // Possible floor
                low = mid + 1;   // Search for last occurrence
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}