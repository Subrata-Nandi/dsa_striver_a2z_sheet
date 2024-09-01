/*
Next Permutation
Difficulty: MediumAccuracy: 40.66%Submissions: 131K+Points: 4
Implement the next permutation, which rearranges the list of numbers into Lexicographically next greater permutation of list of numbers. If such arrangement is not possible, it must be rearranged to the lowest possible order i.e. sorted in an ascending order. You are given an list of numbers arr[ ] of size N.

Example 1:

Input: N = 6
arr = {1, 2, 3, 6, 5, 4}
Output: {1, 2, 4, 3, 5, 6}
Explaination: The next permutation of the 
given array is {1, 2, 4, 3, 5, 6}.
Example 2:

Input: N = 3
arr = {3, 2, 1}
Output: {1, 2, 3}
Explaination: As arr[] is the last 
permutation. So, the next permutation 
is the lowest one.
Your Task:
You do not need to read input or print anything. Your task is to complete the function nextPermutation() which takes N and arr[ ] as input parameters and returns a list of numbers containing the next permutation.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 10000

Seen this question in a real interview before ?
Yes
No
Company Tags
InfosysFlipkartAmazonMicrosoftFactSetHikeMakeMyTripGoogleQualcommSalesforce
*/

package arrays;
import java.util.*;
public class Test15 {
	/*
	 * This is a C++ code
	class Solution{
		public:
		    vector<int> nextPermutation(int N, vector<int> nums){
		        // code here
		        int n = nums.size();
		        int ind = -1;
		        for(int i=n-2;i>=0;i--) {
		            if(nums[i] < nums[i+1]) {
		                ind = i;
		                break;
		            }
		        }
		        if(ind == -1) {
		            reverse(nums.begin(), nums.end());
		            return nums;
		        }
		        for(int i=n-1;i>ind;i--) {
		            if(nums[i] > nums[ind]) {
		                swap(nums[i], nums[ind]);
		                break;
		            }
		        }
		        reverse(nums.begin() + ind + 1, nums.end());
		        return nums;
		    }
		};
		*/
	
	public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        int n = A.size(); // size of the array.

        // Step 1: Find the break point:
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                // index i is the break point
                ind = i;
                break;
            }
        }

        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array:
            Collections.reverse(A);
            return A;
        }

        // Step 2: Find the next greater element
        //         and swap it with arr[ind]:

        for (int i = n - 1; i > ind; i--) {
            if (A.get(i) > A.get(ind)) {
                int tmp = A.get(i);
                A.set(i, A.get(ind));
                A.set(ind, tmp);
                break;
            }
        }

        // Step 3: reverse the right half:
        List<Integer> sublist = A.subList(ind + 1, n);
        Collections.reverse(sublist);

        return A;
    }
}
