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
         Cliente cliente2 = new Cliente(9, 10);
         
         //Se agrega cliente
        listaCliente.add(cliente);
         listaCliente.add(cliente2);
         
         int time = 0;
         int numCliente = 0;
         
         while (time <= 100){
             System.out.println(time);
             
             if(listaCliente.get(numCliente) != null){
               System.out.println("Entro");
                 /*if(listaCliente.get(numCliente).getTa() == time){
                     System.out.println("Entro");
                     buffer.add(cliente.getInfo());
                     System.out.println("Buffer tiene 1");
                     numCliente++;
                     
                 }
                 */
               numCliente++;
             }
             
             time++;
         }
         
         //Print
        // System.out.println("primero: " + listaCliente.get(time).getTa());
         //System.out.println("2: " + listaCliente.get(1));
        
        
    }
}
