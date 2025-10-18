<h2><a href="https://www.geeksforgeeks.org/problems/median-of-bst/1">Median of BST</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p class="MsoNormal"><span style="font-size: 14pt;">You are given the&nbsp;<strong>root&nbsp;</strong>of a Binary Search Tree, find the median of it.&nbsp;</span></p>
<p class="MsoNormal"><span style="font-size: 14pt;">Let the nodes of the BST, when written in ascending order (inorder traversal), be represented as V1, V2, V3, …, Vn, where n is the total number of nodes in the BST.</span></p>
<ul style="margin-top: 0in;" type="disc">
<li class="MsoNormal"><span style="font-size: 14pt;">If number of nodes are even: return&nbsp;<strong>V(n/2)</strong></span></li>
<li class="MsoNormal"><span style="font-size: 14pt;">If number of nodes are odd: return&nbsp;<strong>V((n+1)/2)</strong></span></li>
</ul>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root = [20, 8, 22, 4, 12, N, N, N, N, 10, 14]
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20251007111944537098/2.webp" alt="2" width="271" height="333"><strong>
Output: </strong>12
<strong>Explanation: </strong>The inorder of given BST is 4, 8, 10, 12, 14, 20, 22. Here, n = 7, so, here median will be ((7+1)/2)th value, i.e., 4th value, i.e, 12.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root = [5, 4, 8, 1]
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20251007111944589768/1.webp" alt="1" width="281" height="247">&nbsp;<strong>
Output: </strong>4<strong>
Explanation: </strong></span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; font-size: 14pt;">The inorder of given BST is 1, 4, 5, 8. Here, n = 4(even), so, here median will be (4/2)th value, i.e., 2nd value, i.e, 4.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 <span style="color: #1e2229; font-family: Nunito; font-size: 17px; background-color: #ffffff;">≤ </span>number of nodes <span style="color: #1e2229; font-family: Nunito; font-size: 17px; background-color: #ffffff;">≤ </span>10<sup>5<br></sup>1 ≤ node.data ≤&nbsp;&nbsp;10<sup>5</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Traversal</code>&nbsp;<code>Binary Search Tree</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;