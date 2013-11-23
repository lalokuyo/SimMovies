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
        
        System.out.println("hola");
         System.out.println("hola COCA COLA");
         
         List<Object> listaCliente = new ArrayList<Object>();
         
         Cliente cliente = new Cliente(2, 3);
         listaCliente.add(cliente);
         
         //Object a = listaCliente.getFirst();
         System.out.println("primero: " + listaCliente);
        
    }
}
