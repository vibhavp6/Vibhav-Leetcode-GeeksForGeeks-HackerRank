<h2><a href="https://www.geeksforgeeks.org/problems/array-to-bst4443/1">Array to BST</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a <strong>sorted </strong>array. Convert it into a <strong>Height Balanced</strong> Binary Search Tree (BST). Return the <strong>root </strong>of the BST.</span></p>
<blockquote>
<p><span style="font-size: 18px;"><strong>Height-balanced</strong> BST means a binary tree in which the depth of the left subtree and the right subtree of every node never differ by more than 1.</span></p>
</blockquote>
<p><span style="font-size: 18px;">Note: The driver code will check the BST, if it is a Height-balanced BST, the output will be <strong>true</strong> otherwise the output will be <strong>false</strong>.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> nums = [1, 2, 3, 4]
<strong>Output:</strong> true
<strong>Explanation:</strong> The preorder traversal of the following BST formed is [2, 1, 3, 4]:
</span><span style="font-size: 18px;">&nbsp;          2
</span><span style="font-size: 18px;">&nbsp;        /   \
</span>        <span style="font-size: 18px;">1     3
</span><span style="font-size: 18px;">&nbsp;              \
&nbsp;               4</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>nums = [1, 2, 3, 4, 5, 6, 7]
<strong>Ouput: </strong>true
<strong>Explanation: </strong>The preorder traversal of the following BST formed is [4, 2, 1, 3, 6, 5, 7]:
        4
       / \
      2   6
     / \   / \
    1 3  5 7</span>
</pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity: </strong>O(n)<br><strong>Expected Auxillary Space: </strong>O(n)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ nums.size() ≤ 10<sup>5</sup><br>1 ≤ nums[i] ≤ 10<sup>5</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Snapdeal</code>&nbsp;<code>Adobe</code>&nbsp;<code>Cisco</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Binary Search Tree</code>&nbsp;<code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;