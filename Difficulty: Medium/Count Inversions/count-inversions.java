class Solution {
    static long inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    static long mergeSort(int arr[], int low, int high) {
        long count = 0;

        if (low < high) {
            int mid = (low + high) / 2;

            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);

            count += merge(arr, low, mid, high);
        }

        return count;
    }

    static long merge(int arr[], int low, int mid, int high) {
        long count = 0;

        int temp[] = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= high) {
            temp[k++] = arr[j++];
        }

        for (i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }

        return count;
    }
}