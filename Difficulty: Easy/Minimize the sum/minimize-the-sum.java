import java.util.*;

class Solution {
    public long minSum(int arr[]) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to min heap
        for (int num : arr) {
            pq.add(num);
        }

        long sum = 0;

        while (pq.size() > 1) {

            int a = pq.poll();
            int b = pq.poll();

            int add = a + b;

            sum += add;

            pq.add(add);
        }

        return sum;
    }
}