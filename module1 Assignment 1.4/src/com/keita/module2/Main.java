package com.keita.module2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<TwoDShape> twoDShapes = new ArrayList<>();
        twoDShapes.add(new Circle(1));
        twoDShapes.add(new Triangle(1,2));


        for (int i = 0; i < twoDShapes.size(); i++){
            System.out.println(twoDShapes.get(i));
        }
    }
}
