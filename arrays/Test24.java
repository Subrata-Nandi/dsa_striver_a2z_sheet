/*

Code
Testcase
Testcase
Test Result
152. Maximum Product Subarray
Attempted
Medium
Topics
Companies
Given an integer array nums, find a 
subarray
 that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

 

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 

Constraints:

1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
*/

package arrays;

public class Test24 {
	class Solution {
    public int maxProduct(int[] nums) {
        /*
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            int product = 1;
            for(int j=i;j<n;j++) {
                product *= nums[j];
                ans = Math.max(ans, product);
            }
        }
        return ans;
        */

        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++) {
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix = prefix * nums[i];
            suffix = suffix * nums[n - i - 1];
            ans = Math.max(ans, Math.max(prefix, suffix));
        }
        return ans;
        
        
        /*
         * This code in C++ is accepted
         * 
		class Solution {
		public:
		    int maxProduct(vector<int>& nums) {
		        int n = nums.size();
		        double prefix = 1;
		        double suffix = 1;
		        double ans = INT_MIN;
		        for(int i=0;i<n;i++) {
		            if(prefix == 0) prefix = 1;
		            if(suffix == 0) suffix = 1;
		
		            prefix = prefix * nums[i];
		            suffix = suffix * nums[n-i-1];
		            ans = max(ans, max(prefix, suffix));
		        }
		        return ans;
		    }
		};        
        */
    }
}
}
