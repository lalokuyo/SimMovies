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
    public static void main(String[] args) {
        // TODO code application logic here
        
 //************************************* VARIABLES ***********************************************
        //Lista de objetos 
         List<Evento> listaEvento = new ArrayList<Evento>();
         List<Object> buffer = new ArrayList<Object>();
        // Buffer carro = new Buffer();
               
         //Evento nuevo
         Evento cliente = new Evento(2, 3, 10);
         Evento cliente2 = new Evento(7, 4, 10);
         Evento cliente3 = new Evento(2, 10, 10);
         
         //Se agrega cliente
         listaEvento.add(cliente);
         listaEvento.add(cliente2);
         listaEvento.add(cliente3);
         
         int time = 0;
         int numEvento= 0;
         int size = listaEvento.size()-1;
         
         //Ciclo de los clientes y del número de iteraciones
         while (time <= 100){
             System.out.print(time + " ");
             
                  if(time == listaEvento.get(numEvento).getTa()){  //Si el tiempo es igual al del llegada
                      System.out.println(" num: "+ listaEvento.get(numEvento).getTa());
                      buffer.add(listaEvento.get(numEvento).getInfo());
                      if(numEvento < size){                        
                        numEvento++;
                      }
                  }
             System.out.println(""); 
          
             
             time++;
         }
         
         //Falta definir si el buffer sera generico o no. Definir las demas clases
         System.out.print("El Buffer tiene: " + buffer.toString());
        
    }
}
