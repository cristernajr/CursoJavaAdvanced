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
public class Tortuga extends Thread{
    public void run(){
        int i = 0;
        System.out.println("inicia la tortuga");
        
        while(i <= 5){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
            i++;
        }
        System.out.println("Ya llego la tortuga");
    }
}
