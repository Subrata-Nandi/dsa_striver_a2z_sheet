/*
54. Spiral Matrix
Solved
Medium
Topics
Companies
Hint
Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
*/

package arrays;
import java.util.*;
public class Test19 {
	class Solution {
	    public List<Integer> spiralOrder(int[][] mat) {
	        List<Integer> arr = new ArrayList<>();
	        int n = mat.length;
	        int m = mat[0].length;
	        int top = 0, bottom = n - 1;
	        int left = 0, right = m - 1;

	        while(top <= bottom && left <= right) {
	            for(int i=left;i<=right;i++) {
	                arr.add(mat[top][i]);
	            }
	            top++;
	            for(int i=top;i<=bottom;i++) {
	                arr.add(mat[i][right]);
	            }
	            right--;
	            if(top <= bottom) {
	                for(int i=right;i>=left;i--) {
	                    arr.add(mat[bottom][i]);
	                }
	                bottom--;
	            }
	            if(left <= right) {
	                for(int i=bottom;i>=top;i--) {
	                    arr.add(mat[i][left]);
	                }
	                left++;
	            }
	        }
	        return arr;
	    }
	}
}
