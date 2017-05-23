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
public class OverloadTest {
    public static void main(String[] args) {
        System.out.println(AddArguments.add(11, 23));
        System.out.println(AddArguments.add(23, 14, 19));
        System.out.println(AddType.add(10, 20));
        System.out.println(AddType.add(10, 20));
    }
}
class AddArguments{
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
}
class AddType{
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
}
