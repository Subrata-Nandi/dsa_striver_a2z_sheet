/*
Implement Queue using Linked List
Difficulty: BasicAccuracy: 45.6%Submissions: 108K+Points: 1
Implement a Queue using Linked List. 
A Query Q is of 2 Types
(i) 1 x   (a query of this type means  pushing 'x' into the queue)
(ii) 2     (a query of this type means to pop an element from the queue and print the poped element)

Example 1:

Input:
Q = 5
Queries = 1 2 1 3 2 1 4 2
Output: 2 3
Explanation: n the first testcase
1 2 the queue will be {2}
1 3 the queue will be {2 3}
2   poped element will be 2 the
    queue will be {3}
1 4 the queue will be {3 4}
2   poped element will be 3.

Example 2:

Input:
Q = 4
Queries = 1 2 2 2 1 3 
Output: 2 -1
Explanation: In the second testcase 
1 2 the queue will be {2}
2   poped element will be {2} then
    the queue will be empty. 
2   the queue is empty and hence -1
1 3 the queue will be {3}.
Your Task:
Complete the function push() which takes an integer as input parameter and pop() which will remove and return an element(-1 if queue is empty).

Expected Time Complexity: O(1).
Expected Auxiliary Space: O(1).

Constraints:
1 <= Q <= 100
1 <= x <= 100
*/

package stack_and_queue;

class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}

public class Test07 {
	class MyQueue
	{
	    QueueNode front, rear;
	    
	    //Function to push an element into the queue.
		void push(int a)
		{
	        // Your code here
	        QueueNode temp = new QueueNode(a);
	        if(front == null) {
	            front = temp;
	            rear = temp;
	        }
	        else {
	            rear.next = temp;
	            rear = temp;
	        }
		}
		
	    //Function to pop front element from the queue.
		int pop()
		{
	        // Your code here
	        if(front == null) return -1;
	        QueueNode temp = front;
	        int x = temp.data;
	        front = front.next;
	        temp = null;
	        return x;
		}
	}
}
