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
         
         //Falta definirlo bien
         
         public Buffer(){
             this.buffer = new ArrayList<Object>();
         }
         
         public List<Object> getList() {
             buffer.add("a");
            return this.buffer;
        }
               
}
