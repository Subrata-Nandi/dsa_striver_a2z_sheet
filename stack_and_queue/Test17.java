/*
Smallest number on left
Difficulty: MediumAccuracy: 54.85%Submissions: 59K+Points: 4
Given an array a of integers of length n, find the nearest smaller number for every element such that the smaller element is on left side.If no small element present on the left print -1.

Example 1:

Input: n = 3
a = {1, 6, 2}
Output: -1 1 1
Explaination: There is no number at the 
left of 1. Smaller number than 6 and 2 is 1.
Example 2:

Input: n = 6
a = {1, 5, 0, 3, 4, 5}
Output: -1 1 -1 0 3 4
Explaination: Upto 3 it is easy to see 
the smaller numbers. But for 4 the smaller 
numbers are 1, 0 and 3. But among them 3 
is closest. Similary for 5 it is 4.
Your Task:
You do not need to read input or print anything. Your task is to complete the function leftSmaller() which takes n and a as input parameters and returns the list of smaller numbers.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 ≤ n ≤ 10000
0 ≤ a[i] ≤ 104  
*/

package stack_and_queue;
import java.util.*;
public class Test17 {
	class Solution{
	    static List<Integer> leftSmaller(int n, int a[])
	    {
	        //code here
	        List<Integer> ans = new ArrayList<>();
	        Stack<Integer> st = new Stack<>();
	        for(int i=0;i<n;i++) {
	            while(!st.empty() && st.peek() >= a[i]) {
	                st.pop();
	            }
	            
	            int x = st.empty() ? -1 : st.peek();
	            ans.add(x);
	            st.push(a[i]);
	            
	        }
	        return ans;
	    }
	}
}
