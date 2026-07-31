class Solution {
    public String uncommonChars(String s1, String s2) {

        boolean[] a = new boolean[26];
        boolean[] b = new boolean[26];

        for (char ch : s1.toCharArray())
            a[ch - 'a'] = true;

        for (char ch : s2.toCharArray())
            b[ch - 'a'] = true;

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i])
                ans.append((char)(i + 'a'));
        }

        return ans.toString();
    }
}