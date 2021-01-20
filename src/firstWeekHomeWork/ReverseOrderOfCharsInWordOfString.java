package firstWeekHomeWork;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ReverseOrderOfCharsInWordOfString {
    /*Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
Input:  "I am doing great"
Output: "I ma gniod taerg"

       --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints

 Input:  "I am doing great"
Output: "I ma gniod taerg"


    Constraints: preserve spaces and order of words

    c) prepare test data (Minimum of 3 set)


    d ) Write the Pseudo code
    1. Split the string based on the delimiter and store in an array
    2. Then if the length of the string element is less than 2 then return the string
    3. if the length is more than two then use two pointer alogorithm ans swap chars
    4. return the char array or convert that back to a string

     */
    @Test
    public void example1() {
        String input = "I am doing great";
        String output = "I ma gniod taerg";
        String s = reverseCharsOfWord(input);
        Assert.assertEquals(s,output);

    }
    @Test
    public void example2() {
        String input = "This is not goanna help us !!";
        String output = "sihT si ton annaog pleh su !!";
        String s = reverseCharsOfWord(input);
        Assert.assertEquals(s,output);

    }
    @Test
    public void example3() {
        String input = "hello  there &*5";
        String output = "olleh  ereht 5*& ";
        String s = reverseCharsOfWord(input);
        Assert.assertEquals(s,output);

    }

    private String reverseCharsOfWord(String str) {
        String[] s = str.trim().split(" ");
        String revStr = "";
        int index = 0;
        String finalStr = "";

        for (String eachStr : s) {

            char[] chars = eachStr.toCharArray();
            int left = 0;
            char temp = ' ';
            int right = chars.length - 1;
            while (left <= right) {
                temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            revStr = "";
            for (char eachCh : chars) {
                //
                revStr += eachCh;
            }
            s[index++] = revStr;
        }
        //}
        for (String eachStr : s) {
            finalStr += eachStr + " ";
        }
        return finalStr;
    }
}
