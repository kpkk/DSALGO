package practise;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoPointer_FindIntersectionOfArrays {

    /*

    1. Sort both the arrays
    2. Then initialize two pointer variables as p1=0 and p2=0
    3. until each pointer meets its length, iterate from left to right
    4. if both the pointers are equal then add the value to list and increment both p1, p2
    5. If p1< p2 then increment only p1 but not p2
    6. if p2<p1 then increment p2 not just p1
    7. then return the list
     */
    @Test
    public void example1(){
        int [] nums1={11,2,12,1};
        int[] nums2={2,12};
       findInterSectionArrays_twoPointer(nums1, nums2);
    }
    @Test //edge
    public void testData2(){
        int [] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};

    }


    @Test //-ve
    public void testData3(){
        int [] nums1={0,0,0,0};
        int[] nums2={2,12};

    }

    private void findInterSectionArrays_twoPointer(int [] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1=0,p2=0;
        ArrayList<Integer>al=new ArrayList<Integer>();
        while (p1<nums1.length&& p2<nums2.length){
            if(nums1[p1]==nums2[p2]){
                al.add(nums1[p1]);
                p1++;
                p2++;
            }else if(nums1[p1]<nums2[p2]){
                p1++;
            }else{
                p2++;
            }
        }
        System.out.println(al);
    }
}
