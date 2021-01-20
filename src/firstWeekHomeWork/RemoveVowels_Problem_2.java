package firstWeekHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class RemoveVowels_Problem_2 {

    /*

    iven a string, remove the vowels from the string and print the string without vowels.
Input : youwillwinthis
Output : ywllwnths

Input : what is your name ?
Output : wht s yr nm ?

 --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints

  Input : youwillwinthis
Output : ywllwnths

Input : what is your name ?
Output : wht s yr nm ?

   Constraints: case sensitive

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code
      1. Take the string parameter then convert that into a character array
      2. Iterate the array from left to right
      3. Check each character whether or not it is a vowel
      4. if it vowel remove that and else add it to the another array
      5. convert the array into string and return the same


     */

    @Test
    public void example1(){
        String s="youwillwinthis";
        String output="ywllwnths";
        String s1 = removeVowels(s);
        Assert.assertEquals(s1,output);
    }
    @Test
    public void example2(){
        String s="WhAtIsYOuoa";
        String output="WhtsY";
        String s1 = removeVowels(s);
        Assert.assertEquals(s1,output);
    }
    @Test
    public void example3(){
        String s="bdc";
        String output="bdc";
        String s1 = removeVowels(s);
        Assert.assertEquals(s1,output);
    }
    @Test
    public void example4(){
        String s="aeiou";
        String output="";
        String s1 = removeVowels(s);
        Assert.assertEquals(s1,output);
    }

    private String removeVowels(String s){
        char[] ch = s.toCharArray();
        String str="";
        for (char eachChar:ch
             ) {
            if(eachChar=='a'||eachChar=='A'||eachChar=='e'||eachChar=='E'||eachChar=='i'||eachChar=='I'||eachChar=='o'||eachChar=='O'||eachChar=='u'||eachChar=='U'){
                continue;
            }else{
                str=str+eachChar;
            }
        }
        return str;
    }
}
