/*
Infix to Postfix
Difficulty: MediumAccuracy: 52.94%Submissions: 85K+Points: 4
Given an infix expression in the form of string str. Convert this infix expression to postfix expression.

Infix expression: The expression of the form a op b. When an operator is in-between every pair of operands.
Postfix expression: The expression of the form a b op. When an operator is followed for every pair of operands.
Note: The order of precedence is: ^ greater than * equals to / greater than + equals to -. Ignore the right associativity of ^.
Example 1:

Input: str = "a+b*(c^d-e)^(f+g*h)-i"
Output: abcd^e-fgh*+^*+i-
Explanation:
After converting the infix expression 
into postfix expression, the resultant 
expression will be abcd^e-fgh*+^*+i-
Example 2:

Input: str = "A*(B+C)/D"
Output: ABC+*D/
Explanation:
After converting the infix expression 
into postfix expression, the resultant 
expression will be ABC+*D/
 
Your Task:
This is a function problem. You only need to complete the function infixToPostfix() that takes a string(Infix Expression) as a parameter and returns a string(postfix expression). The printing is done automatically by the driver code.

Expected Time Complexity: O(|str|).
Expected Auxiliary Space: O(|str|).

Constraints:
1 ≤ |str| ≤ 105

Seen this question in a real interview before ?
Yes
No
Company Tags
PaytmVMWareMicrosoft
*/

package stack_and_queue;
import java.util.*;
public class Test08 {
	class Solution {
	    // Function to convert an infix expression to a postfix expression.
	    static int priority(char x) {
	        if(x == '^') return 3;
	        else if(x == '*' || x == '/') return 2;
	        else if(x == '+' || x == '-') return 1;
	        else return -1;
	    }
	    
	    public static String infixToPostfix(String exp) {
	        // Your code here
	        String ans = "";
	        Stack<Character> st = new Stack<>();
	        for(int i=0;i<exp.length();i++) {
	            if((exp.charAt(i) >= 'A' && exp.charAt(i) <= 'Z') ||
	               (exp.charAt(i) >= 'a' && exp.charAt(i) <= 'z') ||
	               (exp.charAt(i) >= '0' && exp.charAt(i) <= '9')
	            ) {
	                ans += exp.charAt(i);
	            }
	            else if(exp.charAt(i) == '(')
	                st.push(exp.charAt(i));
	            else if(exp.charAt(i) == ')') {
	                while(st.peek() != '(') {
	                    ans += st.pop();
	                }
	                st.pop();
	            }
	            else {
	                while(!st.empty() && priority(exp.charAt(i)) <= priority(st.peek())) {
	                    ans += st.pop();
	                }
	                st.push(exp.charAt(i));
	            }
	 
	        }
	        while(!st.empty()) {
	            ans += st.pop();
	        }
	        return ans;
	    }
	}
}
