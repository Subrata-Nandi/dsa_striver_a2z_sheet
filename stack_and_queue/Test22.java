/*
735. Asteroid Collision
Solved
Medium
Topics
Companies
Hint
We are given an array asteroids of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

 

Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
Example 2:

Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.
Example 3:

Input: asteroids = [10,2,-5]
Output: [10]
Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
 

Constraints:

2 <= asteroids.length <= 104
-1000 <= asteroids[i] <= 1000
asteroids[i] != 0
*/

package stack_and_queue;
import java.util.*;
public class Test22 {
	class Solution {
	    public int[] asteroidCollision(int[] arr) {
	        Stack<Integer> st = new Stack<>();
	        int n = arr.length;
	        for(int i=0;i<n;i++) {
	            if(arr[i] > 0) st.push(arr[i]);
	            else {
	                while(!st.empty() && st.peek() > 0 && st.peek() < Math.abs(arr[i]))
	                    st.pop();
	                
	                if(!st.empty() && st.peek() == Math.abs(arr[i]))
	                    st.pop();
	                else if(st.empty() || st.peek() < 0)
	                    st.push(arr[i]);
	                
	            }
	        }
	        ArrayList<Integer> a = new ArrayList<>();
	        while(!st.empty()) 
	            a.add(st.pop());
	        Collections.reverse(a);
	        int ans[] = new int[a.size()];
	        for(int i=0;i<ans.length;i++) {
	            ans[i] = a.get(i);
	        }
	        return ans;
	    }
	}
}
