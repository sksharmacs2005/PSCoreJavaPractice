package org.example;

public class FibonacciSeries {
    public static void main(String[] args) {

        int num=10;
        printFibonaicciSeries(num);

    }

    private static void printFibonaicciSeries(int num)
    {
        // 0 1 1 2 3 5 8 13

        int firstNum=0,secondNum=1;
        System.out.print(firstNum + " " + secondNum);
        for(int i=2;i<num;i++)
        {
            int nextNum=firstNum+secondNum;
            System.out.print(" " + nextNum);
            firstNum=secondNum;
            secondNum=nextNum;
        }
    }
    //Recursive using
    public static int fibonacci(int position) {
        System.out.print(".");
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return fibonacci(position - 1)
                + fibonacci(position - 2);
    }
}
