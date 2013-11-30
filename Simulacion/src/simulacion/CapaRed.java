/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

/**
 *
 * @author Eduardo
 */
public class CapaRed {
    
    //while(Mientras haya cosas en el buffer)
   // Simulacion buffer.
    public static void readFromBuffer(){
        while(!Buffer.buffer.isEmpty()){
            
        }
        
    }
    
    
    public static void addToBuffer(Evento evento){
        Buffer.buffer.add("W!!\n");
        Buffer.buffer.add(evento);
        
        
    }
    
}
