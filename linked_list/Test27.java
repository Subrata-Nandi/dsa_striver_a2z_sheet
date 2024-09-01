/*
61. Rotate List
Solved
Medium
Topics
Companies
Given the head of a linked list, rotate the list to the right by k places.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:


Input: head = [0,1,2], k = 4
Output: [2,0,1]
 

Constraints:

The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 * 109
*/

package linked_list;

public class Test27 {
	class Solution {
	    public ListNode rotateRight(ListNode head, int k) {
	        if(head == null || head.next == null || k == 0) return head;
	        ListNode tail = head;
	        int len = 1;
	        while(tail.next != null) {
	            len++;
	            tail = tail.next;
	        }
	        if(k % len == 0) return head;
	        tail.next = head;
	        k = k % len;
	        int cnt = 0;
	        ListNode temp = head;
	        while(temp != null) {
	            cnt++;
	            if(cnt == len - k) {
	                head = temp.next;
	                temp.next = null;
	            }
	            temp = temp.next;
	        }
	        return head;
	    }
	}
}
