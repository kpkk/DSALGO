package Day13;

public class FindMaxMinIndex {

    /*

    Given a sorted integer array, return the first and last occurring index of the target integer
input={11,14,19,19,19,19,19,23,24}
target=19
output=[2,6]
input={11,14,17,18,19,20,23,24}
target=19
output=[4,4]
input={11,14,17,18,19,20,23,24}
target=16
output=[-1,-1]

time o{n}
space o{1}
Psedudo code:-

1. Initialize the left and right with default value -1.,-1
     */


    private int[] findIndices(int[] nums, int k){
        int left=-1, right=-1, n=nums.length;
        for (int i=0;i<n;i++){
            if(nums[i]==k && left==-1){
                left=i;
            }
            if(nums[i-1]==k && right==-1){
                right=n-1-i;

            }
            if(left!=-1 &&right!=-1){
                break;
            }
        }
        return new int []{left,right};
    }
}
