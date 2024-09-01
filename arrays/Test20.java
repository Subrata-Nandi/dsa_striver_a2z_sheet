/*
229. Majority Element II
Solved
Medium
Topics
Companies
Hint
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
 

Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
 

Follow up: Could you solve the problem in linear time and in O(1) space?
*/

package arrays;
import java.util.*;
public class Test20 {
	class Solution {
	    public List<Integer> majorityElement(int[] nums) {
	    	/*
			public static List<Integer> majorityElement(int []v) {
		        int n = v.length; //size of the array
		        List<Integer> ls = new ArrayList<>(); // list of answers
		
		        //declaring a map:
		        HashMap<Integer, Integer> mpp = new HashMap<>();
		
		        // least occurrence of the majority element:
		        int mini = (int)(n / 3) + 1;
		
		        //storing the elements with its occurnce:
		        for (int i = 0; i < n; i++) {
		            int value = mpp.getOrDefault(v[i], 0);
		            mpp.put(v[i], value + 1);
		
		            //checking if v[i] is
		            // the majority element:
		            if (mpp.get(v[i]) == mini) {
		                ls.add(v[i]);
		            }
		            if (ls.size() == 2) break;
		        }
		
		        return ls;
		    }
		    */
	    	
	    	
	        /*
	        int n = nums.length;
	        List<Integer> arr = new ArrayList<>();
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for(int i=0;i<n;i++) {
	            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
	        }

	        for(Map.Entry<Integer, Integer> it: map.entrySet()) {
	            if(it.getValue() > (n/3)) {
	                arr.add(it.getKey());
	            }
	        }
	        return arr;
	        */

	        // Modification of Moore's voting algo
	        int cnt1 = 0, cnt2 = 0;
	        int ele1 = Integer.MIN_VALUE;
	        int ele2 = Integer.MIN_VALUE;
	        int n = nums.length;
	        for(int i=0;i<n;i++) {
	            if(cnt1 == 0 && nums[i] != ele2) {
	                cnt1 = 1;
	                ele1 = nums[i];
	            }
	            else if(cnt2 == 0 && nums[i] != ele1) {
	                cnt2 = 1;
	                ele2 = nums[i];
	            }
	            else if(nums[i] == ele1) cnt1++;
	            else if(nums[i] == ele2) cnt2++;
	            else {
	                cnt1--;
	                cnt2--;
	            }
	        }

	        cnt1 = 0;
	        cnt2 = 0;
	        List<Integer> arr = new ArrayList<>();
	        for(int i=0;i<n;i++) {
	            if(nums[i] == ele1) cnt1++;
	            if(nums[i] == ele2) cnt2++;
	        }
	        int mini = (int) (n/3) + 1;
	        if(cnt1 >= mini) arr.add(ele1);
	        if(cnt2 >= mini) arr.add(ele2);
	        return arr;
	    }
	}
}
