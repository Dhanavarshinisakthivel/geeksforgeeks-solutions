<h2><a href="https://www.geeksforgeeks.org/problems/water-the-plants--170646/1?page=18&category=Arrays,Sorting&sortBy=submissions">Minimum Workers to Cover All Hours</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given an integer array <strong>arr[]</strong> , where each element <strong>arr[i]</strong> denotes the range of working hours a person at position i can cover.</span></p>
<p><span style="font-size: 18px;">A person at index i can work and cover the time interval [i - arr[i], i + arr[i]].</span></p>
<p><span style="font-size: 18px;">If arr[i] = -1, the person is unavailable and cannot cover any time.</span></p>
<p><span style="font-size: 18px;">Find the minimum number of people required to cover the entire interval [0, n – 1]. If it is not possible, return -1.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [-1, 2, 2, -1, 0, 0]
<strong>Output: </strong>2
<strong>Explanation: <br></strong>For arr[] = [-1, 2, 2, -1, 0, 0], each index i represents a person who can cover the interval [i - arr[i], i + arr[i]].
Here:
Index 1 can cover [-1, 3], which becomes [0, 3]
Index 2 can cover [0, 4]
Index 4 can cover [4, 4]
Index 5 can cover [5, 5]
The person at index 2 covers positions 0 to 4, and the person at index 5 covers position 5. Together, they cover the entire interval [0, 5].
So, the minimum number of people required is 2.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2, 3, 4, -1, 2, 0, 0, -1, 0]
<strong>Output: </strong>-1
<strong>Explanation: <br></strong>For arr[] = [2, 3, 4, -1, 2, 0, 0, -1, 0]:
Index 0 → covers [0, 2]
Index 1 → covers [0, 4]
Index 2 → covers [0, 6]
Index 4 → covers [2, 6]
Index 5 → covers [5, 5]
Index 6 → covers [6, 6]
Index 8 → covers [8, 8]
No person can cover index 7 because:
arr[7] = -1 (unavailable), and
no other interval extends to position 7.
Since position 7 remains uncovered, it is impossible to cover the entire interval [0, 8].
Hence, the answer is -1.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤&nbsp;10<sup>5</sup><br>-50&nbsp;</span><span style="font-size: 18px;">≤ </span><span style="font-size: 18px;">arr[i] ≤ 50</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Greedy</code>&nbsp;<code>Sorting</code>&nbsp;