package Day3;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntersectionOfTwoArrays_Two_Pointer {

    /*
Given two sorted arrays,find the intersection of 2 arrays.
Input: nums1 = [1,2,11,12], nums2 = [2,12]
Output: [2,12]
Input: nums1 = [4,5,9], nums2 = [4,4,8,9,9]
Output: [4,9]
    --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints

 Input: nums1 = [1,2,11,12], nums2 = [2,12]
Output: [2,12]
Input: nums1 = [4,5,9], nums2 = [4,4,8,9,9]
Output: [4,9]

   Constraints: use two pointer algorithm

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code
     */
    @Test
    public void example1() {
        int num1[] = {1, 2, 11, 12};
        int num2[] = {2, 12};
        int output[] = {2, 12};
        int[] integers = finInterSectionOfArrays(num1, num2);
        Assert.assertArrayEquals(integers,output);


    }

    @Test
    public void example2() {
        int num1[] = {4, 5, 9};
        int num2[] = {4, 4, 8, 9, 9};
        int output[] = {4, 9};
        int[] integers = finInterSectionOfArrays(num1, num2);
        Assert.assertArrayEquals(integers,output);

    }

    @Test
    public void example3() {
        int num1[] = {4, 5, 9};
        int num2[] = {1, 2, 3};
        int output[] = {};
        int[] integers = finInterSectionOfArrays(num1, num2);
        Assert.assertArrayEquals(integers,output);

    }

    /*
    Pseudo code

    1. initialize two variables called left index, right index to iterate through th arrays
    2. Then compare both left and right
    3. If both are equal then add it to te list and increment both the indices
    4. If at all the first index is greater than the second index value then increment the second index alone
    5. if the first index is less than the second index then move the first alone
    6. repeat 3,4,5 until both the indices reaches the length of the array
     */

    private int[] finInterSectionOfArrays(int[] num1, int[] num2) {
        int pointer1 =0;
        int pointer2 =0;
        List<Integer>al=new ArrayList<>();
        while(pointer1<num1.length&&pointer2<num2.length){
            if(num1[pointer1]==num2[pointer2]){
                al.add(num1[pointer1]);
                pointer1++;
                pointer2++;
            }else if(num1[pointer1]<num2[pointer2]){
                pointer1++;
            }else{
                pointer2++;
            }

        }
        int[] intersectionArray=new int[al.size()];
        int index=0;
        Iterator<Integer> iterator = al.iterator();
        while (iterator.hasNext()){
            intersectionArray[index++]=iterator.next();
        }
        return intersectionArray;


    }
}



