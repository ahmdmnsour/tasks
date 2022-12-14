package com.company;

import java.util.Scanner;

class Triangle {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    Triangle() {
        System.out.print("Enter first side value: ");
        firstSide = new Scanner(System.in).nextDouble();
        System.out.print("Enter second side value: ");
        secondSide = new Scanner(System.in).nextDouble();
        System.out.print("Enter third side value: ");
        thirdSide = new Scanner(System.in).nextDouble();
    }

    double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    double getArea() {
        double s = getPerimeter()/2;
        return Math.sqrt(s*(s-firstSide)*(s-secondSide)*(s-thirdSide));
    }
}
