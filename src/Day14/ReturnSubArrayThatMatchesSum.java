package Day14;

import org.junit.Test;

public class ReturnSubArrayThatMatchesSum {

    /*

    Given an integer array return all the subarray (start and end index) with sum matching target
Note: Sliding window+Hashing
Input: int[] num={1, 7, 4, 3, 4, 1, 2, 5, 1};
int target=7
Output:
1,1
2,3
3,4
4,6
6,7
     */

    @Test
    public void test1(){
        int[] nums={1, 7, 4, 3, 4, 1, 2, 5, 1};
        int target=7;
    }

    /*
    Pseudo code:-

    1. iterate from the left and check if the number is equal to target, if yes return the indices
    2. If its greater then move the window by ignoring the current element
    3. If its lesser then keep adding it
     */

    private int[] returnIndicesOfExactSum(int[] nums, int k){
        int sum=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==k){
                return new int[]{i,i};
            }
            else{
                sum+=nums[i];
            }
        }
        //temporary return type
        return new int[]{-1-1};
    }
}
