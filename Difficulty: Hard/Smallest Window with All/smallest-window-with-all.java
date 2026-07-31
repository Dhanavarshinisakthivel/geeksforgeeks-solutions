class Solution {
    public static String minWindow(String s, String p) {

        if (p.length() > s.length())
            return "";

        int[] freq = new int[256];

        for (char ch : p.toCharArray())
            freq[ch]++;

        int count = p.length();
        int left = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (freq[ch] > 0)
                count--;

            freq[ch]--;

            while (count == 0) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                freq[leftChar]++;

                if (freq[leftChar] > 0)
                    count++;

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" :
                s.substring(start, start + minLen);
    }
}