/*
Floor in a Sorted Array / Implement Lower Bound
Difficulty: EasyAccuracy: 33.75%Submissions: 263K+Points: 2
Given a sorted array arr[] of size n without duplicates, and given a value x. Floor of x is defined as the largest element k in arr[] such that k is smaller than or equal to x. Find the index of k(0-based indexing).

Examples

Input: n = 7, x = 0 arr[] = {1,2,8,10,11,12,19}
Output: -1
Explanation: No element less than 0 is found. So output is "-1".
Input: n = 7, x = 5 arr[] = {1,2,8,10,11,12,19}
Output: 1
Explanation: Largest Number less than 5 is 2 (i.e k = 2), whose index is 1(0-based indexing).
Your Task:
The task is to complete the function findFloor() which returns an integer denoting the index value of K or return -1 if there isn't any such number.

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ n ≤ 107
1 ≤ arr[i] ≤ 1018
0 ≤ x ≤ arr[n-1]
*/

package binary_search;

public class Test2 {
	class Solution {

	    // Function to find floor of x
	    // arr: input array
	    // n is the size of array
	    static int findFloor(long arr[], int n, long x) {
	        int low = 0;
	        int high = n - 1;
	        int ans = -1;
	        while(low <= high) {
	            int mid = (low + high) / 2;
	            if(arr[mid] <= x) {
	                ans = mid;
	                low = mid + 1;
	            }
	            else {
	                high = mid - 1;
	            }
	        }
	        return ans;
	    }
	}

}
