<h2><a href="https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1">Undirected Graph Cycle</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an undirected graph with V vertices labelled from 0 to V-1 and E edges, check whether the graph contains any cycle or not. The Graph is represented as an adjacency list, where adj[i] contains all the vertices that are directly connected to vertex <em>i.</em></span></p>
<p><strong><span style="font-size: 18px;">NOTE:&nbsp;</span></strong><span style="font-size: 18px;">The adjacency list represents undirected edges, meaning that if there is an edge between vertex&nbsp;<em>i</em> and vertex&nbsp;<em>j, </em>both j will be adj[i] and i will be in adj[j].</span><span style="font-size: 18px;"><strong><img src="C:\Users\Mukul kumar\Desktop\GFG_PIC.JPG" alt=""></strong></span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>adj = [[1], [0,2,4], [1,3], [2,4], [1,3]]<strong>&nbsp;</strong>
<strong>Output: </strong>1
<strong>Explanation:</strong> 
</span><img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700219/Web/Other/891791f9-1abb-45b1-80f2-7af46d73dcd2_1685086491.png" alt="">
<span style="font-size: 18px;">1-&gt;2-&gt;3-&gt;4-&gt;1 is a cycle.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>adj = [[], [2], [1,3], [2]]</span>
<strong><span style="font-size: 18px;">Output: </span></strong><span style="font-size: 18px;">0
<strong>Explanation: 
</strong></span><img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700219/Web/Other/d8cbd97e-406e-4f50-a38c-6a58747df876_1685086491.png" alt="">
<span style="font-size: 18px;">No cycle in the graph.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ adj.size() ≤ 10<sup>5</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>Samsung</code>&nbsp;<code>MakeMyTrip</code>&nbsp;<code>Oracle</code>&nbsp;<code>Adobe</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>DFS</code>&nbsp;<code>Graph</code>&nbsp;<code>union-find</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;