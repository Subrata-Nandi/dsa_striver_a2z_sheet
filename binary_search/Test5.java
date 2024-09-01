/*
34. Find First and Last Position of Element in Sorted Array
Solved
Medium
Topics
Companies
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
*/

package binary_search;

public class Test5 {
	class Solution {
	    static int firstOccur(int arr[], int n, int x) {
	        int low = 0;
	        int high = n - 1;
	        int first = -1;
	        while(low <= high) {
	            int mid = (low + high) / 2;
	            if(arr[mid] == x) {
	                first = mid;
	                high = mid - 1;
	            }
	            else if(arr[mid] < x) low = mid + 1;
	            else high = mid - 1;
	        }
	        return first;
	    }

	    static int lastOccur(int arr[], int n, int x) {
	        int low = 0;
	        int high = n - 1;
	        int last = -1;
	        while(low <= high) {
	            int mid = (low + high) / 2;
	            if(arr[mid] == x) {
	                last = mid;
	                low = mid + 1;
	            }
	            else if(arr[mid] < x) low = mid + 1;
	            else high = mid - 1;
	        }
	        return last;
	    }

	    public int[] searchRange(int[] nums, int target) {
	        /*
	        // Linear search approach
	        int first = -1;
	        int last = -1;
	        int arr[] = new int[2];
	        for(int i=0;i<nums.length;i++) {
	            if(nums[i] == target) {
	                if(first == -1) first = i;
	                last = i;
	            }
	        }
	        arr[0] = first;
	        arr[1] = last;
	        return arr;
	        */

	        int first = firstOccur(nums, nums.length, target);
	        int last = lastOccur(nums, nums.length, target);;
	        int arr[] = new int[2];
	        arr[0] = first;
	        arr[1] = last;
	        return arr;
	    }
	}
}
