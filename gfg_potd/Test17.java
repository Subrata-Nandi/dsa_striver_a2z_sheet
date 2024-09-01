/*
Juggler Sequence
EasyAccuracy: 52.04%Submissions: 14K+Points: 2
In need of more Geekbits? Win from a pool of 3500+ Geekbits via GfG Weekly this sunday!

banner
Juggler Sequence is a series of integers in which the first term starts with a positive integer number a and the remaining terms are generated from the immediate previous term using the below recurrence relation:

Juggler Formula

Given a number n, find the Juggler Sequence for this number as the first term of the sequence until it becomes 1.


Example 1:

Input: n = 9
Output: 9 27 140 11 36 6 2 1
Explaination: We start with 9 and use 
above formula to get next terms.
 

Example 2:

Input: n = 6
Output: 6 2 1
Explaination: 
[61/2] = 2. 
[21/2] = 1.
 

Your Task:
You do not need to read input or print anything. Your Task is to complete the function jugglerSequence() which takes n as the input parameter and returns a list of integers denoting the generated sequence.

 

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

 

Constraints:
1 ≤ n ≤ 100
*/

package gfg_potd;
import java.util.*;
public class Test17 {
	static List<Integer> jugglerSequence(int n) {
        // code here
        List<Integer> a = new ArrayList<Integer>();
        a.add(n);
        while(n != 1) {
            if(n % 2 == 0) {
                n = (int) Math.pow(n, 0.5);
                a.add(n);
            }
            else {
                n = (int) Math.pow(n, 1.5);
                a.add(n);
            }
        }
        return a;
    }
}
