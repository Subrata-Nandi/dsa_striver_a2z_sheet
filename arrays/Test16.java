/*
Array Leaders
Difficulty: EasyAccuracy: 29.94%Submissions: 663K+Points: 2
Given an array arr of n positive integers, your task is to find all the leaders in the array. An element of the array is considered a leader if it is greater than all the elements on its right side or if it is equal to the maximum element on its right side. The rightmost element is always a leader.

Examples

Input: n = 6, arr[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.
Input: n = 5, arr[] = {10,4,2,4,1}
Output: 10 4 4 1
Explanation: Note that both of the 4s are in output, as to be a leader an equal element is also allowed on the right. side
Input: n = 4, arr[] = {5, 10, 20, 40} 
Output: 40
Explanation: When an array is sorted in increasing order, only the rightmost element is leader.
Input: n = 4, arr[] = {30, 10, 10, 5} 
Output: 30 10 10 5
Explanation: When an array is sorted in non-increasing order, all elements are leaders.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= n <= 107
0 <= arr[i] <= 107

Seen this question in a real interview before ?
Yes
No
Company Tags
PayuAdobe
*/

package arrays;
import java.util.*;
public class Test16 {
	class Solution {
	    // Function to find the leaders in the array.
	    static ArrayList<Integer> leaders(int n, int arr[]) {
	        // Your code here
	        int maxi = arr[n-1];
	        ArrayList<Integer> result = new ArrayList<>();
	        result.add(maxi);
	        for(int i=n-2;i>=0;i--) {
	            if(arr[i] >= maxi) {
	                result.add(arr[i]);
	                maxi = arr[i];
	            }
	        }
	        Collections.reverse(result);
	        return result;
	    }
	}
}
