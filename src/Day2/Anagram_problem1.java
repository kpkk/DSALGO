package Day2;

import org.junit.Assert;
import org.junit.Test;

import java.io.CharArrayReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Anagram_problem1 {
    /*
    1) Write a function to check whether two given strings are anagram of each other or not.
 An anagram of a string is another string that contains the same characters,
 only the order of characters can be different. For example, “abcd” and “dabc” are an anagram of each other.

 --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints
    Input: abcd
    Output: cdba
    Constraints: we have to solve with list

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code

      1. Check the length of the two strings, if they match by their length
      2. if they don't match return false saying they are not anagrams
      3. If they match convert both the strings into character array then add to list
      4. Sort both the lists to make sure it wont break in edge cases
      5. compare the two lists for their equality
      6. if they are equal return true
     */
    @Test //+ve
    public void example1(){
        String s1="listen";
        String s2="silent";
        boolean b = checkAnagram(s1, s2);
        Assert.assertTrue(b);

    }
    @Test //-ve
    public void example2(){
        String s1="Listen";
        String s2="Silent";
        boolean b = checkAnagram(s1, s2);
        Assert.assertTrue(b);

    }
    @Test //edge
    public void example3(){
        String s1="ABCD";
        String s2="CBA";
        boolean b = checkAnagram(s1, s2);
        Assert.assertFalse(b);

    }
    @Test //edge
    public void example4(){
        String s1="AABCD";
        String s2="CBAD";
        boolean b = checkAnagram(s1, s2);
        Assert.assertFalse(b);

    }


    private boolean checkAnagram(String str1, String str2){

        if(str1.length()!=str2.length()){
            return false;
        }
        else {
            List<Character> anagram1 = new LinkedList<Character>();
            List<Character> anagram2 = new LinkedList<Character>();
            for (int i=0;i<str1.length();i++){
                anagram1.add(str1.toLowerCase().charAt(i));
                anagram2.add(str2.toLowerCase().charAt(i));
            }
            Collections.sort(anagram1);
            Collections.sort(anagram2);

            if(anagram1.equals(anagram2)){
               return true;
           }else
               return false;

        }

    }

}
