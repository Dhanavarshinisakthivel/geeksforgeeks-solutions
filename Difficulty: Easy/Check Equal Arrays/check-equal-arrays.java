import java.util.*;

class Solution {
    public boolean checkEqual(int a[], int b[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count elements of first array
        for (int x : a) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Remove elements using second array
        for (int x : b) {

            if (!map.containsKey(x) || map.get(x) == 0) {
                return false;
            }

            map.put(x, map.get(x) - 1);
        }

        return true;
    }
}