/*
Maximum sum of hour glass
MediumAccuracy: 54.82%Submissions: 34K+Points: 4
Matrix Partners India: Exclusive Job-A-Thon | Apply to 15+ Companies via 1 Hiring Challenge | Starting from 29th April onwards

banner
Given two integers n, m and a 2D matrix mat of dimensions nxm, the task is to find the maximum sum of an hourglass.
An hourglass is defined as a part of the matrix with the following form:



Return -1 if any hourglass is not found.

Example 1:

Input:
n = 3, m = 3
mat = [[1, 2, 3],
       [4, 5, 6],
       [7, 8, 9]]
Output:
35
Explanation:
There is only one hour glass which is
1 2 3
  5
7 8 9   and its sum is 35.
Example 2:

Input:
n = 2, m = 3
mat = [[1, 2, 3],
       [4, 5, 6]]
Output:
-1
Explanation:
There are no hour glasses in this matrix.
Your Task:
You don't need to read input or print anything. Your task is to complete the function findMaxSum() which takes the two integers n, m, and the 2D matrix mat as input parameters and returns the maximum sum of an hourglass in the matrix. If there are no hourglasses, it returns -1.

Expected Time Complexity: O(n*m)
Expected Auxillary Space: O(1)

Constraints:
1 <= n <= 150
3 <= m <= 150
0 <= mat[i][j] <= 106

*/

package gfg_potd;

public class Test09 {

	static int findSum(int mat[][], int n, int m) {
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int j=m;j<(m+3);j++) {
            sum1 = sum1 + mat[n][j];
            sum2 = sum2 + mat[n+2][j];
        }
        
        sum = sum1 + sum2 + mat[n+1][m+1];
        return sum;

    }
    
    int findMaxSum(int n, int m, int mat[][]) {
        // code here
        int ans = -1;
        int temp = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(i <= n-3 && j <= m-3) {
                    temp = findSum(mat, i, j);
                    ans = Math.max(ans, temp);
                }
            }
        }
        return ans;
    }
	
}
