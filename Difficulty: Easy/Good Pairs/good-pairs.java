class Solution {
    static final long MOD = 1000000007;

    public int solve(int[] arr) {
        int[] freq = new int[1001];

        for (int num : arr)
            freq[num]++;

        long ans = 0;
        int smaller = 0;

        for (int i = 1; i <= 1000; i++) {
            ans = (ans + (long) freq[i] * smaller) % MOD;
            smaller += freq[i];
        }

        return (int) ans;
    }
}