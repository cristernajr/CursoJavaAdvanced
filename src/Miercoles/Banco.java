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
public class Banco {
    public float rangoDeInteres(){
        return 0;
    }
    
    public static void main(String[] args) {
        BanCoppel banco1 = new BanCoppel();
        Bancomer banco2 = new Bancomer();
        HSBC banco3 = new HSBC();
    
        System.out.println("Rango de interes " + banco1.rangoDeInteres());
        System.out.println("Rango de interes " + banco2.rangoDeInteres());
        System.out.println("Rango de interes " + banco3.rangoDeInteres());
    }
}
class HSBC extends Banco{
    @Override
    public float rangoDeInteres() {
        return 8f;
    }
}
class Bancomer extends Banco {
    @Override
    public float rangoDeInteres() {
        return 9f;
    }
}
class BanCoppel extends Banco {
    @Override
    public float rangoDeInteres() {
        return 7f;
    }
}