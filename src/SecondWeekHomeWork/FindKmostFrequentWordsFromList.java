package SecondWeekHomeWork;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindKmostFrequentWordsFromList {

    /*

    Given a non-empty list of words, return the k most frequent elements.

Your answer should be sorted by frequency from highest to lowest. If two words have the same frequency,
then the word with the lower alphabetical order comes first.

Example 1:
Input: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
Output: ["i", "love"]
Explanation: "i" and "love" are the two most frequent words.

Example 2:
Input: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
Output: ["the", "is", "sunny", "day"]
Explanation: "the", "is", "sunny" and "day" are the four most frequent words

  --------------------------------------------------------------
    Problem solving Template

    a) Did i under stand the question- Yes
    b) Do I know what is input, output and constraints
 Input: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
Output: ["the", "is", "sunny", "day"]

    Constraints: use hashing technique

    c) prepare test data (Minimum of 3 set)


      d ) Write the Pseudo code
     */

    @Test
    public void example1(){
        String[] words={"i", "love", "leetcode", "i", "love", "coding"};
        int k=2;
        String [] output={"i","love"};
        String[] frequentWords = findFrequentWords(words, k);
        Assert.assertArrayEquals(output,frequentWords);
    }

    @Test
    public void example2(){
        String[] words={"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k=4;
        String [] output={"the", "is", "sunny", "day"};
        String[] frequentWords = findFrequentWords(words, k);
        Assert.assertArrayEquals(output,frequentWords);
    }
    @Test
    public void example3(){
        String[] words={"i", "love", "leetcode", "i", "love", "coding"};
        int k=4;
        String [] output={"the", "is", "sunny", "day"};
        String[] frequentWords = findFrequentWords(words, k);
        Assert.assertArrayEquals(output,frequentWords);
    }

    /*

    Pseudo code
    1. Iterate from the left to right in the array
    2. create a hashmap with word as key and its occurrence as value and add each word into the map
       - while adding check if the word already exists, if so add the previous index to it
       - if not just add it
       - Then sort the map using java8 streams API basis the values in descending order
       - then return the array

     */

    private String[] findFrequentWords(String[] words, int k){
        HashMap<String,Integer> wMap=new HashMap<String, Integer>();

        for (int i = 0; i <words.length ; i++) {
           wMap.put(words[i],wMap.getOrDefault(words[i],0)+1);
        }
        List<String> collect = wMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                limit(k).flatMap(fm -> Stream.of(fm.getKey())).collect(Collectors.toList());

        String[] str=new String[collect.size()];
        int index=0;
        Iterator<String> iterator = collect.iterator();
        while (iterator.hasNext()){
            str[index++]=iterator.next();
        }

return str;
    }



}
