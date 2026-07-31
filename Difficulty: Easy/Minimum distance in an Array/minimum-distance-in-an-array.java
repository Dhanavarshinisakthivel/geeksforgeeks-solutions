class Solution {
    public int minDist(int arr[], int x, int y) {

        int last = -1;
        int ans = Integer.MAX_VALUE;
        int lastValue = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x || arr[i] == y) {

                if (last != -1 && arr[i] != lastValue) {
                    ans = Math.min(ans, i - last);
                }

                last = i;
                lastValue = arr[i];
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}