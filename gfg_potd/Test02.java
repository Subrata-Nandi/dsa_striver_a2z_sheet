/*
Minimum element in BST
BasicAccuracy: 70.95%Submissions: 150K+Points: 1
Given the root of a Binary Search Tree. The task is to find the minimum valued element in this given BST.

Example 1:

Input:
           5
         /    \
        4      6
       /        \
      3          7
     /
    1
Output: 1
Example 2:

Input:
             9
              \
               10
                \
                 11
Output: 9
Your Task:
The task is to complete the function minValue() which takes root as the argument and returns the minimum element of BST. If the tree is empty, there is no minimum element, so return -1 in that case.

Expected Time Complexity: O(Height of the BST)
Expected Auxiliary Space: O(1).

Constraints:
0 <= n <= 104


*/

package gfg_potd;

/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Test02 {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        // code here
        int minVal;
        while(root.left != null)
            root = root.left;
        minVal = root.data;
        return minVal;
    }
}

