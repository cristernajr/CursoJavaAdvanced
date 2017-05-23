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

interface show {
    void print();
}

public class InterfaceTest implements show {

    @Override
    public void print() {
        System.out.println("Hola");
    }
    
    public static void main(String[] args) {
        InterfaceTest a = new InterfaceTest();
        a.print();
    }
    
}
