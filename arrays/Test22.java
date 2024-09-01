/*
560. Subarray Sum Equals K
Solved
Medium
Topics
Companies
Hint
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
 

Constraints:

1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107
*/

package arrays;
import java.util.*;
public class Test22 {
	class Solution {
	    public int subarraySum(int[] nums, int k) {
	        /*
	        int cnt = 0;
	        for(int i=0;i<nums.length;i++) {
	            int sum = 0;
	            for(int j=i;j<nums.length;j++) {
	                sum += nums[j];
	                if(sum == k) cnt++;
	            }
	        }
	        return cnt;
	        */

	        int n = nums.length;
	        int cnt = 0;
	        HashMap<Integer, Integer> mpp = new HashMap<>();
	        mpp.put(0, 1);
	        int preSum = 0;
	        for(int i = 0;i<n;i++) {
	            preSum += nums[i];
	            int remain = preSum - k;
	            cnt += mpp.getOrDefault(remain, 0);
	            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
	        }
	        return cnt;
	    }
	}
}
