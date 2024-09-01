/*
Find pairs with given sum in doubly linked list
Difficulty: EasyAccuracy: 66.01%Submissions: 47K+Points: 2
Given a sorted doubly linked list of positive distinct elements, the task is to find pairs in a doubly-linked list whose sum is equal to given value target.

 

Example 1:

Input:  
1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 8 <-> 9
target = 7
Output: (1, 6), (2,5)
Explanation: We can see that there are two pairs 
(1, 6) and (2,5) with sum 7.
 

Example 2:

Input: 
1 <-> 5 <-> 6
target = 6
Output: (1,5)
Explanation: We can see that there is one pairs  (1, 5) with sum 6.

 

Your Task:
You don't need to read input or print anything. Your task is to complete the function findPairsWithGivenSum() which takes head node of the doubly linked list and an integer target as input parameter and returns an array of pairs. If there is no such pair return empty array.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 <= N <= 105
1 <= target <= 105
*/

package linked_list;
import java.util.*;
public class Test24 {
	class Solution {
	    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
	        // code here
	        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	        Node temp1 = head;
	        Node temp2 = head;
	        while(temp2.next != null) {
	            temp2 = temp2.next;
	        }
	        while(temp1.data < temp2.data) {
	            if(temp1.data + temp2.data == target) {
	                ArrayList<Integer> pair = new ArrayList<Integer>();
	                pair.add(temp1.data);
	                pair.add(temp2.data);
	                arr.add(pair);
	                temp1 = temp1.next;
	                temp2 = temp2.prev;
	            }
	            else if(temp1.data + temp2.data < target) {
	                temp1 = temp1.next;
	            }
	            else {
	                temp2 = temp2.prev;
	            }
	        }
	        return arr;
	    }
	}
}
