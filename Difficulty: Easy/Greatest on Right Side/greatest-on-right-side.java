import java.util.*;

class Solution {
    public ArrayList<Integer> nextGreatest(int arr[]) {

        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();

        int maxRight = -1;

        // Traverse from right side
        for (int i = n - 1; i >= 0; i--) {

            int current = arr[i];

            ans.add(maxRight);

            // Update maximum
            maxRight = Math.max(maxRight, current);
        }

        // Reverse result because we traversed from right
        Collections.reverse(ans);

        return ans;
    }
}