/*
Ceil The Floor
Difficulty: EasyAccuracy: 43.76%Submissions: 67K+Points: 2
Given an unsorted array Arr[] of N integers and an integer X, find floor and ceiling of X in Arr[0..N-1].

Floor of X is the largest element which is smaller than or equal to X. Floor of X doesn’t exist if X is smaller than smallest element of Arr[].

Ceil of X is the smallest element which is greater than or equal to X. Ceil of X doesn’t exist if X is greater than greatest element of Arr[].

Example 1:

Input:
N = 8, X = 7
Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
Output: 6 8
Explanation:
Floor of 7 is 6 and ceil of 7 
is 8.
Example 2:

Input:
N = 8, X = 10
Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
Output: 9 -1
Explanation:
Floor of 10 is 9 but ceil of 10 is not 
possible.
Your Task:
You don't need to read input or print anything. Your task is to complete the function getFloorAndCeil() which takes the array of integers arr, n and x as parameters and returns a pair of integers denoting the answer. Return -1 if floor or ceil is not present.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints :
1 ≤ N ≤ 105
1 ≤ Arr[i], X ≤ 106
*/

package binary_search;

public class Test3 {
	class Solution {
	    public static int getFloor(int[] arr, int n, int x) {
	        int low = 0;
	        int high = n - 1;
	        int ans = -1;
	        while(low <= high) {
	            int mid = (low + high) / 2;
	            if(arr[mid] <= x) {
	                ans = arr[mid];
	                low = mid + 1;
	            }
	            else {
	                high = mid - 1;
	            }
	        }
	        return ans;
	    }
	    
	    public static int getCeil(int[] arr, int n, int x) {
	        int low = 0;
	        int high = n - 1;
	        int ans = -1;
	        while(low <= high) {
	            int mid = (low + high) / 2;
	            if(arr[mid] >= x) {
	                ans = arr[mid];
	                high = mid - 1;
	            }
	            else {
	                low = mid  + 1;
	            }
	        }
	        return ans;
	    }   
	}

	class Solve {
	    
	    Pair getFloorAndCeil(int[] arr, int n, int x) {
	        // code here
	        Solution obj = new Solution();
	        Arrays.sort(arr);
	        int ans1 = obj.getFloor(arr, n, x);
	        int ans2 = obj.getCeil(arr, n, x);
	        return new Pair(ans1, ans2);
	    }
	}
}
