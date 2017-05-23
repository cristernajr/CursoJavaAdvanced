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
public class Animal {
    void eat(){
        System.out.println("Comiendo...");
    }
}
class dog extends Animal{
    void run(){
        System.out.println("Corriendo...");
    }
}
class prueba{
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.run();
    }
}