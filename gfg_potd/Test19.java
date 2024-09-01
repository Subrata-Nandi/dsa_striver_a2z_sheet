/*
Remove Duplicates
Difficulty: EasyAccuracy: 52.35%Submissions: 132K+Points: 2
Given a string str without spaces, the task is to remove all duplicate characters from it, keeping only the first occurrence.

Note: The original order of characters must be kept the same. 

Examples :

Input: str = "zvvo"
Output: "zvo"
Explanation: Only keep the first occurrence
Input: str = "gfg"
Output: "gf"
Explanation: Only keep the first occurrence
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= |str| <= 105
str contains lowercase English alphabets

Seen this question in a real interview before ?
Yes
No
Company Tags
Microsoft
Topic Tags
StringsData StructuresHash
*/

package gfg_potd;
import java.util.*;
public class Test19 {
	// User function Template for Java

	class Solution {
	    String removeDups(String str) {
	        // code here
	        HashSet<Character> mp = new LinkedHashSet<>();
	        for(int i=0;i<str.length();i++) {
	            mp.add(str.charAt(i));
	        }
	        
	        String ans = "";
	        for(char it: mp) {
	            ans += it;
	        }
	        
	        return ans;
	    }
	}
}
