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
public class Animal4 {
    String color = "Blanco";
}
class Dog4 extends Animal4{
    String color = "Negro";
    
    void imprimir(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
class Animal5{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog5 extends Animal5{
    void eat(){
        System.out.println("eating bread...");
    }
    void run(){
        System.out.println("running away...");
    }
    void takeShower(){
        System.out.println("takin' a shower");
    }
    void sample(){
        eat();
        run();
        takeShower();
        super.eat();
    }
}
class pruebaAnimal{
    public static void main(String[] args) {
        Dog4 d = new Dog4();
        d.imprimir();
        
        Dog5 d5 = new Dog5();
        d5.sample();
    }
}