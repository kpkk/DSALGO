package Day15;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class CheckPalindrome {

    /*

    Palindrome
Given a string, determine if a permutation of the String could form a palindrome
Input: “Babu”
Output: false
Input: “aab"
Output: true
You can solve this problem either using Map or Set !! -> O(n) time complexity and O(1) -> Space complexity !!
     */

    @Test
    public void test1(){
        String input="aab";
        Assert.assertEquals(true, checkPalindrome(input));

    }
    @Test
    public void test2(){
        String input="deepu";
        Assert.assertEquals(true, checkPalindrome(input));

    }

    /*
    Pseudo code:-
 1. create a hashset of characters
 2. get the each character from the string to the hashset
 3. if the character

//Time complexity-o[n]
    //space-o[n]
     */
    private boolean checkPalindrome(String str){

        HashMap<Character,Integer> map=new HashMap<>();
        HashSet<Character>set=new HashSet<>();
        int count=0;
        for (Character ch:str.toCharArray()) {
            if(!set.add(ch)){
                set.remove(ch);
            }
        }


        return set.size()<=1;



    }
}
