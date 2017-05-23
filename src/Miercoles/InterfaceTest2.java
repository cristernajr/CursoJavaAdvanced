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
interface Drawable{
    void draw();
}
class Rectangle3 implements Drawable{

    @Override
    public void draw() {
        System.out.println("drawing a rectangle");  
    }
}
class Circle3 implements Drawable{

    @Override
    public void draw() {
        System.out.println("drawing a circle");  
    }
}
public class InterfaceTest2 {
    public static void main(String[] args) {
        Drawable d = new Circle3();
        d.draw();
    }
}
