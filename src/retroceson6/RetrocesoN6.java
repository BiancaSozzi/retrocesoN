/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retroceson6;
import java.io.*;

/**
 *
 * @author bianc
 */
public class RetrocesoN6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
        System.out.println("Ingrese el tamaño de la ventana: ");
        int window = Integer.parseInt(br.readLine());
  
        int sent = 0;
  
        while(true){
   
            for(int i = 0; i < window; i++){
            System.out.println("Paquete " + sent + " enviado.");
            sent++;
            if(sent == window)
            break;
        }
            
        System.out.println("Ingrese el último ack recibido.");
        int ack = Integer.parseInt(br.readLine());
   
        if(ack == window-1){
            System.out.println("La transmisión ha finalizado con éxito");
            break;
        } else{
            sent = ack+1;
        }
  
        }  
    }
    
}
