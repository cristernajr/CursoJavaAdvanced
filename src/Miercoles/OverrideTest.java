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
public class OverrideTest {
    public static void main(String[] args) {
        Bike bici = new Bike();
        bici.run();
    }
}
class Vehiculo{
    void run(){
        System.out.println("El vehiculo esta corriendo");
    }
}
class Bike extends Vehiculo{
    void run(){
        System.out.println("La bici esta corriendo");
    }
}