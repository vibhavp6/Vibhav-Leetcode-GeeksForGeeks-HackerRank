<h2><a href="https://www.geeksforgeeks.org/problems/replace-os-with-xs0052/1">Replace O's with X's</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">You are given a <strong>grid[][] </strong>of size n*m, where every element is either 'O' or 'X'. You have to <strong>replace</strong> all 'O' or a group of 'O' with 'X' that are surrounded by 'X'. </span></p>
<p><span style="font-size: 18px;">A 'O' (or a set of 'O') is considered to be surrounded by 'X' if there are 'X' at locations just below, just above, just left and just right of it.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> <br>grid[][] = [['X', 'X', 'X', 'X'], <br>          ['X', 'O', 'X', 'X'], <br>          ['X', 'O', 'O', 'X'], <br>          ['X', 'O', 'X', 'X'], <br>          ['X', 'X', 'O', 'O']]
<strong>Output:</strong> <br>[['X', 'X', 'X', 'X'], <br>['X', 'X', 'X', 'X'], <br>['X', 'X', 'X', 'X'], <br>['X', 'X', 'X', 'X'], <br>['X', 'X', 'O', 'O']]
<strong>Explanation:</strong> We only changed those 'O' that are surrounded by 'X'</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> <br>grid[][] = [['X', 'O', 'X', 'X'], <br>          ['X', 'O', 'X', 'X'], <br>          ['X', 'O', 'O', 'X'], <br>          ['X', 'O', 'X', 'X'], <br>          ['X', 'X', 'O', 'O']]
<strong>Output:</strong> <br>[['X', 'O', 'X', 'X'], <br>['X', 'O', 'X', 'X'], <br>['X', 'O', 'O', 'X'], <br>['X', 'O', 'X', 'X'], <br>['X', 'X', 'O', 'O']]
<strong>Explanation:</strong> There's no 'O' that's surround by 'X'.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> <br>grid[][] = [['X', 'X', 'X'], <br>          ['X', 'O', 'X'], <br>          ['X', 'X', 'X']]
<strong>Output:</strong> <br>[['X', 'X', 'X'], <br>['X', 'X', 'X'], <br>['X', 'X', 'X']]
<strong>Explanation:</strong> There's only one 'O' that's surround by 'X'.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ grid.size() ≤ 100<br>1 ≤ grid[0].size() ≤ 100<br></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Google</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Recursion</code>&nbsp;<code>Matrix</code>&nbsp;<code>Graph</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;<code>BFS</code>&nbsp;