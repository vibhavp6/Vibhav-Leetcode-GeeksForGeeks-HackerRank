<h2><a href="https://www.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1">Dijkstra Algorithm</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given a weighted, undirected and connected graph where you have given <a title="adjacency list" href="https://www.geeksforgeeks.org/adjacency-list-meaning-definition-in-dsa/" target="_blank" rel="noopener">adjacency list</a> <strong>adj.</strong> You have to find the shortest distance of all the vertices from the source vertex <strong>src</strong>, and return a list of integers denoting the shortest distance between <strong>each node</strong> and source vertex<strong> src</strong>.</span></p>
<p><span style="font-size: 14pt;"><strong>Note: </strong>The Graph doesn't contain any negative weight edge.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>adj<strong> </strong>=<strong> </strong>[[[1, 9]], [[0, 9]]], src<strong> </strong>= 0
<strong>Output: </strong>[0, 9]
<strong>Explanation</strong>:
<img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700334/Web/Other/6a77963c-f9a6-4cf4-953c-19a2759a52a3_1685086564.png" alt="">
The source vertex is 0. Hence, the shortest distance of node 0 is 0 and the shortest distance from node 0 to 1 is 9.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>adj = [[[1, 1], [2, 6]], [[2, 3], [0, 1]], [[1, 3], [0, 6]]], src<strong> </strong>= 2
<strong>Output: </strong>[4, 3, 0]
<strong>Explanation</strong>:
<img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700334/Web/Other/8c9ee3a2-a7d3-4028-ae22-a22ddb6ab7a3_1685086565.png" alt="">
For nodes 2 to 0, we can follow the path 2-1-0. This has a distance of 1+3 = 4, whereas the path 2-0 has a distance of 6. So, the Shortest path from 2 to 0 is 4.
The shortest distance from 0 to 1 is 1 .</span></pre>
<div><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ no. of vertices&nbsp;≤ 1000<br>0 ≤ adj[i][j] ≤ 1000</span></div>
<div><span style="font-size: 14pt;">0 ≤ src &lt; no. of vertices</span></div></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Graph</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;