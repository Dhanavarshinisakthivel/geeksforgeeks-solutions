import java.util.*;

class Solution {
    public int getCandidate(int n, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++)
            list.add(i);

        while (list.size() >= k) {
            ArrayList<Integer> temp = new ArrayList<>();

            for (int i = k - 1; i < list.size(); i += k) {
                temp.add(list.get(i));
            }

            list = temp;
        }

        return list.get(0);
    }
}