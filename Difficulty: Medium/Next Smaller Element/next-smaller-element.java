import java.util.*;

class Solution {
    public ArrayList<Integer> nextSmallerEle(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int n = arr.length;
        int result[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty())
                result[i] = -1;
            else
                result[i] = stack.peek();

            stack.push(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            ans.add(result[i]);
        }

        return ans;
    }
}