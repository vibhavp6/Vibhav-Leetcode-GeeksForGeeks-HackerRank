<h2><a href="https://www.geeksforgeeks.org/problems/divisibility-tree1902/1">Divisibility tree</a></h2><h3>Difficulty Level : Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a tree with n nodes numbered from 1 to n and n - 1 edges connecting them. The tree is rooted at node 1. Your task is to remove a maximum number of edges from the given tree such that the tree converts into a disjoint union tree and the nodes of connected components left are divisible by 2. If n is odd, then it is allowed to keep exactly one component with an odd number of nodes.</span>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: <br></strong>n = 10<br>edges = {{2,1},{3,1},{4,3},{5,2},{6,1},{7,2},{8,6},{9,8},{10,8}}
<strong>Output:<br></strong>2
<strong>Explanation:<br></strong>Take two integers at a time i.e. 2 is connected with 1, 3 is connected with 1,4 is 
connected with 3, 5 is connected with 2 and so on. Fig will understand you better.
Original tree:<br>
</span><img src="https://contribute.geeksforgeeks.org/wp-content/uploads/1466090203-2e0cf4f1be-even.png"><span style="font-size: 18px;"> &nbsp;&nbsp;
After removing edge 1-3 and 1-6. So ans is 2 because all nodes are even.<br>
</span><img src="https://contribute.geeksforgeeks.org/wp-content/uploads/image1-1.png">
</pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: <br></strong>n = 4<br>edges = {{2,1},{4,2},{1,3}}
<strong>Output:<br></strong>1
<strong>Explanation:<br></strong>Removing the edge 2-1 will convert the tree into disjoint union tree with nodes of connected component left is divisible by 2. </span></pre>
<p><strong><span style="font-size: 18px;">Your Task:</span></strong><br><span style="font-size: 18px;">You don't need to read or print anyhting. Your task is to complete the function <strong>minimumEdgeRemove()&nbsp;</strong>which takes n and edges as input parameter and returns the minimum number of edges which is removed to make the tree disjoint union tree such that the tree converts into disjoint union tree so that nodes of connected component left is divisible by 2.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Compelxity:&nbsp;</strong>O(n)<br><strong>Expected Space Comeplxity:&nbsp;</strong>O(1)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= n &lt;= 10<sup>5</sup><br>edges.length == n - 1<br>1 &lt;= edges[i][0], </span><span style="font-size: 18px;">edges[i][1] &lt;= n</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>DFS</code>&nbsp;<code>Graph</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;