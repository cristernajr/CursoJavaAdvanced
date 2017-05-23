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
public class Integrante {
    int id;
    String nombre;
    
    public Integrante(int i, String n){
        id = i;
        nombre = n;
    }
    
    public Integrante(Integrante in){
        id = in.id;
        nombre = in.nombre;
    }
    
    private void display() {
        System.out.println(id+""+nombre);
    }
    
    public Integrante(){
        
    }
    
    public static void main(String[] args){
        Integrante i1 = new Integrante(001,"Fer");
        Integrante i2 = new Integrante(i1);
        
        i1.display();
        i2.display();
    }
}