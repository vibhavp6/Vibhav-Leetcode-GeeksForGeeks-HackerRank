<h2><a href="https://www.geeksforgeeks.org/problems/check-if-two-nodes-are-cousins/1?page=2&difficulty%5B%5D=0&category%5B%5D=Tree&sortBy=submissions">Check if two Nodes are Cousins</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a binary tree (having <strong>distinct</strong> node values)<strong>root</strong> and two node values. Check whether <span style="box-sizing: border-box; margin: 0px; padding: 0px;">or not the two nodes with values <strong>a </strong>and <strong>b</strong> are&nbsp;<strong>cousins</strong></span>.<br></span><span style="font-size: 18px;"><strong>Note:</strong> Two nodes of a binary tree are&nbsp;<strong>cousins</strong> if they have the same depth with different parents</span><span style="font-size: 18px;">.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input:
&nbsp;     </strong><span style="font-size: 18px;">1
&nbsp;   /   \
</span><strong style="font-size: 18px;">   </strong><span style="font-size: 18px;">2     3
a = 2, b = 3</span><strong style="font-size: 18px;">
Output: </strong><span style="font-size: 18px;">false<br><strong>Explanation</strong>: Here, nodes 2 and 3 areat the same level but have sameparent nodes.</span></span></pre>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>&nbsp; &nbsp; &nbsp; &nbsp;1
&nbsp; &nbsp; &nbsp;/&nbsp;  \&nbsp;
&nbsp;  &nbsp;2&nbsp; &nbsp;  3
&nbsp;  /&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;\
<strong>  </strong>5&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;4<strong>&nbsp;
</strong>a = 5, b = 4<strong>
Output: </strong>True<strong>
Explanation: </strong>Here, nodes 5 and 4 areat the same level and have differentparent nodes. Hence, they both are cousins </span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong>O(Number of Nodes).<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(Number of Nodes).</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= number of nodes &lt;= 10<sup>5<br></sup>1 &lt;= a, b &lt;= 10<sup>5</sup><sup><br></sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<code>D-E-Shaw</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Tree</code>&nbsp;<code>DFS</code>&nbsp;<code>Arrays</code>&nbsp;<code>BFS</code>&nbsp;