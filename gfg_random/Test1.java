/*
Missing number in array
EasyAccuracy: 29.59%Submissions: 1.1MPoints: 2
Exclusive Job-A-Thon | Apply to 15+ Companies via 1 Hiring Challenge | Starting from 29th April onwards

banner
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
Example 2:

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9

Your Task :
You don't need to read input or print anything. Complete the function MissingNumber() that takes array and N as input  parameters and returns the value of the missing number.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/

package gfg_random;

public class Test1 {
	int missingNumber(int array[], int n) {
        // Your Code Here
        int temp = (n * (n + 1)) / 2;
        int sum = 0;
        for(int i=0;i<n-1;i++) {
            sum += array[i];
        }
        return temp - sum;
    }
}


/*		// Another process using xor

int missingNumber(int array[], int n) {
    // Your Code Here
    int xor1 = 0;
    int xor2 = 0;
    for(int i=0;i<n-1;i++) {
        xor2 = xor2 ^ array[i];
        xor1 = xor1 ^ (i + 1);
    }
    xor1 = xor1 ^ n;
    return xor1 ^ xor2;
}

*/