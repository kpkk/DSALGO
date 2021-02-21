package Day10;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Stack;

public class reverseUntilKEle_queue {

    /*

    Given an integer k and a queue of integers, we need to reverse the order of the first k elements of the queue,
leaving the other elements in the same relative order.
Only following standard operations are allowed on queue.
Examples:
Input :
Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
k = 5
Output :
Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]
Input :
Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
k = 4
Output :
Q = [40, 30, 20, 10, 50, 60, 70, 80, 90, 100]

-- valid question--> what if the k is greater than the array length
     */
    @Test
    public void test1(){
        int[] nums={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int k=5;
        reverseKele(nums,k);
    }
    @Test
    public void test2(){
        int[] nums={10, 10,10,16,18,20};
        int k=3;
        reverseKele(nums,k);
    }
    @Test
    public void test3(){
        int[] nums={10,10,10,16,18,20};
        int k=8;
        reverseKele(nums,k);
    }
    @Test
    public void test4(){
        char c='a';
        int a=32;
        char ch=(char) a;
        System.out.println((char)c-ch);
        int[] nums={10,10,10,16,18,20};
        int k=8;
        reverseKele(nums,k);
    }
    /*
    Pseudo code
    1. Iterate through the array elements
    2. Store the first K elements into a stack
    3. Then store the rest of the elements into a queue
    4. Get the item from stack and add them to the queue
    5. Dequeue the total number of K elements from the queue
    6. And enque (offer) in the same queue
    7. Then return the queue
     */

    private void reverseKele(int []nums, int k){
        if(k>nums.length){
            throw new RuntimeException("invalid input");
        }
        Stack<Integer>st=new Stack<>();
        ArrayDeque<Integer>ad=new ArrayDeque<>();

        for (int i=0;i<nums.length;i++){
                if(i<k){
                    st.push(nums[i]);
                }else{
                    ad.offer(nums[i]);
                }
        }
        //get the elements from the stack
        for (int i=0;i<k;i++){
            ad.offer(st.pop());
        }

        //deque (poll) only the total-k elements
        for (int i=0;i<nums.length-k;i++){
            ad.offer(ad.poll());
        }
        System.out.println(ad);

    }
}
