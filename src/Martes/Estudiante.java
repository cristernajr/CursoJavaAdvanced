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

/*
    Objeto: Entidad del mundo real que posee tres
    caracteristicas: comportamiento, estado, identidad.

    Estado: Representa el calor de un objeto.
    Comportamiento: Representa la funcionalidad que poseee el objeto.
    Identidad: Un objeto es tipicamente implementado con
    el calor del id no es visible para el usuario final, pero
    es usado internamente por la J}VM, para idetificar cada objeto
    de manera unica.

    Un objeto es una instancia de una clase.

    CLASE: Es un grupo que tinene propiedades comunes.
    Es una plantilla para modelar los objetos que se crean.
    Una clase contiene: 
        - Campos
        - Meotodos
        - Constructores
        - Bloques
        - Clases anidadas e interfaces.
*/
public class Estudiante {
    int id;
    String name;
    
    public static void main(String[] args) {
        // Creando un objeto de estudiante
        Estudiante s1 = new Estudiante();
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno(002, "liz");
        
        System.out.println("nombre: "+a1.name);
        
        a1.inicializarVariable(001, "fercha");
        a1.mostrar();
        a2.mostrar();
    }
}

class Alumno{
    int id = 1;
    String name = "Fer";
    
    public void inicializarVariable(int id, String n){
        this.id = id;
        this.name = n;
    }
    
    public void mostrar() {
        // TODO code application logic here
        System.out.println(id+" "+name);
    }
    
    public Alumno(){
        
    }
    
    public Alumno(int id, String name){
        this.id = id;
        this.name = name;
    }
}
