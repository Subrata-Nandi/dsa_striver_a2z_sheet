/*
Rotate a Linked List
Difficulty: MediumAccuracy: 39.95%Submissions: 223K+Points: 4
Given the head of a singly linked list, the task is to rotate the linked list clockwise by k nodes, i.e., left-shift the linked list by k nodes, where k is a given positive integer smaller than or equal to length of the linked list.

Examples:

Input: linkedlist: 2->4->7->8->9 , k = 3
Output: 8->9->2->4->7
Explanation:
Rotate 1: 4 -> 7 -> 8 -> 9 -> 2
Rotate 2: 7 -> 8 -> 9 -> 2 -> 4
Rotate 3: 8 -> 9 -> 2 -> 4 -> 7

Input: linkedlist: 1->2->3->4->5->6->7->8 , k = 4
Output: 5->6->7->8->1->2->3->4

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= number of nodes <= 103
1 <= node -> data <= 104
1 <= k <= number of nodes 

Seen this question in a real interview before ?
Yes
No
Company Tags
AccoliteAmazonMicrosoftMakeMyTrip
*/

package gfg_potd;

public class Test24 {
	class Node{
	    int data;
	    Node next;
	    Node(int d){
	        data=d;
	        next=null;
	    }
	}

	class Solution {
	    // Function to rotate a linked list.
	    public Node rotate(Node head, int k) {
	        // add code here
	        Node tail = head;
	        Node temp = head;
	        int len = 1;
	        while(tail.next != null) {
	            tail = tail.next;
	            len++;
	        }
	        if(k == len) return head;
	        tail.next = head;
	        k = k % len;
	        while(k-1 != 0) {
	            temp = temp.next;
	            k--;
	        }
	        head = temp.next;
	        temp.next = null;
	        return head;
	    }
	}
}
