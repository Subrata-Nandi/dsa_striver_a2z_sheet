/*
169. Majority Element
Solved
Easy
Topics
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 

Follow-up: Could you solve the problem in linear time and in O(1) space?
*/

package arrays;

public class Test12 {
	class Solution {
	    public int majorityElement(int[] nums) {
	        int cnt = 0;
	        int ele = 0;

	        // Moore's Voting Algorithm
	        
	        for(int i=0;i<nums.length;i++) {
	            if(cnt == 0) {
	                cnt++;
	                ele = nums[i];
	            }
	            else if(nums[i] == ele) {
	                cnt++;
	            }
	            else {
	                cnt--;
	            }
	        }
	        return ele;
	    }
	}
}
