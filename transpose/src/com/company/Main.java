package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, c;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        r = in.nextInt();

        System.out.print("Enter number of columns: ");
        c = in.nextInt();

        int[][] matrix = new int[r][c], transposedMatrix = new int[c][r];
        System.out.println("Enter matrix elements");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                matrix[i][j] = in.nextInt();
                transposedMatrix[j][i] = matrix[i][j];
            }

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++)
                System.out.print(transposedMatrix[i][j] + " ");
            System.out.println("");
        }
    }
}
