package Day5;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckOccuurencesOfEachValueUnique_Hashing {

    /*

    Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.
Example 1:
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:
Input: arr = [1,2]
Output: false
Example 3:
Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true

 --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints
 Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true

    Constraints: use hashing technique

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code
     */

    @Test
    public void example1(){
        int[] arr = {1,2,2,1,1,3};
        boolean output= true;
        boolean uniqueOccurrences = findUniqueOccurrences(arr);
        Assert.assertEquals(uniqueOccurrences,output);
        boolean result = findUniqueOccurence_MapAndSet(arr);
        Assert.assertEquals(result,output);

    }
    @Test
    public void example2(){
        int[] arr = {1,2};
        boolean output= false;
        boolean uniqueOccurrences = findUniqueOccurrences(arr);
        Assert.assertEquals(uniqueOccurrences,output);
        boolean result = findUniqueOccurence_MapAndSet(arr);
        Assert.assertEquals(result,output);
    }
    @Test
    public void example3(){
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        boolean output= true;
        boolean uniqueOccurrences = findUniqueOccurrences(arr);
        boolean result = findUniqueOccurence_MapAndSet(arr);
        Assert.assertEquals(result,output);
        Assert.assertEquals(uniqueOccurrences,output);
    }
    /*
    Pseudo code
    1. create a map and add all the array elements
    2. iterate in a loop and get the key values one by one and add it to the set if set returns false
    3. exit the loop and return the output

     */

    private boolean findUniqueOccurrences(int [] nums){
        HashMap<Integer,Integer> arrayNums=new HashMap<Integer, Integer>();
        boolean add=false;
        for (int i=0;i<nums.length;i++){
            arrayNums.put(nums[i],arrayNums.getOrDefault(nums[i],0)+1);
        }

        HashSet<Integer>numOccurrences=new HashSet<Integer>();
        Set<Map.Entry<Integer, Integer>> entries = arrayNums.entrySet();
        for (Map.Entry eachEntry: entries){
            Integer value =(Integer) eachEntry.getValue();
             add = numOccurrences.add(value);
             if(add==false){
                 return add;

             }

        }
        return add;

    }
    /*
       Pseudo code:-
       Create a hashmap with both key and value as integer and  and add all the array values
       Then add the map values into a set, if the size of map and set are same then return true
     */

    private boolean findUniqueOccurence_MapAndSet(int[] nums){

        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       return map.size()==new HashSet(map.values()).size();
    }
}
