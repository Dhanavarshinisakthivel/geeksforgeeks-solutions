import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Long.compare(
                (long)b[0] * b[0] + (long)b[1] * b[1],
                (long)a[0] * a[0] + (long)a[1] * a[1]
            )
        );

        for (int[] p : points) {
            pq.offer(p);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            int[] p = pq.poll();

            ArrayList<Integer> point = new ArrayList<>();
            point.add(p[0]);
            point.add(p[1]);

            ans.add(point);
        }

        return ans;
    }
}