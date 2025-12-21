<h2><a href="https://www.geeksforgeeks.org/problems/count-x-in-range-of-a-sorted-array/1">Count X in Range of a Sorted Array</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p class="MsoNormal"><span style="font-size: 14pt;">You are given a sorted array <strong>arr[]</strong> and a 2D array <strong>queries[][]</strong>, where queries[i] represents a query in the form<strong> [l, r, x]</strong>. </span><span style="font-size: 14pt;">For each query, count how many times the number x appears in the subarray <strong>arr[l...r]</strong> (inclusive).</span></p>
<p class="MsoNormal"><strong><span style="font-size: 14pt;">Examples:</span></strong></p>
<pre class="MsoNormal"><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [1, 2, 2, 4, 5, 5, 5, 8], queries[][] = [[0, 7, 5], [1, 2, 2], [0, 3, 7]]</span><br><span style="font-size: 14pt;"><strong>Output:</strong> [3, 2, 0]<br><strong>Explanation:</strong></span><br><span style="font-size: 14pt;">Query [0, 7, 5] → elements from index 0 to 7 are [1, 2, 2, 4, 5, 5, 5, 8].
Number 5 occurs 3 times.
Query [1, 2, 2] → subarray is [2, 2], and 2 occurs 2 times.
Query [0, 3, 7] → subarray is [1, 2, 2, 4], and 7 is not present.</span></pre>
<pre class="MsoNormal"><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 3, 3, 3, 6, 7, 8], queries[][] = [[0, 3, 3], [4, 6, 3], [1, 5, 6]]
<strong>Output:</strong> [3, 0, 1]
<strong>Explanation:</strong>
Query [0, 3, 3] → subarray [1, 3, 3, 3], and 3 appears 3 times.
Query [4, 6, 3] → subarray [6, 7, 8], 3 not found.
Query [1, 5, 6] → subarray [3, 3, 3, 6, 7], and 6 occurs 1 time.</span></pre>
<p><strong style="font-size: 18px;">Constraints:</strong><br style="font-size: 18px;"><span style="font-size: 18px;">1 ≤ arr.size(), queries.size() ≤ 10</span><sup>5</sup><br style="font-size: 18px;"><span style="font-size: 18px;">1 ≤ arr[i], x</span><span style="font-size: 18px;"> ≤ 10</span><sup>6<br></sup><span style="font-size: 18px;">0 ≤ l ≤ r &lt; arr.size()<br></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Binary Search</code>&nbsp;<code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;