/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miercoles;

/**
 *
 * @author CC-16
 */
public class Persona {
    int id;
    String name;

    public Persona(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Empleado2 extends Persona{
    float salario;
    
    Empleado2(int id, String name, float salario){
        super(id, name);
        this.salario = salario;
    }
    void display(){
        System.out.println(id+" "+name+" "+salario);
    }
}
class PersonaTest{
    public static void main(String[] args) {
        Empleado2 e = new Empleado2(001,"Fer",1000);
        e.display();
    }
}
