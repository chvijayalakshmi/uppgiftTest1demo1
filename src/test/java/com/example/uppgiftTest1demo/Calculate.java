package com.example.uppgiftTest1demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Calculate {
    Calculator c = new Calculator();
   @Test
    void additionShouldBeTrue(){
        int a=2, b=3;

        int Expected = 7;
        int Result = c.add(a,b);
       Assertions.assertEquals(Result,Expected);
    }
    @Test
    void sub(){
        int a=20;
        int b=5;
        int Expected = 15;
        int Result = c.subtract(a,b);
        Assertions.assertEquals(Result,Expected);
    }
    @Test
    void multiplication(){
        int a=2;
        int b=4;
        int Expected = 8;
        int Result = c.multiply(a,b);
        Assertions.assertEquals(Result,Expected);
    }
    @Test
    void division(){
        int a=10;
        int b=2;
        int Expected = 5;
        double Result = c.divide(a,b);
        Assertions.assertEquals(Result,Expected);
    }
    @Test
    void squareRute(){
        int a=2;
        double Result = c.squareRootOf(a);
        double Expected = 1.4142135623730951;

        Assertions.assertEquals(Result,Expected);
    }
    @Test
    void area(){
        int a=2;
       double Result = c.getArea(a);
        double Expected = 12.57;

        Assertions.assertEquals(Result,Expected);
    }
    @Test
    void areaForNegativeValue(){
        int a=-12;
        double Result = c.getArea(a);
        double Expected = Double.NaN;

        Assertions.assertEquals(Result,Expected);
    }

    @Test
    void circumference(){
        int a=5;
        double Result = c.getCircumference(a);
        double Expected = 31.42;

        Assertions.assertEquals(Result,Expected);
    }
    @Test
    void circumferenceForNegativeValue(){
        int a=-5;
        double Result = c.getCircumference(a);
        double Expected = Double.NaN;

        Assertions.assertEquals(Result,Expected);
    }

}
