/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jueves;

/**
 *
 * @author CC-16
 */
public class Carrera {
    public static void main(String[] args) {
        Tortuga t1 = new Tortuga();
        Thread t2 = new Thread(new Liebre());
        
        t1.start();
        t2.start();
    }
}
