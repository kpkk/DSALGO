package Day4;

import org.junit.Assert;
import org.junit.Test;

public class SlidingWindow_FindTheHighestSumOfKConsecutiveEle {

    @Test
    public void example1(){
        int[] input={1,2,7,8,9};
        int target=3;
        int output=24;
        int highestSum = findHighestSum(input, target);
        Assert.assertEquals(highestSum,output);
    }
    @Test
    public void example2(){
        int[] input={-2,-5,1,-4};
        int target=2;
        int output=-3;
        int highestSum = findHighestSum(input, target);
        Assert.assertEquals(highestSum,output);
    }
    @Test
    public void example3(){
        int[] input={1,2,3,4};
        int target=4;
        int output=10;
        int highestSum = findHighestSum(input, target);
        Assert.assertEquals(highestSum,output);
    }

    private int findHighestSum(int nums[], int target){
        int max=0;
        for (int i=0;i<target;i++){
            max+=nums[i];
        }
        int currentMax=max;
        for (int i=target;i<nums.length;i++){
            currentMax+=nums[i]-nums[i-target];
        }
        max=Math.max(currentMax,max);
        return max;
    }

}
