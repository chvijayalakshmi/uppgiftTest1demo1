package com.example.uppgiftTest1demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return (double) a / (double) b;
    }

    public double squareRootOf(int a) {
        return Math.sqrt(a);
    }

    public double getArea(int a) {
        if (a < 0) {
            return Double.NaN;
        }
        double area = Math.PI * (a * a);
        return Math.round(area * 100.0) / 100.0;
    }

    public double getCircumference(int a) {
        if (a < 0) {
            return Double.NaN;
        }
        double circumference = Math.PI * 2 * a;
        return Math.round(circumference * 100.0) / 100.0;
    }

    public static void main(String[] args) {

        SpringApplication.run(Calculator.class, args);
        /*Calculator c = new Calculator();
        double r = c.getCircumference(-4);
        System.out.println(r);*/
    }
}
