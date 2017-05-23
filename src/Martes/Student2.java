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
public class Student2 {
    int noControl;
    String nombre;
    static String instituto = "UAS";
    
    public static void change() {
        instituto = "UAG";
    }

    public Student2() {
    }

    public Student2(int noControl, String nombre) {
        this.noControl = noControl;
        this.nombre = nombre;
    }
    
    public void display(){
        System.out.println(noControl+" "+nombre+" "+instituto);
    }
    
    public static void main(String[] args) {
        Student2.change();
        
        Student2 s1 = new Student2(001,"Fer");
        Student2 s2 = new Student2(002,"Pau");
        Student2 s3 = new Student2(003,"Viri");
        
        s1.display();
        s2.display();
        s3.display();
    }
}
