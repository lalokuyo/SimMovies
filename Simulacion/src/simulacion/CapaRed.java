/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.math.BigDecimal;

/**
 *
 * @author Eduardo
 */
public class CapaRed{
 
    
    
    //Esta función esta constantemente leyendo
    //en el buffer y las procesa el servidor o el cliente
    public static void readFromBuffer(Buffer buffer){
        int index = 0;
        Evento evento;
        //Buffer buffer = buf;
        //System.out.print(buffer.getList().);
        
        //Mientras existan elementos Cliente en el buffer se verifica 
       while(!buffer.getList().isEmpty()){
                        

           // evento = buffer.getList().get(index).idMarco;
           // System.out.print("lista \n:" + buffer.getList().);
           // buffer.getList().remove(index); //Quitalo de la lista
            
           //Si el evento es un Cliente -> procesa su lista
           
           
            if(buffer.getList().get(index).idMarco == 0){
              /*  System.out.println("\nsize: " + buffer.getList().size());
                //Impresión de los elementos en la lista
                 for(int i=0; i < buffer.getList().size(); i++){
                    System.out.print("L: " + buffer.getList().get(i).getInfo());
                 }*/
               
                System.out.println("\nCliente: " + buffer.getList().get(index).idCliente + " index: " + index);
                AppServer.fileReader("Terse_Jurassic.dat", buffer.getList().remove(index).idCliente); //Quitalo de la lista
                addToBuffer();
               // addToBuffer();
                
               /* System.out.println("size: " + buffer.getList().size());
                //Impresión de los elementos en la lista
                 for(int i=0; i < buffer.getList().size(); i++){
                    System.out.print("L: " + buffer.getList().get(i).getInfo());
                 }
                 System.out.print("**********");*/
            }else  
             //Else si el evento es respuesta para cliente    
            if(buffer.getList().get(index).idMarco != 0){
                buffer.getList().remove(index); //Quitalo de la lista
               
                //Aqui va lo tuyo ivonne
                //AppCliente.funcionChida

            }
            //
        }
      // System.out.println("Se acabo");
        //index = 0;
        
    }
    
    
    public static void addToBuffer(){
        
        //Mientras haya Clientes con listas 
        while(!Simulacion.readyList.isEmpty()){
           
            Cliente auxCliente;     //Cliente Auxiliar
            double quantum = 1.0;
            //BigDecimal quantum = new BigDecimal("0.5");
            //BigDecimal time = new BigDecimal("0.0000");
            double time = 0.0;
            int paquete = 0;
     
            //Para cada cliente 
            for(int i=0; i <Simulacion.readyList.size(); i++){
                auxCliente = Simulacion.readyList.get(i);
                System.out.println("");
                
                  
                //Verificar si la lista de paquetes ya se acabo 
                //para sacar al cliente de la lista
                if(auxCliente.getList().isEmpty()){
                    System.out.print("\nBorrado"); 
                    Simulacion.readyList.remove(auxCliente);
                }
                
                //Atiendelo por 0.5 segundos 
                while(time <= quantum){
                    
                    //Se agregan al buffer los paquetes si es que tiene espacio
                    //de lo contrario se pierden...
                    if(Simulacion.buffer.freeSpace()){
                        System.out.print(" time " + time + " idC: " + auxCliente.getList().get(paquete).getInfo());
                        
                        Buffer.buffer.add(auxCliente.getList().remove(paquete));
                        //Se vuelve a llamar a lectura para ir vaciando el buffer **
                        readFromBuffer(Simulacion.buffer);  
            
                    }else{
                        System.out.print("\nBasura - size " + Buffer.buffer.size());
                        auxCliente.getList().remove(paquete);
                    }
                       
                    //paquete++;
                    time += 0.1;
                }
                time = 0.0;
              
                
            }
         
        }
    }
    
}
