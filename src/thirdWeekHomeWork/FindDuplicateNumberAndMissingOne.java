package thirdWeekHomeWork;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class FindDuplicateNumberAndMissingOne {

    /*

    The set S originally contains numbers from 1 to n. But unfortunately, due to the data error,
 one of the numbers in the set got duplicated to another number in the set, which results in repetition of one number and loss of another number.
Given an array nums representing the data status of this set after the error.
Your task is to firstly find the number occurs twice and then find the number that is missing. Return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

 --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints
 Input: nums = [1,2,2,4]
Output: [2,3]

    Constraints: use hashing technique

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code
      1. Iterate the array from left to right and add the values into a set
      2. if the set returns false, then add the element into a list ans subsequent element then break
      3. return the list
     */
    @Test
    public void example1() {
        int[] nums = {1, 2, 2, 4};
        int[] output = {2, 3};
        int[] duplicateAndSubSequent = findDuplicateAndSubSequent(nums, output);
        Assert.assertArrayEquals(output, duplicateAndSubSequent);
    }

    @Test
    public void example2() {
        int[] nums = {1, 2, 3, 4, 5, 6, 6, 8};
        int[] output = {6, 7};
        int[] duplicateAndSubSequent = findDuplicateAndSubSequent(nums, output);
        Assert.assertArrayEquals(output, duplicateAndSubSequent);
    }

    @Test
    public void example3() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] output = {};
        int[] duplicateAndSubSequent = findDuplicateAndSubSequent(nums, output);
        Assert.assertArrayEquals(output, duplicateAndSubSequent);
    }

    private int[] findDuplicateAndSubSequent(int[] nums, int[] output) {

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> seqList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                seqList.add(nums[i]);
                seqList.add(nums[i] + 1);
                break;
            }
        }
        int[] seqArray=new int[seqList.size()];
        int index=0;
        Iterator<Integer> iterator = seqList.iterator();
        while (iterator.hasNext()){
            seqArray[index++]=iterator.next();
        }
        return seqArray;
    }
}