/*
Union of Two Sorted Arrays
Difficulty: MediumAccuracy: 31.39%Submissions: 236K+Points: 4
Given two sorted arrays of size n and m respectively, find their union. The Union of two arrays can be defined as the common and distinct elements in the two arrays. Return the elements in sorted order.

Example 1:

Input: 
n = 5, arr1[] = {1, 2, 3, 4, 5}  
m = 5, arr2 [] = {1, 2, 3, 6, 7}
Output: 
1 2 3 4 5 6 7
Explanation: 
Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
Example 2:

Input: 
n = 5, arr1[] = {2, 2, 3, 4, 5}  
m = 5, arr2[] = {1, 1, 2, 3, 4}
Output: 
1 2 3 4 5
Explanation: 
Distinct elements including both the arrays are: 1 2 3 4 5.
Example 3:

Input:
n = 5, arr1[] = {1, 1, 1, 1, 1}
m = 5, arr2[] = {2, 2, 2, 2, 2}
Output: 
1 2
Explanation: 
Distinct elements including both the arrays are: 1 2.
Your Task: 
You do not need to read input or print anything. Complete the function findUnion() that takes two arrays arr1[], arr2[], and their size n and m as input parameters and returns a list containing the union of the two arrays.

Expected Time Complexity: O(n+m).
Expected Auxiliary Space: O(n+m).
*/

package arrays;
import java.util.*;
public class Test5 {

	//User function Template for Java

	//arr1,arr2 : the arrays
	// n, m: size of arrays
	class Solution
	{
	    //Function to return a list containing the union of the two arrays.
	    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
	    {
	        // add your code here
	        ArrayList<Integer> arr = new ArrayList<>();
	        SortedSet<Integer> set = new TreeSet<Integer>();	// Using sorted set of tree set
	        
	        for(int i=0;i<n;i++) 
	            set.add(arr1[i]);
	            
	        for(int i=0;i<m;i++) 
	            set.add(arr2[i]);
	            
	        for(Integer i: set)
	            arr.add(i);
	            
	        return arr;
	    }
	}
}
