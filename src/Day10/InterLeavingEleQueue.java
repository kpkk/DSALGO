package Day10;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Stack;

public class InterLeavingEleQueue {

    /*
    Given a queue of integers of even length, rearrange the elements by interleaving the first half of the queue with the second half of the queue.
Only a stack can be used as an auxiliary space.
Examples:
Input :  1 2 3 4
Output : 1 3 2 4
Input : 11 12 13 14 15 16 17 18 19 20
Output : 11 16 12 17 13 18 14 19 15 20
     */
    @Test
    public void test1(){
        int []nums={1,2,3,4};
        int[] output={1,3,2,4};
    }

    /*
    1. Find the mid point of the array
    2. Then add the elements of the array from mid point to until the length to a queue
    3. then

     */
    private void interleavingEle(int nums[]){
        int mid=nums.length/2;
        ArrayDeque<Integer>ad=new ArrayDeque<>();
        Stack<Integer>st=new Stack<>();
        for (int i=mid;i< nums.length;i++){
            st.push(nums[i]);
        }
        for (int i=0;i<nums.length;i++){
            if(i%2==0){
                continue;
            }else{
              //  mid=nums[i];
            }
        }
    }
}
