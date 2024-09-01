/*
Median of 2 Sorted Arrays of Different Sizes
Difficulty: HardAccuracy: 28.4%Submissions: 113K+Points: 8
Given two sorted arrays array1 and array2 of size m and n respectively. Find the median of the two sorted arrays.

Example 1:

Input:
m = 3, n = 4
array1[] = {1,5,9}
array2[] = {2,3,6,7}
Output: 5
Explanation: The middle element for
{1,2,3,5,6,7,9} is 5
Example 2:

Input:
m = 2, n = 4
array1[] = {4,6}
array2[] = {1,2,3,5}
Output: 3.5
Your Task:
The task is to complete the function MedianOfArrays() that takes array1 and array2 as input and returns their median. 

Can you solve the problem in expected time complexity?

Expected Time Complexity: O(min(log n, log m)).
Expected Auxiliary Space: O((n+m)/2).

Constraints: 
0 ≤ m,n ≤ 106
1 ≤ array1[i], array2[i] ≤ 109

Seen this question in a real interview before ?
Yes
No
Company Tags
AmazonMicrosoftSamsungGoogle
*/

package binary_search;

public class Test18 {
	class GFG 
	{ 
	    static double medianOfArrays(int n, int m, int a[], int b[]) 
	    {
	        // Your Code Here
	        int mid = n + m;
	        int ind2 = mid / 2;
	        int ind1 = (mid / 2) - 1;
	        int ind1el = -1, ind2el = -1;
	        int cnt = 0;
	        int i = 0, j = 0;
	        
	        while(i<n && j<m) {
	            if(a[i] <= b[j]) {
	                if(cnt == ind1) ind1el = a[i];
	                if(cnt == ind2) ind2el = a[i];
	                cnt++;
	                i++;
	            }
	            else {
	                if(cnt == ind1) ind1el = b[j];
	                if(cnt == ind2) ind2el = b[j];
	                cnt++;
	                j++;
	            }
	        }
	        
	        while(i<n) {
	            if(cnt == ind1) ind1el = a[i];
	            if(cnt == ind2) ind2el = a[i];
	            cnt++;
	            i++;
	        }
	        
	        while(j<m) {
	            if(cnt == ind1) ind1el = b[j];
	            if(cnt == ind2) ind2el = b[j];
	            cnt++;
	            j++;
	        }
	        
	        if(mid % 2 == 1) return (double) ind2el;
	        else return (double) (((double) ind1el + (double) ind2el) / 2.0);
	    }
	}
}
