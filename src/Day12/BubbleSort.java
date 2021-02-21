package Day12;

import java.util.Arrays;

public class BubbleSort {

    //time- O[N2]
    //space- O[N]- array size
    public static void main(String[] args) {
        int[] arr={4,11,2,17,1,8,18,22};
        for (int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
//                    arr[i]+=arr[j];
//                    arr[j]=arr[i]-arr[j];
//                    arr[i]=arr[i]-arr[j];
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
