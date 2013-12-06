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
         Cliente cliente4 = new Cliente(3, 0, 0, 0, 0);
         Cliente cliente5 = new Cliente(4, 0, 0, 0, 0);
         Cliente cliente6 = new Cliente(5, 0, 0, 0, 0);
         Cliente cliente7 = new Cliente(6, 0, 0, 0, 0);
         Cliente cliente8 = new Cliente(7, 0, 0, 0, 0);
         Cliente cliente9 = new Cliente(8, 0, 0, 0, 0);
         Cliente cliente10 = new Cliente(9, 0, 0, 0, 0);
         Cliente cliente11 = new Cliente(10, 0, 0, 0, 0);
         Cliente cliente12 = new Cliente(11, 0, 0, 0, 0);
         Cliente cliente13 = new Cliente(12, 0, 0, 0, 0);
         Cliente cliente14 = new Cliente(13, 0, 0, 0, 0);
         Cliente cliente15 = new Cliente(14, 0, 0, 0, 0);
         Cliente cliente16 = new Cliente(15, 0, 0, 0, 0);
         Cliente cliente17 = new Cliente(16, 0, 0, 0, 0);
         Cliente cliente18 = new Cliente(17, 0, 0, 0, 0);
         Cliente cliente19 = new Cliente(18, 0, 0, 0, 0);
         Cliente cliente20 = new Cliente(19, 0, 0, 0, 0);
         
         //Peticiones clientes nuevos (id, marco, time, size, maxPq.)
         Evento pet1 = new Evento(0, 0, 2, 10, 0);
         Evento pet2 = new Evento(1, 0, 3, 10, 0);
         Evento pet3 = new Evento(2, 0, 4, 10, 0); 
         Evento pet4 = new Evento(3, 0, 5, 10, 0); 
         Evento pet5 = new Evento(4, 0, 6, 10, 0);
         Evento pet6 = new Evento(5, 0, 7, 10, 0);
         Evento pet7 = new Evento(6, 0, 8, 10, 0);
         Evento pet8 = new Evento(7, 0, 9, 10, 0); 
         Evento pet9 = new Evento(8, 0, 10, 10, 0); 
         Evento pet10 = new Evento(9, 0, 11, 10, 0);
         Evento pet11 = new Evento(10, 0, 12, 10, 0);
         Evento pet12 = new Evento(11, 0, 13, 10, 0);
         Evento pet13 = new Evento(12, 0, 14, 10, 0); 
         Evento pet14 = new Evento(13, 0, 15, 10, 0); 
         Evento pet15 = new Evento(14, 0, 16, 10, 0);
         Evento pet16 = new Evento(15, 0, 17, 10, 0);
         Evento pet17 = new Evento(16, 0, 18, 10, 0);
         Evento pet18 = new Evento(17, 0, 19, 10, 0); 
         Evento pet19 = new Evento(18, 0, 20, 10, 0); 
         Evento pet20 = new Evento(19, 0, 21, 10, 0);
         
         
       
         //Se agregan clientes
         readyList.add(cliente1);
         readyList.add(cliente2);
         readyList.add(cliente3);
         readyList.add(cliente4);
         readyList.add(cliente5);
         readyList.add(cliente6);
         readyList.add(cliente7);
         readyList.add(cliente8);
         readyList.add(cliente8);
         readyList.add(cliente10);
         readyList.add(cliente11);
         readyList.add(cliente12);
         readyList.add(cliente13);
         readyList.add(cliente14);
         readyList.add(cliente15);
         readyList.add(cliente16);
         readyList.add(cliente17);
         readyList.add(cliente18);
         readyList.add(cliente19);
         readyList.add(cliente20);
         
         
         
         //Se agregan peticiones cliente
         listaEvento.add(pet1);
         listaEvento.add(pet2);
         listaEvento.add(pet3);
         listaEvento.add(pet4);
         listaEvento.add(pet5);
         listaEvento.add(pet6);
         listaEvento.add(pet7);
         listaEvento.add(pet8);
         listaEvento.add(pet9);
         listaEvento.add(pet10);
         listaEvento.add(pet11);
         listaEvento.add(pet12);
         listaEvento.add(pet13);
         listaEvento.add(pet14);
         listaEvento.add(pet15);
         listaEvento.add(pet16);
         listaEvento.add(pet17);
         listaEvento.add(pet18);
         listaEvento.add(pet19);
         listaEvento.add(pet20);
         
        
   
        
         
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
            System.out.println("Cliente " + readyList.get(i).getInfo());
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
