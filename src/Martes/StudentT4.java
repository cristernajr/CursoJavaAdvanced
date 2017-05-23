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
public class StudentT4 {
    public void Mensajito(){
        System.out.println("Hola soy un mensajito");
    }
    public void Msn(){
        Mensajito();
    }
    public static void main(String[] args) {
        StudentT4 s1 = new StudentT4();
        s1.Msn();
    }
}
