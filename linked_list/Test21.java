/*
Delete Middle of Linked List
Difficulty: EasyAccuracy: 54.52%Submissions: 126K+Points: 2
Given a singly linked list, delete the middle of the linked list.

Note:

If there are even nodes, then there would be two middle nodes, we need to delete the second middle element.
If the input linked list has a single node, then it should return NULL.
Examples:

Input: LinkedList: 1->2->3->4->5
Output: 1->2->4->5
Explanation:

Input: LinkedList: 2->4->6->7->5->1
Output: 2->4->6->5->1
Explaination:

Input: LinkedList: 7 
Output: <empty linked list>
Expected Time Complexity: O(n)
Expected Space Complexity: O(1)

Constraints:
1 <= number of nodes <= 105
1 <= node->data <= 109

Seen this question in a real interview before ?
Yes
No
Company Tags
FlipkartAmazonMicrosoft
*/

package linked_list;

public class Test21 {
	class Solution {
	    Node deleteMid(Node head) {
	        // This is method only submission.
	        // You only need to complete the method.
	        if(head == null || head.next == null) return null;
	        Node slow = head;
	        Node fast = head;
	        fast = fast.next.next;
	        while(fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        slow.next = slow.next.next;
	        return head;
	    }
	}
}
