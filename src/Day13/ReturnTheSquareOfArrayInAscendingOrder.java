package Day13;

import org.junit.Test;

import java.util.Arrays;
import java.util.Map;

public class ReturnTheSquareOfArrayInAscendingOrder {

    /*
    Given an array of integers sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
Input: [-8,-3,4,3,10]
Output: [9,9,16,64,100]


Pseudo code:-
 1. initialize two variables left=0 and right=left+1
 2. compare both the values, if the left is greater then swap else move on
 3. return the array
     */
    @Test
    public void test1(){
        int[] num={-8,-3,4,3,10};
        int[] output={9,9,16,64,100};
        int[] ints = returnSquareOfArray(num);
        System.out.println(Arrays.toString(ints));
        Arrays.equals(output,ints);

    }
    @Test
    public void test2(){
        int[] num={-8,-3};
        int[] output={9,64};
        int[] ints = returnSquareOfArray(num);
        System.out.println(Arrays.toString(ints));
        int[] ints1 = returnSquareOfArrayAnotherApproach(num);
        System.out.println(Arrays.toString(ints1));
    }

    private int[] returnSquareOfArray(int[] nums){
        int left=0;
        int right=left+1;
        for (int i=0;i<nums.length;i++){
            nums[i]*=nums[i];
        }
        for (left=0;left<nums.length;left++){
            for (right=left+1;right<nums.length;right++){
                if(nums[left]>nums[right]){
                    int temp=nums[left];
                     nums[left]=nums[right];
                     nums[right]=temp;

                }
            }
        }
        return nums;
    }

    private int[] returnSquareOfArrayAnotherApproach(int nums[]){
        int left=0;
        int right=nums.length-1;
        while (left<right){

            int absLeft=Math.abs(nums[left]);
            int absRight=Math.abs(nums[right]);
            if(absLeft<absRight){
                nums[right]=absRight*absRight;
                right--;
            }
            else{
                nums[right]=absLeft*absLeft;
                left++;
            }
        }
        return nums;

    }


}
