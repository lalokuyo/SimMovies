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
    
        //Lista de eventos en espera de agregarlos al buffer
        public static List<Evento> responseList = new ArrayList<Evento>();
        
        // public static String name = "movies.txt";
         //public static String archOut = "";
      
     /*
      * 
      * Este método abre el archivo que el cliente pide y luego segmenta
      * los marcos en los distintos paquetes necesarios para transmitirlos.
      * 
      */
      public static void fileReader(String fileName, int idCliente){
      
        /* try {
            BufferedReader archIn = new BufferedReader(new FileReader(fileName)); //archivo 1
            //PrintWriter archOut = new PrintWriter(new FileWriter(out));//archivo salida
            String linea = ("");
            
            //Variables de Calculos de paquetes
            double paquetes = 0.0;
            int mtu = 20;       //Tamaño del paquete
            int marco = 0;      //Marco en lectura
            int denom = 0;      //Cantidad de paquetes a enviar
            boolean resta = false;
            
            //Parametros del evento a crear
            int idMarco = 1;
            int ta = 0;//que es ta?? segùn es la cantidad de paquetes que tiene un marco, no?
            int size = 20; int residuo = 0;
            
            
            while(archIn.ready()){
               linea = archIn.readLine();
               marco = Integer.parseInt(linea); //524
               paquetes = (double)marco/mtu; //26.2
               denom = (int)paquetes;  //26
              // System.out.println("L: " + paquetes);
         
               //Verificar si hay residuo para cubrir todos los paquetes
               
               if(paquetes%1 != 0){
                   
                   residuo = marco - (denom * mtu); // = 4
                   resta = true;
                   
               }
               
               //For para agregar cada paquete a una lista de atención
               for(int i=0; i<denom; i++){
                   Evento paquete = new Evento(idCliente, idMarco, ta, size);
                   responseList.add(paquete);
                   ta++;
         
               }
               //En caso de haber residuo agregar ese también a la lista
               if(resta){
                   Evento paquete = new Evento(idCliente, idMarco, ta, residuo);
                   responseList.add(paquete);
                   resta = false;
                   residuo = 0;
               }
               
               idMarco++;
            }
            
           //Impresión de los elementos en la lista
          /*   for(int i=0; i < responseList.size(); i++){
                System.out.print("L: " + responseList.get(i).getInfo());
            }
           
            
            archIn.close();
            //archOut.close();
         }
            catch (FileNotFoundException fne){
               System.out.println("El archivo no existe");
            }
            catch (IOException ioe){
               System.out.println("Error en entrada");
            }*/
         System.out.println("Cheque cliente");
      }
      
      public static void response(){
          
          // while()
      }
  

    
}
