package thirdWeekHomeWork;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class IsoMorphicStringsCheck {

    /*

Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true
Example 2:
Input: s = "foo", t = "bar"
Output: false
Example 3:
Input: s = "paper", t = "title"
Output: true
Note:
You may assume both s and t have the same length.

--------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints
 Input: s = "egg", t = "add"
Output: true
    Constraints: use hashing technique

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code

     */
    @Test
    public void example1(){
        String s="egg";
        String t="add";
        boolean output= true;
        boolean b = checkIsomorphic(s, t);
        Assert.assertEquals(b,output);
    }
    @Test
    public void example2(){
        String s="foo";
        String t="bar";
        boolean output= false;
        boolean b = checkIsomorphic(s, t);
        Assert.assertEquals(b,output);
    }
    @Test
    public void example3(){
        String s="paper";
        String t="title";
        boolean output= true;
        boolean b = checkIsomorphic(s, t);
        Assert.assertEquals(b,output);
    }

    /*
    Convert the strings into a character arrays
    create a hashmap with character as key and its occurrence as value then add the values
    then get the map values from both the maps and check if they are equal or not
    if they are same return true
     */

    private boolean checkIsomorphic(String s, String t){
        HashMap<Character,Integer>sMap=new HashMap<Character,Integer>();
        HashMap<Character,Integer>tMap=new HashMap<Character,Integer>();

        if(s.length()!=t.length()){
            return false;
        }

        for (int i=0;i<s.length();i++){
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i=0;i<t.length();i++){
            tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i),0)+1);
        }
        ArrayList<Integer>a1=new ArrayList<Integer>(sMap.values());
        ArrayList<Integer>a2=new ArrayList<Integer>(tMap.values());
        if(a1.equals(a2)){
            return true;
        }

      return false;

    }
}
