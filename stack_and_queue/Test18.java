/*
42. Trapping Rain Water
Solved
Hard
Topics
Companies
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 

Constraints:

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105
*/

package stack_and_queue;

public class Test18 {
	class Solution {
	    public int trap(int[] height) {
	        int n = height.length;
	        int prefixMax[] = new int[n];
	        prefixMax[0] = height[0];
	        for(int i=1;i<n;i++) {
	            prefixMax[i] = Math.max(height[i], prefixMax[i-1]);
	        }

	        int suffixMax[] = new int[n];
	        suffixMax[n-1] = height[n-1];
	        for(int i=n-2;i>=0;i--) {
	            suffixMax[i] = Math.max(height[i], suffixMax[i+1]);
	        }
	        
	        int total = 0;
	        for(int i=0;i<n;i++) {
	            if(height[i] < prefixMax[i] && height[i] < suffixMax[i]) {
	                total += Math.min(prefixMax[i], suffixMax[i]) - height[i];
	            }
	            System.out.println(total);
	        }

	        return total;
	    }
	}
}
