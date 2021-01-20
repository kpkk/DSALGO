package Day4;

import org.junit.Test;

import java.util.Arrays;

public class SlidingWindow_FindTheSUbArraySumsUpToTarget {

    /*
    Pseudo code
    1. start with the first element


     */

    @Test
    public void example1() {
        int[] numbers = {1,7,4,3,1,2,1,5,1};
        int target = 7;
        int[] sum = findSubArray(numbers, target);
        System.out.println(Arrays.toString(sum));
    }

    @Test
    public void example2() {
        int[] numbers = {1,1,1,1,1,1,1};
        int target = 7;
        int[] sum = findSubArray(numbers, target);
        System.out.println(Arrays.toString(sum));
    }

    @Test
    public void example3() {
        int[] numbers = {8,11,14,23};
        int target = 7;
        int[] sum = findSubArray(numbers, target);
        System.out.println(sum);
    }


    private int[] findSubArray(int [] nums, int target){
        int current=0;

      for (int i=0;i<nums.length;i++){

          current+=nums[i];
          if(current==target){
              return new int[] {nums[i]};
          }else if(current<target){
              continue;
          }else{
              current+=nums[i+1]-nums[i-1];
              break;
          }
      }
      return new int []{-1,-1};

    }
}

/*
  int current=nums[0];
        if(current==target){
            return new int[]{0};
        }

        for (int i=1;i<nums.length;i++){
            current+=nums[i];
            if(current<target){
                continue;
            }else if (current>target){
                current+= nums[i+1]-nums[i-1];
            }else if(current==target){
                return new int[]{i,i+1};
            }
        }

        return new int[]{-1,-1};
 */