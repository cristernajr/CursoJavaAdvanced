/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 *
 * @author CC-16
 */
public class TestIO2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("c:\\hola.txt");
        FileInputStream fis2 = new FileInputStream("c:\\hola.txt");
        
        FileOutputStream fos = new FileOutputStream("c:\\nuevo.txt");
        
        SequenceInputStream sis = new SequenceInputStream(fis, fis2);
        
        int i;
        while((i = sis.read()) != -1){
            System.out.print((char)i);
            fos.write(i);
        }
        sis.close();
        fis.close();
        fis2.close();
    }
}
