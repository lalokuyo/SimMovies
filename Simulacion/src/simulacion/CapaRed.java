/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

/**
 *
 * @author Eduardo
 */
public class CapaRed{
 
    
    //while(Mientras haya cosas en el buffer)
   // Simulacion buffer.
    public static void readFromBuffer(Buffer buffer){
        int index = 0;
        Evento evento;
        //Buffer buffer = buf;
        System.out.print(buffer.getList().get(index).getInfo());
        
        //Mientras existan elementos en el buffer se verifica 
       //while(!buffer.getList().isEmpty()){
                        
            evento = buffer.getList().get(index);
            if(evento.idMarco == 0){
                System.out.print("\nSI JALA \n");
                AppServer.fileReader("Terse_Jurassic.dat", evento.idCliente);                
            }
            index++;
       // }
        index = 0;
        
        
    }
    
    
    public static void addToBuffer(Evento evento){
     //   Buffer.buffer.add("W!!\n");
        Buffer.buffer.add(evento);
        //AQUI VA ROUND ROBIN!!
        
    }
    
}
