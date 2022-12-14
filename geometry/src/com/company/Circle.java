package com.company;

import java.util.Scanner;

class Circle {
    private double radius;

    private final double pi = 3.14;

    Circle() {
        System.out.print("Enter circle's radius: ");
        radius = new Scanner(System.in).nextDouble();
    }

    double getArea() {
        return radius*radius*pi;
    }

    double getCircumference() {
        return 2*radius*pi;
    }
}
