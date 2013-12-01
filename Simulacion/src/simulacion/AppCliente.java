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
   
        System.out.println("Estoy imprimiendo desde cliente: ");
        for(int i=0; i < AppServer.responseList.size(); i++){
                   System.out.println("L: " + AppServer.responseList.get(i).getInfo());
             
        }
        
        
        
    }
 
}
