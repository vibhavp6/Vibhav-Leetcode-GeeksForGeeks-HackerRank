<h2><a href="https://www.geeksforgeeks.org/problems/geeks-training/1">Geek's Training</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Geek is going for a training program for n days. He can perform any of these activities: <strong>Running</strong>, <strong>Fighting</strong>, and <strong>Learning </strong>Practice. Each activity has some point on each day. As Geek wants to improve all his skills, he can't do the same activity on two consecutive days.&nbsp;Given a 2D array <code>arr[][]</code> of size n where <code>arr[i][0]</code>, <code>arr[i][1]</code>, and <code>arr[i][2]</code> represent the merit points for <strong>Running</strong>, <strong>Fighting</strong>, and <strong>Learning</strong> on the i-th day, determine the maximum total merit points Geek can achieve .</span></p>
<p><span style="font-size: 14pt;"><strong>Example:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[]= [[1, 2, 5], [3, 1, 1], [3, 3, 3]]
<strong>Output: </strong>11
<strong>Explanation: </strong>Geek will learn a new move and earn 5 point then on second day he will do running and earn 3 point and on third day he will do fighting and earn 3 points so, maximum merit point will be 11.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[]= [[1, 1, 1], [2, 2, 2], [3, 3, 3]]
<strong>Output: </strong>6
<strong>Explanation: </strong>Geek can perform any activity each day while adhering to the constraints, in order to maximize his total merit points as 6.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[]= [[4, 2, 6]]
<strong>Output: </strong>6
<strong>Explanation: </strong>Geek will learn a new move to make his merit points as 6.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraint:</strong><br>1 &lt;=&nbsp; n &lt;= 10<sup>5&nbsp; &nbsp;</sup><br>1 &lt;=&nbsp; arr[i][j] &lt;= 100<br></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;<code>Arrays</code>&nbsp;