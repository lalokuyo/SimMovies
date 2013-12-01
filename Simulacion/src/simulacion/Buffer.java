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

public class Buffer {
    
         public static List<Object> buffer;
         public static int capacidad;
         
         //Falta definirlo bien
         
         public Buffer(int capacidad){
             this.buffer = new ArrayList<Object>();
             this.capacidad = capacidad;
         }
         
         public List<Object> getList() {
             //buffer.add("a");
            return this.buffer;
        }
         
         public boolean freeSpace(){
             //return buffer.size();
             return (buffer.size() < capacidad) ? true : false;
            
         }
               
}
