<h2><a href="https://www.geeksforgeeks.org/problems/maximum-sum-increasing-subsequence4749/1">Max Sum Increasing Subsequence</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p data-pm-slice="0 0 []">Given an array of positive integers <strong>arr[]</strong>, find the <strong>maximum sum </strong>of a subsequence such that the elements of the subsequence form a <strong>strictly increasing sequence</strong>.<br>In other words, among all strictly increasing subsequences of the array, return the one with the <strong>largest possible sum.</strong></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: arr[] = [1, 101, 2, 3, 100]
<strong>Output:</strong> 106
<strong>Explanation</strong>: The maximum sum of an increasing sequence is obtained from [1, 2, 3, 100].</span></pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: arr[] = [4, 1, 2, 3]
<strong>Output:</strong> 6
<strong>Explanation</strong>: The maximum sum of an increasing sequence is obtained from [1, 2, 3].<br></span></pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: arr[] = [4, 1, 2, 4]
<strong>Output:</strong> 7
<strong>Explanation</strong>: The maximum sum of an increasing sequence is obtained from [1, 2, 4].</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>3</sup></span><br><span style="font-size: 18px;">1 ≤ arr[i] ≤ 10<sup>5</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Morgan Stanley</code>&nbsp;<code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;<code>Algorithms</code>&nbsp;