class Solution {
    public int findCeil(int arr[], int x) {

        int low = 0;
        int high = arr.length - 1;

        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {

                ans = mid;      // possible answer
                high = mid - 1; // find first occurrence

            } else {

                low = mid + 1;
            }
        }

        return ans;
    }
}