/*
Find Nth root of M
Difficulty: EasyAccuracy: 25.06%Submissions: 120K+Points: 2
You are given 2 numbers (n , m); the task is to find n√m (nth root of m).
 

Example 1:

Input: n = 2, m = 9
Output: 3
Explanation: 32 = 9
Example 2:

Input: n = 3, m = 9
Output: -1
Explanation: 3rd root of 9 is not
integer.
 

Your Task:
You don't need to read or print anyhting. Your task is to complete the function NthRoot() which takes n and m as input parameter and returns the nth root of m. If the root is not integer then returns -1.
 

Expected Time Complexity: O(n* log(m))
Expected Space Complexity: O(1)
 

Constraints:
1 <= n <= 30
1 <= m <= 109

Seen this question in a real interview before ?
Yes
No
Company Tags
DirectiAccenture
*/

package binary_search;

public class Test14 {
	class Solution
	{
	    public int NthRoot(int n, int m)
	    {
	        // code here
	        int low = 1;
	        int ans = -1;
	        int high = m;
	        while(low <= high) {
	            int mid = (low + high) / 2;
	            int val = (int) Math.pow(mid, n);
	            if(val == m) {
	                return mid;
	            }
	            else if(val > m) 
	                high = mid - 1;
	            else 
	                low = mid + 1;
	        }
	        return ans;
	    }
	}
}
