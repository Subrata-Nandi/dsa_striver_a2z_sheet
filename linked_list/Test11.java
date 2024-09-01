/*
Reverse a linked list
Difficulty: EasyAccuracy: 73.11%Submissions: 302K+Points: 2
Given the head of a linked list, the task is to reverse this list and return the reversed head.

Examples:

Input: Linked list: 1->2->3->4->5->6
Output: 6->5->4->3->2->1
Explanation:

Input: Linked list: 2->7->10->9->8 
Output: 8->9->10->7->2
Explanation:

Input: Linked List: 10
Output: 10
Explanation: For a single node list, the reverse would be same as original
Expected Time Complexity: O(n)
Expected Space Complexity: O(1)

Constraints:
1 <= number of nodes, data of nodes <= 105

 

Seen this question in a real interview before ?
Yes
No
Company Tags
PaytmVMWareZohoAccoliteAmazonMicrosoftSamsungSnapdealD-E-ShawMakeMyTripTeradataWalmartGoldman SachsIntuitAdobe
SAP LabsTejas NetworkCiscoQualcommCognizantMahindra ComvivaIgniteWorld
*/

package linked_list;

public class Test11 {
	// function Template for Java

	/* linked list node class:

	class Node {
	    int data;
	    Node next;
	    Node(int value) {
	        this.value = value;
	    }
	}

	*/

	class Solution {
	    // Function to reverse a linked list.
	    Node reverseList(Node head) {
	        // code here
	        /*
	        // Using stack
	        Node temp = head;
	        Stack<Integer> st = new Stack<>();
	        while(temp != null) {
	            st.push(temp.data);
	            temp = temp.next;
	        }
	        temp = head;
	        while(temp != null) {
	            temp.data = st.pop();
	            temp = temp.next;
	        }
	        return head;
	        */
	        
	        Node temp = head;
	        Node curr = head;
	        Node prev = null;
	        while(temp != null) {
	            temp = temp.next;
	            curr.next = prev;
	            prev = curr;
	            curr = temp;
	        }
	        head = prev;
	        return head;
	    }
	}
}

/*
// Recursive Approach
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}
*/
