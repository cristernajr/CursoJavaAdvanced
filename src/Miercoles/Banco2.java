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
public class Banco2 {
    public float rangoDeInteres(){
        return 0;
    }
    
    public static void main(String[] args) {
        /*
        BanCoppel banco1 = new BanCoppel();
        Bancomer banco2 = new Bancomer();
        HSBC banco3 = new HSBC();
        */
        
        Banco2 b;
        b = new BanCoppel2();
        System.out.println("Rango de interes " + b.rangoDeInteres());
        b = new Bancomer2();
        System.out.println("Rango de interes " + b.rangoDeInteres());
        b = new HSBC2();
        System.out.println("Rango de interes " + b.rangoDeInteres());
    }
}
class HSBC2 extends Banco2{
    @Override
    public float rangoDeInteres() {
        return 8f;
    }
}
class Bancomer2 extends Banco2 {
    @Override
    public float rangoDeInteres() {
        return 9f;
    }
}
class BanCoppel2 extends Banco2 {
    @Override
    public float rangoDeInteres() {
        return 7f;
    }
}