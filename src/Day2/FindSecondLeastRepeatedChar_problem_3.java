package Day2;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindSecondLeastRepeatedChar_problem_3 {

    /*
    Find the second least repeating character in a given string
Example:
Input: "tesla-service" Output: s
Solve using Map
--------------------------------------------------------------
    Problem solving Template

    a) Did i understand the question- Yes
    b) Do I know what is input, output and constraints
   Input: tesla-service
   Output: s
    Constraints: we have to solve with map

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code

     */

    @Test
    public void example1() {
        String s = "tesla-service";
        char output = 's';
        findSecondLeastRepeatedChar(s);

    }

    private char findSecondLeastRepeatedChar(String s){

        char[] chars = s.toLowerCase().toCharArray();
        Map<Character,Integer> map=new HashMap<Character,Integer>();

        for (char eachChar:chars) {
            map.put(eachChar,map.getOrDefault(eachChar,0)+1);

        }
        int minCount=Integer.MAX_VALUE;
        char ch =' ';
        for (Map.Entry<Character,Integer> eachEntry:map.entrySet()){
          //  System.out.println(eachEntry.getKey());
            Integer value = eachEntry.getValue();
           minCount= Math.max(minCount,value);
           if(minCount==value){
               ch=eachEntry.getKey();
           }

        }
        System.out.println(minCount);
        System.out.println(ch);
        return ch;




    }
}
