package Day1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PushAllZeroesToRight_problem_4 {

    /*

Question;-
  1) Given an array of random numbers, Push all the zero’s of a given array to the end of the array. The order of all other elements should be same.

Example:
Input :  arr = [1, 2, 0, 4, 3, 0, 5, 0]
Output : arr = [1, 2, 4, 3, 5, 0, 0]

Input : arr = [1, 2, 0, 0, 0, 3, 6]
Output : arr = [1, 2, 3, 6, 0, 0, 0]

   --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints

   Input: flowerbed = [1,0,0,0,1], n = 1
   Output: true


   Input: flowerbed = [1,0,0,0,1], n = 2
   Output: false
   Constraints: all the other array elements should be as is.

    c) prepare test data (Minimum of 3 set)
       +ve,Input: flowerbed = [1,0,0,0,1], n = 1
       edge  [1,0,0,0,1,0,1,0,0,1,1,1] n=2
       -ve a[] = {1,0,0,0,1} n=2

      d ) Write the Pseudo code

       1. Iterate through the array from left to right (one at a time)
       2. declare a variable called count and initialize that to 0.
       3. If at all a non zero element found, replace it with the value at index of count
       4. Repeat the process through out the array so that all non zeroes would move towards the front
       5.Now the count value would be the index of first zero then set all the other values from that position to till the end to zeroes

  --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Constraints: each input might have only one output, an element should not be entered twice

    c) prepare test data (Minimum of 3 set)
       edge,a[] = [-4,-1,0,3,3,3,10] target= 13
       +ve  [2,7,11,15], target = 9
       -ve a[] = {} target= 8

      d ) Write the Pseudo code


     */

    @Test //+ve
    public void testData1(){
        int [] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int[] newArray = pushALLzeroesToEnd(arr);
        String ints = pushAllZeroesToEndAlternate(arr);
        System.out.println(ints);
        Assert.assertEquals(true,Arrays.equals(newArray,new int[]{1,2,4,3,5,0,0,0}));
    }
    @Test //edge
    public void testData2(){
        int [] arr = {-1,1,-3,5,2, 0, 0, 0, 3, 6};
        int[] newArray = pushALLzeroesToEnd(arr);
        Assert.assertEquals(true,Arrays.equals(newArray,new int[]{-1,1,-3,5,2,3,6,0,0,0}));
    }
    @Test //+-ve
    public void testData3(){
        int [] arr = {0,0};
        int[] newArray = pushALLzeroesToEnd(arr);
        Assert.assertEquals(true,Arrays.equals(newArray,new int[]{0,0}));
    }

    private int[] pushALLzeroesToEnd(int [] nums){
        int count=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }
        for (int j=count;j<nums.length;j++){
            nums[j]=0;
        }
       /* while (count<nums.length){
            nums[count]=0;
        }*/
        return nums;
    }

    private String pushAllZeroesToEndAlternate(int []nums){
        int[] nums1=new int[nums.length];
        int index=0;
        for (int i=0;i<nums.length;i++){
            nums1[index++]=nums[i];
        }
        System.out.println(nums1.toString());
        return Arrays.toString(nums1);
    }
}
