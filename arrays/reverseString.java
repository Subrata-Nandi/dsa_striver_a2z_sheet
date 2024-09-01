/*
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
package arrays;
import java.util.*;

public class reverseString {
	
	public static String reverse(String s) {
		char[] arr = s.toCharArray();
		int start = 0;
		int end = s.length()-1;
		while(start<end) {
			char swap = arr[start];
			arr[start] = arr[end];
			arr[end] = swap;
			start++;
			end--;
		}
		System.out.println("Reverse array is: ");
		String str = new String(arr);
		return str;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		reverseString ob = new reverseString();
		if(s.length()>=1 & s.length()<=10000)
			System.out.println(ob.reverse(s));
		else
			System.out.println("Word is either too long or short.");
	}

}

/*
Output

Enter the string: 
for
Reverse array is: 
rof

In GFG

class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        char arr[] = str.toCharArray();
        if(str.length()<=1 & str.length()>=10000) {
            return "String is either null or too long.";
        }
        int start = 0;
        int end = str.length() - 1;
        for(int i=0;i<=end;i++) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        String s = new String(arr);
        return s;
    }
}
*/