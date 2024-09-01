/*
Postfix to Infix Conversion
Difficulty: MediumAccuracy: 49.41%Submissions: 19K+Points: 4
You are given a string that represents the postfix form of a valid mathematical expression. Convert it to its infix form.

Example:

Input:
ab*c+ 
Output: 
((a*b)+c)
Explanation: 
The above output is its valid infix form.
Your Task:

Complete the function string postToInfix(string post_exp), which takes a postfix string as input and returns its infix form.

 

Expected Time Complexity: O(N).

Expected Auxiliary Space: O(N).

Constraints:

3<=post_exp.length()<=104
*/

package stack_and_queue;
import java.util.*;
public class Test12 {
	class Solution {
	    static String postToInfix(String exp) {
	        // code here
	        Stack<String> st = new Stack<>();
	        for(int i=0;i<exp.length();i++) {
	            char temp = exp.charAt(i);
	            if(temp >= 'A' && temp <= 'Z' ||
	               temp >= 'a' && temp <= 'z' ||
	               temp >= '0' && temp <= '9'
	            ) {
	                st.push(Character.toString(temp));
	            }
	            else {
	                String top1 = st.pop();
	                String top2 = st.pop();
	                st.push("(" + top2 + temp + top1 + ")");
	            }
	        }
	        return st.pop();
	    }
	}
}
