/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes;

/**
 *
 * @author CC-16
 */
public class StudentT3 {
    public static void main(String[] args) {
       AB ab = new AB(10); 
    }
}

class AB{
    AB(){
        System.out.println("hola soy un mensaje en el constructor");
    }
    AB(int x){
        this();
        System.out.println(x);
        
    }
}
