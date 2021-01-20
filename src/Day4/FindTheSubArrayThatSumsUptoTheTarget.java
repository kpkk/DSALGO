package Day4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindTheSubArrayThatSumsUptoTheTarget {

    /*

    1. take the input integer array and the target as inputs
    2. iterate through the array from left to right
    3. initiate another array and add both the elements
       - if the sum is equal to the target return
       - if the sum is less than the target add next element then check for its equality
       - if it goes above then ignore and move the I

     */

    @Test
    public void example1() {
        int[] numbers = {1,7,4,3,1,2,1,5,1};
        int target = 7;
        int[] sum = exactSum(numbers, target);
        System.out.println(sum);
    }

    @Test
    public void example2() {
        int[] numbers = {1,1,1,1,1,1,1};
        int target = 7;
        int[] sum = exactSum(numbers, target);
        System.out.println(sum);
    }

    @Test
    public void example3() {
        int[] numbers = {8,11,14,23};
        int target = 7;
        int []sum = exactSum(numbers, target);
        System.out.println(sum);
    }

    private int[] exactSum(int[] nums, int target){
        int sum=0;
        List<Integer>al=new ArrayList<>();

        for (int i=0;i<nums.length;i++){
            sum=nums[i];
            if(sum==target){
                return new int[]{i,i};
            }else{
                for (int j=i+1;j<nums.length;j++){
                    sum+=nums[j];
                    if (sum==target){
                        al.add(i);
                        al.add(j);
                        return new int[]{i,j};
                    }else if(sum>target){
                        break;
                    }else if    (sum<target){
                        continue;
                    }
                }
            }

        }
        int index=0;
        Iterator<Integer> iterator = al.iterator();
        int[] indices= new int[al.size()];
        while (iterator.hasNext()){
            indices[index++]=iterator.next();
        }
        return indices;
    }
}
