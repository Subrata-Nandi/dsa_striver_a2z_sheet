/*
Given an array, rotate the array by one position in clock-wise direction.
 

Example 1:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
 

Example 2:

Input:
N = 8
A[] = {9, 8, 7, 6, 4, 2, 1, 3}
Output:
3 9 8 7 6 4 2 1
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function rotate() which takes the array A[] and its size N as inputs and modify the array in place.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

Constraints:
1<=N<=10^5
0<=a[i]<=10^5
*/

package arrays;

class Solution7 {
    
    public void rotate(int arr[], int n)
    {
        for(int i=n-1;i>0;i--) {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
    }
}

public class Cyclically_rotate_an_array {

}
