package SecondWeekHomeWork;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PalindromeString_TwoPointer {

    /*

1) Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
Note: For the purpose of this problem, we define empty string as valid palindrome.
Example 1:
Input: "A man, a plan, a canal: Panama"
Output: true

Example 2:
Input: "race a car"
Output: false

 --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints

Input: "A man, a plan, a canal: Panama"
Output: true


   Constraints: use two pointer algorithm, 
                only consider the alphanumeric chars

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code
      1. Read the string value then convert into a character array
      2. Then in a loop check if the character is alphanumeric
      3. declare another empty string add the alphanumeric chars alone by eliminating others
      4. Convert the new String into a character array
      5. Then initialize two variables called left and right (two pointer)
      6. Start the left pointer at zero and the right pointer at the end of the array
      7. then keep swaping the left with right until both left and right reaches the same point
      8. then convert this array into a string
      9. compare this string with the initially modified (removed all chars other then alphanumeric) string, if both are equal then its palindrome
      10. return True or False values

}

*/

    @Test
    public void example1() {
        String input = "race  a car";
        boolean output = false;
        boolean b = palindromeCheck(input);
        Assert.assertEquals(b,output);

    }

    @Test
    public void example2() {
        String input = "A man, a plan, a canal: Panama";
        boolean output = true;
        boolean b = palindromeCheck(input);
        Assert.assertEquals(b,output);

    }

    @Test
    public void example3() {
        String input = "pradeep";
        boolean output = false;
        boolean b = palindromeCheck(input);
        Assert.assertFalse(output);

    }
    @Test
    public void example4() {
        String input = "";
        boolean output = false;
        boolean b = palindromeCheck(input);
        Assert.assertFalse(output);

    }


    private boolean palindromeCheck(String str) {
        if (str.length()==0)
            return false;
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (alphaNumericCheck(str.charAt(i)) == true) {
                newStr += str.charAt(i);
            }
        }
        char[] chars = newStr.toLowerCase().toCharArray();


        int left = 0;
        String revStr = "";
        int right = chars.length - 1;
        char temp = ' ';
        while (left < right) {
            temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;


        }

        for (char ch : chars) {
            revStr += ch;
        }

        if (newStr.equalsIgnoreCase(revStr)) {
            return true;
        }
        System.out.println(revStr);
        System.out.println(newStr);
        return false;

    }

    private boolean alphaNumericCheck(char ch) {
        if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122 || ch >= 47 && ch <= 55) {
            return true;
        }
        return false;
    }

}