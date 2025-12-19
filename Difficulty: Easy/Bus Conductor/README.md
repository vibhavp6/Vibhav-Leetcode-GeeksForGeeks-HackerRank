<h2><a href="https://www.geeksforgeeks.org/problems/bus-conductor--170647/1">Bus Conductor</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">You are conductor of a bus.&nbsp;You are given two arrays&nbsp;<strong>chairs[]</strong>&nbsp;and&nbsp;<strong>passengers[]</strong>&nbsp;of equal length, where&nbsp;<strong>chairs[i]</strong>&nbsp;is the position of the&nbsp;<strong>i<sup>th</sup></strong>&nbsp;chair and&nbsp;<strong>passengers[j]</strong>&nbsp;is the position of the&nbsp;<strong>j<sup>th</sup></strong>&nbsp;passenger.&nbsp;You may perform the following move any number of times:</span></p>
<ul>
<li><span style="font-size: 14pt;">Increase or decrease the position of the&nbsp;<strong>i<sup>th</sup></strong>&nbsp;passenger&nbsp;by&nbsp;<strong>1</strong>&nbsp;(i.e., moving the&nbsp;<strong>i<sup>th</sup></strong>&nbsp;passenger from position&nbsp;<strong>x</strong>&nbsp;to&nbsp;<strong>x+1</strong>&nbsp;or&nbsp;<strong>x-1</strong>)</span></li>
</ul>
<p><span style="font-size: 14pt;">Return the&nbsp;<strong>minimum number of moves</strong> required to move each passenger to get a chair.<br></span><span style="font-size: 14pt;"><strong>Note:</strong> Although multiple chairs can occupy the same position, each passenger must be assigned to exactly one unique chair.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> chairs[] = [3, 1, 5], passengers[] = [2, 7, 4]
<strong>Output:</strong> 4
<strong>Explanation:</strong> The passengers are moved as follows:
- The first passenger is moved from position 2 to position 1 using 1 move.
- The second passenger is moved from position 7 to position 5 using 2 moves.
- The third passenger is moved from position 4 to position 3 using 1 move.
In total, 1 + 2 + 1 = 4 moves were used.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> chairs[] = [2, 2, 6, 6], passengers[] = [1, 3, 2, 6]
<strong>Output:</strong> 4
<strong>Explanation:</strong> Note that there are two chairs at position 2 and two chairs at position 6.
The passangers are moved as follows:
- The first passenger is moved from position 1 to position 2 using 1 move.
- The second passenger is moved from position 3 to position 6 using 3 moves.
- The third passenger is not moved.
- The fourth passenger is not moved.
In total, 1 + 3 + 0 + 0 = 4 moves were used.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:<br></strong>1 ≤ n ≤ 10<sup>5<br></sup>1 ≤ chairs[i], passengers[j] ≤ 10<sup>4</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Sorting</code>&nbsp;