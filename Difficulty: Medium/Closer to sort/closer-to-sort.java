class Solution {
    public int closer(int[] arr, int x) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == x)
                return mid;

            if (mid - 1 >= low && arr[mid - 1] == x)
                return mid - 1;

            if (mid + 1 <= high && arr[mid + 1] == x)
                return mid + 1;

            if (arr[mid] > x)
                high = mid - 2;
            else
                low = mid + 2;
        }

        return -1;
    }
}