package Day14;

import org.junit.Test;

import java.util.ArrayList;

public class MaxSumOfSubArray {

    /*

    Find maximum subarray sum
Input: [ 1, -5, 2, -3, 7, 1]
Output: 8

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.


     */

    @Test
    public void test1(){
        int[] nums={1, -5, 2, -3, 7, 1};
        int output=8;
        int sum = findSum(nums);
        System.out.println(sum);
    }
    @Test
    public void test2(){
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int output=6;
    }

    /*

    Pseudo code:-
    1. Just iterate the whole length of an array and calculate the sum and consider it as max
    2. then shrink the window by one and calculate the sum
    3. if the sum is greater update the sum else continue
    4. continue the process until the window can be shrunked to its possible way
     */

    private int findSum(int [] nums){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}
