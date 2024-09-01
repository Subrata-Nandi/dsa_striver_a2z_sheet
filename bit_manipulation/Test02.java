/*
K-th Bit is Set or Not
Difficulty: EasyAccuracy: 52.75%Submissions: 176K+Points: 2
Given a number n and a bit number k, check if kth index bit of n is set or not. A bit is called set if it is 1. Position of set bit '1' should be indexed starting with 0 from LSB side in binary representation of the number.
Note: Index is starting from 0. You just need to return true or false, driver code will take care of printing "Yes" and "No".

Examples : 

Input: n = 4, k = 0
Output: No
Explanation: Binary representation of 4 is 100, in which 0th index bit from LSB is not set. So, return false.
Input: n = 4, k = 2
Output: Yes
Explanation: Binary representation of 4 is 100, in which 2nd index bit from LSB is set. So, return true.
Input: n = 500, k = 3
Output: No
Explanation: Binary representation of 500 is 111110100, in which 3rd index bit from LSB is not set. So, return false.

Expected Time Complexity: O(1).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ n ≤ 109
0 ≤ k ≤ 31
Seen this question in a real interview before ?
Yes
No
Company Tags
Microsoft
*/

package bit_manipulation;

public class Test02 {
	class CheckBit {
	    // Function to check if Kth bit is set or not.
	    static boolean checkKthBit(int n, int k) {
	        // Your code here
	    	// using left shift operator
	        if((n & (1 << k)) != 0) return true;
	        else return false;
	        
	        
	        // using right shift operator
	        /*
	        if(((n >> k) & 1) == 0) return false;
	        else return true;
	        */
	    }
	}
}
