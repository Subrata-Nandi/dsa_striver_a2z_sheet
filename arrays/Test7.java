/*
Missing in Array
Difficulty: EasyAccuracy: 29.59%Submissions: 1.1MPoints: 2
Given an array of size n-1 such that it only contains distinct integers in the range of 1 to n. Return the missing element.

Examples:

Input: n = 5, arr[] = {1,2,3,5}
Output: 4
Explanation : All the numbers from 1 to 5 are present except 4.
Input: n = 2, arr[] = {1}
Output: 2
Explanation : All the numbers from 1 to 2 are present except 2.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ n ≤ 106
1 ≤ arr[i] ≤ 106

Seen this question in a real interview before ?
Yes
No
Company Tags
FlipkartMorgan StanleyAccoliteAmazonMicrosoftD-E-ShawOla CabsPayuVisaIntuitAdobeCiscoQualcommTCS
*/

package arrays;

public class Test7 {
	class Solution {

	    // Note that the size of the array is n-1
	    int missingNumber(int n, int arr[]) {

	        // Your Code Here
	        int xor1 = 0, xor2 = 0;
	        for(int i=0;i<n-1;i++) {
	            xor2 = xor2 ^ arr[i];
	            xor1 = xor1 ^ (i+1);
	        }
	        xor1 = xor1 ^ n;
	        return xor1 ^ xor2;
	    }
	}
	
	/*
	class Solution {
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
	*/
}
