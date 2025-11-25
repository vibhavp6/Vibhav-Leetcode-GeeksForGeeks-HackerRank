<h2><a href="https://www.geeksforgeeks.org/problems/game-of-xor1541/1">Game of XOR</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p data-start="127" data-end="278"><span style="font-size: 14pt; font-family: 'andale mono', monospace;">You are given an integer array <code data-start="158" data-end="165"><strong>arr[]</strong>.</code>&nbsp;The <strong data-start="187" data-end="196">value</strong> of a subarray is defined as the <strong data-start="229" data-end="244">bitwise XOR</strong> of all elements in that subarray.</span><br><span style="font-size: 14pt; font-family: 'andale mono', monospace;">Your task is to compute the <strong data-start="308" data-end="363">bitwise XOR </strong>of the<strong data-start="308" data-end="363"> values </strong>of all possible<strong data-start="308" data-end="363"> subarrays</strong> of <code data-start="367" data-end="372">arr[]</code>.</span></p>
<p><span style="font-size: 14pt; font-family: 'andale mono', monospace;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt; font-family: 'andale mono', monospace;"><strong>Input:</strong> arr[] = [1, 2, 3] 
<strong>Output: </strong>2
<strong>Explanation:</strong>
xor[1] = 1
xor[1, 2] = 3
xor[2, 3] = 1
xor[1, 2, 3] = 0
xor[2] = 2
xor[3] = 3
Result : 1 ^ 3 ^ 1 ^ 0 ^ 2 ^ 3 = 2
</span></pre>
<pre><span style="font-size: 14pt; font-family: 'andale mono', monospace;"><strong>Input:</strong> arr[] = [1, 2]
<strong>Output: </strong>0
<strong>Explanation:</strong>
xor[1] = 1
xor[1, 2] = 3
xor[2] = 2
Result : 1 ^ 3 ^ 2 = 0</span></pre>
<p><span style="font-size: 14pt; font-family: 'andale mono', monospace;"><strong>Constraints:</strong></span><br><span style="font-size: 14pt; font-family: 'andale mono', monospace;">1&nbsp;<span style="color: #1e2229; background-color: #ffffff;">≤</span>&nbsp;arr.size()&nbsp;<span style="color: #1e2229; background-color: #ffffff;">≤</span>&nbsp;10<sup>5</sup></span><br><span style="font-size: 14pt; font-family: 'andale mono', monospace;">0 <span style="color: #1e2229; background-color: #ffffff;">≤ </span>arr[i]&nbsp;<span style="color: #1e2229; background-color: #ffffff;">≤</span>&nbsp;10<sup>9</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;<code>Bit Magic</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;