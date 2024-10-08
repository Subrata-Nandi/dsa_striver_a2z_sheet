/*
Given an unsorted array arr[] of size n having both negative and positive integers. 
The task is place all negative element at the end of array without changing the order of positive element and negative element.

 

Example 1:

Input : 
n = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5

Example 2:

Input : 
n = 8
arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
Output :
7  9  10  11  -5  -3  -4  -1
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function segregateElements() which takes the array arr[] and its size N as inputs and store the answer in the array arr[] itself.

 

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)
 


Constraints:
1 ≤ n ≤ 10^6
-10^9 ≤ arr[i] ≤ 10^9
*/

package arrays;

public class Negative_elements_one_side {

}

class Solution5 {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        if(n==0 || n==1)
            return;
        int new_arr[] = new int[n];
        int count = 0;
        for(int i=0;i<n;i++) {
            if(arr[i] >= 0) {
                new_arr[count] = arr[i];
                count++;
            }
        }
        for(int i=0;i<n;i++) {
            if(arr[i] < 0) {
                new_arr[count] = arr[i];
                count++;
            }
        }
        for(int i=0;i<n;i++) {
            arr[i] = new_arr[i];
        }
    }
}
