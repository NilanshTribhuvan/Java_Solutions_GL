<h2><a href="https://www.geeksforgeeks.org/problems/maximum-sub-array5443/1">Max Sum Subarray of Non-Negative</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">Given an array of integers <strong>arr[]</strong>, find the contiguous subarray with the maximum sum that contains only non-negative numbers. </span></p>
<ul>
<li><span style="font-size: 14pt;">If multiple subarrays have the same maximum sum return the one with longest length. </span></li>
<li><span style="font-size: 14pt;">If there is still a tie, return the subarray with the smallest starting index. </span></li>
<li><span style="font-size: 14pt;">If the array contains only negative numbers, return -1.</span></li>
</ul>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 2, 3, -1, 6]
<strong>Output:</strong> [1, 2, 3]
<strong>Explanation:</strong> The valid non-negative subarrays [1, 2, 3] and [6] both have a sum of 6. Since [1, 2, 3] has the longer length, it is selected.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [-1, 2]
<strong>Output:</strong> [2]
<strong>Explanation:</strong> The only valid non-negative subarray is [2], so the output is [2].<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 2, 5, -7, 2, 6]
<strong>Output:</strong> [1, 2, 5]
<strong>Explanation:</strong> The valid non-negative subarrays are [1, 2, 5] and [2, 6]. Both have the same sum of 8, but [1, 2, 5] starts earlier and also longest one so it is the preferred subarray.</span></pre></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>Intuit</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Divide and Conquer</code>&nbsp;