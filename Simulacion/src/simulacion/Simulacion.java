/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;


import java.math.BigDecimal;
import java.util.*;

public class Simulacion {
    
    public static BigDecimal time = new BigDecimal("0.0000");
    //public static BigDecimal timeAux = new BigDecimal("0.0000");
    public static BigDecimal fin = new BigDecimal("100.000");
    public static BigDecimal fijo = new BigDecimal("0.5");
    public static BigDecimal fijoAux = new BigDecimal("0.0001");
     public static BigDecimal otrofijoAux = new BigDecimal("0.1");
    public static BigDecimal aux;
    
    public static int numEvento= 0;
    public static int size;
    
    
    public static Buffer buffer = new Buffer(9);
    
    //Lista de clientes predefinidos
    public static List<Cliente> readyList = new ArrayList<Cliente>();
    //Lista de eventos de llegada 
    public static List<Evento> listaEvento = new ArrayList<Evento>();
     
    
    
    public static void main(String[] args) {
        
        
        //****************** VARIABLES ***************************************
        
        
         
         
         //Clientes predefinidos
         Cliente cliente1 = new Cliente(0, 0, 0, 0, 0);
         Cliente cliente2 = new Cliente(1, 0, 0, 0, 0);
         Cliente cliente3 = new Cliente(2, 0, 0, 0, 0);
         
         //Peticiones clientes nuevos (id, marco, time, size, maxPq.)
         Evento pet1 = new Evento(0, 0, 2, 10, 0);
         Evento pet2 = new Evento(1, 0, 4, 10, 0);
         Evento pet3 = new Evento(2, 0, 6, 10, 0);   
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
   
        
         
         size = listaEvento.size()-1;
         
         
         //Ciclo de los clientes y del número de iteraciones
         while ((time.compareTo(fin)) == -1){
            // System.out.print(time + " tAux: " + timeAux);
             System.out.print(time);
             clientFinder();
            /* System.out.print(time + " ");
            double tiempoTemp = (double)listaEvento.get(numEvento).getTa();
            aux = new BigDecimal(tiempoTemp); //Este es el Ta del evento convertido a BD

            //Se truncan los decimales del tiempo
            BigDecimal trunc = time.setScale(1,BigDecimal.ROUND_DOWN);
            //Si el tiempo de llegada es igual al tiempo del contador
            if(trunc.compareTo(aux) == 0){  
              System.out.println(" num: "+ listaEvento.get(numEvento).getTa());

              System.out.print("Entro a buffer: "+buffer.freeSpace());

             //Si el buffer tiene espacio se agrega un evento
             if(buffer.freeSpace()){
                 // buffer.getList().add(listaEvento.get(numEvento).getInfo());

                buffer.getList().add(listaEvento.get(numEvento));
                CapaRed.readFromBuffer(buffer);   //Se lee del buffer 
              }

              //CapaRed.addToBuffer(listaEvento.get(numEvento));  //Escribe desde otro lado
              //buffer.getList().add(name);
              if(numEvento < size){                        
                numEvento++;
              }
           } */
                  
             System.out.println(""); 
          
             time = time.add(otrofijoAux);
//             timeAux = timeAux.add(fijo);
         }//Fin While
         
         System.out.println("\nLO QUE TIENEN LAS LISTAS");
         //Impresión de los elementos en la lista
         for(int i=0; i < readyList.size(); i++){
            System.out.println("Cliente" + readyList.get(i).idClient);
            for(int j=0; j < readyList.get(i).getList().size(); j++){
                System.out.println(readyList.get(i).getList().get(i).idCliente);
            
            }
         }
         
         //Impresión de los elementos en la lista
         for(int i=0; i < buffer.getList().size(); i++){
            System.out.print("El Buffer tiene:\n " + buffer.getList().get(i).getInfo());
         }
         
         
        
    }
    
    public static void clientFinder(){
        if(!listaEvento.isEmpty()){
        
        double tiempoTemp = (double)listaEvento.get(numEvento).getTa();
            aux = new BigDecimal(tiempoTemp); //Este es el Ta del evento convertido a BD

            //Se truncan los decimales del tiempo
            BigDecimal trunc = time.setScale(1,BigDecimal.ROUND_DOWN);
            System.out.print(" Entra: " + trunc);
            //Si el tiempo de llegada es igual al tiempo del contador
            if(trunc.compareTo(aux) == 0){  
              System.out.println(" num: "+ listaEvento.get(numEvento).getTa());

              System.out.print("Entro a buffer: "+buffer.freeSpace());

             //Si el buffer tiene espacio se agrega un evento
             if(buffer.freeSpace()){
                 // buffer.getList().add(listaEvento.get(numEvento).getInfo());

                buffer.getList().add(listaEvento.remove(numEvento));
                CapaRed.readFromBuffer(buffer);   //Se lee del buffer 
              }

              if(numEvento < size){                        
                //numEvento++;
              }
           }
            
        }
    }
   
    
    
}
