/*
Add two numbers represented by linked lists
MediumAccuracy: 34.52%Submissions: 245K+Points: 4
 Done with winning Geekbits? Now win GfG Bag, GfG T-shirt & much more just by writing your experiences. Start Writing, Start Winning.
banner
Given two decimal numbers, num1 and num2, represented by linked lists of size n and m respectively. The task is to return a linked list that represents the sum of these two numbers.

For example, the number 190 will be represented by the linked list, 1->9->0->null, similarly 25 by 2->5->null. Sum of these two numbers is 190 + 25 = 215, which will be represented by 2->1->5->null. You are required to return the head of the linked list 2->1->5->null.

Note: There can be leading zeros in the input lists, but there should not be any leading zeros in the output list.

Example 1:

Input:
n = 2
num1 = 45 (4->5->null)
m = 3
num2 = 345 (3->4->5->null)
Output: 
3->9->0->null  
Explanation: 
For the given two linked list (4 5) and (3 4 5), after adding the two linked list resultant linked list will be (3 9 0).
Example 2:

Input:
n = 4
num1 = 0063 (0->0->6->3->null)
m = 2
num2 = 07 (0->7->null)
Output: 
7->0->null
Explanation: 
For the given two linked list (0 0 6 3) and (0 7), after adding the two linked list resultant linked list will be (7 0).
Your Task:
The task is to complete the function addTwoLists() which has node reference of both the linked lists and returns the head of the sum list.   

Expected Time Complexity: O(n+m)
Expected Auxiliary Space: O(max(n,m)) for the resultant list.

Constraints:
1 <= n, m <= 104


Company Tags
Flipkart
Morgan Stanley
Accolite
Amazon
Microsoft
Snapdeal
MakeMyTrip
Qualcomm
*/

package gfg_potd;

public class Test12 {

	//Function to reverse a linked list
    static Node reverseList(Node head) {
        Node curr = head;
        Node prev = null;
        Node next = null;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
    
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node num1, Node num2){
        // code here
        // return head of sum list
        num1 = reverseList(num1);
        num2 = reverseList(num2);
        
        Node temp1 = num1;
        Node temp2 = num2;
        int carry = 0;
        Node dummyNode = new Node(-1);
        Node curr = dummyNode;
        while(temp1 != null || temp2 != null) {
            int sum = carry;
            if(temp1 != null) sum = sum + temp1.data;
            if(temp2 != null) sum = sum + temp2.data;
            
            Node newNode = new Node(sum % 10);
            carry = sum / 10;
            
            curr.next = newNode;
            curr = curr.next;
            
            if(temp1 != null) temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;
        } 
        
        if(carry != 0) {
            Node newNode = new Node(carry);
            curr.next = newNode;
        }
        
        dummyNode = reverseList(dummyNode.next);
        
        while(dummyNode.data == 0 && dummyNode.next != null) {
            dummyNode = dummyNode.next;
        }
        
        return dummyNode;
    }
	
}
