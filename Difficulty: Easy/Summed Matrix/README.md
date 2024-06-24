<h2><a href="https://www.geeksforgeeks.org/problems/summed-matrix5834/1">Summed Matrix</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px; color: #000000;"><span style="font-family: Mulish, sans-serif; font-size: 14pt; background-color: #ffffff;">A matrix is constructed of size<strong> n*n</strong> and given an integer ‘<strong>q’.</strong> The value at every cell of the matrix is given as, <strong>M(i,j) = i+j,</strong> where ‘<strong>M(i,j)</strong>' is the value of a cell, ‘<strong>i</strong>’ is the row number, and ‘<strong>j’</strong> is the column number. Return the number of cells having value ‘<strong>q</strong>’.</span></span></p>
<p><span style="font-size: 18px;"><strong>Note:</strong> Assume, the array is in 1-based indexing.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input:</strong> </span><span style="font-size: 18px;"><strong>n = </strong>4, <strong>q = </strong>7</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Output:</span> </strong></span><span style="font-size: 18px;">2</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Explanation:</span> </strong></span><span style="font-size: 18px;">Matrix becomes
2 3 4 5 
3 4 5 6 
4 5 6 7
5 6 7 8
</span><span style="font-size: 18px;">The count of 7 is 2.</span></pre>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input:</strong> </span><span style="font-size: 18px;"><strong>n = </strong>5, <strong>q = </strong>4</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Output:</span> </strong></span><span style="font-size: 18px;">3</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Explanation:</span> </strong></span><span style="font-size: 18px;">Matrix becomes
2 3 4 5 6&nbsp;
3 4 5 6 7&nbsp;
4 5 6 7 8&nbsp;
5 6 7 8 9&nbsp;
6 7 8 9 10&nbsp;
The count of 4 is 3.</span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(1)<br><strong>Expected Auxiliary Space:</strong> O(1)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 ≤ n,q ≤ 10<sup>18</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>number-theory</code>&nbsp;<code>Mathematical</code>&nbsp;<code>Matrix</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;