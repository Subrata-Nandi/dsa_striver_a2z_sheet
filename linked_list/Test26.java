/*
25. Reverse Nodes in k-Group
Solved
Hard
Topics
Companies
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]
Example 2:


Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]
 

Constraints:

The number of nodes in the list is n.
1 <= k <= n <= 5000
0 <= Node.val <= 1000
*/

package linked_list;

public class Test26 {
	class Solution {
	    public ListNode findKthNode(ListNode temp, int k) {
	        int cnt = 1;
	        while(temp != null) {
	            cnt++;
	            temp = temp.next;
	            if(cnt == k) return temp;
	        }
	        return temp;
	    }
	    
	    public void reverse(ListNode head) {
	        ListNode prev = null;
	        ListNode temp = head;
	        ListNode curr = head;
	        while(temp != null) {
	            temp = temp.next;
	            curr.next = prev;
	            prev = curr;
	            curr = temp;
	        }
	    }

	    public ListNode reverseKGroup(ListNode head, int k) {
	        ListNode temp = head;
	        ListNode prevNode = null;
	        while(temp != null) {
	            ListNode kthNode = findKthNode(temp, k);
	            if(kthNode == null) {
	                if(prevNode != null) prevNode.next = temp;
	                break;
	            }
	            ListNode nextNode = kthNode.next;
	            kthNode.next = null;
	            reverse(temp);
	            if(head == temp) {
	                head = kthNode;
	            }
	            else {
	                prevNode.next = kthNode;
	            }
	            prevNode = temp;
	            temp = nextNode;
	        }
	        return head;
	    }
	}
}
