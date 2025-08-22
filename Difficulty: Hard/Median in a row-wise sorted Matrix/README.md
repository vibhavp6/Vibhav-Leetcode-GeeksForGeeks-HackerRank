<h2><a href="https://www.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1">Median in a row-wise sorted Matrix</a></h2><h3>Difficulty Level : Difficulty: Hard</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given a <strong>row-wise sorted</strong> matrix&nbsp;</span><strong style="font-size: 18.6667px;">mat[][]</strong><span style="font-size: 14pt;"> of size n*m, where the number of rows and columns is always </span><strong style="font-size: 14pt;">odd</strong><span style="font-size: 14pt;">.&nbsp;Return the <strong>median</strong> of the matrix.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: mat[][] = [[1, 3, 5], <br>                [2, 6, 9], <br>                [3, 6, 9]]
<strong>Output:</strong>&nbsp;5
<strong>Explanation</strong>: Sorting matrix elements gives us [1, 2, 3, 3, 5, 6, 6, 9, 9]. Hence, 5 is median.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>mat[][] = [[2, 4, 9],
                [3, 6, 7],
                [4, 7, 10]]
<strong>Output: </strong>6
<strong>Explanation</strong>: Sorting matrix elements gives us [2, 3, 4, 4, 6, 7, 7, 9, 10]. Hence, 6 is median.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>mat = [[3], [4], [8]]
<strong>Output: </strong>4
<strong>Explanation</strong>: Sorting matrix elements gives us [3, 4, 8]. Hence, 4 is median.<br></span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ n, m ≤ 400<br>1 ≤ mat[i][j] ≤ 2000</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Matrix</code>&nbsp;<code>Binary Search</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;