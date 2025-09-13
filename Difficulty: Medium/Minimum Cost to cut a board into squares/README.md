<h2><a href="https://www.geeksforgeeks.org/problems/minimum-cost-to-cut-a-board-into-squares/1">Minimum Cost to cut a board into squares</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a board of dimensions <strong>n × m</strong> that needs to be cut into <strong>n*m</strong> squares. The cost of making a cut along a horizontal or vertical edge is provided in two arrays:</span></p>
<ul>
<li><span style="font-size: 18px;"><strong>x[]:</strong> Cutting costs along the vertical edges (length-wise).</span></li>
<li><span style="font-size: 18px;"><strong>y[]: </strong>Cutting costs along the horizontal edges (width-wise).</span></li>
</ul>
<p><span style="font-size: 18px;">Find the <strong>minimum total cost</strong> required to cut the board into squares optimally.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:<br></strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> n = 4, m = 6, x[] = [2, 1, 3, 1, 4], y[] = [4, 1, 2]
<strong>Output: </strong>42
<strong>Explanation:</strong>
<img style="height: 218px; width: 327px;" src="https://media.geeksforgeeks.org/img-practice/board-1646284249.png" alt="">
For above board optimal way to cut into square is: <br>1. Pick 4 (from x) -&gt; vertical cut, </span><span style="font-size: 18px;">Cost = 4 × horizontal segments = 4,<br>   Vertical segments = 2, Total = 4.<br></span><span style="font-size: 18px;">2. Pick 4 (from y) -&gt; horizontal cut, Cost = 4 × vertical segments = 8,<br>   Horizontal segments = 2, Total = 12.<br>3. Pick 3 (from x) -&gt; vertical cut, Cost = 3 × horizontal segments = 6,<br>   Vertical segments = 3, Total = 18. <br>4. Pick 2 (from x) -&gt; vertical cut, Cost = 2 × horizontal segments = 4,<br>   Vertical segments = 4, Total = 22.<br>5. Pick 2 (from y) -&gt; horizontal cut, Cost = 2 × vertical segments = 8,<br>   Horizontal segments = 3, Total = 30.<br>6. Pick 1 (from x) -&gt; vertical cut, Cost = 1 × horizontal segments = 3,<br>   Vertical segments = 5, Total = 33.<br>7. Pick 1 (from x) -&gt; vertical cut, Cost = 1 × horizontal segments = 3,<br>   Vertical segments = 6, Total = 36.<br>8. Pick 1 (from y) -&gt; horizontal cut, Cost = 1 × vertical segments = 6,<br>   Horizontal segments = 4, Total = 42.<br></span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> n = 4, m = 4, x[] = [1, 1, 1], y[] = [1, 1, 1]<br></span><span style="font-size: 18px;"><strong style="font-size: 18px;">Output: </strong><span style="font-size: 18px;">15</span><strong style="font-size: 18px;">
Explanation:</strong><span style="font-size: 18px;"> 
<img style="height: 225px; width: 323px;" src="https://media.geeksforgeeks.org/img-practice/board-1646284249-1661926688.png" alt="">
For above board optimal way to cut into square is: 
1. Pick 1 (from y) -&gt; horizontal cut, Cost = 1 × vertical segments = 1,
   Horizontal segments = 2, Total = 1.
2. Pick 1 (from y) -&gt; horizontal cut, Cost = 1 × vertical segments = 1,
   Horizontal segments = 3, Total = 2.
3. Pick 1 (from y) -&gt; horizontal cut, Cost = 1 × vertical segments = 1,
   Horizontal segments = 4, Total = 3.
4. Pick 1 (from x) -&gt; vertical cut, Cost = 1 × horizontal segments = 4,
   Vertical segments = 2, Total = 7.
5. Pick 1 (from x) -&gt; vertical cut, Cost = 1 × horizontal segments = 4,
   Vertical segments = 3, Total = 11.
6. Pick 1 (from x) -&gt; vertical cut, Cost = 1 × horizontal segments = 4,
   </span></span><span style="font-size: 18px;">Vertical segments = 4, Total = 15.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br></span><span style="font-size: 18px;">2 ≤ n, m</span><span style="font-size: 18px;">&nbsp;≤ 10<sup>3<br></sup>1 ≤ x[i], y[j] ≤10<sup>3</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Greedy</code>&nbsp;<code>Algorithms</code>&nbsp;