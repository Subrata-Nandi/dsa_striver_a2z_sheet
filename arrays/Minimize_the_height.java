/*
Given an array arr[] denoting heights of N towers and a positive integer K.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by K
Decrease the height of the tower by K
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

You can find a slight modification of the problem here.
Note: It is compulsory to increase or decrease the height by K for each tower. After the operation, the resultant array should not contain any negative integers.

Example 1:

Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as 
{1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}. 
The difference between 
the largest and the smallest is 8-3 = 5.
Example 2:

Input:
K = 3, N = 5
Arr[] = {3, 9, 12, 16, 20}
Output:
11
Explanation:
The array can be modified as
{3+k, 9+k, 12-k, 16-k, 20-k} -> {6, 12, 9, 13, 17}. 
The difference between 
the largest and the smallest is 17-6 = 11. 
Your Task:
You don't need to read input or print anything. Your task is to complete the function getMinDiff() which takes the arr[], n, and k as input parameters and returns an integer denoting the minimum difference.

Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(N)

Constraints
1 ≤ K ≤ 109
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 109
 */

package arrays;
import java.util.*;
public class Minimize_the_height {

}

class Solution10 {
    int getMinDiff(int[] arr, int n, int k) {
        
        if(n == 1) return 0;
        
        Arrays.sort(arr);	// Sort the array to make it easier to find minimum and maximum values
        int diff = arr[n-1] - arr[0];		// Initialize the result with the maximum possible difference
        int max, min;
        
        for(int i=1;i<n;i++) {
        	// Calculate the potential maximum and minimum values within the range
            max = Math.max(arr[i-1]+k , arr[n-1]-k);		// Last r element ta max tai otar theke k minus kore r baki sobar songe k plus kore max check korchi
            min = Math.min(arr[0]+k , arr[i]-k);		// // First r element ta min tai otai k plus kore r baki sobar songe k minus kore min check korchi
            if(min<0) 		// Skip iterations where the minimum element is negative
                continue;	
            diff = Math.min(diff, max-min);		// Update the result with the minimum difference.
        }
        return diff;
    }
}

/*
Approach

1. Sort the array in ascending order to simplify finding minimum and maximum values.
2. Initialize the result with the maximum possible difference (difference between the last and first elements).
3. Iterate through the array, and for each tower:
   - Calculate the potential maximum and minimum values within the range of modifications.
   - Update the result with the minimum difference.
4. Return the final result.

*/