/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author CC-16
 */
public class Cliente {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",6666);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Hola Servidor");
        
        dout.flush();
        dout.close();
        s.close();
    }
}
