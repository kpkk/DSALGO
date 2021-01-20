package Day6;

import org.junit.Assert;
import org.junit.Test;

public class FindLongestSubArrayOfOnes {

    /*

    Given an array A of 0s and 1s, we may change up to K values from 0 to 1.
Return the length of the longest (contiguous) subarray that contains only 1s.
Example 1:
Input: A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
Output: 6
Explanation:
[1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
Example 2:
Input: A = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
Output: 10
Explanation:
[0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.

     */

    @Test
    public void example1(){
        int[] nums={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int output=10;
        int length = findLongestsubStringLengthOfOnes(nums, k);
        Assert.assertEquals(length,output);
    }

    private int findLongestsubStringLengthOfOnes(int nums[], int k){

        int left=0, right=0;

        for (right=0;right<nums.length;right++){
            if(nums[right]==0){
                k--;
            }
            if(k<0){
                if(nums[left]==0){
                    k++;
                    left++;
                }
            }
        }
        return right-left;
    }
}
