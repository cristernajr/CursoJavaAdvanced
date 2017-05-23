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
public class Empleado {
    float salario;
    
    public static void main(String[] args) {
        Programador p = new Programador();
            
        System.out.println("el salario de un programador es " + p.salario);
    }    
}
class Programador extends Empleado{
    int bono = 10000;  
}

