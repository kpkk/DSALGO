package SecondWeekHomeWork;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FindGivenAnagramIsASUbStringOfGivenString {

    /*

    Find if the given anagram is substring of the input string. Solve using sliding window.
Example 1:
String input="acbbabccaabcab"
String anagram="abc";
Output: True
Explanation: Substring(0,2) is anagram of "abc"

Example 2:
String input="acbbabccaabcab";
String anagram="abd";
Output: false

  --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints
String input="acbbabccaabcab";
String anagram="abd";
Output: false

    Constraints: solve sliding window technique

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code
      1. create 2 arrays with size 26 (since the assumption is only alphabets of lowercase are available)
      2. Then add all the characters of anagram to the ascii array
      3. Then add the k chars of the input string (k is length of anagram) to the input array
      4. Compare if both ar equal else, remove the first character from the subarray then add the subsequent one

     */
    @Test
    public void example1() {
        String input = "acbbabccaabcab";
        String anagram = "abd";
        boolean result = false;
        boolean b = checkGivenAnagramIsSubstring(input, anagram);
        Assert.assertEquals(result,b);
    }

    @Test
    public void example2() {
        String input = "acbbabccaabcab";
        String anagram = "abc";
        boolean result = true;
        boolean b = checkGivenAnagramIsSubstring(input, anagram);
        Assert.assertEquals(result,b);
    }

    @Test
    public void example3() {
        String input = "acbbabccaabcab";
        String anagram = "abd";
        boolean result = false;
        boolean b = checkGivenAnagramIsSubstring(input, anagram);
        Assert.assertEquals(result,b);
    }

    private boolean checkGivenAnagramIsSubstring(String input, String anagram) {
        int[] inputArr = new int[26];
        int[] anagramArr = new int[26];
        for (char c : anagram.toCharArray()) {
            anagramArr[c - 'a']++;
        }
            int start = 0, end = 0;
            while (end < input.length()) {
                inputArr[input.charAt(end++) - 'a']++;
                if (end > anagram.length())
                    inputArr[input.charAt(start++) - 'a']--;
                if (Arrays.equals(inputArr, anagramArr))
                    return true;
            }


        return false;
    }
}
