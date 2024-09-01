/*
Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

 

Example 1:

Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output: 1 10000
Explanation: minimum and maximum elements of array are 1 and 10000.
 

Example 2:

Input:
N = 5
A[]  = {1, 345, 234, 21, 56789}
Output: 1 56789
Explanation: minimum and maximum element of array are 1 and 56789.
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function getMinMax() which takes the array A[] and its size N as inputs and returns the minimum and maximum element of the array.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= N <= 10^5
1 <= Ai <=10^12
*/

package arrays;
import java.util.*;

class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

class Compute 
{
    static Pair getMinMax(long arr[], long n)  
    {
        //Write your code here
//    	for(int i=0;i<n-1;i++) {
//			for(int j=0;j<n-i-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp = (int) arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
    	
    	Arrays.sort(arr);
    	return new Pair(arr[0], arr[(int) (n-1)]);
    	
    }
}

public class MinMaxElement {

//	public static int[] sortArr(int arr[]) {
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=0;j<arr.length-i-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		return arr;
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int N = sc.nextInt();
		if(N>=1 & N<=Math.pow(10,5)) {
			long[] arr = new long[N];
			System.out.println("Enter array elements: ");
			for(int i=0;i<N;i++) {
				System.out.println("Element " + (i+1) + ": ");
				arr[i] = sc.nextInt();
			}
			Compute ob = new Compute();
			Pair p = ob.getMinMax(arr, N);
			System.out.println(p.first + " " + p.second);
		}
	}

}

// ----------------------------------------------------------------------------------------------------------------------------------

// GFG coding
//User function Template for Java

/*
class Pair  
{  
  long first, second;  
  public Pair(long first, long second)  
  {  
      this.first = first;  
      this.second = second;  
  }  
} 

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

/*
class Solution2 
{
  static Pair getMinMax(long a[], long n)  
  {
      //Write your code here
      Arrays.sort(a);
      long minimum = a[0];
      long maximum = a[(int) n-1];
      return new Pair(minimum, maximum);
  }
}
*/