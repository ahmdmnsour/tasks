package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter ANYTHING and I will remove all commas");
        String s = new Scanner(System.in).nextLine();

        // Checking every character in the string if it is a comma or not
        // if it is not, it will be printed
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != ',') System.out.print(s.charAt(i));
    }
}
