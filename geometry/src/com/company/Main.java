package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("type c for circle or t for triangle");
        char choice = in.nextLine().charAt(0);
        if (choice == 'c') {
            Circle circle = new Circle();
            System.out.println("Enter a to get area or p for perimeter");
            choice = in.nextLine().charAt(0);
            if (choice == 'a')
                System.out.println("Circle's area = " + circle.getArea());
            else if (choice == 'p')
                System.out.println("Circle's perimeter = " + circle.getCircumference());
        } else if (choice == 't') {
            Triangle triangle = new Triangle();
            System.out.println("Enter a to get area or p for perimeter");
            choice = in.nextLine().charAt(0);
            if (choice == 'a')
                System.out.println("Triangle's area = " + triangle.getArea());
            else if (choice == 'p')
                System.out.println("Triangle's perimeter = " + triangle.getPerimeter());
        }
    }
}
