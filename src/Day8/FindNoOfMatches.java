package Day8;

import org.junit.Assert;
import org.junit.Test;

public class FindNoOfMatches {

    /*
    Pseudo code:-
    inputs:- number of teams
    what to find? number of matches
    formula :-
    even: no of matches= no of teams/2
    odd: no of matches= no of teams-1/2
    read the input the number of matches which is n
    if the n value is even, then do n/2
    if the n value is odd then do n-1/2
    call this recursively until n=1
     */

    @Test
    public void example(){
        int teams=4;
        int matches=2;
        int i = noOfMatches(teams);
        Assert.assertEquals(matches,i);
    }

//    private int initiator(int teams){
//        if(teams<2)
//            return 0;
//        if(teams>1&& teams%2==1){
//            noOfMatches((teams-1)/2);
//        }
//        if(teams>1&&teams%2==0){
//            noOfMatches((teams)/2);
//        }
//    }

    private int noOfMatches(int teams){

        if(teams<2)
            return 0;
        if(teams>1&& teams%2==1){
            noOfMatches((teams-1)/2);
        }
        if(teams>1&&teams%2==0){
            noOfMatches((teams)/2);
        }
        return teams;
    }
}
