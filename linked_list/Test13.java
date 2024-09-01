/*
Sort a linked list of 0s, 1s and 2s
Difficulty: EasyAccuracy: 60.75%Submissions: 190K+Points: 2
Given a linked list where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to the head side, 2s at the end of the linked list, and 1s in the middle of 0s and 2s.

Examples:

Input: LinkedList: 1->2->2->1->2->0->2->2
Output: 0->1->1->2->2->2->2->2
Explanation: All the 0s are segregated to the left end of the linked list, 2s to the right end of the list, and 1s in between.
 
Input: LinkedList: 2->2->0->1
Output: 0->1->2->2
Explanation: After arranging all the 0s,1s and 2s in the given format, the output will be 0 1 2 2.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

Constraints:
1 <= no. of nodes <= 106
0 <= node->data <= 2

Seen this question in a real interview before ?
Yes
No
Company Tags
AmazonMicrosoftMakeMyTrip
*/

package linked_list;

public class Test13 {
	/*
	class Node
	{
	    int data;
	    Node next;
	    Node(int data)
	    {
	        this.data = data;
	        next = null;
	    }
	}
	*/
	class Solution {
	    // Function to sort a linked list of 0s, 1s and 2s.
	    static Node segregate(Node head) {
	        // add your code here
	        /*
	        // TC = O(2n)
	        Node temp = head;
	        int cnt0 = 0;
	        int cnt1 = 0;
	        int cnt2 = 0;
	        while(temp != null) {
	            if(temp.data == 0) cnt0++;
	            else if(temp.data == 1) cnt1++;
	            else cnt2++;
	            temp = temp.next;
	        }
	        temp = head;
	        while(temp != null) {
	            if(cnt0 != 0) {
	                temp.data = 0;
	                cnt0--;
	            }
	            else if(cnt1 != 0) {
	                temp.data = 1;
	                cnt1--;
	            }
	            else {
	                temp.data = 2;
	                cnt2--;
	            }
	            temp = temp.next;
	        }
	        return head;
	        */
	        
	        // TC = O(n) 
	        Node temp = head;
	        Node headZero = new Node(-1);
	        Node zero = headZero;
	        Node headOne = new Node(-1);
	        Node one = headOne;
	        Node headTwo = new Node(-1);
	        Node two = headTwo;
	        
	        while(temp != null) {
	            if(temp.data == 0) {
	                zero.next = temp;
	                zero = temp;
	            }
	            else if(temp.data == 1) {
	                one.next = temp;
	                one = temp;
	            }
	            else {
	                two.next = temp;
	                two = temp;
	            }
	            temp = temp.next;
	        }
	        zero.next = (headOne.next != null) ? headOne.next : headTwo.next;
	        one.next = headTwo.next;
	        two.next = null;
	        return headZero.next;
	    }
	}
}
