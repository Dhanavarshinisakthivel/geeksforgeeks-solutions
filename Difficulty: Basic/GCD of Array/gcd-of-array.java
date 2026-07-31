class Solution {
    public int gcd(int n, int arr[]) {
        int ans = arr[0];

        for (int i = 1; i < n; i++) {
            ans = findGCD(ans, arr[i]);
        }

        return ans;
    }

    public int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}