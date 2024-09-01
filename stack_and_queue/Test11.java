/*
Postfix to Prefix Conversion
Difficulty: MediumAccuracy: 81.43%Submissions: 9K+Points: 4
You are given a string that represents the postfix form of a valid mathematical expression. Convert it to its prefix form.

Example 1:

Input: 
ABC/-AK/L-*
Output: 
*-A/BC-/AKL
Explanation: 
The above output is its valid prefix form.

Example 2:

Input: 
ab+
Output: 
+ab
Explanation: 
The above output is its valid prefix form.
Your Task:

Complete the function string postToPre(string post_exp), which takes a postfix string as input and returns its prefix form.

Expected Time Complexity: O(post_exp.length()).

Expected Auxiliary Space: O(post_exp.length()).

Constraints:

3<=post_exp.length()<=16000

*/

package stack_and_queue;
import java.util.*;
public class Test11 {
	class Solution {
	    static String postToPre(String post_exp) {
	        // code here
	        Stack<String> st = new Stack<>();
	        for(int i=0;i<post_exp.length();i++) {
	            char temp = post_exp.charAt(i);
	            if(temp >= 'A' && temp <= 'Z' ||
	               temp >= 'a' && temp <= 'z' ||
	               temp >= '0' && temp <= '9'
	            ) {
	                st.push(Character.toString(temp));
	            }
	            else {
	                String top1 = st.pop();
	                String top2 = st.pop();
	                st.push(temp + top2 + top1);
	            }
	        }
	        return st.pop();
	    }
	}
}
