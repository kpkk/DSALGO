package SecondWeekHomeWork;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FindExtraCharacter_TwoPointer {

    /*

Given 2 Strings with length n and (n+1) respectively. The second String contains all the characters of first but with an extra char.
Write the code to find the extra char.
Example 1:
Input:
A1 = "Test"
A2 = "Test$"
Output: '$'

Example 2:
Input:
A1 = "Hello"
A2 = "lloreH"
Output: 'r'
       --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints
   Input:
    A1 = "Test"
    A2 = "Test$"
    Output: '$'
    Constraints: use two pointer algorithm

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code

      1. Initially accept the two strings which are of n, n+1
      2. convert those arrays into character arrays then sort them
      3. Initialize a character variables with space
      4. Initialize two variables called pointer1, pointer2 to iterate through both the arrays
      4. iterate from left to right in until the length of both the arrays
      5. check if the character from both the arrays are equal
      6. if both are equal then increment both the pointers
      7. If at all the characters doesn't match then return the character and break the loop return the character

     */

    @Test
    public void example1() {
        String input1 = "Test";
        String input2 = "Test$";
        char output = '$';
        char extraChar = findExtraChar(input1, input2);
        Assert.assertEquals(extraChar, output);

    }

    @Test
    public void example2() {
        String input1 = "Hello";
        String input2 = "lloreH";
        char output = 'r';
        char extraChar = findExtraChar(input1, input2);
        Assert.assertEquals(extraChar, output);

    }

    @Test
    public void example3() {
        String input1 = "Hello";
        String input2 = "hello";
        char output = ' ';
        char extraChar = findExtraChar(input1, input2);
        Assert.assertEquals(extraChar, output);

    }

    private char findExtraChar(String str1, String str2) {
        char c = ' ';
        if (str1.length() == str2.length())
            return c;

        char[] chars = str1.toCharArray();
        char[] chars1 = str2.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);

        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < chars.length && pointer2 < chars1.length) {

            if (chars[pointer1] == chars1[pointer2]) {
                pointer1++;
                pointer2++;
            }else{
                c=chars1[pointer2];
                break;
            }

        }
        c = chars1[pointer2];


        return c;
    }
}

