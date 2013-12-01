/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

/**
 *
 * @author Eduardo
 */
import java.util.*;

public class Buffer{
    
         public static List<Evento> buffer;
         public static int capacidad;
         
         //Falta definirlo bien
         
         public Buffer(int capacidad){
             this.buffer = new ArrayList<Evento>();
             this.capacidad = capacidad;
         }
         
         public List<Evento> getList() {
             //buffer.add("a");
            return this.buffer;
        }
         
         public boolean freeSpace(){
             //return buffer.size();
             return (buffer.size() < capacidad) ? true : false;
            
         }
               
}
