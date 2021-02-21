package Day13;

import org.junit.Test;

import java.util.Arrays;

public class RightRotationByNtimesOfArray {

    /*

Given an integer array perform right rotation a given number of times, N
and print the output. N < length of array.
Input: [4,6,3,8,2,9,1,36]
N = 4
Output: [2,9,1,36,4,6,3,8]

Pseudo code:-
1. declare left=0 and right = length-1
2. until the value of N is met swap the values and return the array
     */

    @Test
    public void test1(){
        int[] input={4,6,3,8,2,9,1,36};
        int k=4;
        int[] output={2,9,1,36,4,6,3,8};
        int[] ints = rightRotation(input, k);
        System.out.println(Arrays.toString(ints));
    }

    private int[] rightRotation(int[] nums, int k){

        int left=k-1;
        int right=nums.length-1;
        for (int i=1;i<=k;i++){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left--;
            right--;
        }
        return nums;

    }
}
