package SecondWeekHomeWork;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MoveAllPositivesToRight_TwoPointer {

    /*

   Write a program to move all the positive numbers to end. (Solve using 2 pointer!!)
Input: [4, -1, 9, 0, 2, -4, 5]
Output: [-1, 0, -4, 4, 9, 2, 5]

 --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints




   Constraints: use two pointer algorithm

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code

      1. Initialize two variables to zero and traverse the array from left to right
      2. check if the number is negative and then swap the left and right then increment both
      3. if the number is greater than zero then increment only the left index(the fast pointer)
      4. do this operation until the whole array is iterated
     */

    @Test
    public void example1(){
        int[] num1={4, 0, 9, -1, 2, -4, 5};
        int[] num2= {-1, 0, -4, 4, 2, 9, 5};
        int[] ints = moveALLpositives(num1);
        Assert.assertArrayEquals(ints,num2);

    }
    @Test
    public void example2(){
        int[] num1={4, -1, 9, 0, -2, -4, 5,-6};
        int[] num2= {-1, -2, -4, 0, -6, 9, 5, 4};
        int[] ints = moveALLpositives(num1);
        Assert.assertArrayEquals(ints,num2);

    }
    @Test
    public void example3(){
        int[] num1={4, -1, -4, 5};
        int[] num2= {-1, -4, 4,5};
        int[] ints = moveALLpositives(num1);
        Assert.assertArrayEquals(ints,num2);

    }
    private int[] moveALLpositives(int[] nums){
        int left=0;
        int right=0;
        int temp=0;
        while (left<nums.length){
            if(nums[left]<0){
                temp=nums[left];
                if(nums[right]==0){
                    nums[left]=nums[++right];
                }
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right++;

            }
            else {
                left++;
            }

        }
        System.out.println(Arrays.toString(nums));
        return nums;


    }
}
