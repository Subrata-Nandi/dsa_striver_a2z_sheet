/*
Palindrome Linked List
Difficulty: MediumAccuracy: 41.48%Submissions: 315K+Points: 4
Given a singly linked list of integers. The task is to check if the given linked list is palindrome or not.

Examples:

Input: LinkedList: 1->2->1->1->2->1
Output: true
Explanation: The given linked list is 1->2->1->1->2->1 , which is a palindrome and Hence, the output is true.

Input: LinkedList: 1->2->3->4
Output: false
Explanation: The given linked list is 1->2->3->4, which is not a palindrome and Hence, the output is false.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1) 
Note: You should not use the recursive stack space as well

Constraints:
1 <= number of nodes <= 105
1 ≤ node->data ≤ 103

Seen this question in a real interview before ?
Yes
No
Company Tags
AccoliteAmazonMicrosoftSnapdealMakeMyTripAdobeYodlee InfotechKLA TencorKritikal Solutions
*/

package linked_list;
import java.util.*;
public class Test12 {
	/* Structure of class Node is
	class Node
	{
	    int data;
	    Node next;

	    Node(int d)
	    {
	        data = d;
	        next = null;
	    }
	}*/

	class Solution {
	    // Function to check whether the list is palindrome.
	    boolean isPalindrome(Node head) {
	        // Your code here
	        if(head.next == null) return true;
	        Node temp = head;
	        Stack<Integer> st = new Stack<>();
	        while(temp != null) {
	            st.push(temp.data);
	            temp = temp.next;
	        }
	        temp = head;
	        while(temp != null) {
	            if(st.pop() != temp.data) return false;
	            temp = temp.next;
	        }
	        return true;
	    }
	}
}
