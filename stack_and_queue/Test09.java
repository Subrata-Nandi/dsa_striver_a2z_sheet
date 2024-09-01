/*
Prefix to Infix Conversion
Difficulty: MediumAccuracy: 73.41%Submissions: 11K+Points: 4
You are given a string S of size N that represents the prefix form of a valid mathematical expression. Convert it to its infix form.

Example 1:

Input: 
*-A/BC-/AKL
Output: 
((A-(B/C))*((A/K)-L))
Explanation: 
The above output is its valid infix form.
Your Task:

Complete the function string preToInfix(string pre_exp), which takes a prefix string as input and return its infix form.

 

Expected Time Complexity: O(N).

Expected Auxiliary Space: O(N).

Constraints:

3<=|S|<=104
*/

package stack_and_queue;
import java.util.*;
public class Test09 {
	class Solution {
	    static String preToInfix(String pre_exp) {
	        // code here
	        Stack<String> st = new Stack<>();
	        for(int i=pre_exp.length()-1;i>=0;i--) {
	            char temp = pre_exp.charAt(i);
	            if(temp >= 'A' && temp <= 'Z' ||
	               temp >= 'a' && temp <= 'z' ||
	               temp >= '0' && temp <= '9'
	            ) {
	                st.push(Character.toString(temp));
	            }
	            else {
	                String top1 = st.pop();
	                String top2 = st.pop();
	                st.push("(" + top1 + temp + top2 + ")");
	            }
	        }
	        return st.pop();
	    }
	}
}
