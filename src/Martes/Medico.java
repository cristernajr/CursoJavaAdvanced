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
public class Medico {
    int numeroEmpleado;
    String nombre;
    
    public static void main(String[] args) {
        Enfermera e1 = new Enfermera();
        Enfermera e2 = new Enfermera(001,"Roxana");
        
        System.out.println("El nombre de la enfermera es: "+e1.nombre);
        
        e1.inicializarVarible(002, "Andrea");
        e1.mostrar();
        
        e2.mostrar();
    }
}

class Enfermera{
    int numeroEmpleado = 0;
    String nombre = "Ninguno";
    
    public void inicializarVarible(int numeroEmpleado, String nombre){
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
    }
    
    public void mostrar(){
        System.out.println("El numero de empleado es: "+numeroEmpleado+", su nombre es: "+nombre);
    }
    
    public Enfermera(){
        
    }
    
    public Enfermera(int numeroEmpleado, String nombre){
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
    }
}
