<h2><a href="https://www.geeksforgeeks.org/problems/diagonal-traversal-of-binary-tree/1">Diagonal Tree Traversal</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a Binary Tree, print the <strong>diagonal traversal</strong> of the binary tree.</span></p>
<p><span style="font-size: 18px;">Consider lines of slope -1 passing between nodes. Given a Binary Tree, print all diagonal elements in a binary tree belonging to same line.<br>If the diagonal element are present in two different subtress then left subtree diagonal element should be taken first and then right subtree.&nbsp;</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong> :
&nbsp;           8
&nbsp;        /     \
&nbsp;       3      10
&nbsp;     /   \      \
&nbsp;    1     6     14
&nbsp;        /   \   /
&nbsp;       4     7 13
<strong>Output</strong> : 8 10 14 3 6 7 13 1 4
<strong>Explanation</strong>:
<a href="http://d1hyf4ir1gqw6c.cloudfront.net//wp-content/uploads/unnamed1.png"><img class="alignnone size-full wp-image-137695" style="height: 264px; width: 406px;" src="https://contribute.geeksforgeeks.org/wp-content/uploads/diagonal.jpg" alt="unnamed">
</a>Diagonal Traversal of binary tree : 
 8 10 14 3 6 7 13 1 4</span>
</pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>You don't need to read input or print anything. The task is to complete the function<strong> diagonal()&nbsp;</strong>that takes the root node<strong>&nbsp;</strong>as input argumets<strong> </strong>and returns the diagonal traversal of the given tree.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong>O(N).<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(N).</span><br><span style="font-size: 18px;">Here N is number of nodes.</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= Number of nodes&lt;= 10<sup>5</sup><br>1 &lt;= Data of a node&lt;= 10<sup>5</sup></span><br>&nbsp;</p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;