/*
191. Number of 1 Bits
Solved
Easy
Topics
Companies
Write a function that takes the binary representation of a positive integer and returns the number of 
set bits
 it has (also known as the Hamming weight).

 

Example 1:

Input: n = 11

Output: 3

Explanation:

The input binary string 1011 has a total of three set bits.

Example 2:

Input: n = 128

Output: 1

Explanation:

The input binary string 10000000 has a total of one set bit.

Example 3:

Input: n = 2147483645

Output: 30

Explanation:

The input binary string 1111111111111111111111111111101 has a total of thirty set bits.
*/

package bit_manipulation;

public class Test08 {
	class Solution {
	    public int hammingWeight(int n) {
	        int cnt = 0;
	        /*
	        // One Way
	        while(n != 0) {
	            cnt += (n & 1);  // odd checking
	            n = n >> 1;     // dividing by 2
	        }
	        */

	        // Another way

	        while(n != 0) {
	            n = n & (n - 1);
	            cnt++;
	        }
	        return cnt;
	    }
	}
}
