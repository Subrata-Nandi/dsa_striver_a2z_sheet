/*
The Celebrity Problem
Difficulty: MediumAccuracy: 38.33%Submissions: 272K+Points: 4
A celebrity is a person who is known to all but does not know anyone at a party. A party is being organized by some people.  A square matrix mat is used to represent people at the party such that if an element of row i and column j is set to 1 it means ith person knows jth person. You need to return the index of the celebrity in the party, if the celebrity does not exist, return -1.

Note: Follow 0-based indexing.

Examples:

Input: mat[][] = [[0 1 0],
                [0 0 0], 
                [0 1 0]]
Output: 1
Explanation: 0th and 2nd person both know 1. Therefore, 1 is the celebrity. 
Input: mat[][] = [[0 1],
                [1 0]]
Output: -1
Explanation: The two people at the party both know each other. None of them is a celebrity.
Expected Time Complexity: O(n2)
Expected Auxiliary Space: O(1)

Constraints:
1 <= mat.size()<= 3000
0 <= mat[i][j]<= 1

Seen this question in a real interview before ?
Yes
No
Company Tags
ZohoFlipkartAmazonMicrosoftGoogleFab.comOne97United Health Group
Topic Tags
ArraysStackData Structures
*/

package stack_and_queue;

public class Test21 {
	class Solution {
	    // Function to find if there is a celebrity in the party or not.
	    public int celebrity(int mat[][]) {
	        // code here
	        int n = mat.length;
	        int KnowMe[] = new int[n];
	        int IKnow[] = new int[n];
	        for(int i=0;i<n;i++) {
	            for(int j=0;j<n;j++) {
	                if(mat[i][j] == 1) {
	                    KnowMe[j]++;
	                    IKnow[i]++;
	                }
	            }
	        }
	        
	        for(int i=0;i<n;i++) {
	            if((KnowMe[i] == n-1) && (IKnow[i] == 0)) {
	                return i;
	            }
	        }
	        return -1;
	    }
	}
	
	/*
	// Two pointer approach
	class Solution {
	    // Function to find if there is a celebrity in the party or not.
	    public int celebrity(int mat[][]) {
	        // code here
	        int n = mat.length;
	        int top = 0;
	        int down = n - 1;
	        while(top < down) {
	            if(mat[top][down] == 1)
	                top++;
	            else if(mat[down][top] == 1)
	                down--;
	            else {
	                top++;
	                down--;
	            }
	        }
	        if(top > down) return -1;
	        for(int i=0;i<n;i++) {
	            if(i == top) continue;
	            if(mat[top][i] == 0 && mat[i][top] == 1);
	            else return -1;
	        }
	        return top;
	    }
	}
	*/
}
