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
public class TestRunnable {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                show();
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                show2();
            }
        };
        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();        
    }            
        
    public static void show(){
        System.out.println("Tarea 1");
    }

    public static void show2(){
        System.out.println("Tarea 2");
    }

}
