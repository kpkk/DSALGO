package firstWeekHomeWork;

import org.junit.Test;

import java.util.Arrays;



public class MoveAllThePostivesToRight {
    @Test
    public void example1(){
        int[] num1={4, -1, 9, 0, 2, -4, 5};
        int[] num2= {-1, 0, -4, 4, 9, 2, 5};
        moveALLpositives(num1);

    }
    @Test
    public void example2(){
        int[] num1={4, -1, 9, 0, -2, -4, 5,-6};
        int[] num2= {-1, 0, -4, 4, 9, 2, 5};
        moveALLpositives(num1);

    }
    @Test
    public void example3(){
        int[] num1={4, -1, -4, 5};
        int[] num2= {-1, 0, -4, 4, 9, 2, 5};
        moveALLpositives(num1);

    }

    private void moveALLpositives(int[] nums){
        int left=0;
        int right=0;
        int temp=0;
        while (left<nums.length){
            if(nums[left]<0){
                temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right++;

            }
            else {
                left++;
            }

        }
        System.out.println( Arrays.toString(nums));

    }
}
