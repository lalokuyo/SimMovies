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
public class AppCliente {
  
    public static void nose (){
        
         List<Cliente> listaCliente = new ArrayList<Cliente>();
         // buffer = new ArrayList<Object>();
       
               
         //Peticiones de clientes nuevos
         Cliente client1 = new Cliente(1, 0, 0, 0, 0);
         Cliente client2 = new Cliente(2, 0, 0, 0, 0);
         Cliente client3 = new Cliente(3, 0, 0, 0, 0);
         Cliente client4 = new Cliente(4, 0, 0, 0, 0);
         Cliente client5 = new Cliente(5, 0, 0, 0, 0);
         
         //Se agrega cliente
         listaCliente.add(client1);
         listaCliente.add(client2);
         listaCliente.add(client3);
         listaCliente.add(client4);
         listaCliente.add(client5); 
   
        //Leo lo que hay en el buffer para ir haciendo operaciones previas a la utilización
        for(int i=0; i < AppServer.responseList.size(); i++){
             System.out.println("L: " + AppServer.responseList.get(i).getInfo());
             
        }
        
        
        
    }
}
 

