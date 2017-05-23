/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miercoles;

/**
 *
 * @author ortiz
 */
public class CarreraDeLaMuerte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException 
    {
        CarroUno carroUno = new CarroUno("John");
        CarroDos carroDos = new CarroDos("Roky");
        
        carroUno.Acelerar();
        Thread.sleep(1000);
        carroDos.Acelerar();
        Thread.sleep(1000);
        carroUno.Acelerar();
        Thread.sleep(1000);
        carroDos.ActivarMira();
        Thread.sleep(1000);
        carroDos.LanzarMicil();
        Thread.sleep(1000);
        carroUno.Esquivar();
        Thread.sleep(1000);
        carroDos.Acelerar();
        Thread.sleep(1000);
        carroUno.ActivarEscudo();
        Thread.sleep(1000);
        carroDos.ActivarMira();
        Thread.sleep(1000);
        carroUno.Ametrallar();
        Thread.sleep(1000);
        carroDos.Frenar();
        System.out.println("GAME OVER");
    }
    
}
