/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miercoles;

/**
 *
 * @author CC-16
 */
abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("drawing rectangles :D");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("drawing circles :D");
    }
}

public class AbstractTest2{
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        new Rectangle().draw();
    }
}
