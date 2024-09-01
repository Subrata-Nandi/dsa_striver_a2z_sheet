/*
Merge two sorted linked lists
Difficulty: MediumAccuracy: 62.91%Submissions: 155K+Points: 4
Given two sorted linked lists consisting of nodes respectively. The task is to merge both lists and return the head of the merged list.

Examples:

Input: LinkedList1: 5->10->15->40, ListedList2: 2->3->20
Output: 2->3->5->10->15->20->40
Explanation:

Input: LinkedList1: 1->1, LinkedList2: 2->4
Output: 1->1->2->4
Explanation:

Expected Time Complexity: O(n+m)
Expected Auxilliary Space: O(1)

Constraints:
1 <= no. of nodes<= 105
0 <= node->data <= 105

Seen this question in a real interview before ?
Yes
No
Company Tags
ZohoFlipkartAccoliteAmazonMicrosoftSamsungFactSetMakeMyTripOracleBrocadeSynopsysOATS SystemsBelzabar
*/

package linked_list;

public class Test28 {
	class Solution {
	    // Function to merge two sorted linked list.
	    Node sortedMerge(Node head1, Node head2) {
	        // This is a "method-only" submission.
	        // You only need to complete this method
	        Node dNode = new Node(-1);
	        Node temp = dNode;
	        while(head1 != null && head2 != null) {
	            if(head1.data < head2.data) {
	                temp.next = head1;
	                temp = temp.next;
	                head1 = head1.next;
	            }
	            else {
	                temp.next = head2;
	                temp = temp.next;
	                head2 = head2.next;
	            }
	        }
	        if(head1 != null) temp.next = head1;
	        else temp.next = head2;
	        return dNode.next;
	    }
	}
}
