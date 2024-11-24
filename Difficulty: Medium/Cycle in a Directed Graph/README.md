<h2><a href="https://www.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1">Cycle in a Directed Graph</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a Directed Graph with <strong>V</strong> vertices (Numbered from <strong>0</strong> to <strong>V-1</strong>) and <strong>E</strong> edges, check whether it contains any cycle or not.<br>The graph is represented as an adjacency list, where <code>adj[i]</code> contains a list of vertices that are directly reachable from vertex <span class="katex"><span class="katex-mathml">i</span></span>. Specifically, <code>adj[i][j]</code> represents an edge from vertex <span class="katex"><span class="katex-mathml">i</span></span> to vertex <span class="katex"><span class="katex-mathml">j</span></span>.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong></span>

<span style="font-size: 18px;"><img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700218/Web/Other/9a013355-2510-4ab0-b554-1a2b9f6cb44f_1685086462.png" alt=""></span>

<span style="font-size: 18px;"><strong>Output:</strong> 1
<strong>Explanation</strong>: 3 -&gt; 3 is a cycle</span></pre>
<pre><span style="font-size: 18px;"><strong>Example 2:<br></strong></span><span style="font-size: 18px;"><strong>Input:</strong></span>
<img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700218/Web/Other/b1096e14-7c18-47d8-a4e9-8dd42b2e466f_1685086462.png" alt="">

<span style="font-size: 18px;"><strong>Output:</strong> 0
<strong>Explanation</strong>: no cycle in the graph</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ V, E ≤ 10<sup>5</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>Samsung</code>&nbsp;<code>MakeMyTrip</code>&nbsp;<code>Oracle</code>&nbsp;<code>Goldman Sachs</code>&nbsp;<code>Adobe</code>&nbsp;<code>BankBazaar</code>&nbsp;<code>Rockstand</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Graph</code>&nbsp;<code>Data Structures</code>&nbsp;