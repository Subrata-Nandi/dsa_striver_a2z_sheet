/*
Flattening a Linked List
Difficulty: MediumAccuracy: 51.53%Submissions: 155K+Points: 4
Given a Linked List, where every node represents a sub-linked-list and contains two pointers:
(i) a next pointer to the next node,
(ii) a bottom pointer to a linked list where this node is head.
Each of the sub-linked lists is in sorted order.
Flatten the Link List so all the nodes appear in a single level while maintaining the sorted order.

Note: The flattened list will be printed using the bottom pointer instead of the next pointer. Look at the printList() function in the driver code for more clarity.

Examples:

Input:

Output:  5-> 7-> 8- > 10 -> 19-> 20-> 22-> 28-> 30-> 35-> 40-> 45-> 50.
Explanation: The resultant linked lists has every node in a single level.(Note: | represents the bottom pointer.)
Input:
 
Output: 5-> 7-> 8-> 10-> 19-> 22-> 28-> 30-> 50
Explanation: The resultant linked lists has every node in a single level.(Note: | represents the bottom pointer.)
Note: In the output section of the above examples, the -> represents the bottom pointer.

Expected Time Complexity: O(n * n * m)
Expected Auxiliary Space: O(n)

Constraints:
0 <= number of nodes <= 50
1 <= no. of nodes in sub-LinkesList(mi) <= 20
1 <= node->data <= 103

Seen this question in a real interview before ?
Yes
No
Company Tags
PaytmFlipkartAmazonMicrosoftSnapdeal24*7 Innovation LabsPayuVisaGoldman SachsQualcommDrishti-Soft
*/

package linked_list;
import java.util.*;

/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/


public class Test30 {
	class Solution {
	    // Function to flatten a linked list
	    Node merge2Lists(Node head1, Node head2) {
	        Node t1 = head1;
	        Node t2 = head2;
	        Node dNode = new Node(-1);
	        Node temp = dNode;
	        while(t1 != null && t2 != null) {
	            if(t1.data < t2.data) {
	                temp.bottom = t1;
	                temp = t1;
	                t1 = t1.bottom;
	            }
	            else {
	                temp.bottom = t2;
	                temp = t2;
	                t2 = t2.bottom;
	            }
	            temp.next = null;
	        }
	        if(t1 != null) temp.bottom = t1;
	        else temp.bottom = t2;
	        
	        return dNode.bottom;
	    }
	    
	    Node flatten(Node root) {
	        // code here
	        if(root == null || root.next == null) return root;
	        Node head = flatten(root.next);
	        return merge2Lists(root, head);
	    }
	}
}
