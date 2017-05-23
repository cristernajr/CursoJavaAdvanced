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
interface iBanco{
    float rangoDeInteres();
}
public class Banco3 implements iBanco {
    public float rangoDeInteres(){
        return 0;
    }
    
    public static void main(String[] args) {   
        Banco3 b;
        b = new BanCoppel3();
        System.out.println("Rango de interes " + b.rangoDeInteres());
        b = new Bancomer3();
        System.out.println("Rango de interes " + b.rangoDeInteres());
        b = new HSBC3();
        System.out.println("Rango de interes " + b.rangoDeInteres());
    }
}
class HSBC3 extends Banco3 implements iBanco{
    @Override
    public float rangoDeInteres() {
        return 8f;
    }
}
class Bancomer3 extends Banco3 implements iBanco{
    @Override
    public float rangoDeInteres() {
        return 9f;
    }
}
class BanCoppel3 extends Banco3 implements iBanco{
    @Override
    public float rangoDeInteres() {
        return 7f;
    }
}