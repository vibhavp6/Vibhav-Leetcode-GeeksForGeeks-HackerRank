<h2><a href="https://www.geeksforgeeks.org/problems/number-of-paths-in-a-matrix-with-k-coins2728/1">Number of paths in a matrix with k coins</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">You are given a matrix <strong>mat[][]</strong> of size <strong>n x m</strong>, where each of its cells contains some coins. <strong>Count </strong>the number of ways to collect <strong>exactly k coins</strong> while moving from the top left cell of the matrix to the bottom right cell. <br></span><span style="font-size: 14pt;">From a cell (<strong>i</strong>, <strong>j</strong>), you can only move to cell (<strong>i+1</strong>, <strong>j</strong>) or (<strong>i</strong>, <strong>j+1</strong>).</span></p>
<p><span style="font-size: 14pt;"><strong>Note:</strong> It is guaranteed that the answer will not exceed 32-bit integer limits.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: k = 12, mat[] = [[1, 2, 3],
&nbsp;                     [4, 6, 5],
&nbsp;                     [3, 2, 1]]
<strong>Output:</strong> 2
<strong>Explanation</strong>: There are 2 possible paths with exactly 12 coins, (1 + 2 + 6 + 2 + 1) and (1 + 2 + 3 + 5 + 1).
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>k = 16, mat[] = [[1, 2, 3],&nbsp;
&nbsp;                     [4, 6, 5],&nbsp;
&nbsp;                     [9, 8, 7]]
<strong>Output: </strong>0 
<strong>Explanation: </strong>There are no possible paths that lead to sum = 16.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:<br></strong></span><span style="font-size: 14pt;">1 ≤ k ≤ 100<br>1 ≤ n, m ≤ 100<br>0 ≤ mat[i][j]&nbsp;≤ 200</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;<code>Recursion</code>&nbsp;<code>Matrix</code>&nbsp;<code>Backtracking</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;