/*
Find XOR of numbers from L to R.
Difficulty: EasyAccuracy: 50.0%Submissions: 23K+Points: 2
You are given two integers L and R, your task is to find the XOR of elements of the range [L, R].

Example:

Input: 
L = 4, R = 8 
Output:
8 
Explanation:
4 ^ 5 ^ 6 ^ 7 ^ 8 = 8
Your Task:

Your task is to complete the function findXOR() which takes two integers l and r and returns the XOR of numbers from l to r.

Expected Time Complexity: O(1).

Expected Auxiliary Space: O(1).

Constraints:

1<=l<=r<=109
*/

package bit_manipulation;

public class Test15 {
	class Solution {
	    
	    static int findXor(int n) {
	        if(n % 4 == 1) return 1;
	        else if(n % 4 == 2) return n+1;
	        else if(n % 4 == 3) return 0;
	        else  return n;
	    }
	    
	    public static int findXOR(int l, int r) {
	        return findXor(r) ^ findXor(l-1);
	    }
	}
}
