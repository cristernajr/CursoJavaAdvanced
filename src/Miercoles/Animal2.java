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
public class Animal2 {
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog2 extends Animal2 {
    void run(){
        System.out.println("Running...");
    }
}
class Cachorro extends Dog2{
    void drinkMilk(){
        System.out.println("Drinkin' milk");
    }
}
class Herencia{
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.drinkMilk();
        cachorro.run();
        cachorro.eat();
    }
}