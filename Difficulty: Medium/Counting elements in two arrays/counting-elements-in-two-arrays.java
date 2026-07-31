import java.util.*;

class Solution {
    public ArrayList<Integer> countLessEq(int[] a, int[] b) {

        Arrays.sort(b);

        ArrayList<Integer> ans = new ArrayList<>();

        for (int x : a) {
            ans.add(upperBound(b, x));
        }

        return ans;
    }

    private int upperBound(int[] b, int x) {

        int low = 0, high = b.length - 1;
        int ans = b.length;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (b[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}