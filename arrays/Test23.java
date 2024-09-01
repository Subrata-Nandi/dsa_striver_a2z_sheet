/*
Merge Without Extra Space
Difficulty: HardAccuracy: 32.01%Submissions: 244K+Points: 8
Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted order without using any extra space. Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.

Example 1:

Input: 
n = 4, arr1[] = [1 3 5 7] 
m = 5, arr2[] = [0 2 6 8 9]
Output: 
arr1[] = [0 1 2 3]
arr2[] = [5 6 7 8 9]
Explanation:
After merging the two 
non-decreasing arrays, we get, 
0 1 2 3 5 6 7 8 9.
Example 2:

Input: 
n = 2, arr1[] = [10 12] 
m = 3, arr2[] = [5 18 20]
Output: 
arr1[] = [5 10]
arr2[] = [12 18 20]
Explanation:
After merging two sorted arrays 
we get 5 10 12 18 20.
Your Task:
You don't need to read input or print anything. You only need to complete the function merge() that takes arr1, arr2, n and m as input parameters and modifies them in-place so that they look like the sorted merged array when concatenated.

Expected Time Complexity:  O((n+m) log(n+m))
Expected Auxilliary Space: O(1)

Constraints:
1 <= n, m <= 105
0 <= arr1i, arr2i <= 107

Seen this question in a real interview before ?
Yes
No
Company Tags
ZohoMicrosoftSnapdealGoldman SachsAdobeLinkedinAmdocsBrocadeJuniper NetworksQuikrSynopsys
*/

package arrays;
import java.util.*;
public class Test23 {
	class Solution
	{
	    //Function to merge the arrays.
	    public static void merge(long arr1[], long arr2[], int n, int m) 
	    {
	        // code here 
	        int left = n - 1;
	        int right = 0;
	        while(left >= 0 && right < m) {
	            if(arr1[left] > arr2[right]) {
	                long temp = arr1[left];
	                arr1[left] = arr2[right];
	                arr2[right] = temp;
	                left--;
	                right++;
	            }
	            else {
	                break;
	            }
	        }
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	    }
	}
}
