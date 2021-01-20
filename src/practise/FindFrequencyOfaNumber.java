package practise;

import org.junit.Assert;
import org.junit.Test;

public class FindFrequencyOfaNumber {

    /*
    1. iterate the array from left to right
    2. check if each element is equal to the target, if so increment count
    3. then return count
     */
    @Test //+ve
    public void testData1() {
        int a[] = {0, 5, 5, 5, 4};
        int x = 5;
        findFrequency(a, x);
        //Assert.assertEquals(i, 3);
    }
    private void findFrequency(int[] nums, int target){
        int count=0;
      for (int i=0;i<nums.length;i++){
          if(nums[i]==target){
              count++;
          }
      }
        System.out.println(count);
    }
}
