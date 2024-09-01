/*
2. Add Two Numbers
Solved
Medium
Topics
Companies
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
*/

package linked_list;
import java.util.*;
public class Test10 {
	class Solution {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode t1 = l1;
	        ListNode t2 = l2;
	        ListNode dummyNode = new ListNode(-1);
	        ListNode temp = dummyNode;
	        int carry = 0;
	        while(t1 != null || t2 != null) {
	            int sum = carry;
	            if(t1 != null) sum += t1.val;
	            if(t2 != null) sum += t2.val;

	            ListNode newNode = new ListNode(sum % 10);
	            carry = sum / 10;
	            if(t1 != null) t1 = t1.next;
	            if(t2 != null) t2 = t2.next;
	            temp.next = newNode;
	            temp = temp.next;
	        }
	        if(carry != 0) {
	            ListNode newNode = new ListNode(carry);
	            temp.next = newNode;
	        }
	        return dummyNode.next;
	    }
	}
}
