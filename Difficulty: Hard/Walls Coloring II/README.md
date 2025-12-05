<h2><a href="https://www.geeksforgeeks.org/problems/walls-coloring-ii--170647/1">Walls Coloring II</a></h2><h3>Difficulty Level : Difficulty: Hard</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">You are given <strong>n</strong> walls arranged in a row, and each wall must be painted using one of the <strong>k</strong> available colors. The cost of painting&nbsp;</span><strong style="font-size: 18px;">ith </strong><span style="font-size: 18px;">wall </span><span style="font-size: 18px;">with&nbsp;</span><strong style="font-size: 18px;">jth </strong><span style="font-size: 18px;">color </span><span style="font-size: 18px;">is given by </span><strong style="font-size: 18px;">costs[i][j]</strong><span style="font-size: 18px;">. Your task is to determine the </span><strong style="font-size: 18px;">minimum total cost</strong><span style="font-size: 18px;"> required to paint all the walls in such a way that </span><strong style="font-size: 18px;">no two adjacent walls</strong><span style="font-size: 18px;"> share the same color. If it is impossible to paint the walls under this condition, you must return </span><strong style="font-size: 18px;">-1</strong><span style="font-size: 18px;">.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 4, k = 3,<br>costs[][] = [[1, 5, 7],
           [5, 8, 4],
&nbsp;          [3, 2, 9],
&nbsp;          [1, 2, 4]]

<strong>Output: </strong>8
<strong>Explanation:</strong>
Paint wall 0 with color 0. Cost = 1
Paint wall 1 with color 2. Cost = 4
Paint wall 2 with color 1. Cost = 2
Paint wall 3 with color 0. Cost = 1
Total Cost = 1 + 4 + 2 + 1 = 8</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 5, k = 1,
costs[][] = [[5],
           [4],
&nbsp;          [9],
&nbsp;          [2],
&nbsp;          [1]]
<strong>Output: </strong>-1
<strong>Explanation: </strong>It is not possible to color all the walls under the given conditions.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:<br></strong></span><span style="font-size: 18px;">0<span style="color: #1e2229; font-family: Nunito; font-size: 17px; background-color: #ffffff;">&nbsp;≤</span> n&nbsp;<span style="color: #1e2229; font-family: Nunito; font-size: 17px; background-color: #ffffff;">&nbsp;≤ </span>10<sup>3<br></sup></span><span style="font-size: 18px;">0<span style="color: #1e2229; font-family: Nunito; font-size: 17px; background-color: #ffffff;">&nbsp;≤</span> k&nbsp;<span style="color: #1e2229; font-family: Nunito; font-size: 17px; background-color: #ffffff;">&nbsp;≤ </span>10<sup>3<br></sup></span><span style="font-size: 18px;">1<span style="color: #1e2229; font-family: Nunito; font-size: 17px; background-color: #ffffff;">&nbsp;≤ </span>costs[i][j]&nbsp;<span style="color: #1e2229; font-family: Nunito; font-size: 17px; background-color: #ffffff;">&nbsp;≤ </span>10<sup>5</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;