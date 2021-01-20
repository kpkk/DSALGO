package Day2;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class FindUniqueChars_problem_2 {

    /*

     5) Find unique characters in a given string.
Input: Testleaf
Output: a, s, f, l

--------------------------------------------------------------
    Problem solving Template

    a) Did i understand the question- Yes
    b) Do I know what is input, output and constraints
   Input: Testleaf
   Output: a, s, f, l
    Constraints: we have to solve with set

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code
      1. Take the input string and convert that into a character array
      2. Then declare two sets one to store the unique chars and other one to duplicate chars
      3. then check for conditions
        i) if the set contains the character already
        ii)if the duplicates set contains the character already
      4. if both have the character then remove that
      5. else add it to the set as long as the array has elements
      6. Then convert the set into array and return the same

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
    @Test
    public void example1() {
        String s = "Testleaf";
        char[] output = {'a', 's', 'f', 'l'};
        char[] uniqueChars = findUniqueChars(s);
        Assert.assertArrayEquals(uniqueChars, output);

    }

    @Test
    public void example2() {
        String s = " Pradeep $#$ ";
        char[] output = {'a', 'r', '#', 'd'};
        char[] uniqueChars = findUniqueChars(s);
        Assert.assertArrayEquals(uniqueChars, output);

    }

    @Test
    public void example3() {
        String s = "aaaa";
        char[] output = {};
        char[] uniqueChars = findUniqueChars(s);
        Assert.assertArrayEquals(uniqueChars, output);


    }

    @Test
    public void example4() {
        String s = "abcd";
        char[] output = {'a', 'b', 'c', 'd'};
        char[] uniqueChars = findUniqueChars(s);
        Assert.assertArrayEquals(uniqueChars, output);
    }



    private char[] findUniqueChars(String str) {

        char[] ch = str.toLowerCase().toCharArray();
        Set<Character> unirqueChars = new HashSet<Character>();
        Set<Character> dupChars = new HashSet<Character>();
        List<Character> al=new ArrayList<Character>();
       // char[] ch2= new char[];

        for (Character eachChar : ch) {
            if (unirqueChars.contains(eachChar) || dupChars.contains(eachChar)) {
                unirqueChars.remove(eachChar);
                dupChars.add(eachChar);
            }
            else {
                unirqueChars.add(eachChar);

            }

        }
        al.addAll(unirqueChars);
        char[] ch2=new char[al.size()];
        //Character[] objects = al.toArray();
        for (int i=0;i<al.size();i++) {
            ch2[i]=al.get(i);

        }
        System.out.println(unirqueChars);
        return ch2;




    }


}













