/*
148. Sort List
Solved
Medium
Topics
Companies
Given the head of a linked list, return the list after sorting it in ascending order.

 

Example 1:


Input: head = [4,2,1,3]
Output: [1,2,3,4]
Example 2:


Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]
Example 3:

Input: head = []
Output: []
 

Constraints:

The number of nodes in the list is in the range [0, 5 * 104].
-105 <= Node.val <= 105
*/

package linked_list;
import java.util.*;
public class Test31 {
	class Solution {
	    public ListNode sortList(ListNode head) {
	        ArrayList<Integer> ans = new ArrayList<>();
	        ListNode temp = head;
	        while(temp != null) {
	            ans.add(temp.val);
	            temp = temp.next;
	        }
	        Collections.sort(ans);
	        temp = head;
	        int i = 0;
	        while(temp != null) {
	            temp.val = ans.get(i);
	            i++;
	            temp = temp.next;
	        }
	        return head;
	    }
	}
	
	/*
	class Solution {
	    public ListNode findMiddle(ListNode head) {
	        ListNode slow = head;
	        ListNode fast = head.next;
	        while(fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        return slow;
	    }
	    public ListNode merge2LL(ListNode head1, ListNode head2) {
	        ListNode t1 = head1;
	        ListNode t2 = head2;
	        ListNode dNode = new ListNode(-1);
	        ListNode temp = dNode;
	        while(t1 != null && t2 != null) {
	            if(t1.val < t2.val) {
	                temp.next = t1;
	                temp = temp.next;
	                t1 = t1.next;
	            }
	            else {
	                temp.next = t2;
	                temp = temp.next;
	                t2 = t2.next;
	            }
	        }
	        if(t1 != null) temp.next = t1;
	        else temp.next = t2;

	        return dNode.next;
	    }
	    public ListNode f(ListNode head) {
	        if(head == null || head.next == null) return head;
	        ListNode middle = findMiddle(head);
	        ListNode leftHead = head;
	        ListNode rightHead = middle.next;
	        middle.next = null;

	        leftHead = f(leftHead);
	        rightHead = f(rightHead);

	        return merge2LL(leftHead, rightHead);
	    }
	    public ListNode sortList(ListNode head) {
	        if(head == null || head.next == null) return head;
	        return f(head);
	    }
	}
	*/
	
}
