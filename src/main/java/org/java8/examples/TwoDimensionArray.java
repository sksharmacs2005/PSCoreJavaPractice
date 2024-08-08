package org.java8.examples;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int row_length=3;
        int col_length=3;
        int[][] twoDimArray=new int[row_length][col_length];

        int count=1;
        for(int i=0;i<row_length;i++)
        {
            for(int j=0;j<col_length;j++)
            {
                twoDimArray[i][j]=count;
                count++;

            }

        }//reat
        for(int i=0;i<row_length;i++)
        {
            for(int j=0;j<col_length;j++)
            {
                System.out.print( twoDimArray[i][j] +  "|" );
            }
            System.out.println();
        }
        System.out.println("*************************");
        //update
        twoDimArray[2][2]=20;
        for(int i=0;i<row_length;i++)
        {
            for(int j=0;j<col_length;j++)
            {
                System.out.print( twoDimArray[i][j] +  "|" );
            }
            System.out.println();
        }
        System.out.println("*************************");
        //delete
        twoDimArray[2][2]=-1;

        for(int i=0;i<row_length;i++)
        {
            for(int j=0;j<col_length;j++)
            {
                System.out.print( twoDimArray[i][j] +  "|" );
            }
            System.out.println();
        }
    }
}
