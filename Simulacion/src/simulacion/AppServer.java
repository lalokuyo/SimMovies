/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
            String linea1 = ("");
           
            
            while(archIn.ready()){
               linea1 = archIn.readLine();
               
              // archOut.println(linea1);
               System.out.println(linea1+"\n");
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
