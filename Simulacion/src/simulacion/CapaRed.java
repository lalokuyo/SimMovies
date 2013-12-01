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
    public static void readFromBuffer(Buffer buffer){
        int index = 0;
        Evento evento = new Evento(0,0,0,0);
        
        while(!buffer.getList().isEmpty()){
            evento = (Evento)buffer.getList().get(index);
            if(evento.idMarco == 0){
                AppServer.fileReader("Terse_Jurrasic.dat", evento.idCliente);                
            }
        }
        index = 0;
        Buffer.buffer.toString();
        
    }
    
    
    public static void addToBuffer(Evento evento){
     //   Buffer.buffer.add("W!!\n");
        Buffer.buffer.add(evento);
        
        
    }
    
}
