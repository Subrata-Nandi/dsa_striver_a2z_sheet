/*
Reverse a String
BasicAccuracy: 69.49%Submissions: 345K+Points: 1
Be the comment of the day in POTD and win a GfG T-Shirt!
Solve right now

banner
You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG
Example 2:

Input:
s = for
Output: rof
Your Task:

You only need to complete the function reverseWord() that takes s as parameter and returns the reversed string.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).

Constraints:
1 <= |s| <= 10000

*/

package string;

public class Test01 {

	public static String reverseWord(String str)
    {
        // Reverse the string str
        String s = "";
        char ch;
        for(int i=0;i<str.length();i++) {
            ch = str.charAt(i);
            s = ch + s;
        }
        return s;
    }
}

// String r pore character add hoche na but string r age character add kora jai