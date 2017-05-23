/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miercoles;

import java.io.IOException;

/**
 *
 * @author CC-16
 */
public class TestException {
    public static void main(String[] args) throws Exception {
        try{
            M m = new M();
            m.method();
        }catch(Exception e){
            System.out.println("Exception Handled");
        }
        /*
        try{
            int data = 50/0;
            int a[];
            a = new int [5];
            a[5] = 30/0; 
        }catch(ArrayIndexOutOfBoundsException ex2){
            System.out.println(ex2);
        }catch(Exception ex3){
            System.out.println(ex3);
        }finally{
            System.out.println("el bloque finally siempre se ejecuta");
        }
         
        System.out.println("Lo que sigue");
*/
    }
}
class M{
    void method() throws IOException {
        throw new IOException("Error");
    }
}