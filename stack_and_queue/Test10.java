/*
Prefix to Postfix Conversion
Difficulty: MediumAccuracy: 80.24%Submissions: 9K+Points: 4
You are given a string that represents the prefix form of a valid mathematical expression. Convert it to its postfix form.

Example:

Input: 
*-A/BC-/AKL
Output: 
ABC/-AK/L-*
Explanation: 
The above output is its valid postfix form.
Your Task:

Complete the function preToPost(string pre_exp), which takes a prefix string as input and returns its postfix form.

 

Expected Time Complexity: O(N).

Expected Auxiliary Space: O(N).

Constraints:

3<=pre_exp.length()<=100
*/

package stack_and_queue;
import java.util.*;
public class Test10 {
	class Solution {
	    static String preToPost(String pre_exp) {
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
	                st.push(top1 + top2 + temp);
	            }
	        }
	        return st.pop();
	    }
	}
}
