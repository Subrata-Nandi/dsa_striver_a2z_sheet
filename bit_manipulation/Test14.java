/*
Two numbers with odd occurrences
Difficulty: MediumAccuracy: 49.49%Submissions: 50K+Points: 4
Given an unsorted array, Arr[] of size N and that contains even number of occurrences for all numbers except two numbers. Find the two numbers in decreasing order which has odd occurrences.

Example 1:

Input:
N = 8
Arr = {4, 2, 4, 5, 2, 3, 3, 1}
Output: {5, 1} 
Explaination: 5 and 1 have odd occurrences.

Example 2:

Input:
N = 8
Arr = {1 7 5 7 5 4 7 4}
Output: {7, 1}
Explaination: 7 and 1 have odd occurrences.

Your Task:
You don't need to read input or print anything. Your task is to complete the function twoOddNum() which takes the array Arr[] and its size N as input parameters and returns the two numbers in decreasing order which have odd occurrences.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
2 ≤ N ≤ 106
1 ≤ Arri ≤ 1012

*/

package bit_manipulation;

public class Test14 {
	class Solution
	{
	    public int[] twoOddNum(int arr[], int n)
	    {
	        // code here
	        int ans[] = new int[2];
	        int xor = 0;
	        for(int i=0;i<n;i++) {
	            xor = xor ^ arr[i];
	        }
	        int rightmost = (xor & (xor - 1)) ^ xor;
	        int b1 = 0, b2 = 0;
	        for(int i=0;i<n;i++) {
	            if((arr[i] & rightmost) != 0) 
	                b1 = b1 ^ arr[i];
	            else
	                b2 = b2 ^ arr[i];
	        }
	        
	        if(b1 > b2) {
	            ans[0] = b1;
	            ans[1] = b2;
	        }
	        else {
	            ans[0] = b2;
	            ans[1] = b1;
	        }
	        
	        return ans;
	    }
	}
}
