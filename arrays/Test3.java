/*
Rotate Array
Difficulty: EasyAccuracy: 37.06%Submissions: 323K+Points: 2
Given an unsorted array arr[] of size n. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. 

Examples :

Input: n = 5, d = 2 arr[] = {1,2,3,4,5}
Output: 3 4 5 1 2
Explanation: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.
Example 2:

Input: n = 10, d = 3 arr[] = {2,4,6,8,10,12,14,16,18,20}
Output: 8 10 12 14 16 18 20 2 4 6
Explanation: 2 4 6 8 10 12 14 16 18 20 when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.
Your Task:
You need not print or read anything. You need to complete the function rotateArr() which takes the array, d and n as input parameters and rotates the array by d elements. The array must be modified in-place without using extra space.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 106
1 <= d <= 106
0 <= arr[i] <= 105

Seen this question in a real interview before ?
Yes
No
Company Tags
AmazonMicrosoftMAQ Software
*/

package arrays;

public class Test3 {
	class Solution {
	    // Function to rotate an array by d elements in counter-clockwise direction.
	    static void rotateArr(int arr[], int d, int n) {
	        // add your code here
	        d = d % n;
	        int temp[] = new int[d];
	        
	        for(int i=0;i<d;i++) {
	            temp[i] = arr[i];
	        }
	        
	        for(int i=d;i<n;i++) {
	            arr[i-d] = arr[i];
	        }
	        
	        int j = 0;
	        for(int i=n-d;i<n;i++) {
	            arr[i] = temp[j];
	            j++;
	        }
	    }
	}
}
