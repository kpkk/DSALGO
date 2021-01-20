package firstWeekHomeWork;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ReverseArrayOfChars_Two_Pointer {
  /*

  The input string is given as an array of characters char[].
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
You may assume all the characters consist of printable ascii characters.
Example 1:
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:
Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
    --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints

   Input: ["h","e","l","l","o"]
   Output: ["o","l","l","e","h"]

    Constraints: use the same array using two pointer

    c) prepare test data (Minimum of 3 set)


    d ) Write the Pseudo code

    1. declare two variables called left and right
    2. initialize the variables to the start index(0) and end index(ch.length) respectively
    3. Then iterate using two pointer until the left<=right
    4. swap each variable
*/

  @Test
  public void example1(){
      char[] input={'h','e','l','l','o'};
      char [] output={'o','l','l','e','h'};
      char[] strings = reverseCharSeqence(input);
      Assert.assertArrayEquals(strings,output);

  }
    @Test
    public void example2(){
        char[] input={'H','a','n','n','a','h'};
        char [] output={'h','a','n','n','a','H'};
        char[] strings = reverseCharSeqence(input);
        Assert.assertArrayEquals(strings,output);

    }

    private char [] reverseCharSeqence(char[]ch){
      int left=0;
      int right=ch.length-1;
      char temp=' ';
      while (left<=right){
          temp=ch[left];
          ch[left]=ch[right];
          ch[right]=temp;
          left++;
          right--;
      }
      return ch;
    }

}
