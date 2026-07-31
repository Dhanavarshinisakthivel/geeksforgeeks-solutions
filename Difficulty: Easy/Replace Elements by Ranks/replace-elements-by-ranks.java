class Solution {
    public void replaceWithRank(int arr[]) {

        int n = arr.length;

        int temp[] = arr.clone();

        Arrays.sort(temp);

        HashMap<Integer, Queue<Integer>> map = new HashMap<>();

        // Store ranks for each value
        for (int i = 0; i < n; i++) {

            if (!map.containsKey(temp[i])) {
                map.put(temp[i], new LinkedList<>());
            }

            map.get(temp[i]).add(i);
        }

        // Replace elements with ranks
        for (int i = 0; i < n; i++) {
            arr[i] = map.get(arr[i]).poll();
        }
    }
}