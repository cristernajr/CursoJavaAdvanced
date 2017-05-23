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
public class StudentT5 {
    StudentT52 obj;

    public StudentT5(StudentT52 obj) {
        this.obj = obj;
    }
    
    void display(){
        System.out.println(obj.id);
    }
}

class StudentT52{
    int id = 10;

    public StudentT52() {
        StudentT5 s5 = new StudentT5(this);
        s5.display();
    }
    
    public static void main(String[] args) {
        StudentT52 s5 = new StudentT52();
    }
}


