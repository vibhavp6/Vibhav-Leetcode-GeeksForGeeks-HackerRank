<h2><a href="https://www.geeksforgeeks.org/problems/sums-of-i-th-row-and-i-th-column3054/1">Sums of i-th row and i-th column</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a matrix A of dimensions NxM. Check whether the sum of the&nbsp;<strong>i<sup>th</sup></strong>&nbsp;row is equal to the sum of the&nbsp;<strong>i<sup>th</sup>&nbsp;</strong>column.<br>
Note: Check only up to valid&nbsp;row and column numbers i.e if the dimensions are 3x5, check only for the first 3 rows and columns, i.e. min(N, M).</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N=2,M=2
A=[[1,2],[2,1]]
<strong>Output:</strong>
1
<strong>Explanation:</strong>
The sum of 1st row is equal to sum of
1st column and also sum of 2nd row is equal 
to the sum of 2nd column.So, Answer is 1.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N=1,M=3
A=[[5],[0],[0]]
<strong>Output:</strong>
1
<strong>Explanation:</strong>
The sum of 1st column is equal
to the sum of 1st row.Thus,answer is 1.
(We do not check for the 2nd and 3rd rows
because there are no 2nd and 3rd columns.)</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>sumOfRowCol()</strong> which takes two integers N, M and a 2D array A as input parameters and returns 1 if all the valid sum of rows is equal to the valid sum of columns. Otherwise, returns 0.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong>O(N*M)<br>
<strong>Expected Auxillary Space:</strong>O(min(N,M))</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=N,M,A[i][j]&lt;=10<sup>3</sup></span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Matrix</code>&nbsp;<code>Data Structures</code>&nbsp;