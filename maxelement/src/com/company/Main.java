package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        System.out.println("The biggest number in the array is " + getMax(arr, n));
    }

    static int getMax(int[] arr, int size) {
        // giving a value to max variable arbitrarily
        int max = arr[0];

        for (int il : arr)
            if (max <= il) max = il;

        return max;
    }
}
