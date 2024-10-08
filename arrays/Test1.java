/*
Check if array is sorted
Difficulty: EasyAccuracy: 39.37%Submissions: 197K+Points: 2
Given an array arr[] of size N, check if it is sorted in non-decreasing order or not. 

Example 1:

Input:
N = 5
arr[] = {10, 20, 30, 40, 50}
Output: 1
Explanation: The given array is sorted.
Example 2:

Input:
N = 6
arr[] = {90, 80, 100, 70, 40, 30}
Output: 0
Explanation: The given array is not sorted.
Your Task:
You don't need to read input or print anything. Your task is to complete the function arraySortedOrNot() which takes the arr[] and N as input parameters and returns a boolean value (true if it is sorted otherwise false).

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 106
- 109 ≤ arr[i] ≤ 109
*/

package arrays;

public class Test1 {
	class Solution {
	    boolean arraySortedOrNot(int[] arr, int n) {
	        // code here
	        for(int i=1;i<n;i++) {
	            if(arr[i] >= arr[i-1]) {
	                
	            }
	            else {
	                return false;
	            }
	        }
	        return true;
	    }
	}
}
