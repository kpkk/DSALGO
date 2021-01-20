package Day6;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class FindDifferenceBwSameNumbersInArrayIsAtmostK {

    /*
    Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j]
 and the absolute difference between i and j is at most k.
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false

   --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints
 Input: nums = [1,2,3,1], k = 3
Output: true

    Constraints: solve using hashing (map)

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code
      1. Iterate through the array from left and right
      2. Create a hashmap with integer as key and corresponding and add the characters
      3. Before adding it, check if it exists
            - if present, update the value by subtracting the previously existing value with current index
            - check if the value is less than or equal to the target (k), if so return true
            - else return false
            - if not just add it to the map

     */
    @Test
    public void example1(){
        int[] nums={1,0,1,1};
        int k=1;
        boolean output=true;
        boolean difference = findDifference(nums, k);
        Assert.assertEquals(difference,output);
    }
    @Test
    public void example2(){
        int[] nums={1,2,3,1};
        int k=3;
        boolean output=true;
        boolean difference = findDifference(nums, k);
        Assert.assertEquals(difference,output);
    }
    @Test
    public void example3(){
        int[] nums={1,2,3,1,2,3};
        int k=2;
        boolean output=false;
        boolean difference = findDifference(nums, k);
        Assert.assertEquals(difference,output);
    }

    private boolean findDifference(int[] nums, int k){
        HashMap<Integer,Integer> numbers=new HashMap<Integer,Integer>();
        for (int i = 0; i <nums.length ; i++) {
            if(numbers.containsKey(nums[i])){
                if(i-numbers.get(nums[i])<=k){
                    return true;
                }else{
                    numbers.put(nums[i],i);
                }

            }else{
                numbers.put(nums[i],i);
            }

        }
        return false;
    }
}
