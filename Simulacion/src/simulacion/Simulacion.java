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
      
        //Lista de objetos 
         List<Cliente> listaCliente = new ArrayList<Cliente>();
         List<Object> buffer = new ArrayList<Object>();
         
         //Cliente nuevo
         Cliente cliente = new Cliente(2, 3);
         Cliente cliente2 = new Cliente(7, 4);
         Cliente cliente3 = new Cliente(9, 10);
         
         //Se agrega cliente
         listaCliente.add(cliente);
         listaCliente.add(cliente2);
         listaCliente.add(cliente3);
         
         int time = 0;
         int numCliente= 0;
         int i = 0;
         int size = listaCliente.size()-1;
         
         //Ciclo de los clientes y del número de iteraciones
         while (time <= 100){
             System.out.print(time + " ");
             
                  if(time == listaCliente.get(numCliente).getTa()){  //Si el tiempo es igual al del llegada
                      System.out.println(" num: "+ listaCliente.get(numCliente).getTa());
                      if(numCliente < size){                        
                        numCliente++;
                      }
                  }
             System.out.println(""); 
          
             
             time++;
         }
         
        
    }
}
