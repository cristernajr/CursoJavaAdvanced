/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author CC-16
 */
public class Server2 {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();

        DataInputStream dim = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        String str = "",str2 = "";

        while(!str.equals("stop")){
            str = dim.readUTF();
            System.out.println("El cliente dice: "+str);

            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }

        dim.close(); 
        s.close();
        ss.close();
    }
    
}
