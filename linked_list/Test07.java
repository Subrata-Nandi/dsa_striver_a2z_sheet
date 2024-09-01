/*
Delete node in Doubly Linked List
Difficulty: EasyAccuracy: 42.98%Submissions: 129K+Points: 2
Given a doubly Linked list and a position. The task is to delete a node from a given position (position starts from 1) in a doubly linked list and return the head of the doubly Linked list.

Examples:

Input: LinkedList = 1 <--> 3 <--> 4, x = 3
Output: 1 3  
Explanation: 
After deleting the node at position 3 (position starts from 1),the linked list will be now as 1 <--> 3.
 
Input: LinkedList = 1 <--> 5 <--> 2 <--> 9, x = 1
Output: 5 2 9
Explanation:

Expected Time Complexity: O(n)
Expected Auxilliary Space: O(1)

Constraints:
2 <= size of the linked list(n) <= 105
1 <= x <= n
1 <= node.data <= 109

Seen this question in a real interview before ?
Yes
No
Company Tags
AmazonWalmart
*/

package linked_list;

public class Test07 {
	    public Node deleteNode(Node head, int x) {
        if(head == null || head.next == null) return null;
        if(x == 1) {
            Node temp = head;
            head = head.next;
            head.prev = null;
            temp.next = null;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        while(temp != null) {
            cnt++;
            if(cnt == x) {
                break;
            }
            temp = temp.next;
        }
        Node back = temp.prev;
        Node front = temp.next;
        if(front == null) {
            back.next = null;
            temp.prev = null;
        }
        else {
            back.next = front;
            front.prev = back;
            temp.next = null;
            temp.prev = null;
        }
        return head;
    }
}
}
