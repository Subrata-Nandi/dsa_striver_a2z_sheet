/*
Find length of Loop
Difficulty: EasyAccuracy: 44.26%Submissions: 168K+Points: 2
Given the head of a linked list, determine whether the list contains a loop. If a loop is present, return the number of nodes in the loop, otherwise return 0.



Note: 'c' is the position of the node which is the next pointer of the last node of the linkedlist. If c is 0, then there is no loop.

Examples:

Input: LinkedList: 25->14->19->33->10->21->39->90->58->45, c = 4
Output: 7
Explanation: The loop is from 33 to 45. So length of loop is 33->10->21->39-> 90->58->45 = 7. 
The number 33 is connected to the last node of the linkedlist to form the loop because according to the input the 4th node from the beginning(1 based indexing) 
will be connected to the last node for the loop.
 
Input: LinkedList: 5->4, c = 0
Output: 0
Explanation: There is no loop.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= no. of nodes <= 106
0 <= node.data <=106
0 <= c<= n-1

Seen this question in a real interview before ?
Yes
No
Company Tags
AmazonAdobeQualcomm
*/

package linked_list;

public class Test18 {
	class Solution {
	    // Function to find the length of a loop in the linked list.
	    public int findLength(Node slow, Node fast) {
	        int cnt = 1;
	        fast = fast.next;
	        while(slow != fast) {
	            cnt++;
	            fast = fast.next;
	        }
	        return cnt;
	    }
	    
	    public int countNodesinLoop(Node head) {
	        // Add your code here.
	        Node slow = head;
	        Node fast = head;
	        while(fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	            
	            if(slow == fast) 
	                return findLength(slow, fast);
	        }
	        return 0;
	    }
	}
}
