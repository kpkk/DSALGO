package Day9HomeWork;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class StacksRemoveDuplicates {

    /*
    Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.
We repeatedly make duplicate removals on S until we no longer can.
Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.
Example 1:
Input: "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
Note: S consists only of English lowercase letters.
     */

    @Test
    public void example1(){
        String input="abbaca";
        String s = removeDups(input);
        Assert.assertEquals("ca",s);
    }
    @Test
    public void example2(){
        String input="abba";
        String s = removeDups(input);
        Assert.assertEquals("",s);
    }
    @Test
    public void example3(){
        String input="abc";
        String s = removeDups(input);
        Assert.assertEquals("abc",s);
    }
    @Test
    public void example4(){
        String input="";
       String s = removeDups(input);
        Assert.assertEquals("",s);
    }
    @Test
    public void example5(){
        String input="a";
        String s = removeDups(input);
        Assert.assertEquals("a",s);
    }
    /*
    Pseudo code-
    Time complexity- O[N]
    Space complexity- O[N]

    1. Convert the string into a character array
    2. Then add each character to the stack
    3. While adding check if the each element is present at the top(peek)
        - if so delete the existing element the don't add the current element
        - else add it to the top of stack
    4. append the stack elements to a string builder then return the reversed value

     */

    private String removeDups(String s){
        if(s.length()<2){
            return s;
        }

        char[] c = s.toCharArray();
        Stack<Character> st=new Stack();

        for (Character eachC:c)
        {
            if(!st.empty()&&st.peek()==eachC){
                st.pop();
            }else{
                st.push(eachC);
            }

        }
        StringBuilder sb=new StringBuilder();
        while (!st.empty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}
