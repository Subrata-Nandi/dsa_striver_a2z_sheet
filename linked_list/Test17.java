/*
Detect Loop in linked list
Difficulty: MediumAccuracy: 43.49%Submissions: 427K+Points: 4
Given the head of a singly linked list, the task is to check if the linked list has a loop. A loop means that the last node of the linked list is connected back to a node in the same list.  So if the next of the last node is null. then there is no loop.

Note: You need to return a boolean value true if there is a loop, otherwise false.

The following is an internal representation of every test case (three inputs).
A LinkedList and a pos (1-based index)-Position of the node to which the last node links back if there is a loop. If the linked list does not have any loop, then pos = 0.

Examples:

Input: LinkedList: 1->3->4, pos = 2
Output: true
Explanation: 

See the above list there exists a loop connecting the last node back to the second node.
Input: LinkedList: 1->8->3->4, pos = 0
Output: false
Explanation: 

There is no loop exists.
Input: LinkedList: 1->2->3->4, pos = 1
Output: true
Explanation:

A loop is present connecting the last node back to the first node.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ number of nodes ≤ 104
1 ≤ node->data ≤ 103

Seen this question in a real interview before ?
Yes
No
Company Tags
PaytmVMWareAccoliteAmazonOYO RoomsSamsungSnapdealD-E-ShawHikeMakeMyTripWalmartMAQ SoftwareAdobeSAP LabsQualcommVeritasMahindra ComvivaLybrate
Topic Tags
Linked Listtwo-pointer-algorithmData StructuresAlgorithms
*/

package linked_list;

public class Test17 {
	class Solution {
	    // Function to check if the linked list has a loop.
	    public static boolean detectLoop(Node head) {
	        // Add code here
	        Node slow = head;
	        Node fast = head;
	        while(fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	            
	            if(slow == fast)
	                return true;
	        }
	        return false;
	    }
	}
}
