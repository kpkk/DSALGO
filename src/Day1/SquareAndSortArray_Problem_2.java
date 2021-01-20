package Day1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SquareAndSortArray_Problem_2 {

    /*
2) Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

Constraints: nums is sorted in non-decreasing order.


     --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints
    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    Constraints: nums is sorted in non-decreasing order.

    c) prepare test data (Minimum of 3 set)
       edge,a[] = [-4,-1,0,3,10]
       +ve  a[] = {1, 2, 3}	x = 4
       -ve a[] = {}

      d ) Write the Pseudo code

       1. Iterate through the array
       2. Get the each number and sqaure it
       3. assign the value back to the same array (replace)
       4. Sort the array again then return

     */

    @Test //+ve
    public void testData1(){
        int a[] = {1, 2, 3};
        int[] sqArray = squareAndSort(a);
        Assert.assertEquals(true, Arrays.equals(sqArray,new int[]{1,4,9}));
    }
    @Test //edge
    public void testData2(){
        int a[] = {-4,-1,0,3,10};
        int[] sqArray = squareAndSort(a);
        Assert.assertEquals(true, Arrays.equals(sqArray,new int[]{0,1,9,16,100}));
    }
    @Test //-ve
    public void testData3(){
        int a[] = {};
        int[] sqArray = squareAndSort(a);
        Assert.assertEquals(true, Arrays.equals(sqArray,new int[]{}));
    }

    private int[] squareAndSort(int [] nums){

        for (int i=0;i<nums.length;i++)
            nums[i]= nums[i]* nums[i];

        Arrays.sort(nums);
        return nums;
    }
}
