import java.util.*;

class Solution {
    public int[] sortedMerge(int arr1[], int arr2[]) {

        int n = arr1.length;
        int m = arr2.length;

        int res[] = new int[n + m];

        int k = 0;

        // Copy first array
        for (int i = 0; i < n; i++) {
            res[k++] = arr1[i];
        }

        // Copy second array
        for (int i = 0; i < m; i++) {
            res[k++] = arr2[i];
        }

        // Sort merged array
        Arrays.sort(res);

        return res;
    }
}