package Day3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ReverseVowels_Two_pointer_Algo {

    /*
    Write a function that takes a string as input and reverse only the vowels of the string
Input: Babu
Output: Buba
Input: winnerofcode
Output: wennorofcedi

    --------------------------------------------------------------
    Problem solving Template

    a) Did i understand the question- Yes
    b) Do I know what is input, output and constraints
   Input: Babu
Output: Buba
Input: winnerofcode
Output: wennorofcedi
    Constraints: use two pointer algorithm

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code
      1. Initialize the left index and set the index value as 0
      2. then initialize the ending index and set the ending index as string.length
      3. Check if the left index and right index are vowels, if so swap values
      4. else move the let index towards right by one and right index towards left by one
      5. repeat step3 until the left and right are same

     */

    @Test
    public void example1(){
       String input="Babu";
       String output="Buba";
        String s = reverseVowels_two_pointer(input);
        Assert.assertEquals(output,s);

    }
    @Test
    public void example2(){
        String input="winnerofcode";
        String output="wennorofcedi";
        String s = reverseVowels_two_pointer(input);
        Assert.assertEquals(output,s);

    }
    @Test
    public void example3(){
        String input="rhythm";
        String output="rhythm";
        String s = reverseVowels_two_pointer(input);
        Assert.assertEquals(output,s);


    }

    private String reverseVowels_two_pointer(String str){
        int left=0;
        int right= str.length()-1;
        char[] chars = str.toCharArray();
        String newStr="";
        char temp=' ';
        if(str.trim().length()<2){
            return str;
        }

        while(left<right) {

            if (isVowel(chars[left]) && isVowel(chars[right])) {
                temp = chars[left];
                chars[left] = chars[right];
                chars[right]=temp;
                left++;
                right--;

            }
            else if(!isVowel(chars[left])){
                left++;
            }
            else if(!isVowel(chars[right])){
                right--;
            }
        }
        for (char eachChar:chars){
            newStr+=eachChar;
        }

        return newStr;
    }



    private boolean isVowel(char ch){
        boolean check=false;
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            check=true;
            return check;
    }

}

