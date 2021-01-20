package Day1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ToSum_Problem_3 {

  /*
  Question:-
    Given an array of integers say nums and an integer say target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.

            Example:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation:
    nums[0] + nums[1] == 9, so we
    return [0, 1].

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

       1. Iterate through the array from left to right (one at a time)
       2. subtract the each number present in the array with target
       3. then iterate from the subsequent element until the end of the array
       4. Check if the difference is equal to any value present in array
       5. if exists break the loop
       6. return the indices of i and j
   */


    @Test //+ve
    public void testData1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = toSum(nums, target);
        Assert.assertEquals(true, Arrays.equals(indices,new int[]{0,1}));
    }
    @Test //-ve
    public void testData2() {
        int[] nums = {};
        int target = 9;
        int[] indices = toSum(nums, target);
        Assert.assertEquals(true, Arrays.equals(indices,new int[]{0,0}));
    }
    @Test //edge
    public void testData3() {
        int[] nums = {-4,-1,0,3,3,3,10};
        int target = 13;
        int[] indices = toSum(nums, target);
        Assert.assertEquals(true, Arrays.equals(indices,new int[]{3,6}));
    }





  private int[] toSum(int [] nums, int target){
      int [] indices= new int[2];
      boolean bFound=false;
      for (int i=0;i<nums.length;i++){
          int diff= target-nums[i];
          for (int j=i+1;j<nums.length;j++){
              if(nums[j]==diff){
                  indices[0]=i;
                  indices[1]=j;
                  bFound=true;
                  break;

              }
          }
          if (bFound)break;
      }
      return indices;
  }
}
