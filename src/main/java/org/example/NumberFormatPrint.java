package org.example;

public class NumberFormatPrint {
    public static void main(String[] args) {
        int rows = 5; // You can change the number of rows as needed

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to the next line after printing the numbers in the row
            System.out.println();
        }
    }
}
