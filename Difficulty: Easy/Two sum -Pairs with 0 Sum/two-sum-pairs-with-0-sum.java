import java.util.*;

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == 0) {

                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);

                ans.add(pair);

                // Skip duplicates
                while (left < right && arr[left] == arr[left + 1])
                    left++;

                while (left < right && arr[right] == arr[right - 1])
                    right--;

                left++;
                right--;

            } 
            else if (sum < 0) {
                left++;
            } 
            else {
                right--;
            }
        }

        return ans;
    }
}