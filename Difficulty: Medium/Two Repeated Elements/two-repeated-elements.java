import java.util.*;

class Solution {
    public int[] twoRepeated(int[] arr) {
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();

        int index = 0;

        for (int num : arr) {
            if (set.contains(num)) {
                ans[index++] = num;
                if (index == 2)
                    break;
            } else {
                set.add(num);
            }
        }

        return ans;
    }
}