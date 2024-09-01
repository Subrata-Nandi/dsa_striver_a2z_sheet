/*
Implement Queue using array
Difficulty: BasicAccuracy: 47.24%Submissions: 158K+Points: 1
Implement a Queue using an Array. Queries in the Queue are of the following type:
(i) 1 x   (a query of this type means  pushing 'x' into the queue)
(ii) 2     (a query of this type means to pop element from queue and print the poped element)

Examples:

Input:
Q = 5
Queries = 1 2 1 3 2 1 4 2
Output: 2 3
Explanation:
In the first test case for query 
1 2 the queue will be {2}
1 3 the queue will be {2 3}
2   poped element will be 2 the 
    queue will be {3}
1 4 the queue will be {3 4}
2   poped element will be 3 
Input:
Q = 4
Queries = 1 3 2 2 1 4   
Output: 3 -1
Explanation:
In the second testcase for query 
1 3 the queue will be {3}
2   poped element will be 3 the
    queue will be empty
2   there is no element in the
    queue and hence -1
1 4 the queue will be {4}. 
 

Expected Time Complexity: O(1) for both push() and pop().
Expected Auxiliary Space: O(1) for both push() and pop().

Constraints:
1 ≤ Q ≤ 105
0 ≤ x ≤ 105

Seen this question in a real interview before ?
Yes
No
Company Tags
AmazonGoldman Sachs
Topic Tags
ArraysQueueData Structures
*/

package stack_and_queue;

public class Test02 {
	class MyQueue {

	    int front, rear;
		int arr[] = new int[100005];

	    MyQueue()
		{
			front=0;
			rear=0;
		}
		
		//Function to push an element x in a queue.
		void push(int x)
		{
		    // Your code here
		    arr[rear++] = x;
		} 

	    //Function to pop an element from queue and return that element.
		int pop()
		{
			// Your code here
			if(front == rear) return -1;
			return arr[front++];
		} 
	}

}
