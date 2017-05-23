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
public class Student {
    int id;
    String name;
    static String universidad = "UAS";

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    void display(){
        System.out.println(id+""+name+""+universidad);
    }
    
    public static void main(String[] args) {
        Student s1 = new Student(001,"Fer");
        Student s2 = new Student(002,"Aranxa");
        
        s1.display();
        s2.display();
        
    }
}
