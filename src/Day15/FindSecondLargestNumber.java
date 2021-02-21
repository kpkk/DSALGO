package Day15;

import org.junit.Assert;
import org.junit.Test;

public class FindSecondLargestNumber {

    @Test
    public void test1(){
        int[] num={1,2,3,4,5};
        Assert.assertEquals(4,findSecondMax(num));
    }

    private int findSecondMax(int[] nums){
            int firstMax= Integer.MIN_VALUE;
            int secondMax=Integer.MIN_VALUE;

            if(nums.length<2){
                throw new RuntimeException("error");
            }
            for (int i=0;i<nums.length;i++){
                if(nums[i]>firstMax){
                    secondMax=firstMax;
                    firstMax=nums[i];
                }
                else if(nums[i]>secondMax){
                    secondMax=nums[i];
                }
            }
            if(firstMax==secondMax){
                throw new RuntimeException("error");
            }else
                return secondMax;

    }
}
