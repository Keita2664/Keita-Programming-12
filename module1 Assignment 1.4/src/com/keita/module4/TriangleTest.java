package com.keita.module4;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    //Partition
    /*
    Height is positive & width is positive
    Boundary Cases
    Height is 0 & width is positive
    Height is positive & width is 0
    Height = 0.1
    Width = 0.1
     */

    /**
     * partitioned the inputs as follows
     * Height -> positive
     * Width -> negative
     *
     * Height = 0.1, 0
     * Width = 0.1, 0
     */

    @Test public void testHeightAndWidthArePositive(){
        // height = 2 & width = 2
        // height = 44 & width = 12
        // height = 120 & width = 1
        assertEquals(2 * 2 / 2, new Triangle(2,2).getWidth(),.001);
        assertEquals(12 * 44 / 2, new Triangle(12,44).getArea(), .001);
        assertEquals(1 * 120 / 2, new Triangle(1,120).getArea(), .001);
    }

    @Test public void testBoundaries(){
        // height = 12 & width = 0
        // height = 12 & width = 0.1
        // height = 0 & width = 12
        // height = 0.1 & width = 12

        assertEquals(0 * 12 / 2, new Triangle(0,12).getArea(),.001);
        assertEquals(0.1 * 12 / 2, new Triangle(0.1,12).getArea(),.001);
        assertEquals(12 * 0 / 2, new Triangle(12,0).getArea(), .001);
        assertEquals(12 * 0.1 / 2, new Triangle(0.1,12).getArea(), .001);
    }

}