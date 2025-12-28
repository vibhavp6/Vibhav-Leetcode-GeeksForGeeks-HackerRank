<h2><a href="https://www.geeksforgeeks.org/problems/minimum-time-to-fulfil-all-orders/1">Minimum time to fulfil all orders</a></h2><h3>Difficulty Level : Difficulty: Hard</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;"><strong>Geek</strong>&nbsp;is organizing a party at his house. For the party, he needs exactly&nbsp;<strong>n</strong>&nbsp;donuts for the guests.&nbsp;<strong>Geek</strong> decides to order the donuts from a nearby restaurant, which has <strong>m&nbsp;</strong>chefs and each chef has a rank&nbsp;<strong>r</strong>.<br>A chef with rank&nbsp;<strong>r&nbsp;</strong>can make 1 donut in the first&nbsp;<strong>r</strong>&nbsp;minutes, 1 more donut in the next&nbsp;<strong>2r</strong> minutes, 1 more donut in the next&nbsp;<strong>3r</strong>&nbsp;minutes, and so on.<br>For example, a chef with rank 2, can make one donut in 2 minutes, one more donut in the next 4 minutes, and one more in the next 6 minutes. So, it take 2 + 4 + 6 = 12 minutes to make 3 donuts. A chef can move on to making the next donut only after completing the previous one. All the chefs can work simultaneously.<br>Since,&nbsp;it's time for the party,&nbsp;<strong>Geek&nbsp;</strong>wants to know the&nbsp;<strong>minimum</strong>&nbsp;time required in completing&nbsp;<strong>n</strong> donuts. Return an integer denoting the <strong>minimum time</strong>.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 10, rank[] = [1, 2, 3, 4]
<strong>Output: </strong>12
<strong>Explanation:</strong> 
Chef with rank 1, can make 4 donuts in time 1 + 2 + 3 + 4 = 10 mins
Chef with rank 2, can make 3 donuts in time 2 + 4 + 6 = 12 mins
Chef with rank 3, can make 2 donuts in time 3 + 6 = 9 mins
Chef with rank 4, can make 1 donuts in time = 4 minutes
Total donuts = 4 + 3 + 2 + 1 = 10 and total time = 12 minutes.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 8, rank[] = [1, 1, 1, 1, 1, 1, 1, 1]
<strong>Output: </strong>1
<strong>Explanation: </strong>As all chefs are ranked 1, so each chef can make 1 donuts in 1 min.
Total donuts = 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 = 8 and total time = 1 minute.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>3</sup><br>1 ≤ m ≤ 10<sup>4</sup><br>1 ≤ rank[i] ≤ 100</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Binary Search</code>&nbsp;<code>Algorithms</code>&nbsp;