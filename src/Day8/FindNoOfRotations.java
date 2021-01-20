package Day8;

import org.junit.Before;
import org.junit.Test;

public class FindNoOfRotations {



    @Test
    public void example1(){
        int[] numbers={5,6,7,3,4};
        int rotations=3;
        int rot=findRotations(numbers);
        System.out.println(rot);
    }
    @Test
    public void example2(){
        int[] numbers={1,2,3,4};
        int rotations=0;
        int rot=findRotations(numbers);
        System.out.println(rot);
    }

    private int findRotations(int[] numbers) {
        if (numbers[0]<numbers[numbers.length-1]){
            return 0;
        }
       return recursive(numbers,0,numbers.length-1);

    }

    private int recursive(int[] numbers, int left, int right){
        if(left==right){
            return left;
        }
        int mid= (left+right)/2;
        if(mid<right && numbers[mid+1]<numbers[mid])
            return mid+1;
        if(mid>left && numbers[mid]<numbers[mid-1])
            return mid;

        if(numbers[right]> numbers[left]){
            return recursive(numbers,left,mid-1);
        }
        else{
            return recursive(numbers,mid+1,right);
        }

    }
}
