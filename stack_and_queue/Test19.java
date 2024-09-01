/*
Number of NGEs to the right
Difficulty: MediumAccuracy: 56.74%Submissions: 15K+Points: 4
Given an array of N integers and Q queries of indices. Return a list NGEs[] where NGEs[i] stores the count of elements strictly greater than the current element (arr[indices[i]]) to the right of indices[i].


Examples :

Input:  arr[]     = [3, 4, 2, 7, 5, 8, 10, 6]
        queries = 2
        indices[] = [0, 5]
Output:  6, 1
Explanation: The next greater elements to the right of 3(index 0) are 4,7,5,8,10,6. The next greater elements to the right of 8(index 5) is only 10.

Input:  arr[]     = [1, 2, 3, 4, 1]
        queries = 2
        indices[] = [0, 3]
Output:  3, 0
Explanation: The count of numbers to the right of index 0 which are greater than arr[0] is 3 i.e. (2, 3, 4). Similarly, the count of numbers to the right of index 3 which are greater than arr[3] is 0, since there are no greater elements than 4 to the right of the array.

Expected Time Complexity: O(N * queries).
Expected Auxiliary Space: O(queries).


Constraints:
1 <= N <= 104
1 <= arr[i] <= 105
1 <= queries <= 100

0 <= indices[i] <= N - 1
*/

package stack_and_queue;

public class Test19 {
	class Solution {
	    
		public static int nges(int arr[], int index) {
		    int temp = arr[index];
		    int count = 0;
		    for(int i=index+1;i<arr.length;i++) {
		        if(arr[i] > temp) count++;
		    }
		    return count;
		  } 
		  
		  public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
		    // code here
		    int ans[] = new int[queries];
		    for(int i=0;i<queries;i++) {
		        ans[i] = nges(arr, indices[i]);
		    }
		    return ans; 
		  }
		}
}
