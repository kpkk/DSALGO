package Day5;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class FindEleThatOccurredOnlyOnce_hashing {
    /*

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
Example 1:
Input: nums = [2,2,1]
Output: 1
Example 2:
Input: nums = [4,1,2,1,2]
Output: 4
Example 3:
Input: nums = [1]
Output: 1

     --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints
 Input: nums = [2,2,1]
Output: 1

    Constraints: solve using brute force first then hashing technique

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code
     */

    @Test
    public void example1(){
        int[] nums={2,1,2};
        int output=1;
        int ele = findUniqueElementInArray(nums);
        Assert.assertEquals(ele,output);
        int uniqueNumber = findUniqueUsingHashSet(nums);
        Assert.assertEquals(ele,uniqueNumber);

    }
    @Test
    public void example2(){
        int[] nums={4,1,2,1,2};
        int output=4;
        int ele = findUniqueElementInArray(nums);
        Assert.assertEquals(ele,output);
        int uniqueNumber = findUniqueUsingHashSet(nums);
        Assert.assertEquals(ele,uniqueNumber);

    }
    @Test
    public void example3(){
        int[] nums={1};
        int output=1;
        int ele = findUniqueElementInArray(nums);
        Assert.assertEquals(ele,output);
        int uniqueNumber = findUniqueUsingHashSet(nums);
        Assert.assertEquals(ele,uniqueNumber);

    }

    /*
    Pseudo code bruteforce
    1. Loop through the array from left to right
    2. get the element count by adding them to the map
    3. iterate the map entry set, get the key whose value is one then return the same

     */
    private int findUniqueElementInArray(int nums[]){
        HashMap<Integer,Integer> elecount=new HashMap<Integer,Integer>();
        int uniquevalue=0;
        for (int i=0;i<nums.length;i++){
            elecount.put(nums[i],elecount.getOrDefault(nums[i],0)+1);

        }
       // HashSet<Integer>set=new HashSet<>(elecount.values());

        Set<Map.Entry<Integer, Integer>> entries = elecount.entrySet();
        for (Map.Entry eachEntry: entries){
            Integer value = (Integer)eachEntry.getValue();
            if(value==1){
               uniquevalue= (Integer) eachEntry.getKey();
               break;
            }
        }

return uniquevalue;
    }

    /*
    create a hashset and add all the values, before adding check if the value exists or not
    if it exists remove the character and return the on existing character


     */

  private int findUniqueUsingHashSet(int[] nums){
        HashSet<Integer>unique=new HashSet<>();
      for (int i = 0; i <nums.length ; i++) {
          if(!unique.add(nums[i])){
              unique.remove(nums[i]);
          }
      }

return unique.iterator().next();
  }

  private int findUsingXor(int []nums){
      int result=0;
      for (int i = 0; i < nums.length; i++) {
          result^=nums[i];

      }
      return result;

  }
}
