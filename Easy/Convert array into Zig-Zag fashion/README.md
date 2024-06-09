<h2><a href="https://www.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1">Convert array into Zig-Zag fashion</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array&nbsp;<strong>arr</strong> of distinct elements of size&nbsp;<strong>n</strong>, the task is to rearrange the elements of the array in a zig-zag fashion so that the converted array should be in the below form:&nbsp;</span></p>
<blockquote>
<p><span style="font-size: 18px;"><strong>arr[0] &lt; arr[1] &nbsp;&gt; arr[2] &lt; arr[3] &gt; arr[4] &lt; . . . . arr[n-2] &lt; arr[n-1] &gt; arr[n]</strong>.&nbsp;</span></p>
</blockquote>
<p><span style="font-size: 18px;"><strong>Note: </strong>Modify the given arr[] only,<strong> </strong>If your transformation is correct, the output will be 1 else the output will be 0.&nbsp;</span></p>
<p><span style="font-size: 18px;"><strong>Examples</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 7, arr[] = {4, 3, 7, 8, 6, 2, 1}
<strong>Output: </strong>3 7 4 8 2 6 1
<strong>Explanation:</strong> 3 &lt; 7 &gt; 4 &lt; 8 &gt; 2 &lt; 6 &gt; 1</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 4, arr[] = {1, 4, 3, 2}
<strong>Output:</strong> 1 4 2 3
<strong>Explanation: </strong>1 &lt; 4 &gt; 2 &lt; 3</span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(n)<br><strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= n &lt;= 10<sup>6</sup><br>0 &lt;= arr<sub>i</sub> &lt;= 10<sup>9</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Paytm</code>&nbsp;<code>Amazon</code>&nbsp;<code>Adobe</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;