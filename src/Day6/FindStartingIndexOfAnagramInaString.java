package Day6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class FindStartingIndexOfAnagramInaString {

    /*

   1. Convert the p into a character array and add it to the map
2. Convert the s also into a char array and start iterating from left to right using sliding window (lenth of the window is length of p)
3. then add or update the string characters of length also into a map
4. If the maps matches then add the starting index of window into an arraylist
5. Keep doing the steps 3 ad 4
     */
    @Test
    public void example(){
        String s="abab";
        String p="ab";
        int[] output={0,1,2};
    }

    private int[] FindSubStringIndex(String str, String pattern){
        char[] chars = pattern.toCharArray();
        int left=0; int right=0;
        HashMap<Character,Integer> pMap=new HashMap<>();
        HashMap<Character,Integer>sMap=new HashMap<>();
        ArrayList index=new ArrayList<>();
        for (Character eachc:chars){
            pMap.put(eachc,pMap.getOrDefault(eachc,0)+1);
        }
        char[] schars = str.toCharArray();
        for (int i=0;i< pattern.length();i++){
            sMap.put(schars[i],sMap.getOrDefault(schars[i],0)+1);
            if(pMap.keySet().equals(sMap.keySet())){
                index.add(i-pattern.length());
            }else{
                left++;
            }
        }

return new int[] {-1,-1};
    }
}
