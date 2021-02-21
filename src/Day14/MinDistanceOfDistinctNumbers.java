package Day14;

import org.junit.Test;

import java.util.HashSet;

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
Example 3:
Input: nums = [1,2,3,2,2,3], k = 2
Output: true
 */

public class MinDistanceOfDistinctNumbers {

    @Test
    public void test1(){
        int[] n={1,2,3,1};
        int k=3;
        boolean b = minDistance(n, k);
    }
    /*
    Pseudo code:-

    1. initialize two variables as i=0 and j=i+1
    2. check if i and j are same, if so calculate the difference of their indices
    3. if the difference is less than or equals to k then return true
    4. slide the window until k=0
    5. else return false


     */

    private boolean minDistance(int[] nums, int k){

        HashSet<Integer> set=new HashSet<>();

        //for first k values
        for (int i=0;i<=k;i++){

            if(!set.add(nums[i])){
               return true;
            }

        }
        for (int i=k+1;i<nums.length;i++){
            set.remove(nums[i-1-k]);
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;

    }
}
