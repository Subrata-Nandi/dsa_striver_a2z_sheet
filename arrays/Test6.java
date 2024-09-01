/*
Intersection of two sorted arrays
Difficulty: EasyAccuracy: 42.53%Submissions: 41K+Points: 2
The intersection of two arrays contains the elements common to both the arrays. The intersection should not count duplicate elements.
Given two sorted arrays arr1[] and arr2[] of sizes N and M respectively. Find their intersection

 

Example 1:

Input: 
N = 4, arr1[] = {1, 2, 3, 4}  
M = 5, arr2 [] = {2, 4, 6, 7, 8}
Output: 2 4
Explanation: 2 and 4 are only common 
elements in both the arrays.
 

Example 2:

Input: 
N = 5, arr1[] = {1, 2, 2, 3, 4}
M = 6, arr2[] = {2, 2, 4, 6, 7, 8}
Output: 2 4
Explanation: 2 and 4 are the only 
common elements.
 

Example 3:

Input:
N = 2, arr1[] = {1, 2}
M = 2, arr2[] = {3, 4}
Output: -1
Explanation: No common elements.

 

Your Task:
You do not need to read input or print anything. Complete the function printIntersection() that takes arr1,arr2,  N and M as input parameters and return a list of integers containing the intersection of two arrays. If the intersection is empty then then list should contain -1.


Expected Time Complexity: O(N + M).
Expected Auxiliary Space: O(min(N,M)).

 

Constraints:
1 <= N, M <= 105
1 <= arr[i], brr[i] <= 106
*/

package arrays;
import java.util.*;
public class Test6 {
	class Solution
	{
	    //Function to return a list containing the intersection of two arrays.
	    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) 
	    {
	        // add your code here
	        ArrayList<Integer> arr = new ArrayList<>();
	        int i = 0;
	        int j = 0;
	        int count = 0;
	        
	        while(i<n && j<m) {
	            if(arr1[i] < arr2[j]) {
	                i++;
	            }
	            else if(arr2[j] < arr1[i]) {
	                j++;
	            }
	            else {
	                if(arr.size() == 0 || arr.get(count-1) != arr1[i]) {
	                    count++;
	                    arr.add(arr1[i]);
	                }
	                i++;
	                j++;
	            }
	        }
	        return arr;
	    }

	}

}
