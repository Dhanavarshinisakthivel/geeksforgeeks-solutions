import java.util.*;

class Solution {
    public ArrayList<Integer> kthSmallestNum(int n, int range[][], int q, int Q[]) {

        ArrayList<int[]> merged = new ArrayList<>();

        // Sort ranges by starting value
        Arrays.sort(range, (a, b) -> Integer.compare(a[0], b[0]));

        int start = range[0][0];
        int end = range[0][1];

        // Merge ranges
        for (int i = 1; i < n; i++) {

            if (range[i][0] <= end + 1) {
                end = Math.max(end, range[i][1]);
            } 
            else {
                merged.add(new int[]{start, end});
                start = range[i][0];
                end = range[i][1];
            }
        }

        merged.add(new int[]{start, end});


        ArrayList<Integer> ans = new ArrayList<>();

        // Process queries
        for (int k : Q) {

            int result = -1;

            long count = k;

            for (int r[] : merged) {

                long size = (long) r[1] - r[0] + 1;

                if (count <= size) {
                    result = (int)(r[0] + count - 1);
                    break;
                }

                count -= size;
            }

            ans.add(result);
        }

        return ans;
    }
}