package Day1;

import org.junit.Assert;
import org.junit.Test;

public class FlowerBed_Problem_5 {

    /*
    You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
    Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: false

  --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints
    Input: nums = [1,0,0,0,1] n=1
    Output: true
    Constraints: flowers can't be planted in adjacent plots

    c) prepare test data (Minimum of 3 set)
       +ve,a[] = [1,0,0,0,1] n=1
       edge  a[] = {1,0,0,0,1}	n=2
       -ve a[] = {} n=1

      d ) Write the Pseudo code

       1. Iterate through the array
       2. if the integer is zero then check one before and after
       3. we can insert a plant if both condition satisfies else do nothing and return false

     */
    @Test //+ve
    public void testData1(){
        int [] arr={1,0,0,0,1};
        int n=1;
        boolean b = plantAflower(arr, n);
        System.out.println(b);
        Assert.assertTrue(true);

    }
    @Test //edge
    public void testData2(){
        int [] arr={1,0,0,0,1};
        int n=2;
        boolean b = plantAflower(arr, n);
        System.out.println(b);
        Assert.assertFalse(false);

    }
    @Test //-ve
    public void testData3(){
        int [] arr={};
        int n=2;
        boolean b = plantAflower(arr, n);
        System.out.println(b);
        Assert.assertFalse(false);

    }

    private boolean plantAflower(int [] nums, int n){
        boolean flower= false;
        int plantCount=0;
         for (int i=0;i<nums.length;i++){

             if(nums[i]==0){
                 if(nums[i+1]==0&& nums[i-1]==0){
                     nums[i]=1;
                     plantCount++;
                     if(plantCount<n){
                         continue;
                     }else{
                         break;
                     }
                 }
             }
         }
         if(plantCount==n){
             return true;
         }else
         return false;
    }
}
