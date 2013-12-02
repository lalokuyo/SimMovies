/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;


import java.util.*;

/**
 *
 * @author Eduardo
 */
public class Simulacion {
    
    

    /**
     * @param args the command line arguments
     */
    

     public static Buffer buffer = new Buffer(8);
    // public static Buffer clientList = new Buffer(9);
     public static List<Cliente> readyList = new ArrayList<Cliente>();

     
    public static void main(String[] args) {
        
        
        //****************** VARIABLES ***************************************
        //Lista de eventos de llegada 
         List<Evento> listaEvento = new ArrayList<Evento>();
        
         
         
         //Clientes predefinidos
         Cliente cliente1 = new Cliente(0, 0, 0, 0, 0);
         Cliente cliente2 = new Cliente(1, 0, 0, 0, 0);
         Cliente cliente3 = new Cliente(2, 0, 0, 0, 0);
         
         //Peticiones de clientes nuevos
         Evento pet1 = new Evento(0, 0, 1, 10, 0);
         Evento pet2 = new Evento(1, 0, 2, 10, 0);
         Evento pet3 = new Evento(2, 0, 3, 10, 0);   
         //Evento pet4 = new Evento(2, 0, 9, 10, 0);
         
       
         //Se agregan clientes
         readyList.add(cliente1);
         readyList.add(cliente2);
         readyList.add(cliente3);
         
         //Se agregan peticiones cliente
         listaEvento.add(pet1);
         listaEvento.add(pet2);
         listaEvento.add(pet3);
         //listaEvento.add(pet4);
        // listaEvento.add(cliente5);
   
         
         int time = 0;
         int numEvento= 0;
         int size = listaEvento.size()-1;
         String name = "movies.txt";
         
         //AppServer.fileReader(name);
         
         //Ciclo de los clientes y del número de iteraciones
         while (time <= 100){
             System.out.print(time + " ");
                    
                  //Si el tiempo de llegada es igual al tiempo del contador
                  if(time == listaEvento.get(numEvento).getTa()){  
                      System.out.println(" num: "+ listaEvento.get(numEvento).getTa());
                      
                     System.out.print("Entro a buffer: "+buffer.freeSpace());
                     
                     //Si el buffer tiene espacio se agrega un evento
                     if(buffer.freeSpace()){
                         // buffer.getList().add(listaEvento.get(numEvento).getInfo());
                        buffer.getList().add(listaEvento.get(numEvento));
                      }
                      
                      //CapaRed.addToBuffer(listaEvento.get(numEvento));  //Escribe desde otro lado
                      //buffer.getList().add(name);
                      if(numEvento < size){                        
                        numEvento++;
                      }
                   }
                  
              //************ Sección de Procesamiento *********************
               /*
                * Si hay cosas en el buffer llamar por Round Robin
                * 
                */
                // CapaRed.readFromBuffer(buffer);
                  
                  
             System.out.println(""); 
          
             
             time++;
         }
         
         CapaRed.readFromBuffer(buffer);
         
        // CapaRed.addToBuffer();
         System.out.println("\nLO QUE TIENEN LAS LISTAS");
         //Impresión de los elementos en la lista
         for(int i=0; i < readyList.size(); i++){
            System.out.println("Cliente" + readyList.get(i).idClient);
            for(int j=0; j < readyList.size(); j++){
                System.out.println(readyList.get(i).getList().get(i).idCliente);
            
            }
         }
         
         
         //Impresión de los elementos en la lista
         for(int i=0; i < buffer.getList().size(); i++){
            System.out.print("El Buffer tiene:\n " + buffer.getList().get(i).getInfo());
         }
        
     //   AppCliente.nose();
    }
    
    
   
    
    
}
