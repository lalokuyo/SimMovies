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
        //System.out.print(buffer.getList().);
        
        //Mientras existan elementos Cliente en el buffer se verifica 
       while(!buffer.getList().isEmpty()){
                        
<<<<<<< HEAD
           // evento = buffer.getList().get(index).idMarco;
           // System.out.print("lista \n:" + buffer.getList().);
           // buffer.getList().remove(index); //Quitalo de la lista
            
           //Si el evento es un Cliente -> procesa su lista
            if(buffer.getList().get(index).idMarco == 0){
                System.out.println("\nsize: " + buffer.getList().size());
                //Impresión de los elementos en la lista
                 for(int i=0; i < buffer.getList().size(); i++){
                    System.out.print("L: " + buffer.getList().get(i).getInfo());
                 }
                
                System.out.println("\nCliente: " + buffer.getList().get(index).idCliente + " index: " + index);
                AppServer.fileReader("Terse_Jurassic.dat", buffer.getList().get(index).idCliente);
                buffer.getList().remove(index); //Quitalo de la lista
                
                System.out.println("size: " + buffer.getList().size());
                //Impresión de los elementos en la lista
                 for(int i=0; i < buffer.getList().size(); i++){
                    System.out.print("L: " + buffer.getList().get(i).getInfo());
                 }
                 System.out.print("**********");
             
             //Else si el evento es respuesta para cliente    
            }else if(index < buffer.getList().size()-1){
                index++;
                //Aqui va lo tuyo ivonne
                //AppCliente.funcionChida
=======
            evento = buffer.getList().get(index);
            if(evento.idMarco == 0){
                //System.out.print("\nSI JALA \n");
                AppServer.fileReader("Terse_Jurassic.dat", evento.idCliente);                
>>>>>>> 4133f97daf93facb26a3d3664eceb22e77e0ceba
            }
            
            //
        }
        //index = 0;
        
    }
    
    
    public static void addToBuffer(Evento evento){
     //   Buffer.buffer.add("W!!\n");
        Buffer.buffer.add(evento);
        //AQUI VA ROUND ROBIN!!
        
    }
    
}
