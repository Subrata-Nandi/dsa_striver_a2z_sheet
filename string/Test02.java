/*
Palindrome String
Difficulty: EasyAccuracy: 51.21%Submissions: 347K+Points: 2
Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
Example 2:

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome
Your Task:
You don't need to read input or print anything. Complete the function isPalindrome()which accepts string S and returns an integer value 1 or 0.

Expected Time Complexity: O(Length of S)
Expected Auxiliary Space: O(1)

Constraints:
1 <= Length of S<= 2*105

Seen this question in a real interview before ?
Yes
No
Company Tags
PaytmZohoMorgan StanleyAmazonD-E-ShawFactSetCiscoFacebook
*/

package string;

public class Test02 {
	class Solution {
	    int isPalindrome(String s) {
	        // code here
	        int len = s.length() - 1;
	        int i = 0;
	        while(i <= len) {
	            if(s.charAt(i) != s.charAt(len)) return 0;
	            i++;
	            len--;
	        }
	        return 1;
	    }
	};
}
