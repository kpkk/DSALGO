package Day13;

import org.junit.Assert;
import org.junit.Test;

public class RemoveNumberFromArray {

    /*

    Given an array of numbers and a specific number (n), remove all instances of that number (n) and return the new length.
Input: numbers = [0,1,2,2,3,0,4,2], number = 2
Output: 5
numbers = [0,1,4,0,3]

Did i understand problem -yes
Do i input and output- yes
Do i know to solve- yes

     */

    @Test
    public void test1() {
        int n[] = {0, 1, 2, 2, 3, 0, 4, 2};
        int number = 2;
        int output = 5;
        int i = removeElement(n, number);
        int length = removeEleTwoPointer(n, number);
        Assert.assertEquals(length,output);
       Assert.assertEquals(i,output);
    }

    @Test
    public void test2() {
        int n[] = {0, 1, 2, 3, 4};
        int number = 5;
        int output = 5;
        int i = removeElement(n, number);
       // Assert.assertEquals(i,output);
        int length = removeEleTwoPointer(n, number);
        Assert.assertEquals(length,output);
    }

    @Test
    public void test3() {
        int n[] = {0, -1, 4, 3, -1, 4, 5, 6, 4,};
        int number = -1;
        int output = 7;
        int i = removeElement(n, number);
        Assert.assertEquals(i,output);
        int length = removeEleTwoPointer(n, number);
        Assert.assertEquals(length,output);
    }

    private int removeElement(int[] nums, int ele) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != ele) {
                index++;
            }
        }
        return index;
    }

    /*
    for two-pointer
    1. initialize the two variables called left and right also the counter
    2. left=0 and right=n-1;
    3. until left<right check if the current number is equal to the given number
    4. if yes, don't incremt the counter

     */

    private int removeEleTwoPointer(int []nums,int ele){
        int left=0;
        int right=nums.length-1;
        int counter=nums.length;

        while (left<right){

            if(left==right &&nums[right]==ele){
                counter--;
                break;
            }
            if(nums[left]==ele){
                counter--;
            }
            if(nums[right]==ele){
                counter--;
            }
            left++;
            right--;
        }
        return counter;

    }
}
