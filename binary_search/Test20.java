/*
74. Search a 2D Matrix
Solved
Medium
Topics
Companies
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
*/

package binary_search;

public class Test20 {
	class Solution {
	    public boolean searchMatrix(int[][] matrix, int target) {
	        /*
	        for(int i=0;i<matrix.length;i++) {
	            for(int j=0;j<matrix[0].length;j++) {
	                if(matrix[i][j] == target) return true;
	            }
	        }
	        return false;
	        */

	        int n = matrix.length;
	        int m = matrix[0].length;
	        int low = 0;
	        int high = n*m - 1;
	        while(low <= high) {
	            int mid = (low + high) / 2;
	            int row = mid / m;
	            int col = mid % m;
	            if(matrix[row][col] == target) return true;
	            else if(matrix[row][col] < target) low = mid + 1;
	            else high = mid - 1;
	        }
	        return false;
	    }
	}
}
