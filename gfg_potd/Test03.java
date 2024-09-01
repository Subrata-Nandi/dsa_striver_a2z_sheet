/*
Given a Binary Tree, find the In-Order Traversal of it.

Example 1:

Input:
       1
     /  \
    3    2
Output: 3 1 2

Example 2:

Input:
        10
     /      \ 
    20       30 
  /    \    /
 40    60  50
Output: 40 20 60 10 50 30

Your Task:
You don't need to read input or print anything. Your task is to complete the function inOrder() that takes root node of the tree as input and returns a list containing the In-Order Traversal of the given Binary Tree.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= Number of nodes <= 105
0 <= Data of a node <= 105
*/

package gfg_potd;
import java.util.*;
//User function Template for Java

/* A Binary Tree node */

class Node {
 int data;
 Node left, right;
Node(int item)    {
     data = item;
     left = right = null;
 }
} 
public class Test03 {

 ArrayList<Integer> inOrder(Node root) {
     // Code
     ArrayList<Integer> arr = new ArrayList<>();
     inOrderTraversal(arr, root);
     return arr;
 }
 
 public static void inOrderTraversal(ArrayList<Integer> list, Node root) {
     if(root == null)
         return;
     inOrderTraversal(list, root.left);
     list.add(root.data);
     inOrderTraversal(list, root.right);
 }
}


