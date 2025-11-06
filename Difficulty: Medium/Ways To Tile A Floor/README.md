<h2><a href="https://www.geeksforgeeks.org/problems/ways-to-tile-a-floor5836/1">Ways To Tile A Floor</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given a floor of dimensions <strong>2 x n</strong> and tiles of dimensions <strong>2 x 1</strong>, the task is to find the <strong>number of ways</strong> the floor can be tiled. A tile can either be placed horizontally i.e as a 1 x 2 tile or vertically i.e as 2 x 1 tile.&nbsp;<br></span></p>
<p><span style="font-size: 14pt;"><strong>Note:</strong> Two tiling arrangements are considered different if the placement of at least one tile differs.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>n = 3
<strong>Output: </strong>3
<strong>Explanation: </strong>We need 3 tiles to tile the board of size 2 x 3.
We can tile in following ways:
1) Place all 3 tiles vertically.
2) Place first tile vertically and remaining 2 tiles horizontally.
3) Place first 2 tiles horizontally and remaining tiles vertically.<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/914220/Web/Other/blobid0_1762232770.jpg" width="395" height="171"><br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>n = 4
<strong>Output: </strong>5
<strong>Explanation: </strong>We need 4 tiles to tile the board of size 2 x 4.<br>We can tile in following ways:
1) All 4 vertical
2) All 4 horizontal
3) First 2 vertical, remaining 2 horizontal.
4) First 2 horizontal, remaining 2 vertical.
5) Corner 2 vertical, middle 2 horizontal.<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/914220/Web/Other/blobid1_1762232981.jpg" width="408" height="165"><br></span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong></span><br><span style="font-size: 14pt;">1&nbsp;<span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">≤ </span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">n&nbsp;</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">≤</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"> 45</span></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Fibonacci</code>&nbsp;<code>Dynamic Programming</code>&nbsp;<code>Recursion</code>&nbsp;