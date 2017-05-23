package Jueves;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CC-16
 */
public class HilosT extends Thread {
    public void run(){
        System.out.println("Soy un hilo corriendo");
    }
    
    public static void main(String[] args) {
        HilosT t1 = new HilosT();
        t1.start();
        
        Hilos t = new Hilos();
        Thread thread = new Thread(t);
        thread.start();
    }
}
class Hilos implements Runnable{
    public void run(){
        System.out.println("Hilo dos esta corriendo");
    }
}