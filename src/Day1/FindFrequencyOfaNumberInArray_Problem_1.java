package Day1;

import org.junit.Assert;
import org.junit.Test;

public class FindFrequencyOfaNumberInArray_Problem_1 {


    /*
    Problem statement

  1) Find the frequency of a number in an array
Given an array a[] and an element x, find number of occurrences of x in a[].

Examples:
Input  : a[] = {0, 5, 5, 5, 4}	x = 5
Output : 3

Input  : a[] = {1, 2, 3}	x = 4
Output : 0

    --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints
    Input  : a[] = {0, 5, 5, 5, 4}	x = 5
    Output : 3
    Constraints- Open constriants (No)

    c) prepare test data (Minimum of 3 set)
       +ve,a[] = {0, 5, 5, 5, 4}	x = 5
       edge  a[] = {1, 2, 3}	x = 4
       -ve a[] = {} x=8

      d ) Write the Pseudo code


	1.Iterate through the array
	2. Compare each number with the given target value
	3. If at all there is a match increment the count (new variable)
	4. repeat step3 until the array length
	5. return the count


     */
    @Test //+ve
    public void testData1(){
        int a[] = {0, 5, 5, 5, 4};
        int x = 5;
        int i = countNumbers(a, x);
        Assert.assertEquals(i,3);

    }
    @Test //edge
    public void testData2(){
        int a[] = {1,-1,2,3, 4};
        int x = 1;
        int i = countNumbers(a, x);
        Assert.assertEquals(i,1);

    }
    @Test //-ve
    public void testData3(){
        int a[] = {};
        int x = 0;
        int i = countNumbers(a, x);
        Assert.assertEquals(i,0);

    }

    private int countNumbers(int [] nums, int target){
        int count=0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]==target)count++;
        return count;
    }
}
