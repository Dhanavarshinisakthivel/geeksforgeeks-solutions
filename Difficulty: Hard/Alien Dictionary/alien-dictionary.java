import java.util.*;

class Solution {
    public String findOrder(String[] words) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < 26; i++)
            graph.add(new ArrayList<>());

        int[] indegree = new int[26];
        boolean[] present = new boolean[26];

        // Mark existing characters
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                present[ch - 'a'] = true;
            }
        }

        // Create graph from adjacent words
        for (int i = 0; i < words.length - 1; i++) {

            String s1 = words[i];
            String s2 = words[i + 1];

            int len = Math.min(s1.length(), s2.length());
            boolean found = false;

            for (int j = 0; j < len; j++) {

                if (s1.charAt(j) != s2.charAt(j)) {

                    int u = s1.charAt(j) - 'a';
                    int v = s2.charAt(j) - 'a';

                    graph.get(u).add(v);
                    indegree[v]++;
                    found = true;
                    break;
                }
            }

            // Invalid case: prefix issue
            if (!found && s1.length() > s2.length())
                return "";
        }

        // Topological Sort
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 26; i++) {
            if (present[i] && indegree[i] == 0)
                q.add(i);
        }

        StringBuilder ans = new StringBuilder();

        while (!q.isEmpty()) {

            int node = q.poll();
            ans.append((char)(node + 'a'));

            for (int next : graph.get(node)) {
                indegree[next]--;

                if (indegree[next] == 0)
                    q.add(next);
            }
        }

        // Cycle detection
        int count = 0;

        for (boolean b : present) {
            if (b)
                count++;
        }

        if (ans.length() != count)
            return "";

        return ans.toString();
    }
}