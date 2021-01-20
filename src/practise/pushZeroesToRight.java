package practise;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class pushZeroesToRight {

    /*
    1. just initialize an array that of same length as of the given array
    2. Then iterate the input array from left to right
    3. if there is a non zero element then add it to the array
    4. return the new array
     */
    @Test
    public void example(){
        int [] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZeroesToRight(arr);
    }
    @Test //edge
    public void testData2(){
        int [] arr = {-1,1,-3,5,2, 0, 0, 0, 3, 6};
       pushZeroesToRight(arr);
        pushZeroesUsingSameArray(arr);
    }

    private void pushZeroesToRight(int [] nums){
        int[] finalArr=new int[nums.length];
        int index=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                finalArr[index++]=nums[i];
            }
        }
        System.out.println(Arrays.toString(finalArr));
    }
    //alternate way

    private void pushZeroesUsingSameArray(int[] nums){
        int count=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            nums[count++]=nums[i];
        }
        for (int j=count;j<nums.length;j++){
            nums[count++]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
