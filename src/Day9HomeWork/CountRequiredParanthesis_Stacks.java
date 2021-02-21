package Day9HomeWork;

import org.junit.Test;

import java.util.HashMap;
import java.util.Stack;

public class CountRequiredParanthesis_Stacks {

    /*

    Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid.
Formally, a parentheses string is valid if and only if:
It is the empty string, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.
SAMPLE INPUT
()))((
SAMPLE OUTPUT
4
Explanation
The given string can be balanced to "((()))(())", requiring 4 more paranthesis minimum.
     */

    @Test
    public void example1(){
        String input="()))((";
        int output=4;
        countParanthesis(input);
    }
    @Test
    public void example2(){
        String input="(())";
        int output=0;
        countParanthesis(input);
    }
    @Test
    public void example3(){
        String input="(()))";
        int output=1;
        countParanthesis(input);
    }
    @Test
    public void example4(){
        String input="(";
        int output=1;
        countParanthesis(input);
    }

    /*
    Pseudo code:-
    1. Convert the string into an array of characters
    2. then add the character into the stack
        - while adding check if the stack is not empty and also the stack has '(' at top
           and is the current character is equal to ')'
         - Then remove the character from the stack and skip the current element
    3. Add the other elements into the stack
    4. then return the stack size

    Time complexity- O[N]
    Space complexity- O[N]
     */
    private int countParanthesis(String str){
        if(str.length()==0){
            throw new RuntimeException("invalid string input..");
        }
        if(str.length()==1){
            return 1;
        }
        char[] chars = str.toCharArray();
        Stack<Character>stack=new Stack<>();
        for (Character c:chars) {
            if(!stack.empty()&&stack.peek()=='('&&c==')'){
             stack.pop();
            }else{
                stack.push(c);
            }
        }


return stack.size();
    }
}
