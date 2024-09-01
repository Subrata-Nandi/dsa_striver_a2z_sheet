/*
Linked List Insertion At End
Difficulty: BasicAccuracy: 43.96%Submissions: 232K+Points: 1
Given the head of a Singly Linked List and a value x, insert that value x at the end of the LinkedList and return the modified Linked List.

Examples :

Input: LinkedList: 1->2->3->4->5 , x = 6
Output: 1->2->3->4->5->6
Explanation: 

We can see that 6 is inserted at the end of the linkedlist.
Input: LinkedList: 5->4 , x = 1
Output: 5->4->1
Explanation: 

We can see that 1 is inserted at the end of the linkedlist.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
0 <= number of nodes <= 105
1 <= node->data , x <= 103

Seen this question in a real interview before ?
Yes
No
Company Tags
HikeWiproTCS
*/

package linked_list;

public class Test04 {
	class Solution {
	    // Function to insert a node at the end of the linked list.
	    Node insertAtEnd(Node head, int x) {
	        // code here
	        if(head == null) return new Node(x);
	        Node temp = head;
	        while(temp.next != null) {
	            temp = temp.next;
	        }
	        Node newNode = new Node(x);
	        temp.next = newNode;
	        return head;
	    }
	}
}
