/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java. util. Scanner;

/**
 *
 * @author CC-16
 */
public class TestIO {
    
    int opcion = 1;
    String nombreArchivo = "";
    Scanner teclado = new Scanner (System. in);
    Scanner teclado2 = new Scanner (System. in);
    
    public void Menu(){
        System. out. println ("Teclee la opcion: 1) Entrada, 2) Salida, 3) Salir:");
        opcion = teclado.nextInt();
        
        Acciones();
    }
    
    public void Acciones(){
        try{
            switch(opcion){
                case 1:
                    System.out.println ("Teclee el nombre del archivo:");
                    nombreArchivo = teclado2.nextLine();

                    FileOutputStream fos = new FileOutputStream("c:\\"+nombreArchivo+".txt");
                    fos.write(65);
                    fos.close();

                    System.out.println("Se creo el archivo: "+nombreArchivo+".txt");

                    Menu();
                break;
                
                case 2:
                    if(nombreArchivo != ""){
                       FileInputStream fis = new FileInputStream("c:\\"+nombreArchivo+".txt");
                        BufferedInputStream bin = new BufferedInputStream(fis);
                        int i;
                        System.out.println("Se leyo el archivo "+nombreArchivo+".txt");
                        while((i=bin.read()) != -1){
                            System.out.println((char)i);
                        }
                        bin.close();
                        fis.close();

                        Menu(); 
                    }else{
                        System.out.println("No hay archivo que leer");
                        
                        Menu();
                    }
                    
                break;
                
                case 3:
                     System.exit(0);
                break;
            }    
        } catch(IOException ioe){
            System.out.println(ioe);
        }
    }
    
    public static void main(String[] args) {
        
        TestIO io = new TestIO();
        
        io.Menu();
    }
}