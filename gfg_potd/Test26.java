/*
Left View of Binary Tree
Difficulty: EasyAccuracy: 33.74%Submissions: 503K+Points: 2
Given a Binary Tree, return Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function leftView(), which accepts root of the tree as argument. If no left view is possible, return an empty tree.

Left view of following tree is 1 2 4 8.

          1
       /     \
     2        3
   /     \    /    \
  4     5   6    7
   \
     8   

Examples :

Input:
   1
 /  \
3    2
Output: 1 3

Input:

Output: 10 20 40
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
0 <= Number of nodes <= 105
0 <= Data of a node <= 105

Seen this question in a real interview before ?
Yes
No
Company Tags
PaytmFlipkartAccoliteAmazonOYO RoomsSamsungSnapdealMakeMyTripOla CabsAdobeQualcommTwitterKnowlarityOpen Solutions
*/

package gfg_potd;
import java.util.*;
public class Test26 {
	//User function Template for Java

	/* A Binary Tree node
	class Node
	{
	    int data;
	    Node left, right;

	    Node(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	}*/
	class Tree
	{
	    //Function to return list containing elements of left view of binary tree.
	    ArrayList<Integer> arr = new ArrayList<>();
	    
	    void func(Node root, int level) {
	        if(root == null) return;
	        
	        if(level == arr.size()) 
	            arr.add(root.data);
	            
	        func(root.left, level + 1);
	        func(root.right, level + 1);
	    }
	    
	    ArrayList<Integer> leftView(Node root)
	    {
	      // Your code here
	      int level = 0;
	      func(root, level);
	      return arr;
	    }
	}
}
