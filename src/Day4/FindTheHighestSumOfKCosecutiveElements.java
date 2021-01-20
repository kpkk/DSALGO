package Day4;

import org.junit.Test;

/*

Find the highest sum of k consecutive elements
 */

public class FindTheHighestSumOfKCosecutiveElements {

    @Test
    public void example1() {
        int[] numbers = {2,3,1,4,7,8};
        int target = 3;
        int sum = getMaxSum(numbers, target);
        System.out.println(sum);
    }
    @Test
    public void example2() {
        int[] numbers = {12,3,1,4,7,-3};
        int target = 2;
        int sum = getMaxSum(numbers, target);
        System.out.println(sum);
    }
    @Test
    public void example3() {
        int[] numbers = {2,1,7,8,9};
        int target = 5;
        int sum = getMaxSum(numbers, target);
        System.out.println(sum);
    }
    @Test
    public void example4() {
        int[] numbers = {2,1,7,8,9};
        int target = 6;
        int sum = getMaxSum(numbers, target);
        System.out.println(sum);
    }

    @Test
    public void example5() {
        int[] numbers = {-4,-3,-2};
        int target = 2;
        int sum = getMaxSum(numbers, target);
        System.out.println(sum);
    }
    /*
     * Psuedocode:
     * traverse from left to right and
     * pick the first target numbers add them -> store as max
     * keep moving towards right, add them and compare :
     * if your current window are max -> store that numbers with the output
     * finally, return the max value's output
     */

    private int getMaxSum(int[] numbers, int target) {
        if(numbers.length<target||target<=0){
            throw new RuntimeException("invalid target");
        }
        int max=Integer.MIN_VALUE;

        for (int i=0;i<numbers.length-target+1;i++){
            int currentMax=0;
            for (int j=0;j<target;j++){
                  currentMax+=numbers[i+j];

            }
            max=Math.max(max,currentMax);

        }

        return max;
    }
}
