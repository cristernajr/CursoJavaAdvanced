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
public class CarroUno implements ICarroUno
{
    int km=0;
    String nombreCarro;

    public CarroUno() {
    }

    public CarroUno(String nombreCarro) {
        this.nombreCarro = nombreCarro;
    }
    

    @Override
    public void ActivarEscudo() {
        System.out.println(nombreCarro + " --> Escudo Activado...");
    }

    @Override
    public void Ametrallar() {
        System.out.println(nombreCarro + " --> TA-KA TA-KA TA-KA TA-KA TA-KA TA-KA TA-KA !!!!!!");
    }

    @Override
    public void Esquivar() {
        System.out.println(nombreCarro + " --> Esquivando !!!! ....");
    }

    @Override
    public void Acelerar() 
    {
        System.out.println(nombreCarro + " --> RUNNNN!!!"+(km+=30)+"km");
    }

    @Override
    public void Frenar() {
        System.out.println(nombreCarro + " --> Llantas rechinando");
    }
    
}
