/*
Three way partitioning
EasyAccuracy: 41.58%Submissions: 138K+Points: 2
Fast-Track your resumes to top tech companies and get the job you deserve! Register for Job-A-Thon Hiring Challenge  

banner
Given an array of size n and a range [a, b]. The task is to partition the array around the range such that the array is divided into three parts.
1) All elements smaller than a come first.
2) All elements in range a to b come next.
3) All elements greater than b appear in the end.
The individual elements of three sets can appear in any order. You are required to return the modified array.

Note: The generated output is 1 if you modify the given array successfully.

Geeky Challenge: Solve this problem in O(n) time complexity.

Example 1:

Input: 
n = 5
array[] = {1, 2, 3, 3, 4}
[a, b] = [1, 2]
Output: 
1
Explanation: 
One possible arrangement is: {1, 2, 3, 3, 4}. If you return a valid arrangement, output will be 1.
Example 2:

Input: 
n = 6 
array[] = {1, 4, 3, 6, 2, 1}
[a, b] = [1, 3]
Output: 
1
Explanation: 
One possible arrangement is: {1, 3, 2, 1, 4, 6}. If you return a valid arrangement, output will be 1.
Your Task:
You don't need to read input or print anything. The task is to complete the function threeWayPartition() which takes the array array, a, and b as input parameters and modifies the array in place according to the given conditions.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 106
1 <= array[i], a, b <= 109
*/

package gfg_potd;

public class Test06 {
	public void threeWayPartition(int arr[], int a, int b)
    {
        // code here 
        int start = 0, end = arr.length - 1;
        for(int i=0;i<=end;) {
            if(arr[i] < a) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
                i++;
            }
            else if(arr[i] > b) {
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
            }
            else {
                i++;
            }
        }
    }
}
