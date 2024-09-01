/*
Array to Linked List
Difficulty: EasyAccuracy: 66.76%Submissions: 37K+Points: 2
Given an array of integer arr. Your task is to construct the linked list from arr & return the head of the linked list.

Examples:

Input: arr = [1, 2, 3, 4, 5]
Output: LinkedList: 1->2->3->4->5
Explanation: Linked list for the given array will be

Input: arr = [2, 4, 6, 7, 5, 1, 0]
Output: LinkedList: 2->4->6->7->5->1->0
Explanation: Linked list for the given array will be

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= arr.size() <= 106
1 <= arr[i] <= 106

*/

package linked_list;

class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Test01 {
	
	class Solution {
	    static Node constructLL(int arr[]) {
	        // code here
	        Node head = new Node(arr[0]);
	        Node mover = head;
	        for(int i=1;i<arr.length;i++) {
	            Node temp = new Node(arr[i]);
	            mover.next = temp;
	            mover = mover.next;
	        }
	        return head;
	    }
	}
}
