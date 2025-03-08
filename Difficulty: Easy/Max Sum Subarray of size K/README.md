<h2><a href="https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1">Max Sum Subarray of size K</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array of integers<strong> arr[]&nbsp;</strong> and a number<strong> k</strong>. Return&nbsp;the <strong>maximum sum</strong> of a subarray of size k.</span></p>
<p><span style="font-size: 14pt;">Note: A subarray is a contiguous part of any given array.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [100, 200, 300, 400] , k = 2
<strong>Output: </strong>700
<strong>Explanation: </strong>arr<sub>3 </sub> + arr<sub>4</sub> = 700, which is maximum.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [100, 200, 300, 400] , k = 4
<strong>Output: </strong>1000
<strong>Explanation: </strong>arr<sub>1</sub> + arr<sub>2</sub> + arr<sub>3 </sub>+ arr<sub>4</sub> = 1000, </span><span style="font-size: 18px;"><span style="font-size: 14pt;">which is maximum.</span><br></span></pre>
<pre><span style="font-size: 18px;"><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [100, 200, 300, 400] , k = 1
<strong>Output: </strong>400
<strong>Explanation: </strong>arr<sub>4</sub> = 400, which is maximum.</span></span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= arr.size() &lt;= 10<sup>6<br></sup>1 &lt;= arr[i]&lt;= 10<sup>6<br></sup></span><span style="font-size: 18px;">1 &lt;= k&lt;= arr.size()</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>OYO Rooms</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>prefix-sum</code>&nbsp;<code>sliding-window</code>&nbsp;<code>Misc</code>&nbsp;<code>Algorithms</code>&nbsp;