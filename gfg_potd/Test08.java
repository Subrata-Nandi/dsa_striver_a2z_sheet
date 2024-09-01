/*
Merge Sort on Doubly Linked List
MediumAccuracy: 68.49%Submissions: 35K+Points: 4
 Done with winning Geekbits? Now win GfG Bag, GfG T-shirt & much more just by writing your experiences. Start Writing, Start Winning.
banner
Given Pointer/Reference to the head of a doubly linked list of n nodes, the task is to Sort the given doubly linked list using Merge Sort in both non-decreasing and non-increasing order.

Example 1:

Input:
n = 8
value[] = {7,3,5,2,6,4,1,8}
Output:
1 2 3 4 5 6 7 8
8 7 6 5 4 3 2 1
Explanation: After sorting the given
linked list in both ways, resultant
matrix will be as given in the first
two line of output, where first line
is the output for non-decreasing
order and next line is for non-
increasing order.
Example 2:

Input:
n = 5
value[] = {9,15,0,-1,0}
Output:
-1 0 0 9 15
15 9 0 0 -1
Explanation: After sorting the given
linked list in both ways, the
resultant list will be -1 0 0 9 15
in non-decreasing order and 
15 9 0 0 -1 in non-increasing order.
Your Task:
The task is to complete the function sortDoubly() which takes reference to the head of the doubly linked and Sort the given doubly linked list using Merge Sort in both non-decreasing and non-increasing. The printing is done automatically by the driver code.

Expected Time Complexity: O(nlogn)
Expected Space Complexity: O(logn)

Constraints:
1 <= n <= 104
-105 <= values[i] <= 105
*/

package gfg_potd;

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

public class Test08 {

	// Function to find the middle of the node
    static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head.next;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    // Function to merge the two list
    static Node mergeList(Node head1, Node head2) {
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        
        while(head1 != null && head2 != null) {
            if(head1.data < head2.data) {
                head1.prev = temp;
                temp.next = head1;
                temp = head1;
                head1 = head1.next;
            }
            else {
                head2.prev = temp;
                temp.next = head2;
                temp = head2;
                head2 = head2.next;
            }
        }
        
        if(head1 != null) {
            temp.next = head1;
            head1.prev = temp;
        }
        else {
            temp.next = head2;
            head2.prev = temp;
        }
        
        dummyNode = dummyNode.next;
        dummyNode.prev = null;
        return dummyNode;
    }
    
    // Function to sort the given doubly linked list using Merge Sort.
    static Node sortDoubly(Node head) {
        // add your code here
        if(head == null || head.next == null) 
            return head;
        
        Node middle = findMiddle(head);
        Node leftNode = head;
        Node rightNode = middle.next;
        middle.next = null;
        
        leftNode = sortDoubly(leftNode);
        rightNode = sortDoubly(rightNode);
        
        return mergeList(leftNode, rightNode);
    }
	
}
