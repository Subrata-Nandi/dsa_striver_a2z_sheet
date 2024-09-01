/*
Given two arrays a[] and b[] respectively of size n and m, the task is to print the count of elements in the intersection (or common elements) of the two arrays.

For this question, the intersection of two arrays can be defined as the set containing distinct common elements between the two arrays. 

Example 1:

Input:
n = 5, m = 3
a[] = {89, 24, 75, 11, 23}
b[] = {89, 2, 4}

Output: 1

Explanation: 
89 is the only element 
in the intersection of two arrays.
Example 2:

Input:
n = 6, m = 5
a[] = {1, 2, 3, 4, 5, 6}
b[] = {3, 4, 5, 6, 7} 

Output: 4

Explanation: 
3 4 5 and 6 are the elements 
in the intersection of two arrays.
Your Task:
You don't need to read input or print anything. Your task is to complete the function NumberofElementsInIntersection() which takes two integers n and m and their respective arrays a[] and b[]  as input. The function should return the count of the number of elements in the intersection.

 

Expected Time Complexity: O(n + m).
Expected Auxiliary Space: O(min(n,m)).

Constraints:
1 ≤ n, m ≤ 10^5
1 ≤ a[i], b[i] ≤ 10^5
*/

package arrays;
import java.util.*;
class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
    	HashSet<Integer> hs1 = new HashSet<Integer>();
        HashSet<Integer> hs2 = new HashSet<Integer>();
        for(int i=0;i<n;i++) {
          hs1.add(a[i]);
        }
      
        for(int i=0;i<m;i++) {
            if(hs1.contains(b[i]))
              hs2.add(b[i]);
        }
        return hs2.size();
    
    }
};

public class Intersection_of_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 7, 1, 5, 2, 3, 6 };
        int arr2[] = { 3, 8, 6, 20, 7};
        int n = arr1.length;
        int m = arr2.length;
        Solution obj = new Solution();
        System.out.println(obj.NumberofElementsInIntersection(arr1, arr2, n, m));
	}

}

//----------------------------------------------------------------------------------------------------------------------------------

/*
//Optimize Approach
        int count = 0;
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i=0; i<n ; i++){
            hs.add(a[i]);
        }
        
        for(int i=0; i<m ; i++){
            if(hs.contains(b[i])){
                count++;
                hs.remove(b[i]);
            }

        }
        
        return count;
*/