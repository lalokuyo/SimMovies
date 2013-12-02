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
    
    public static void VideoReader (Evento cosa){
                     
                 
           /*
            PSEUDOCODIGO
                 if(marcoActual == IdMarco){
                    paqXmarco++;
                    if(paqXmarco==totalPaq){
                        marcosCompletos++:
                    }      
                }    
          */ 
                System.out.println("COSA "+cosa.getIdCliente());
               if((Simulacion.readyList.get(cosa.getIdCliente()).getMarcoActual())== cosa.getIdMarco()){
                
                  //  System.out.println("PaqXmarco: "+ listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getPaqXmarco());
                    Simulacion.readyList.get(cosa.getIdCliente()).AumentaPaqXmarco();
                  //  System.out.println("AumentaPaqXmarco: "+ listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getPaqXmarco());
                    
                
                
                if((Simulacion.readyList.get(cosa.getIdCliente()).getPaqXmarco())==(Simulacion.readyList.get(cosa.getIdCliente()).getTotalPaq())){
                    Simulacion.readyList.get(cosa.getIdCliente()).AumentaMarcosCompletos();
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
            if((Simulacion.readyList.get(cosa.getIdCliente()).getMarcoActual()) < cosa.getIdMarco()){
                 //System.out.println("Menor Marco Actual: "+ (listaCliente.get(AppServer.responseList.get(i).getIdCliente()).getMarcoActual()));
                 //System.out.println("Menor IdMArco: "+ AppServer.responseList.get(i).getIdMarco());
                
                 Simulacion.readyList.get(cosa.getIdCliente()).setMarcoActual(cosa.getIdMarco());
                 Simulacion.readyList.get(cosa.getIdCliente()).setPaqXmarco(1);
                 Simulacion.readyList.get(cosa.getIdCliente()).setTotalPaq(cosa.getCantPaq());
               
                 
           }
           
           
        

         //for(int k=0; k < Simulacion.listaCliente.size(); k++){
                 System.out.println("ID CLIENTE "+ Simulacion.readyList.get(cosa.getIdCliente()).getIdClient());
                 System.out.println("PAQXMARCO "+ Simulacion.readyList.get(cosa.getIdCliente()).getPaqXmarco());
                 System.out.println("TOTAL PAQUETES "+ Simulacion.readyList.get(cosa.getIdCliente()).getTotalPaq());
                 System.out.println("MARCO ACTUAL "+ Simulacion.readyList.get(cosa.getIdCliente()).getMarcoActual());
                 System.out.println("MARCOS COMPLETOS "+ Simulacion.readyList.get(cosa.getIdCliente()).getMarcosCompletos());
     
        
    }
}
 

