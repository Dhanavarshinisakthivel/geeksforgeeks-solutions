class Solution {
    public int countZeroes(int[] arr) {
        int low = 0, high = arr.length - 1;
        int firstZero = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 0) {
                firstZero = mid;   // possible first zero
                high = mid - 1;    // search left
            } else {
                low = mid + 1;     // search right
            }
        }

        return arr.length - firstZero;
    }
}