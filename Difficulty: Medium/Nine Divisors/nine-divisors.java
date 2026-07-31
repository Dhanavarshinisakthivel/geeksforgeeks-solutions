import java.util.*;

class Solution {
    public int countNumbers(int n) {

        int limit = (int)Math.sqrt(n);
        boolean[] prime = new boolean[limit + 1];
        Arrays.fill(prime, true);

        if (limit >= 0) prime[0] = false;
        if (limit >= 1) prime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= limit; j += i)
                    prime[j] = false;
            }
        }

        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= limit; i++) {
            if (prime[i])
                primes.add(i);
        }

        int count = 0;

        // Case 1: p^8
        for (int p : primes) {
            long val = 1;
            for (int i = 0; i < 8; i++)
                val *= p;

            if (val <= n)
                count++;
            else
                break;
        }

        // Case 2: p^2 * q^2
        for (int i = 0; i < primes.size(); i++) {
            long p2 = (long) primes.get(i) * primes.get(i);

            for (int j = i + 1; j < primes.size(); j++) {
                long q2 = (long) primes.get(j) * primes.get(j);

                long num = p2 * q2;

                if (num <= n)
                    count++;
                else
                    break;
            }
        }

        return count;
    }
}