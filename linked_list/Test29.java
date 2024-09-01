/*
Merge K sorted linked lists
Difficulty: MediumAccuracy: 57.01%Submissions: 82K+Points: 4
Given an array of sorted linked lists of different sizes. The task is to merge them in such a way that after merging they will be a single sorted linked list.

Examples:

Input: arr = [1->2->3, 4->5, 5->6, 7->8]
Output: 1->2->3->4->5->5->6->7->8
Explanation:
The test case has 4 sorted linked 
list of size 3, 2, 2, 2
1st    list     1 -> 2-> 3
2nd   list      4->5
3rd    list      5->6
4th    list      7->8
The merged list will be

Input: arr = [1->3, 4->5->6, 8]
Output: 1->3->4->5->6->8
Explanation:
The test case has 3 sorted linked
list of size 2, 3, 1.
1st list 1 -> 3
2nd list 4 -> 5 -> 6
3rd list 8
The merged list will be

Expected Time Complexity: O(n*log(n))
Expected Auxiliary Space: O(n)
Note: n is the maximum size of all the  LinkedList

Constraints
1 <= total no. of nodes <= 105
1 <= node->data <= 103

Seen this question in a real interview before ?
Yes
No
Company Tags
VMWareAmazonMicrosoft
*/

package linked_list;
import java.util.*;
public class Test29 {
	class Solution {
	    // Function to merge K sorted linked list.
	    Node sortedMerge(Node head1, Node head2) {
	        // This is a "method-only" submission.
	        // You only need to complete this method
	        Node dNode = new Node(-1);
	        Node temp = dNode;
	        while(head1 != null && head2 != null) {
	            if(head1.data < head2.data) {
	                temp.next = head1;
	                temp = temp.next;
	                head1 = head1.next;
	            }
	            else {
	                temp.next = head2;
	                temp = temp.next;
	                head2 = head2.next;
	            }
	        }
	        if(head1 != null) temp.next = head1;
	        else temp.next = head2;
	        return dNode.next;
	    }
	    
	    Node mergeKLists(List<Node> arr) {
	        // Add your code here.
	        Node head = arr.get(0);
	        for(int i=1;i<arr.size();i++) {
	            head = sortedMerge(head, arr.get(i));
	        }
	        return head;
	    }
	}
}
