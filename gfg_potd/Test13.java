/*
Serialize and deserialize a binary tree
MediumAccuracy: 51.67%Submissions: 66K+Points: 4
 Done with winning Geekbits? Now win GfG Bag, GfG T-shirt & much more just by writing your experiences. Start Writing, Start Winning.
banner
Serialization is to store a tree in an array so that it can be later restored and deserialization is reading tree back from the array. Complete the functions

serialize() : stores the tree into an array a and returns the array.
deSerialize() : deserializes the array to the tree and returns the root of the tree.
Note: Multiple nodes can have the same data and the node values are always positive integers. Your code will be correct if the tree returned by deSerialize(serialize(input_tree)) is same as the input tree. Driver code will print the in-order traversal of the tree returned by deSerialize(serialize(input_tree)).

Example 1:

Input:
      1
    /   \
   2     3
Output: 
2 1 3
Example 2:

Input:
         10
       /    \
      20    30
    /   \
   40  60
Output: 
40 20 60 10 30
Your Task:
The task is to complete two functions serialize which takes the root node of the tree as input and stores the tree into an array and deSerialize which deserializes the array to the original tree and returns the root of it.

Expected Time Complexity: O(Number of nodes).
Expected Auxiliary Space: O(Number of nodes).

Constraints:
1 <= Number of nodes <= 104
1 <= Data of a node <= 109
*/

package gfg_potd;
import java.util.*;
public class Test13 {
	ArrayList<Integer> a = new ArrayList<>();
    public ArrayList<Integer> serialize(Node root) {
        // code here
        if(root == null) {
            a.add(-1);
            return a;
        }
        
        a.add(root.data);
        a = serialize(root.left);
        a = serialize(root.right);
        
        return a;
    }
    // Function to deserialize a list and construct the tree.
    int idx = -1;
    public Node deSerialize(ArrayList<Integer> A) {
        // code here
        idx++;
        if(A.get(idx) == -1) return null;
        
        Node root = new Node(A.get(idx));
        root.left = deSerialize(A);
        root.right = deSerialize(A);
        
        return root;
        
    }
}
