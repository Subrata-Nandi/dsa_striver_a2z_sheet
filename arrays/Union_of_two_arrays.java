/*
Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.

Note : Elements are not necessarily distinct.

Example 1:

Input:
5 3
1 2 3 4 5
1 2 3
Output: 
5
Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
Example 2:

Input:
6 2 
85 25 1 32 54 6
85 2 
Output: 
7
Explanation: 
85, 25, 1, 32, 54, 6, and
2 are the elements which comes in the
union set of both arrays. So count is 7.
Your Task:
Complete doUnion function that takes a, n, b, m as parameters and returns the count of union elements of the two arrays. The printing is done by the driver code.

Constraints:
1 ≤ n, m ≤ 10^5
0 ≤ a[i], b[i] < 10^5

Expected Time Complexity : O(n+m)
Expected Auxilliary Space : O(n+m)
*/

package arrays;
import java.util.*;

// GFG coding
class Union_of_two_arrays {
    static void getUnion(int a[], int n, int b[], int m)
    {
 
        // Defining set container s
        HashSet<Integer> s = new HashSet<>();
 
        // Inserting array elements in s
        for (int i = 0; i < n; i++)
            s.add(a[i]);
 
        for (int i = 0; i < m; i++)
            s.add(b[i]);
        System.out.print(
            "Number of elements after union operation: "
            + s.size() + "\n");
        System.out.print("The union set of both arrays is :"
                         + "\n");
 
        System.out.print(
            s.toString()
            + " "); // s will contain only distinct
                    // elements from array a and b
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int a[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
        int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };
 
        getUnion(a, 9, b, 10);
    }
}

//----------------------------------------------------------------------------------------------------------------------------------

/*
class Solution6{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i=0;i<n;i++) { 
            s.add(a[i]);
        }
        for(int i=0;i<m;i++) {
            s.add(b[i]);
        }
        return s.size();
    }
}
*/