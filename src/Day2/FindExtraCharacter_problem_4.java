package Day2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FindExtraCharacter_problem_4 {
   /* Given 2 Strings with length n and (n+1) respectively. The second String contains all the characters of first but with an extra char. Write the code to find the extra char.
    Example 1:
    Input:
    A1 = "Test"
    A2 = "Test$"
    Output: '$'
    Example 2:
     --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints
   Input:
    A1 = "Test"
    A2 = "Test$"
    Output: '$'
    Constraints: open constraint

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code

      1. Convert the strings into a character array and add them to arraylist
      2. then subtract the first list from the second n+1 list
      3. then get the extra character and return



    */
   @Test //+ve
   public void example1() {
       String s1 = "Test";
       String s2 = "Test$";
       char extraChar = findExtraChar(s1, s2);
       Assert.assertEquals(extraChar,'$');
   }
    @Test //edge
    public void example2() {
        String s1 = "deep";
        String s2 = "deepu";
        findExtraChar(s1,s2);
        char extraChar = findExtraChar(s1, s2);
        Assert.assertEquals(extraChar,'u');

    }
    @Test //edge
    public void example3() {
        String s1 = "deep";
        String s2 = "deep";
        findExtraChar(s1,s2);
        char extraChar = findExtraChar(s1, s2);
        Assert.assertEquals(extraChar,' ');

    }
    @Test //edge
    public void example4() {
        String s1 = "Hello";
        String s2 = "lloreH";
        findExtraChar(s1,s2);
        char extraChar = findExtraChar(s1, s2);
        Assert.assertEquals(extraChar,'r');

    }


   private char findExtraChar(String s1, String s2){
       char c=' ';
       if(s1.length()==s2.length()){
           return c;
       }
       List<Character> l1=new ArrayList<Character>();
       List<Character> l2=new ArrayList<Character>();
       for (Character eachChar: s1.toLowerCase().toCharArray()){
           l1.add(eachChar);
       }
       for (Character eachChar: s2.toLowerCase().toCharArray()){
           l2.add(eachChar);
       }


       if(s1.length()>s2.length()){
           l1.addAll(l2);
           l1.removeAll(l2);
           c=l1.get(0);
           System.out.println(l1);
       }else{
           l2.addAll(l1);
           l2.removeAll(l1);
           c=l2.get(0);
           System.out.println(l2);
       }
       return c;



   }
}
