/*
Longest Sub-Array with Sum K
Difficulty: MediumAccuracy: 24.64%Submissions: 292K+Points: 4
Given an array arr containing n integers and an integer k. Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value k.

 

Examples:
 

Input :
arr[] = {10, 5, 2, 7, 1, 9}, k = 15
Output : 4
Explanation:
The sub-array is {5, 2, 7, 1}.
Input : 
arr[] = {-1, 2, 3}, k = 6
Output : 0
Explanation: 
There is no such sub-array with sum 6.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

 

Constraints:
1<=n<=105
-105<=arr[i], K<=105
 

Seen this question in a real interview before ?
Yes
No
Company Tags
Amazon
*/

package arrays;
import java.util.*;
public class Test10 {
	class Solution{
	    
		   
	    // Function for finding maximum and value pair
	    public static int lenOfLongSubarr (int a[], int n, int k) {
	        //Complete the function
	        /*
	        int maxLen = 0;
	        for(int i=0;i<n;i++) {
	            int sum = 0;
	            for(int j=i;j<n;j++) {
	                sum += A[j];
	                if(sum == K) {
	                    maxLen = Math.max(maxLen, j-i+1);
	                }
	            }
	        }
	        return maxLen;
	        */
	        
	        int maxLen = 0;
	        int sum = 0;
	        HashMap<Integer, Integer> preSumMap = new HashMap<>();
	        for(int i=0;i<n;i++) {
	            sum += a[i];
	            if(sum == k) {
	                maxLen = Math.max(maxLen, i+1);
	            }
	            
	            int rem = sum - k;
	            if(preSumMap.containsKey(rem)) {
	                int len = i - preSumMap.get(rem);
	                maxLen = Math.max(maxLen, len);
	            }
	            
	            if(!preSumMap.containsKey(sum)) {
	                preSumMap.put(sum, i);
	            }
	        }
	        return maxLen;
	    }
	    
	    
	}
}

