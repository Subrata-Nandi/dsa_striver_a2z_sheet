/*
Reverse a Doubly Linked List
Difficulty: EasyAccuracy: 70.38%Submissions: 131K+Points: 2
Given a doubly linked list. Your task is to reverse the doubly linked list in-place.

Example 1:

Input:
LinkedList: 3 <--> 4 <--> 5
Output: 5 4 3
Example 2:

Input:
LinkedList: 75 <--> 122 <--> 59 <--> 196
Output: 196 59 122 75
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).

Constraints:
1 <= number of nodes <= 104
0 <= node->data <= 104

Seen this question in a real interview before ?
Yes
No
Company Tags
D-E-ShawAdobe
*/

package linked_list;
import java.util.*;
public class Test09 {
	public static Node reverseDLL(Node  head)
	{
	    //Your code here
		// Using stack
	    Node temp = head;
	    Stack<Integer> st = new Stack<>();
	    while(temp != null) {
	        st.push(temp.data);
	        temp = temp.next;
	    }
	    temp = head;
	    while(temp != null) {
	        temp.data = st.pop();
	        temp = temp.next;
	    }
	    return head;
	    
	    //Only changing the links
	    /*
	    if(head.next == null) return head;
	    Node temp = head;
	    Node last = null;
	    while(temp != null) {
	        last = temp.prev;
	        temp.prev = temp.next;
	        temp.next = last;
	        temp = temp.prev;
	    }
	    return last.prev;
	    */
	}
}
