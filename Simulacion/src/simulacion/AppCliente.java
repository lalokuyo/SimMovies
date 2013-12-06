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
    
    //public static List<Cliente> listaCliente = new ArrayList<Cliente>(); 
    
    public static void VideoReader(Evento evento){
                     
                 
           /*
            PSEUDOCODIGO
                 if(marcoActual == IdMarco){
                    paqXmarco++;
                    if(paqXmarco==totalPaq){
                        marcosCompletos++:
                    }      
                }    
          */ 
             //   System.out.println("COSA "+evento.getIdCliente());
               if((Simulacion.readyList.get(evento.getIdCliente()).getMarcoActual())== evento.getIdMarco()){
                
                  //  System.out.println("PaqXmarco: "+ listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getPaqXmarco());
                    Simulacion.readyList.get(evento.getIdCliente()).AumentaPaqXmarco();
                  //  System.out.println("AumentaPaqXmarco: "+ listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getPaqXmarco());
                    
                
                
                if((Simulacion.readyList.get(evento.getIdCliente()).getPaqXmarco())==(Simulacion.readyList.get(evento.getIdCliente()).getTotalPaq())){
                    Simulacion.readyList.get(evento.getIdCliente()).AumentaMarcosCompletos();
                   // System.out.println("TotalPaquetesCompletos: "+ listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getTotalPaq());
                }
           
           }
           
           /*
            PSEUDOCODIGO
                if(marcoActual < idMarco){
                setMarcoActual(idMarco);
                setpaqxMarco(1);
                setTotalpaq(cantPaq);
               //En caso de que solamente se tenga un paquete por marco.
                if(paqXmarco==totalPaq){
                        marcosCompletos++:
                } 
           
           }         
           */
            if((Simulacion.readyList.get(evento.getIdCliente()).getMarcoActual()) < evento.getIdMarco()){
                 //System.out.println("Menor Marco Actual: "+ (listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getMarcoActual()));
                 //System.out.println("Menor IdMArco: "+ AppServer.responseList.get(i).getIdMarco());
                
                 Simulacion.readyList.get(evento.getIdCliente()).setMarcoActual(evento.getIdMarco());
                 Simulacion.readyList.get(evento.getIdCliente()).setPaqXmarco(1);
                 Simulacion.readyList.get(evento.getIdCliente()).setTotalPaq(evento.getCantPaq());
               
                 // if((Simulacion.readyList.get(evento.getIdCliente()).getPaqXmarco())==(Simulacion.readyList.get(evento.getIdCliente()).getTotalPaq())){
                  //  Simulacion.readyList.get(evento.getIdCliente()).AumentaMarcosCompletos();
                   // System.out.println("TotalPaquetesCompletos: "+ listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getTotalPaq());
                //}
           }
           
           
        

         //for(int k=0; k < Simulacion.listaCliente.size(); k++){
           /*      System.out.println("ID CLIENTE "+ Simulacion.readyList.get(evento.getIdCliente()).getIdClient());
                 System.out.println("PAQXMARCO "+ Simulacion.readyList.get(evento.getIdCliente()).getPaqXmarco());
                 System.out.println("TOTAL PAQUETES "+ Simulacion.readyList.get(evento.getIdCliente()).getTotalPaq());
                 System.out.println("MARCO ACTUAL "+ Simulacion.readyList.get(evento.getIdCliente()).getMarcoActual());
                 System.out.println("MARCOS COMPLETOS "+ Simulacion.readyList.get(evento.getIdCliente()).getMarcosCompletos());*/
     
        
    }
}
 

