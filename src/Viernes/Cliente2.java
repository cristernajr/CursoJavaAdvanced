/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes;

import java.io.IOException;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 *
 * @author CC-16
 */
public class Cliente2 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",6666);
        
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        
        String str = "", str2 = "";
        
        while(!str.equals("stop")){
            str = br.readLine();
            dout.writeUTF(str);
            dout.flush();
            
            str2 = din.readUTF();
            System.out.println("El servidor dice: "+str2);
        }
        
        dout.close();
        s.close();
    }
}
