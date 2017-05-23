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
public class CarroDos implements ICarroDos
{
    int km = 0;
    String nombreCarro;

    public CarroDos() {
    }

    public CarroDos(String nombreCarro) {
        this.nombreCarro = nombreCarro;
    }
    

    @Override
    public void ActivarTodoTerreno() {
        System.out.println(nombreCarro + " --> Modo todo terreno activado");
    }

    @Override
    public void ActivarMira() {
        System.out.println(nombreCarro + " --> Ti - Ti - Ti - Ti");
    }

    @Override
    public void LanzarMicil() {
        System.out.println(nombreCarro + " --> PUS - PUS - PUS - PUS");
    }

    @Override
    public void Acelerar() {
        System.out.println(nombreCarro + " --> RUNNNN!!!"+(km+=30)+"km");
    }

    @Override
    public void Frenar() {
        System.out.println(nombreCarro + " --> Llantas rechinando"); 
    }
    
}
