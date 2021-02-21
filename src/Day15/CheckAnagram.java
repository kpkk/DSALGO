package Day15;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;

public class CheckAnagram {

    /*
Given 2 String, confirm if both of them are anagram to itself
str1 = “money”
Str2 = “onemy"
Output: true
str1 = “money”
Str2 = “hoemy"
Output: false
     */
    @Test
    public void test1(){
        String str="money";
        String str2="onemy";
        Assert.assertEquals(true,checkAnagram(str, str2));

    }
    @Test
    public void test2(){
        String str="money";
        String str2="hoemy";
        Assert.assertEquals(true,checkAnagram(str, str2));

    }
    @Test
    public void test3(){
        String str="malayalam";
        String str2="layalamma";
        Assert.assertEquals(true,checkAnagram(str, str2));

    }
    @Test
    public void test4(){
        String str="aabb";
        String str2="aaab";
        Assert.assertEquals(true,checkAnagram(str, str2));

    }

    private boolean checkAnagram(String str1, String str2){

        if(str1.length()!=str2.length()){
            return false;
        }
        HashMap<Character,Integer> map1=new HashMap<Character, Integer>();
        HashMap<Character,Integer> map2=new HashMap<Character, Integer>();

        char[] ch1=str1.toCharArray();
        char[] ch2=str1.toCharArray();
        for (Character ch:ch1) {
            map1.put(ch, map1.getOrDefault(ch,0)+1);
        }
        for (Character ch:ch2) {
            map2.put(ch, map2.getOrDefault(ch,0)+1);
        }
       return map1.equals(map2);
    }
}
