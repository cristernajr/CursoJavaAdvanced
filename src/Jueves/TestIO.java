/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jueves;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author CC-16
 */
public class TestIO {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("c:\\hola.txt");
        fos.write(65);
        fos.close();
                
        FileInputStream fis = new FileInputStream("c:\\hola.txt");
        BufferedInputStream bin = new BufferedInputStream(fis);
        int i;
        while((i=bin.read()) != -1){
            System.out.println((char)i);
        }
        bin.close();
        fis.close();
    }
}