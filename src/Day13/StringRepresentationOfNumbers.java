package Day13;

import org.junit.Test;

import java.util.Arrays;

public class StringRepresentationOfNumbers {

    /*

    Write a program that outputs the string representation of numbers from 1 to n.
But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
For numbers which are multiples of both three and five output “FizzBuzz”.
n = 15,
Return: ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]

Pseudo code
1. traverse through the each number until n
2. check if its divisible by 3 - print "Fuzz"
3. by 5-> Buzz
4. by 15--> FizzBuzz
5. else print the number as is

Time complexity= 0[N]
Space complexity= 0[N]

     */
    @Test
    public void test1(){
        int n=20;
        String[] strings = fizzBuzz(n);
        System.out.println(Arrays.toString(strings));
    }
    @Test
    public void test2(){
        int n=2;
        String[] strings = fizzBuzz(n);
        System.out.println(Arrays.toString(strings));
    }
    @Test
    public void test3(){
        int n=7;
        String[] strings = fizzBuzz(n);
        System.out.println(Arrays.toString(strings));
    }

    private String[] fizzBuzz(int n){
        String[] s=new String[n];
        for (int i=1;i<=n;i++){
            if(i%15==0){
                s[i-1]="FizzBuzz";
            }
            else if(i%3==0){
                s[i-1]="Buzz";
            }
            else if(i%5==0){
                s[i-1]="Buzz";
            }else{
                s[i-1]=""+i+"";
            }
        }

        return s;
    }
}
