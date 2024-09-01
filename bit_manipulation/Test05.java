/*
Decimal to binary
Difficulty: BasicAccuracy: 55.75%Submissions: 20K+Points: 1
Given a decimal number N, compute its binary equivalent.

Example 1:

Input: N = 7
Output: 111
 

Example 2:

Input: N = 33
Output: 100001
Your Task:
You don't need to read input. Complete the function toBinary() which takes the decimal number N as the input parameter and prints its binary equivalent.
Note: Print the output in a single line, the next line character is printed by the Driver Code.

 

Seen this question in a real interview before ?
Yes
No
Company Tags
Adobe
*/

package bit_manipulation;

public class Test05 {
	class Solution{
		void toBinary(int N) {
			//Write your code here
			StringBuilder str = new StringBuilder("");
			while(N != 0) {
			    if(N % 2 == 1) str.append("1");
			    else str.append("0");
			    N = N / 2;
			}
			str.reverse();
			System.out.print(str.toString());
		}
	}
}
