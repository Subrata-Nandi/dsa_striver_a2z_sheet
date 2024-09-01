/*
Longest Common Prefix of Strings
Difficulty: EasyAccuracy: 29.52%Submissions: 271K+Points: 2
Given an array of strings arr. Return the longest common prefix among all strings present in the array. If there's no prefix common in all the strings, return "-1".

Examples :

Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
Output: gee
Explanation: "gee" is the longest common prefix in all the given strings.
Input: arr[] = ["hello", "world"]
Output: -1
Explanation: There's no common prefix in the given strings.
Expected Time Complexity: O(n*min(|arri|))
Expected Space Complexity: O(min(|arri|))

Constraints:
1 ≤ |arr| ≤ 103
1 ≤ |arr[i]| ≤ 103

Seen this question in a real interview before ?
Yes
No
Company Tags
VMWareMicrosoftGoogle
Topic Tags
ArraysStringsData Structures
*/

package gfg_potd;

public class Test20 {
	class Solution {
	    public String longestCommonPrefix(String arr[]) {
	        // code here
	        if(arr.length == 1) return arr[0];
	        int strlen = arr[0].length();
	        for(int i=0;i<arr.length;i++) {
	            strlen = Math.min(strlen, arr[i].length());
	        }
	        
	        int index = -1;
	        boolean flag = true;
	        
	        for(int i=0;i<strlen;i++) {
	            for(int j=0;j<arr.length-1;j++) {
	                if(arr[j].charAt(i) != arr[j+1].charAt(i)) {
	                    index = i-1;
	                    flag = false;
	                }
	            }
	            if(flag == false) break;
	        }
	        
	        if(index == -1) return "-1";
	        String ans = "";
	        for(int i=0;i<=index;i++) {
	            ans += arr[0].charAt(i);
	        }
	        return ans;
	    }
	}
}
