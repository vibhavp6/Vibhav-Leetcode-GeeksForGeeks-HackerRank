<h2><a href="https://www.geeksforgeeks.org/problems/course-schedule/1">Course Schedule II</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p class="MsoNormal"><span style="font-size: 14pt;">You are given&nbsp;<strong>n&nbsp;</strong>courses, labeled from&nbsp;<strong>0 to n - 1</strong> and a 2d array <strong>prerequisites[][]</strong>&nbsp;where prerequisites[i] =&nbsp;<strong>[x, y]</strong> indicates that we need to take course&nbsp; <strong>y</strong>&nbsp;first if we want to take course<strong>&nbsp;x</strong>.</span></p>
<p class="MsoNormal"><span style="font-size: 14pt;">Find the ordering of courses we should take to complete all the courses.</span></p>
<p><span style="font-size: 18px;"><strong>Note: </strong>There may be multiple correct orders, you just need to return any one of them. If it is impossible to finish all tasks, return an empty array. </span><span style="font-size: 18px;">The Driver code will print <strong>true </strong>if you return any correct order of courses else it will print <strong>false</strong>.&nbsp;</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 3, prerequisites[][] = [[1, 0], [2, 1]]
<strong>Output: </strong>true<strong>
Explanation: </strong></span><span style="font-size: 14pt;">To take course 1, you must finish course 0. To take course 2, you must finish course 1. So the only valid order is [0, 1, 2].</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 4, prerequisites[][] = [[2, 0], [2, 1], [3, 2]]
<strong>Output: </strong>true<strong>
Explanation: </strong></span><span style="font-size: 14pt;">Course 2 requires both 0 and 1. Course 3 requires course 2. Hence, both [0, 1, 2, 3] and [1, 0, 2, 3] are valid.</span></pre>
<div><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>4</sup></span></div>
<div><span style="font-size: 18px;"><span style="font-size: 18px;">0 </span></span><span style="font-size: 18px;">≤ prerequisites.size()&nbsp;≤ 10<sup>5</sup></span></div>
<div>
<div><span style="font-size: 18px;">0 ≤ prerequisites[i][0], prerequisites[i][1] &lt; n<br>All prerequisite pairs are unique</span></div>
<div><span style="font-size: 18px;">prerequisites[i][0] ≠ prerequisites[i][1]</span></div>
</div></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Google</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>DFS</code>&nbsp;<code>Graph</code>&nbsp;<code>BFS</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;