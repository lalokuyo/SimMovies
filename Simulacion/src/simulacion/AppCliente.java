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
    
    public static List<Cliente> listaCliente = new ArrayList<Cliente>(); 
    
    public static void nose (){
                     
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
         
         System.out.println("ANTES cliente MARCOS COMPLETOS: " + listaCliente.get(AppServer.responseList.get(0).getIdCliente()).getMarcosCompletos());      
   
        //Leo lo que hay en el buffer para ir haciendo operaciones previas a la utilización
        for(int i=0; i < AppServer.responseList.size(); i++){
            
            //for(int i=0; i < 50; i++){
               //System.out.println("L: " + AppServer.responseList.get(i).getInfo());
            
           /*
            PSEUDOCODIGO
                 if(marcoActual == IdMarco){
                    paqXmarco++;
                    if(paqXmarco==totalPaq){
                        marcosCompletos++:
                    }      
                }    
          */ 
                //System.out.println("CLIENTE: " + listaCliente.get(AppServer.responseList.get(i).getIdCliente()));
                //System.out.println("Marco Actual: "+ (listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getMarcoActual()));
                //System.out.println("IdMArco: "+ AppServer.responseList.get(i).getIdMarco());
                
           if((listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getMarcoActual())== AppServer.responseList.get(i).getIdMarco()){
                
                  //  System.out.println("PaqXmarco: "+ listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getPaqXmarco());
                    listaCliente.get(AppServer.responseList.get(i).getIdCliente()).AumentaPaqXmarco();
                  //  System.out.println("AumentaPaqXmarco: "+ listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getPaqXmarco());
                    
                
                
                if((listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getPaqXmarco())==(listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getTotalPaq())){
                    listaCliente.get(AppServer.responseList.get(i).getIdCliente()).AumentaMarcosCompletos();
                   // System.out.println("TotalPaquetesCompletos: "+ listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getTotalPaq());
                }
           
           }
           
           /*
            PSEUDOCODIGO
                if(marcoActual < idMarco){
                setMarcoActual(idMarco);
                setpaqxMarco(1);
                setTotalpaq(cantPaq);
           
           }         
           */
            if((listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getMarcoActual()) < AppServer.responseList.get(i).getIdMarco()){
                 //System.out.println("Menor Marco Actual: "+ (listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getMarcoActual()));
                 //System.out.println("Menor IdMArco: "+ AppServer.responseList.get(i).getIdMarco());
                
                 listaCliente.get(AppServer.responseList.get(i).getIdCliente()).setMarcoActual(AppServer.responseList.get(i).getIdMarco());
                 listaCliente.get(AppServer.responseList.get(i).getIdCliente()).setPaqXmarco(1);
                 listaCliente.get(AppServer.responseList.get(i).getIdCliente()).setTotalPaq(AppServer.responseList.get(i).getCantPaq());
                  //System.out.println("Menor Menor Marco Actual: "+ (listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getMarcoActual()));
                  //System.out.println("Menor paqXmarco: "+ (listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getPaqXmarco()));
                 // System.out.println("Menor TotalPaq: "+ (listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getTotalPaq()));
                 
           }
           
           
        }
        
         System.out.println("Despues cliente MARCOS COMPLETOS: " + listaCliente.get(AppServer.responseList.get(0).getIdCliente()).getMarcosCompletos());
        
        
     
        
        
        
    }
}
 

