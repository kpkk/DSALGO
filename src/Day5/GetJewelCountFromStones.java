package Day5;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class GetJewelCountFromStones {

    /*

    You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
	Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
Letters are case sensitive, so "a" is considered a different type of stone from "A".
Example 1:
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:
Input: jewels = "z", stones = "ZZ"
Output: 0
Constraints:
1 <= jewels.length, stones.length <= 50
jewels and stones consist of only English letters.
All the characters of jewels are unique.

--------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints
 Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

    Constraints: use hashing technique also solve in brute force

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code
     */
    @Test
    public void example1() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int output = 3;
        int i = bruteForce_getJewelCount(jewels, stones);
        int i1 = hashing_getJewelCount(jewels, stones);
        Assert.assertEquals(output, i1);
        Assert.assertEquals(output, i);
    }

    @Test
    public void example2() {
        String jewels = "z";
        String stones = "ZZ";
        int output = 3;
        int i = bruteForce_getJewelCount(jewels, stones);
        Assert.assertEquals(output, i);
        int i1 = hashing_getJewelCount(jewels, stones);
        Assert.assertEquals(output, i1);
    }

    @Test
    public void example3() {
        String jewels = "z";
        String stones = "abc";
        int output = 0;
        int i = bruteForce_getJewelCount(jewels, stones);
        Assert.assertEquals(output, i);
        int i1 = hashing_getJewelCount(jewels, stones);
        Assert.assertEquals(output, i1);
    }

    /*

    Pseudo code:-
    Time complexity- O[mxn]
    Space comlexity- o[n]
    1. Declare a variable called count, Iterate through the jewel character sequence
    2. Write an inner for loop to iterate between the stones
    3. Then compare each character, if the both i, j are same increment count
    4. return count
     */
    private int bruteForce_getJewelCount(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }

        }
        return count;

    }
    /*

    1. Declare a hashmap to store all the values, and count variable
    2. Iterate through the stones char sequence and put it in map
    3. Then in another for loop, iterate the jewels and check if it exists
    4. every time there is a character occurrence increment count then return it
     */

    private int hashing_getJewelCount(String jewel, String stones) {
        int count = 0;
        HashMap<Character, Integer> stonesMap = new HashMap<Character, Integer>();
        for (Character c : stones.toCharArray()) {
            stonesMap.put(c, stonesMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < jewel.length(); i++) {
            count += stonesMap.getOrDefault(jewel.charAt(0), 0);
        }

        return count;
    }
}
