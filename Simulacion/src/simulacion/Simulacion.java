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
    
     public static Buffer buffer = new Buffer(7);
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        //****************** VARIABLES ***************************************
        //Lista de objetos 
         List<Evento> listaEvento = new ArrayList<Evento>();
         // buffer = new ArrayList<Object>();
       
               
         //Peticiones de clientes nuevos
         Evento cliente1 = new Evento(1, 0, 1, 10);
         Evento cliente2 = new Evento(2, 0, 2, 10);
         Evento cliente3 = new Evento(3, 1, 3, 10);
         Evento cliente4 = new Evento(4, 0, 9, 10);
         Evento cliente5 = new Evento(4, 0, 10, 10);
         
         //Se agrega cliente
         listaEvento.add(cliente1);
         listaEvento.add(cliente2);
         listaEvento.add(cliente3);
         listaEvento.add(cliente4);
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
         
         //Impresión de los elementos en la lista
         for(int i=0; i < buffer.getList().size(); i++){
            System.out.print("El Buffer tiene:\n " + buffer.getList().get(i).getInfo());
         }
        
    }
    
    
   
    
    
}
