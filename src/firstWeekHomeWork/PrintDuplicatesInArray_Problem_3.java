package firstWeekHomeWork;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class PrintDuplicatesInArray_Problem_3 {
    /*

     Print duplicates in a given array
Input: nums={1,3,8,3,11,5,6,4,7,6,7}
Output: [3,6,7]

--------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints

 Input: nums={1,3,8,3,11,5,6,4,7,6,7}
Output: [3,6,7]

   Constraints: no constraints

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code
      1. Iterate from left to right through the given int array
      2. then add the elements to a map
      3. Then iterate through the map and get the keys whose value is greater than 1
      4. Then declare a list add the repeated elements into it
      5. Then declare an array of list size
      6. iterate through the list and add it to the array then return the same


     */
    @Test
    public void example1(){
        int [] input={1,3,8,3,11,5,6,4,7,6,7};
        int [] output={3,6,7};
        int[] duplicteNums = findDuplicteNums(input);
        int[] duplicatesUsingSet = findDuplicatesUsingSet(input);
        Assert.assertArrayEquals(duplicteNums,output);
        Assert.assertArrayEquals(duplicatesUsingSet,output);


    }
    @Test
    public void example2(){
        int [] input={1,3,-1,-3,-1,8,7,-3};
        int [] output={-1,-3};
        int[] duplicteNums = findDuplicteNums(input);
        int[] duplicatesUsingSet = findDuplicatesUsingSet(input);
        Assert.assertArrayEquals(duplicteNums,output);
        Assert.assertArrayEquals(duplicatesUsingSet,output);


    }
    @Test
    public void example3(){
        int [] input={1,32,3,5,-7};
        int [] output={};
        int[] duplicteNums = findDuplicteNums(input);
        Assert.assertArrayEquals(duplicteNums,output);
        int[] duplicatesUsingSet = findDuplicatesUsingSet(input);
        Assert.assertArrayEquals(duplicatesUsingSet,output);

    }

    private int[] findDuplicteNums(int[] nums){
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        List<Integer> al=new ArrayList<Integer>();


        for (int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry eachEntry: map.entrySet()){
            int value = (Integer)(eachEntry.getValue());
            if(value>1){
                al.add((Integer)eachEntry.getKey());
            }

        }
        int[] dupNums=new int[al.size()];
        for (int i=0;i<al.size();i++){
            dupNums[i]=al.get(i);

        }

        return dupNums;
    }

    private int[] findDuplicatesUsingSet(int[] nums){
        Set<Integer>unique=new HashSet<Integer>();
        Set<Integer>duplicate=new HashSet<Integer>();
        int index=0;
        for (Integer eachInt:nums
             ) {
            if(!unique.add(eachInt)||duplicate.contains(eachInt)){
                unique.remove(eachInt);
                duplicate.add(eachInt);
            }

        }
        int[]dupArray=new int[duplicate.size()];
        Iterator<Integer> iterator = duplicate.iterator();
        while (iterator.hasNext()){
            dupArray[index++]=iterator.next();
        }
        return dupArray;

    }
}
