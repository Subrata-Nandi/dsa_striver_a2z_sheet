/*
Split an array into two equal Sum subarrays
Difficulty: EasyAccuracy: 68.8%Submissions: 7K+Points: 2
Given an array of integers arr, return true if it is possible to split it in two subarrays (without reordering the elements), such that the sum of the two subarrays are equal. If it is not possible then return false.

Examples:

Input: arr = [1, 2, 3, 4, 5, 5]
Output: true
Explanation: In the above example, we can divide the array into two subarrays with eqaul sum. The two subarrays are: [1, 2, 3, 4] and [5, 5]. The sum of both the subarrays are 10. Hence, the answer is true.
Input: arr = [4, 3, 2, 1]
Output: false
Explanation: In the above example, we cannot divide the array into two subarrays with eqaul sum. Hence, the answer is false.
Expected Time Complexity: O(n)
Expected Space Complexity: O(1)

Constraints:
1<=arr.size()<=105 
1<=arr[i]<=106

Seen this question in a real interview before ?
Yes
No
Company Tags
Facebook
Topic Tags
prefix-sumsliding-windowArrays
*/

package gfg_potd;

public class Test25 {
	class Solution {
	    public boolean canSplit(int arr[]) {
	        // code here
	        int sum1 = 0;
	        int sum2 = 0;
	        for(int x: arr) 
	            sum1 += x;
	            
	        for(int i=arr.length-1;i>=0;i--) {
	            sum2 += arr[i];
	            sum1 -= arr[i];
	            
	            if(sum2 == sum1) return true;
	        }
	        return false;
	    }
	}
}
