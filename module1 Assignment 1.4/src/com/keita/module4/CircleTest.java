package com.keita.module4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    //partition
    /*
    radius is positive
    radius is negative
    Boundary Cases
    radius = 0.1, 0, -0.1
     */

    /**
     * partitioned the inputs as follows
     * radius -> positive
     * radius -> negative
     *
     * radius = 0.1, 0, -0.1
     */

    @Test public void testRadiusPositive(){
        //radius = 2 & area = 4 * 3.14
        //radius = 3.3 & area = 10.89 * 3.14
        //radius = 120 & area = 14400 * 3.14
        assertEquals(4 * 3.14, new Circle(2).getArea(),.001);
        assertEquals(10.89 * 3.14, new Circle(3.3).getArea(),.001);
        assertEquals(14400 * 3.14, new Circle(120).getArea(), .001);
    }

    @Test public void testBoundaries(){
        // 0.1 * 0.1 * 3.14
        // 0 * 0 * 3.14
        // -0.1 * -0.1 * 3.14
        assertEquals(0.1 * 0.1 * 3.14, new Circle(0.1).getArea(),.001);
        assertEquals(0 * 0 * 3.14, new Circle(0).getArea(), .001);
    }
}