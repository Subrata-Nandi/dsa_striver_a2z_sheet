/*
Odd or Even
Difficulty: SchoolAccuracy: 60.6%Submissions: 78K+Points: 0
Given a positive integer N, determine whether it is odd or even.

Example 1:

Input:
N = 1
Output:
odd
Explanation:
The output is self-
explanatory.
 

Example 2:

Input:
N = 2
Output:
even
Explanation:
The output is self-
explanatory.
 

Your Task:

You don't need to read input or print anything. Your task is to complete the function oddEven() which takes the integer N and return "even" if number is even and "odd" if the number is odd.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
0 <= N <= 10000
*/

package bit_manipulation;

public class Test03 {
	class Solution{
	    static String oddEven(int N){
	        // code here
	        if((N & 1) == 0) return "even";
	        else return "odd";
	    }
	}
}
