/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author CC-16
 */
public class TestIO3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("c:\\io.txt");
        FileOutputStream fos2 = new FileOutputStream("c:\\io2.txt");
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        
        baos.write(65);
        baos.writeTo(fos);
        baos.writeTo(fos2);
        
        baos.flush();
        baos.close();
        System.out.println("Listo");
    }
}
