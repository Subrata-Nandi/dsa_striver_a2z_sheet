/*
Next Greater Element 2
Difficulty: MediumAccuracy: 68.54%Submissions: 7K+Points: 4
Given a circular integer array arr of size N (i.e ., the next element of arr [N-1] is arr[0] ), return the next greater number for every element in arr.
The next greater element of a number x is the first greater number to its traversing order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.
 

Example 1:

Input:
N = 3
arr[ ] = {1, 2, 1}
Output: {2, -1, 2}
Explanation: The first 1's next greater number is 2:
The number 2 can't find next greater number.
The second 1's next greater number needs to search circularly, which is also 2.
Example 2:

Input:
N = 5
arr[ ] = {5, 4, 3, 2, 1}
Output: {-1, 5, 5, 5, 5}
Your Task:
You don't need to read input or print anything. Your task is to complete the function nextGreaterElement() which takes the array of integers arr and N as parameters and returns an array of integers that contains the next greater number for every element in arr.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 104
-109 ≤ arri  ≤ 109
*/

package stack_and_queue;
import java.util.*;
public class Test16 {
	class Solution {
	    static int[] nextGreaterElement(int n, int arr[]) {
	        // code here
	        int nge[] = new int[n];
	        Stack<Integer> st = new Stack<>();
	        for(int i=2*n-1;i>=0;i--) {
	            while(!st.empty() && arr[i%n] >= st.peek()) {
	                st.pop();
	            }
	            
	            if(i<n) {
	                nge[i] = st.empty() ? -1 : st.peek();
	            }
	            
	            st.push(arr[i%n]);
	        }
	        return nge;
	    }
	}
}
