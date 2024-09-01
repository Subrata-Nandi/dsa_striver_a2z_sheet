/*
Next Greater Element
Difficulty: MediumAccuracy: 32.95%Submissions: 391K+Points: 4
Given an array arr[ ] of n elements, the task is to find the next greater element for each element of the array in order of their appearance in the array. Next greater element of an element in the array is the nearest element on the right which is greater than the current element.
If there does not exist next greater of current element, then next greater element for current element is -1. For example, next greater of the last element is always -1.

Examples

Input: arr[] = [1 3 2 4], n = 4
Output: 3 4 4 -1
Explanation: The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4, since it doesn't exist, it is -1.
Input: arr[] [6 8 0 1 3], n = 5
Output: 8 -1 1 3 -1
Explanation: The next larger element to 6 is 8, for 8 there is no larger elements hence it is -1, for 0 it is 1 , for 1 it is 3 and then for 3 there is no larger element on right and hence -1.
Input: arr[] [10, 20, 30, 50], n = 4
Output: 20 30 50 -1
Explanation: For a sorted array, the next element is next greater element also exxept for the last element.
Input: arr[] [50, 40, 30, 10], n = 4
Output: -1 -1 -1 -1
Explanation: For a reverse sorted array, the next greater element is always 1.
Expected Time Complexity : O(n)
Expected Auxiliary Space : O(n)

Constraints:
1 ≤ n ≤ 106
0 ≤ arr[i] ≤ 1018

Seen this question in a real interview before ?
Yes
No
Company Tags
FlipkartAmazonMicrosoftMakeMyTripAdobe
Topic Tags
StackData Structures
*/

package stack_and_queue;
import java.util.*;
public class Test15 {
	class Solution
	{
	    //Function to find the next greater element for each element of the array.
	    public static long[] nextLargerElement(long[] arr, int n)
	    { 
	        // Your code here
	        Stack<Long> st = new Stack<>();
	        long nge[] = new long[n];
	        for(int i=n-1;i>=0;i--) {
	            while(!st.empty() && arr[i] >= st.peek()) {
	                st.pop();
	            }
	            
	            if(st.empty()) nge[i] = -1;
	            else nge[i] = st.peek();
	                
	            st.push(arr[i]);
	        }
	        return nge;
	    } 
	}
}
