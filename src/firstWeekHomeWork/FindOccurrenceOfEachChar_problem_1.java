package firstWeekHomeWork;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FindOccurrenceOfEachChar_problem_1 {

    /*
Question
    Find occurrence of each character

Input: String input="welcome to automation"
Output:
w=1, e=2, l=1, c=1, o=4, m=2, t=3, a=2, u=1, i=1, n=1,  =2

 --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints

  Input: String input="welcome to automation"
Output:
w=1, e=2, l=1, c=1, o=4, m=2, t=3, a=2, u=1, i=1, n=1,  =2

   Constraints: case sensitive

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code

      1. Accept the string input then convert that into character array
      2. Then iterate through the array from left to right
      3. Add each character into the map, if it exists increment the count
      4. return the map

     */

    @Test //+ve
    public void example1() {
        String input = "welcome to automation";
        // w=1, e=2, l=1, c=1, o=4, m=2, t=3, a=2, u=1, i=1, n=1,  =2
        Map<Character, Integer> chars = new HashMap<Character, Integer>();
        chars.put('w', 1);
        chars.put('e', 2);
        chars.put('l', 1);
        chars.put('c', 1);
        chars.put('o', 4);
        chars.put('m', 2);
        chars.put('t', 3);
        chars.put('a', 2);
        chars.put('u', 1);
        chars.put('i', 1);
        chars.put('n', 1);
        chars.put(' ', 2);
        Map<Character, Integer> occurrenceOfChar = findOccurrenceOfChar(input);
        Assert.assertEquals(chars,occurrenceOfChar);

    }
    @Test //-ve
    public void example2() {
        String input = "hhhh";
        // w=1, e=2, l=1, c=1, o=4, m=2, t=3, a=2, u=1, i=1, n=1,  =2
        Map<Character, Integer> chars = new HashMap<Character, Integer>();
        chars.put('h', 4);
        Map<Character, Integer> occurrenceOfChar = findOccurrenceOfChar(input);
        Assert.assertEquals(chars,occurrenceOfChar);

    }
    @Test //edge
    public void example3() {
        String input = "HEllo";
        // w=1, e=2, l=1, c=1, o=4, m=2, t=3, a=2, u=1, i=1, n=1,  =2
        Map<Character, Integer> chars = new HashMap<Character, Integer>();
        chars.put('H', 1);
        chars.put('E', 1);
        chars.put('l', 2);
        chars.put('o', 1);
        Map<Character, Integer> occurrenceOfChar = findOccurrenceOfChar(input);
        Assert.assertEquals(chars,occurrenceOfChar);

    }

    private Map<Character,Integer> findOccurrenceOfChar(String str){

        char[] ch = str.toCharArray();
        Map<Character,Integer> mp=new HashMap<Character, Integer>();
        for (Character eachChar:ch
             ) {
            mp.put(eachChar,mp.getOrDefault(eachChar,0)+1);
        }
            return mp;
        }


    }


