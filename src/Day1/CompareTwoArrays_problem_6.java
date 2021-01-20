package Day1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareTwoArrays_problem_6 {

    /*
3) Given two arrays,find the intersection of 2 arrays.

Input: nums1 = [11,2,12,1], nums2 = [2,12]
Output: [2,12]

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]

 --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints
    Input: nums = nums1 = [11,2,12,1], nums2 = [2,12]
    Output: [2,12]
    Constraints: no specific constraint

    c) prepare test data (Minimum of 3 set)
       +ve,a[] = [11,2,12,1],  nums2 = [2,12]
       edge  a[] = [4,9,5]	nums2 = [9,4,9,8,4]
       -ve a[] = [1,2,3] nums3=[4,5,6]

      d ) Write the Pseudo code

     */

    @Test //+ve
    public void testData1(){
        int [] nums1={11,2,12,1};
        int[] nums2={2,12};
        int[] resultArray = compareArrays(nums1,nums2);
        Assert.assertEquals(true,Arrays.equals(resultArray, new int[]{2,12,0,0}));
    }
    @Test //edge
    public void testData2(){
        int [] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        int[] resultArray = compareArrays(nums1,nums2);
        Assert.assertEquals(true,Arrays.equals(resultArray, new int[]{4,9,0}));
    }


    @Test //-ve
    public void testData3(){
        int [] nums1={0,0,0,0};
        int[] nums2={2,12};
        int[] resultArray = compareArrays(nums1,nums2);
        Assert.assertEquals(true,Arrays.equals(resultArray, new int[]{0,0,0,0}));
    }

   private int[] compareArrays(int[]nums1,int[]nums2){
       int length1 = nums1.length;
       int length2 = nums2.length;
       if(nums1.length<nums2.length){

       }
       int[] nums3=new int[nums1.length];
       int count=0;
       for (int i=0;i<nums1.length;i++){
           for (int j=0;j<nums2.length;j++){
               if(nums1[i]==nums2[j]){
                   nums3[count++]=nums2[j];
               }
           }
       }
       return nums3;


   }
}
