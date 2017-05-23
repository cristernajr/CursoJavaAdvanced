/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author CC-16
 */
public class Propierties {
    public static void main(String[] args) throws UnknownHostException, MalformedURLException, IOException {
        InetAddress ip = InetAddress.getByName("www.oracle.com"); 
        System.out.println("Nombre del host: "+ip.getHostName());
        System.out.println("Direccion IP "+ip.getHostAddress());
        
        URL url = new URL("https://codigofacilito.com");
        System.out.println("Portocolo: "+url.getProtocol());
        System.out.println("Portocolo: "+url.getHost());
        System.out.println("Portocolo: "+url.getFile());
        System.out.println("Portocolo: "+url.getPort());
        
        HttpsURLConnection hus = (HttpsURLConnection) url.openConnection();
        
        for(int i = 1; i <= 8; i++){
            System.out.println(hus.getHeaderFieldKey(i)+" = "+
                    hus.getHeaderField(i));
        }
        hus.disconnect();
    }
}
