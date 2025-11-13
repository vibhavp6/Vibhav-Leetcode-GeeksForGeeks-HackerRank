<h2><a href="https://www.geeksforgeeks.org/problems/interleaved-strings/1">Interleaved Strings</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given strings <strong>s1</strong>, <strong>s2</strong>, and <strong>s3</strong>, find whether <strong>s3</strong> is formed by an <strong>interleaving </strong>of <strong>s1</strong> and <strong>s2</strong>.<br><strong>Interleaving </strong>of two strings s1 and s2 is a way to mix their characters to form a <strong>new string s3</strong>, while maintaining the <strong>relative order</strong> of characters from s1 and s2. Conditions for interleaving:<br></span></p>
<ol>
<li><span style="font-size: 14pt;">Characters from s1 must appear in the same order in s3 as they are in s1.</span></li>
<li><span style="font-size: 14pt;">Characters from s2 must appear in the same order in s3 as they are in s2.</span></li>
<li><span style="font-size: 14pt;">The length of s3 must be equal to the combined length of s1 and s2.</span></li>
</ol>
<p><span style="font-size: 14pt;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 14pt;"><span style="font-size: 18.6667px;"><strong>Input: </strong>s1 = "AAB", s2 = "AAC", s3 = "AAAABC", <strong>
Output: </strong>true<strong>
Explanation: </strong>The string "AAAABC" has all characters of the other two strings and in the same order.</span></span></pre>
<pre><span style="font-size: 14pt;"><span style="font-size: 18.6667px;"><strong>Input: </strong>s1 = "AB", s2 = "C", s3 = "ACB", <strong>
Output: </strong>true
<strong>Explanation: </strong>s3 has all characters of s1 and s2 and retains order of characters of s1.</span></span></pre>
<pre><span style="font-size: 14pt;"><span style="font-size: 18.6667px;"><strong>Input: </strong>s1 = "YX", s2 = "X", s3 = "XXY"<strong>
Output: </strong>false<strong>
Explanation: </strong>"XXY " is not interleaved of "YX" and "X". The strings that can be formed are YXX and XYX</span></span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ s1.length, s2.length ≤ 300<br>1 ≤ s3.length ≤ 600</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Paytm</code>&nbsp;<code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>FactSet</code>&nbsp;<code>Google</code>&nbsp;<code>Zillious</code>&nbsp;<code>Yahoo</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;<code>Dynamic Programming</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;