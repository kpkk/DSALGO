package Day5;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class MatchPatternAndString {

    /*
Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Input: pattern = "abc", s = "hello world world"
Output: false

     --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints
 Input: pattern = "abba", s = "dog cat cat dog"
Output: true

    Constraints: solve using brute force first then improve

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code

      1. convert the pattern into a character array
      2. Split the string array using space
      3. Check if the sizes of both the arrays are same, if not return false
      3. Declare two hashsets one to hold the unique value and other to store duplicate values
      4. Then add both the arrays into hashsets
      5. if the size of both the duplicate values is same then return true


     */

    @Test
    public void example1() {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean output = true;
        boolean b = MatchPattern(s,pattern);
        Assert.assertEquals(output, b);
    }

    @Test
    public void example2() {
        String pattern = "abba";
        String s = "dog cat cat fish";
        boolean output = false;
        boolean b = MatchPattern(s,pattern);
        Assert.assertEquals(output, b);
    }

    @Test
    public void example3() {
        String pattern = "abc";
        String s = "hello world world";
        boolean output = false;
        boolean b = MatchPattern(s,pattern);
        Assert.assertEquals(output, b);
    }
    @Test
    public void example4() {
        String pattern = "abcd";
        String s = "hello world universe";
        boolean output = false;
        boolean b = MatchPattern(s,pattern);
        Assert.assertEquals(output, b);
    }

    private boolean MatchPattern(String str, String p) {

        char[] patternArr = p.toCharArray();
        String[] stringArr = str.split(" ");
        HashMap<Character, String> chars = new HashMap<>();
        HashMap<String, Character> strings = new HashMap<>();
        for (int i = 0; i <stringArr.length; i++) {
            char c = patternArr[i];
            String w = stringArr[i];
            if (!chars.containsKey(c)) {
                if (!strings.containsKey(w)) {
                    strings.put(w, c);
                    chars.put(c, w);
                } else {
                    return false;
                }

            } else {
                String s = chars.get(c);
                if (!s.equals(w)) {
                    return false;
                }
            }
        }

        return true;
    }
}
