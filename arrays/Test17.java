/*
128. Longest Consecutive Sequence
Solved
Medium
Topics
Companies
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
*/

package arrays;
import java.util.*;
public class Test17 {
	class Solution {
		/*
	    public int longestConsecutive(int[] nums) {
	        if(nums.length == 0) return 0;
	        Arrays.sort(nums);
	        int cntCurr = 0;
	        int lastMin = Integer.MIN_VALUE;
	        int longest = 1;
	        for(int i=0;i<nums.length;i++) {
	            if(nums[i] - 1 == lastMin) {
	                cntCurr++;
	                lastMin = nums[i];
	            }
	            else if(nums[i] != lastMin) {
	                cntCurr = 1;
	                lastMin = nums[i];
	            }
	            longest = Math.max(longest, cntCurr);
	        }
	        return longest;
	    }
		*/
	    
		// Using set data structure
		public int longestConsecutive(int[] nums) {
	        if(nums.length == 0) return 0;
	        Set<Integer> set = new HashSet<Integer>();
	        int longest = 1;
	        for(int i = 0;i<nums.length;i++) {
	            set.add(nums[i]);
	        }
	        for(int it: set) {
	            if(!set.contains(it-1)) {
	                int cnt = 1;
	                int x = it;
	                while(set.contains(x+1)) {
	                    cnt = cnt + 1;
	                    x = x + 1;
	                }
	                longest = Math.max(longest, cnt);
	            }
	        }

	        return longest;
	    }
	}
	
	
}
