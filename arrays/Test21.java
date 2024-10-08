/*
Subarray with given XOR
Programming
Hashing
Medium
53.6% Success

812

16

Bookmark
Asked In:
Problem Description
 
 

Given an array of integers A and an integer B.

Find the total number of subarrays having bitwise XOR of all elements equals to B.



Problem Constraints
1 <= length of the array <= 105

1 <= A[i], B <= 109



Input Format
The first argument given is the integer array A.

The second argument given is integer B.



Output Format
Return the total number of subarrays having bitwise XOR equals to B.



Example Input
Input 1:

 A = [4, 2, 2, 6, 4]
 B = 6
Input 2:

 A = [5, 6, 7, 8, 9]
 B = 5


Example Output
Output 1:

 4
Output 2:

 2


Example Explanation
Explanation 1:

 The subarrays having XOR of their elements as 6 are:
 [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], [6]
Explanation 2:

 The subarrays having XOR of their elements as 5 are [5] and [5, 6, 7, 8, 9]
 */

package arrays;
import java.util.*;
public class Test21 {
	public class Solution {
	    public int solve(ArrayList<Integer> A, int B) {
	        int n = A.size();
	        int xor = 0;
	        int cnt = 0;
	        HashMap<Integer, Integer> mpp = new HashMap<>();
	        mpp.put(0,1);
	        for(int i=0;i<n;i++) {
	            xor = xor ^ A.get(i);
	            int x = xor ^ B;
	            cnt += mpp.getOrDefault(x, 0);
	            mpp.put(xor, mpp.getOrDefault(xor, 0) + 1);
	        }
	        return cnt;
	    }
	}
}
