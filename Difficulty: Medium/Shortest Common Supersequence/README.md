<h2><a href="https://www.geeksforgeeks.org/problems/shortest-common-supersequence0322/1">Shortest Common Supersequence</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given two strings <strong>s1</strong> and <strong>s2</strong>, find the length of the <strong>smallest string </strong>which has both <strong>s1 </strong>and<strong> s2 </strong>as its <strong>sub-sequences</strong>.<br><strong>Note:</strong> s1 and s2&nbsp;can have both uppercase and lowercase English letters.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s1 = "geek", s2 = "eke"
<strong>Output: </strong>5<strong>
Explanation: </strong>String "geeke" has both string "geek" and "eke" as subsequences.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s1 = "AGGTAB", s2 = "GXTXAYB"
<strong>Output: </strong>9<strong>
Explanation: </strong>String "AGXGTXAYB" has both string "AGGTAB" and "GXTXAYB" as subsequences.<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s1 = "geek", s2 = "ek"
<strong>Output: </strong>4<strong>
Explanation: </strong>String "geek" has both string "geek" and "ek" as subsequences.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ s1.size(), s2.size() ≤ 500</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;<code>Dynamic Programming</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;