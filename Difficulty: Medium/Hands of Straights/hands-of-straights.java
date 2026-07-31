class Solution {
    public boolean isStraightHand(int N, int groupSize, int hand[]) {

        if (N % groupSize != 0)
            return false;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Count frequency
        for (int card : hand) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        while (!map.isEmpty()) {

            int first = map.firstKey();

            for (int i = 0; i < groupSize; i++) {

                int card = first + i;

                if (!map.containsKey(card))
                    return false;

                map.put(card, map.get(card) - 1);

                if (map.get(card) == 0)
                    map.remove(card);
            }
        }

        return true;
    }
}