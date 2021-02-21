package Day15;

import org.junit.Assert;
import org.junit.Test;

public class IsMountainArray {

    @Test
    public void test1(){
        int[] nums={0,3,2,1};
        Assert.assertEquals(true,isMountainArray(nums));
    }

    private boolean isMountainArray(int[] nums){
        boolean inc=false, dec=false;
        if(nums.length<3){
            return false;
        }
        for (int i=0;i<nums.length;i++){
            if(nums[i]<nums[i+1]&&!dec){
                inc=true;

            }else if(nums[i]>nums[i+1]){
                dec=true;
            }else {
                return false;
            }

        }
        if(!inc||!dec){
            return false;
        }
        return true;
    }
}
