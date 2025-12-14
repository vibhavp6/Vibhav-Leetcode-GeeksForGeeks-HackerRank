<h2><a href="https://www.geeksforgeeks.org/problems/2d-submatrix-sum-queries/1">2D Submatrix Sum Queries</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given a 2D integer matrix <strong>mat[][]</strong> and a list of queries <strong>queries[][]</strong>, your task is to answer a series of <strong>submatrix sum</strong> <strong>queries</strong>.</span></p>
<p><span style="font-size: 14pt;">Each query is represented as a list <strong>[r1, c1, r2, c2]</strong>, where:</span></p>
<ul>
<li><span style="font-size: 14pt;">(r1, c1) is the top-left coordinate of the submatrix</span></li>
<li><span style="font-size: 14pt;">(r2, c2) is the bottom-right coordinate of the submatrix (both inclusive)</span></li>
</ul>
<p><span style="font-size: 14pt;">Your task is to return a list of integers, the <strong>sum </strong>of elements within the specified <strong>submatrix</strong> for each query.</span></p>
<p><strong><span style="font-size: 14pt;">Examples:&nbsp;</span></strong></p>
<pre><span style="font-size: 18.6667px;"><strong>Input: </strong>mat[][] = [[1, 2, 3], queries[][] = [[0, 0, 1, 1], [1, 0, 2, 2]]
                [1, 1, 0],
                [4, 2, 2]]<br><strong>Output: </strong>[5, 10]<br><strong>Explanation:</strong> <br>Query 1 selects submatrix [[1, 2], [1, 1]] → sum = 5.<br>Query 2 selects submatrix [[1, 1, 0], [4, 2, 2]] → sum = 10.<br></span></pre>
<pre><span style="font-size: 18.6667px;"><strong>Input: </strong>mat[][] = [[1, 1, 1], queries[][] = [[1, 1, 2, 2], [0, 0, 2, 2], [0, 2, 2, 2]]
                [1, 1, 1],
                [1, 1, 1]]<br><strong>Output: </strong>[4, 9, 3]<br><strong>Explanation:</strong> <br>Query 1 selects submatrix [[1, 1], [1, 1]] → sum = 4.<br>Query 2 selects submatrix [[1, 1, 1], [1, 1, 1], [1, 1, 1]] → sum = 9.<br></span><span style="font-size: 14pt;">Query 3 selects submatrix [[1], [1], [1]] → sum = 3.</span></pre>
<p><strong><span style="font-size: 14pt;">Constraints: <br></span></strong><span style="font-size: 14pt;">1 ≤ n × m, q ≤ 10<sup><span style="font-size: 14pt;">5</span><br></sup>0 ≤ mat[i][j] ≤ 10<sup>4<br></sup>0 ≤ r1 ≤ r2 ≤ n - 1<br>0 ≤ c1 ≤ c2 ≤ m - 1</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>prefix-sum</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;