package org.java8.examples;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 6; // Number of rows
        generatePascalsTriangle(n);
    }

    public static void generatePascalsTriangle(int n) {
        int[][] triangle = new int[n][n];

        // Generate Pascal's Triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }

        // Print Pascal's Triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
