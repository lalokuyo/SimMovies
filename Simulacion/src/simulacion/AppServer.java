/*
 *Definir acciones 
 * 
 */
package simulacion;

/**
 *
 * @author Eduardo
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.*;


public class AppServer {
    
    
         //public static String archIn = "movies.txt";
         //public static String archOut = "";
      
     
      public static void fileReader(String name){
      
         try {
            BufferedReader archIn = new BufferedReader(new FileReader(name)); //archivo 1
            //PrintWriter archOut = new PrintWriter(new FileWriter(out));//archivo salida
            String linea = ("");
            double paquetes = 0;
            int mtu = 20;
            int marco = 0;
           
            
            while(archIn.ready()){
               linea = archIn.readLine();
               paquetes = Integer.parseInt(linea)/mtu;
               //Verificar si hay residuo para cubrir todos los paquetes
               if(paquetes%10 != 0)
                   marco = (int)paquetes + 1;
               
               //while o for para agregar cada paquete a capa de red
               
               
              // archOut.println(linea1);
               System.out.println(linea+"\n");
            }
            
            archIn.close();
            //archOut.close();
         }
            catch (FileNotFoundException fne){
               System.out.println("El archivo no existe");
            }
            catch (IOException ioe){
               System.out.println("Error en entrada");
            }
      }
  

    
}
