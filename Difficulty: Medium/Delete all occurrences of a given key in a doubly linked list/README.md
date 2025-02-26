<h2><a href="https://www.geeksforgeeks.org/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list/1">Delete all occurrences of a given key in a doubly linked list</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p dir="ltr"><span style="font-size: 18px;">You are given the <strong>head_ref</strong> of a doubly Linked List and a <strong>Key</strong>. Your task is to <strong>delete all occurrences</strong> of the given key if it is present and return the new DLL.</span></p>
<p dir="ltr"><strong><span style="font-size: 18px;">Example1:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> </span>
<span style="font-size: 18px;">2&lt;-&gt;2&lt;-&gt;10&lt;-&gt;8&lt;-&gt;4&lt;-&gt;2&lt;-&gt;5&lt;-&gt;2</span>
<span style="font-size: 18px;">2</span>
<span style="font-size: 18px;"><strong>Output:</strong> </span>
<span style="font-size: 18px;">10&lt;-&gt;8&lt;-&gt;4&lt;-&gt;5</span>
<strong><span style="font-size: 18px;">Explanation: </span></strong>
<span style="font-size: 18px;">All Occurences of 2 have been deleted.<br><br></span></pre>
<p dir="ltr" style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; font-size: medium; white-space: normal;"><strong><span style="font-size: 18px;">Example2:</span></strong></p>
<pre><strong>Input:</strong> 
9&lt;-&gt;1&lt;-&gt;3&lt;-&gt;4&lt;-&gt;5&lt;-&gt;1&lt;-&gt;8&lt;-&gt;4
9
<strong>Output:</strong> 
1&lt;-&gt;3&lt;-&gt;4&lt;-&gt;5&lt;-&gt;1&lt;-&gt;8&lt;-&gt;4
<strong>Explanation: </strong>
All Occurences of 9 have been deleted.</pre>
<p dir="ltr"><strong><span style="font-size: 18px;">Your Task:</span></strong></p>
<p dir="ltr"><span style="font-size: 18px;">Complete the function void <strong>deleteAllOccurOfX(struct Node** head_ref, int key)</strong>, which takes the reference of the head pointer and an integer value key. Delete all occurrences of the key from the given DLL.</span></p>
<p dir="ltr"><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(N).</span></p>
<p dir="ltr"><span style="font-size: 18px;"><strong>Expected Auxiliary Space:</strong> O(1).</span></p>
<p dir="ltr"><strong><span style="font-size: 18px;">Constraints:</span></strong></p>
<p dir="ltr"><span style="font-size: 18px;">1&lt;=Number of Nodes&lt;=10<sup>5</sup></span></p>
<p dir="ltr"><span style="font-size: 18px;">0&lt;=Node Value &lt;=10<sup>9</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>doubly-linked-list</code>&nbsp;