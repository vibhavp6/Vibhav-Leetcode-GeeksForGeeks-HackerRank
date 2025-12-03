<h2><a href="https://www.geeksforgeeks.org/problems/travelling-salesman-problem2732/1">Travelling Salesman Problem</a></h2><h3>Difficulty Level : Difficulty: Hard</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a 2d matrix <strong>cost[][]</strong> of size n where <strong>cost[i][j]</strong> denotes the cost of moving from city <strong>i</strong> to city <strong>j</strong>. Your task is to complete a tour from city <strong>0</strong> (0-based index) to all other cities such that you visit each city exactly once and then at the end come back to city 0 at <strong>minimum cost</strong>.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>cost[][] = [[0, 111], <br>                [112, 0]]
<strong>Output: </strong>223
<strong>Explanation: </strong>We can visit 0-&gt;1-&gt;0 and cost = 111 + 112.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>cost[][] = [[0, 1000, 5000],<br>                [5000, 0, 1000],<br>                [1000, 5000, 0]]
<strong>Output: </strong>3000
<strong>Explanation: </strong>We can visit 0-&gt;1-&gt;2-&gt;0 and cost = 1000 + 1000 + 1000 = 3000</span>
</pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ cost.size() ≤ 15<br>0 ≤ cost[i][j] ≤ 10<sup>4</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Microsoft</code>&nbsp;<code>Samsung</code>&nbsp;<code>Google</code>&nbsp;<code>Opera</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Matrix</code>&nbsp;<code>Dynamic Programming</code>&nbsp;<code>Bit Magic</code>&nbsp;<code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;