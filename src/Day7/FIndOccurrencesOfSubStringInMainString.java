package Day7;

public class FIndOccurrencesOfSubStringInMainString {

    /*

    given a main string find the occurrences of th substring

    input= "welcome to world, to do something great to everyone"
    substring="to"
    output=3
     */

    /*
    Pseudo code:
    1. use regex to match the substring count then call recursively
     */

    private int findMatches(String mStr, String sStr){
        String[] s = mStr.split(" ");

        boolean matches= mStr.matches("to");
        int count=0;
        if(matches){
            count++;
        }
        findMatches(mStr,sStr);
        return count;
    }
}
