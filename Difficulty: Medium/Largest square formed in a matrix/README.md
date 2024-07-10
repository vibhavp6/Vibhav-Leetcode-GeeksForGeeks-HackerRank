<h2><a href="https://www.geeksforgeeks.org/problems/largest-square-formed-in-a-matrix0806/1">Largest square formed in a matrix</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a binary matrix <strong>mat</strong>&nbsp;of size <strong>n</strong> * <strong>m</strong>, find out the maximum length of a side of a <strong>square</strong> sub-matrix with all 1s.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> n = 6, m = 5
mat = [[0, 1, 1, 0, 1], 
&nbsp;      [1, 1, 0, 1, 0],<br>       [0, 1, 1, 1, 0],<br>       [1, 1, 1, 1, 0],<br>       [1, 1, 1, 1, 1],<br>       [0, 0, 0, 0, 0]]
<strong>Output:</strong> 3
<strong>Explanation:</strong> <br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/705423/Web/Other/blobid0_1720438143.png" width="401" height="149"><br>The maximum length of a side of the square sub-matrix is 3 where every element is 1.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> n = 2, m = 2
mat = [[1, 1], 
&nbsp;      [1, 1]]
<strong>Output:</strong> 2
<strong>Explanation:</strong> The maximum length of a side of the square sub-matrix is 2. The matrix itself is the maximum sized sub-matrix in this case.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> n = 2, m = 2
mat = [[0, 0], 
&nbsp;      [0, 0]]
<strong>Output:</strong> 0
<strong>Explanation:</strong> There is no 1 in the matrix.</span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(n*m)<br><strong>Expected Auxiliary Space:</strong> O(n*m)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n, m ≤ 500<br>0 ≤ mat[i][j] ≤ 1&nbsp;</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<code>Samsung</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;<code>Algorithms</code>&nbsp;<code>Arrays</code>&nbsp;