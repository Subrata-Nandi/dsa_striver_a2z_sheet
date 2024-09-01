/*
Add 1 to a Linked List Number
Difficulty: MediumAccuracy: 31.91%Submissions: 244K+Points: 4
You are given a linked list where each element in the list is a node and have an integer data. You need to add 1 to the number formed by concatinating all the list node numbers together and return the head of the modified linked list. 

Note: The head represents the first element of the given array.

Examples :

Input: LinkedList: 4->5->6
Output: 457

Explanation: 4->5->6 represents 456 and when 1 is added it becomes 457. 
Input: LinkedList: 1->2->3
Output: 124
 
Explanation:  1->2->3 represents 123 and when 1 is added it becomes 124. 
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= len(list) <= 105
0 <= list[i] <= 9

Seen this question in a real interview before ?
Yes
No
Company Tags
Amazon
*/

package linked_list;

public class Test20 {
	class Solution {
	    
	    Node reverse(Node head) {
	        Node prev = null;
	        Node curr = head;
	        Node temp = head;
	        while(temp != null) {
	            temp = temp.next;
	            curr.next = prev;
	            prev = curr;
	            curr = temp;
	        }
	        head = prev;
	        return head;
	    }
	    public Node addOne(Node head) {
	        // code here.
	        head = reverse(head);
	        Node temp = head;
	        int carry = 1;
	        while(temp != null) {
	            temp.data = temp.data + carry;
	            if(temp.data == 10) {
	                temp.data = 0;
	                carry = 1;
	            }
	            else {
	                carry = 0;
	                break;
	            }
	            temp = temp.next;
	        }
	        head = reverse(head);
	        if(carry == 1) {
	            Node newNode = new Node(1);
	            newNode.next = head;
	            head = newNode;
	        }
	        return head;
	    }
	}
	
	/*
	class Solution {
	    public int helper(Node temp) {
	        if(temp == null) return 1;
	        temp.data = temp.data + helper(temp.next);
	        if(temp.data < 10) return 0;
	        temp.data = 0;
	        return 1;
	    }
	    public Node addOne(Node head) {
	        // code here.
	        // Recursive approach, TC = O(n), SC = O(n)
	        
	        int carry = helper(head);
	        if(carry == 1) {
	            Node newNode = new Node(1);
	            newNode.next = head;
	            return newNode;
	        }
	        return head;
	    }
	}
	*/
}
