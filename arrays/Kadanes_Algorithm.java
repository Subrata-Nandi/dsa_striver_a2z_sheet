/*
Find Largest sum contiguous Subarray [V. IMP]		Or 		Kadane’s Algo [V.V.V.V.V IMP]

Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.


Example 1:

Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
Example 2:

Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 
of element (-1)

Your Task:
You don't need to read input or print anything. The task is to complete the function maxSubarraySum() which takes Arr[] and N as input parameters and returns the sum of subarray with maximum sum.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 10^6
-107 ≤ A[i] ≤ 10^7
*/

package arrays;

public class Kadanes_Algorithm {
	
}

class Solution9{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long maximum = Long.MIN_VALUE;
        long sum = 0;
        for(int i=0;i<n;i++) {
            sum = sum + arr[i];
            if(maximum < sum) {
                maximum = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return maximum;
        
    }
    
}

/*
Problem statement
You are given an array 'arr' of length 'n', consisting of integers.



A subarray is a contiguous segment of an array. In other words, a subarray can be formed by removing 0 or more integers from the beginning and 0 or more integers from the end of an array.



Find the sum of the subarray (including empty subarray) having maximum sum among all subarrays.



The sum of an empty subarray is 0.



Example :
Input: 'arr' = [1, 2, 7, -4, 3, 2, -10, 9, 1]

Output: 11

Explanation: The subarray yielding the maximum sum is [1, 2, 7, -4, 3, 2].
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
9
1 2 7 -4 3 2 -10 9 1


Sample Output 1 :
11


Explanation for Sample 1 :
The subarray yielding the maximum sum is [1, 2, 7, -4, 3, 2].


Sample Input 2 :
6
10 20 -30 40 -50 60


Sample Output 2 :
60


Sample Input 3 :
3
-3 -5 -6


Sample Output 3 :
0


Expected time complexity :
The expected time complexity is O(n).


Constraints :
1 <= 'n' <= 10 ^ 6
-10 ^ 6 <= 'arr[i]' <= 10 ^ 6

Time limit: 1sec



import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long maximum = Long.MIN_VALUE;
		long sum = 0;
		for(int i=0;i<n;i++) {
			sum = sum + arr[i];
			if(maximum < sum) {
				maximum = sum;
			}
			if(sum < 0) {
				sum = 0;
			}
		}
		if(maximum < 0) {		Find the sum of the subarray (including empty subarray) having maximum sum among all subarrays. The sum of an empty subarray is 0.
			maximum = 0;
		}
		return maximum;
	}

}
*/

