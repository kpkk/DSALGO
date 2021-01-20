package Day7;

import org.junit.Test;

public class PrintPascalTriangle_Recursion {

    /*
    print the pascal tringle's kth row using recusrion technique
     */

    /*

    Pseudo code:
    1. initialize the two variables called column and row and set values as 0
    2. if the column index is zero or the row index equals to column index then print1
    3. else the value shoould be sum of last row's colum index+ column index-1
     */

    @Test
    public void example1(){
        int k=5;
        int i = printPascal(k, 3);
        System.out.println(i);
        callRecursively(5);
    }

    private void callRecursively(int k){
        for (int i=1;i<=k;i++){
            for (int j=1;i<=j;j++){
                System.out.print(printPascal(i,j)  +" ");
            }
            System.out.println("");
        }
    }
    private int printPascal(int row, int col) {

        if(col==1|| col==row){
            return 1;
        }
        return printPascal(row-1,col)+printPascal(row-1,col-1);

    }
}
