package practise;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArraysEg {

    /*
    problem solving template
    1. did I understand the problem - yes
        - if no ask for more details, with examples
        -if yes go to the next step

    2. what is the input(s)? - two input arrays
     int [] nums1={11,2,12,1};
        int[] nums2={2,12};

    3. what is the expected output - its an array with common elements from both the arrays

    4. Are there any constraints to solve the problem - i.e. any specific conditions- No

    5. do I've all the information to go to the next step- yes

    6. How big is your test data set will be? - 3 sets
    7. Test data set
         - minimum of 3 data set, positive, edge and negative
         - validate with the interviewer that the designed data set is fine
    8. Do I know how to solve the problem
         - Yes, great is there an alternate?
         - No, ask for a hint
         - try to break the problem into smaller chunks


    9. Write the Pseudo code for the brute force
    10. Implement the coding as per the Pseudo code written
    11. Test the code against the test data for better validation
        - if at all something fails, then debug the code
    12. calculate the order of n O-notation


     */

    @Test //+ve
    public void testData1(){
        int [] nums1={11,2,12,1};
        int[] nums2={2,12};
        int[] resultArray = compareArrays(nums1, nums2);
        Assert.assertEquals(true, Arrays.equals(resultArray, new int[]{2,12}));
    }
    @Test //edge
    public void testData2(){
        int [] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        int[] resultArray = compareArrays(nums1, nums2);
        Assert.assertEquals(true,Arrays.equals(resultArray, new int[]{4,9}));
    }


    @Test //-ve
    public void testData3(){
        int [] nums1={0,0,0,0};
        int[] nums2={2,12};
        int[] resultArray = compareArrays(nums1,nums2);
        Assert.assertEquals(true,Arrays.equals(resultArray, new int[]{}));
    }
    /*

    Pseudo code :- brute force
    1. First read the two input arrays and calculate thier length
    2. Iterate the smaller array from left to right
    3. Iterate the bigger array in side the loop from left to right
    4. If the number at the index from both the arrays is equal then add it to the list
    5. Before adding to the list make sure we check, if its already present, if so dont add duplicate
    6. Then declare an array of array list size as that should be the return type
    7. Initialize a variable called index and set its value to "0"Add all the elements then return the same
     */

    private int[] compareArrays(int[]nums1,int[]nums2){
        ArrayList<Integer>commonEle=new ArrayList<Integer>();
        int[] biggestArr;
        int[] smallestArr;

        if(nums1.length<nums2.length){
            smallestArr=nums1;
            biggestArr=nums2;
        }else{
            smallestArr=nums2;
            biggestArr=nums1;
        }

            for (int i=0;i<smallestArr.length;i++){
                for (int j=0;j<biggestArr.length;j++){
                    if(biggestArr[j]==smallestArr[i]){
                        if(commonEle.contains(biggestArr[j]))
                            continue;
                        else
                        commonEle.add(biggestArr[j]);
                    }
                }
            }

            // logic to convert the array list into
        int[] interSectionArr=new int[commonEle.size()];
        int index=0;
        Iterator<Integer> iterator = commonEle.iterator();
        while (iterator.hasNext()){
            interSectionArr[index++]=iterator.next();
        }

        return interSectionArr;
    }


}
