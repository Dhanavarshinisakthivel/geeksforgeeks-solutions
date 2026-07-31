class Solution {
    static int minJumps(int[] arr) {
        int n = arr.length;

        if (arr[0] == 0)
            return -1;

        int jumps = 0;
        int farthest = 0;
        int end = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);

            if (i == end) {
                jumps++;
                end = farthest;

                if (end >= n - 1)
                    return jumps;
            }

            if (end == i && arr[i] == 0)
                return -1;
        }

        return -1;
    }
}