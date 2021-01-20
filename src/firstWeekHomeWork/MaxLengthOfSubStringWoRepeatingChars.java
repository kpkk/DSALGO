package firstWeekHomeWork;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MaxLengthOfSubStringWoRepeatingChars {

    /*
Longest substring without repeating characters
Input: s="abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3
Input: s="bbbbb"
Output: 1
Explanation: The aswer is "b", with the length of 1
Input: s="pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3
Notice that the answer must be a substring, "pwke" is a subsequence not a substring.

        --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints

 Input: s="abcabcbb"
Output: 3


    Constraints: use set

    c) prepare test data (Minimum of 3 set)


    d ) Write the Pseudo code

    1. Take the string parameter as input
    2. check if the length of the string is zero then return zero as max length
    3. initialze a maxlen variable to -1 initially
    4. also declare a set to add the characters as we iterate from left to right
    5. if at all the addition oprtaion in set returns false, we then find the current length and compare it with existing max length
    6. The max length would then be assigned to the maxlenth variable itself
    7. then break the loop
    8. finally return the mxLen int value
     */
    @Test
    public void example1(){
        String input="abcabcbb";
       int output= 3;
        int lengthOfSubstring = findLengthOfSubstring(input);
        Assert.assertEquals(output,lengthOfSubstring);


    }
    @Test
    public void example2(){
        String input="pwwkew";
        int output= 3;
        int lengthOfSubstring = findLengthOfSubstring(input);
        Assert.assertEquals(output,lengthOfSubstring);


    }
    @Test
    public void example3(){
        String input="bbbbb";
        int output= 1;
        int lengthOfSubstring = findLengthOfSubstring(input);
        Assert.assertEquals(output,lengthOfSubstring);


    }
    @Test
    public void example4(){
        String input="";
        int output= 0;
        int lengthOfSubstring = findLengthOfSubstring(input);
        Assert.assertEquals(output,lengthOfSubstring);


    }
    private int findLengthOfSubstring(String str){
        if(str.length()==0){
            return 0;
        }
        Set<Character> set=new HashSet<>();
        int maxLen=-1;

        for (int start=0;start<str.length();start++){

            for (int end=start;end<str.length();end++){
                if(!set.add(str.charAt(end))){
                    maxLen=Math.max(maxLen,end-start);
                    break;
                }
            }
            set.clear();
        }
        return maxLen;


    }
}
