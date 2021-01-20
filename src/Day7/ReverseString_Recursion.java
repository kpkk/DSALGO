package Day7;

import org.junit.Assert;
import org.junit.Test;

public class ReverseString_Recursion {

    /*
    Reverse a given string using recusrion technique
    ex input= hello
    output= olleh

     --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints
    input= hello
    output= olleh

    Constraints: use recursion technique

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code

      1. just convert the string into a character array then iterate from last index to first
      2. then print the string
     */
    @Test
    public void example1(){
        String input="hello";
        String output="olleh";
        String s = reverseString(input);
        Assert.assertEquals(output,s);
       // revreseUsingRecursion(input);

    }
    @Test
    public void example2(){
        String input="aa";
        String output="aa";
        String s = reverseString(input);
        Assert.assertEquals(output,s);


    }

    private String reverseString(String str){
        char[] chars = str.toCharArray();
        String revStr="";
        int index=0;
        char[] chars2=new char[str.length()];
        for (int i=chars.length-1;i>=0;i--){
            chars2[index++]=chars[i];
        }

        for (char eachC:chars2) {
            revStr+=eachC;

        }
        return revStr;
    }
    /*

    call
     */

    private void revreseUsingRecursion(String str){
        //str="pradep";
        String revStr="";

       // revStr+=str.charAt(revStr.length())+revreseUsingRecursion(str);
        System.out.println(revStr);


    }
}
