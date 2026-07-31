class Solution {
    public int findSubString(String str) {

        int[] freq = new int[26];

        // Count distinct characters
        int distinct = 0;

        for (char ch : str.toCharArray()) {
            if (freq[ch - 'a'] == 0)
                distinct++;
            freq[ch - 'a']++;
        }

        int[] window = new int[26];

        int left = 0;
        int count = 0;
        int ans = Integer.MAX_VALUE;

        for (int right = 0; right < str.length(); right++) {

            char ch = str.charAt(right);

            if (window[ch - 'a'] == 0)
                count++;

            window[ch - 'a']++;

            // All distinct characters are present
            while (count == distinct) {

                ans = Math.min(ans, right - left + 1);

                char leftChar = str.charAt(left);

                window[leftChar - 'a']--;

                if (window[leftChar - 'a'] == 0)
                    count--;

                left++;
            }
        }

        return ans;
    }
}