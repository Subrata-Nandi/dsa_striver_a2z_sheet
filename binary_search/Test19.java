/*
Row with max 1s
Difficulty: MediumAccuracy: 33.09%Submissions: 261K+Points: 4
Given a boolean 2D array, consisting of only 1's and 0's, where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's. Return the 0-based index of the first row that has the most number of 1s. If no such row exists, return -1.

Examples :

Input: arr[][] = [[0, 1, 1, 1],[0, 0, 1, 1],[1, 1, 1, 1],[0, 0, 0, 0]]
Output: 2
Explanation: Row 2 contains 4 1's (0-based indexing).
Input: arr[][] = [[0, 0], [1, 1]]
Output: 1
Explanation: Row 1 contains 2 1's (0-based indexing).
 
Expected Time Complexity: O(n+m)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ number of rows, number of columns ≤ 103
0 ≤ arr[i][j] ≤ 1 

 

Seen this question in a real interview before ?
Yes
No
Company Tags
AmazonMicrosoftSnapdeal
*/

package binary_search;

public class Test19 {
	class Solution {
	    public int rowWithMax1s(int arr[][]) {
	        // code here
	        int n = arr.length;
	        int m = arr[0].length;
	        int max_ones = 0;
	        int ind = -1;
	        for(int i=0;i<n;i++) {
	            int sum = 0;
	            for(int j=0;j<m;j++) {
	                sum += arr[i][j];
	            }
	            if(sum > max_ones) {
	                max_ones = sum;
	                ind = i;
	            }
	        }
	        return ind;
	    }
	}
}
