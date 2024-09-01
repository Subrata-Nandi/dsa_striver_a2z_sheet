/*
Delete all occurrences of a given key in a doubly linked list
Difficulty: MediumAccuracy: 50.04%Submissions: 24K+Points: 4
You are given the head_ref of a doubly Linked List and a Key. Your task is to delete all occurrences of the given key if it is present and return the new DLL.

Example1:

Input: 
2<->2<->10<->8<->4<->2<->5<->2
2
Output: 
10<->8<->4<->5
Explanation: 
All Occurences of 2 have been deleted.

Example2:

Input: 
9<->1<->3<->4<->5<->1<->8<->4
9
Output: 
1<->3<->4<->5<->1<->8<->4
Explanation: 
All Occurences of 9 have been deleted.
Your Task:

Complete the function void deleteAllOccurOfX(struct Node** head_ref, int key), which takes the reference of the head pointer and an integer value key. Delete all occurrences of the key from the given DLL.

Expected Time Complexity: O(N).

Expected Auxiliary Space: O(1).

Constraints:

1<=Number of Nodes<=105

0<=Node Value <=109
*/

package linked_list;

public class Test23 {
	class Solution {
	    static Node deleteAllOccurOfX(Node head, int x) {
	        // Write your code here
	        Node temp = head;
	        while(temp != null) {
	            if(temp.data == x) {
	                if(temp == head) {
	                    head = head.next;
	                }
	                Node nextNode = temp.next;
	                Node prevNode = temp.prev;
	                if(prevNode != null) prevNode.next = nextNode;
	                if(nextNode != null) nextNode.prev = prevNode;
	                temp = temp.next;
	            }
	            else {
	                temp = temp.next;
	            }
	        }
	        return head;
	    }
	}
}
