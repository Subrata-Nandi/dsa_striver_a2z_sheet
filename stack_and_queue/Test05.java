/*
20. Valid Parentheses
Solved
Easy
Topics
Companies
Hint
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/

package stack_and_queue;
import java.util.*;
public class Test05 {
	class Solution {
	    public boolean isValid(String s) {
	        Stack<Character> st = new Stack<>();
	        for(int i=0;i<s.length();i++) {
	            char c = s.charAt(i);
	            if(c == '(' || c == '{' || c == '[') {
	                st.push(c);
	            }
	            else {
	                if(st.empty()) return false;
	                char temp = st.peek();
	                if((temp == '(' && c == ')' ||
	                    (temp == '{' && c == '}' ||
	                    (temp == '[') && c == ']'))) {
	                    st.pop();
	                }
	                else return false;
	            }
	        }
	        if(st.empty() == true) return true;
	        else return false;
	    }
	}
}
