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



public class AppServer {
      
     /*
      * 
      * Este método abre el archivo que el cliente pide y luego segmenta
      * los marcos en los distintos paquetes necesarios para transmitirlos.
      * 
      */
      public static void fileReader(String fileName, int idCliente){
          
          //Lista de eventos en espera de agregarlos al buffer POR cliente
          // Cliente cliente = new Cliente(idCliente, 0, 0, 0, 0);
          System.out.println("FileReader.id: " + idCliente);
         try {
            BufferedReader archIn = new BufferedReader(new FileReader(fileName)); //archivo 1
            //PrintWriter archOut = new PrintWriter(new FileWriter(out));//archivo salida
            String linea = ("");
            
            //Variables de Calculos de paquetes
            double paquetes = 0.0;
            int mtu = 20;               //Tamaño del paquete
            int marco = 0;              //Marco en lectura
            int denom = 0;              //Cantidad de paquetes a enviar
            int cantidadPaquetes = 0;   //Cantidad de paquetes que hay por marco
            boolean resta = false;
            
            //Parametros del evento a crear
            int idMarco = 1;
            double ta = 0;
            int size = 20; int residuo = 0;
            
            
            while(archIn.ready()){
                
                
               linea = archIn.readLine();
               marco = Integer.parseInt(linea); //524
               paquetes = (double)marco/mtu; //26.2
               denom = (int)paquetes;  //26

               //Verificar si hay residuo para cubrir todos los paquetes
               cantidadPaquetes = denom;
               
               if(paquetes%1 != 0){
                   
                   residuo = marco - (denom * mtu); // = 4
                   resta = true;
                   cantidadPaquetes = denom + 1;
                   
               }
               
               //For para agregar cada paquete a una lista de atención
               for(int i=0; i<denom; i++){
                   Evento paquete = new Evento(idCliente, idMarco, ta, size, cantidadPaquetes);
                  // System.out.print("Paquete a agregar: " + paquete.getInfo() + " en "+ Simulacion.readyList.get(idCliente).idClient);
                   Simulacion.readyList.get(idCliente).getList().add(paquete);
                   ta++;
                   
                   //Simulacion.timeAux = Simulacion.timeAux.add(Simulacion.fijoAux);
                   Simulacion.time = Simulacion.time.add(Simulacion.fijoAux);
               }
               
               //En caso de haber residuo agregar ese también a la lista
               if(resta){
                   Evento paquete = new Evento(idCliente, idMarco, ta, residuo,cantidadPaquetes);
                   Simulacion.readyList.get(idCliente).getList().add(paquete);
                   resta = false;
                   residuo = 0;
                   
                   //Simulacion.timeAux = Simulacion.timeAux.add(Simulacion.fijoAux);
                   Simulacion.time = Simulacion.time.add(Simulacion.fijoAux);
               }
               
               idMarco++;
            }
            
           //Impresión de los elementos en la lista
          /*   for(int i=0; i < responseList.size(); i++){
                System.out.print("L: " + responseList.get(i).getInfo());
            }*/

            archIn.close();
            
            System.out.println("Lista ready: " + Simulacion.readyList.get(idCliente).idClient);  
            
             
         }
            catch (FileNotFoundException fne){
               System.out.println("El archivo no existe");
            }
            catch (IOException ioe){
               System.out.println("Error en entrada");
            }
      }
      
}
