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
 
    public static int inicioLista = 0; //Contador de posición de lectura en la lista "ready.list"
     public static int finLista = 0;
    
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
                finLista++;
                addToBuffer();
              
                
             //Else si el evento es respuesta para cliente       
            }else if(buffer.getList().get(index).idMarco != 0){
                //buffer.getList().remove(index); //Quitalo de la lista
               
                //Aqui va lo tuyo ivonne
                //AppCliente.funcionChida
                
                  AppCliente.VideoReader(buffer.getList().get(index));
                  buffer.getList().remove(index); 

            }
        
            //
        }
        
    }
    
    
    public static void addToBuffer(){
        
       //Se asigna el valor del final de la lista para no atender a clientes vacios 
        
        System.out.println("FinLista: " + finLista);
        //Mientras haya Clientes con listas 
        while(inicioLista < finLista){
        //while(inicioLista < Simulacion.readyList.size()){
           
            Cliente auxCliente;     //Cliente Auxiliar
            //double quantum = 1.0;
            //BigDecimal quantum = new BigDecimal("0.5");
            //BigDecimal time = new BigDecimal("0.0000
            
            BigDecimal quantum = new BigDecimal("0.0005");
            BigDecimal time = new BigDecimal("0.0000");
            BigDecimal fijo = new BigDecimal("0.0001");
            BigDecimal zero = new BigDecimal("0.0000");
            //double time = 0.0;
            int paquete = 0;
             //
     
            //Para cada cliente 
            for(int i=inicioLista; i < finLista; i++){
                auxCliente = Simulacion.readyList.get(i);
                System.out.println("\nAtendiendo cliente: " + auxCliente.idClient);
                
                
                    //Atiendelo por 0.5 segundos mientras su lista no este vacia
                    while(((time.compareTo(quantum))==-1) && !auxCliente.getList().isEmpty()){
                        
                       // if(!auxCliente.getList().isEmpty()){

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
                       // }

                        //paquete++;
                       // time += 0.1;
                            time = time.add(fijo);

                    }
                   // time = 0.0;
                    time = zero;
                
                //Verificar si la lista de paquetes ya se acabo 
                //para sacar al cliente de la lista
                if(auxCliente.getList().isEmpty()){
                    System.out.print("\nBorrado " + auxCliente.idClient); 
                    //Simulacion.readyList.remove(auxCliente);
                    inicioLista++;
                    break; //Se tiene que reiniciar el for para que no salte a nadie
                   
                }
                
            }
         
        }
    }
    
}
