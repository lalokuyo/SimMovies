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
        
        //Mientras existan elementos Cliente en el buffer se verifica 
        for(int i=0; i < buffer.getList().size(); i++){
                        
           //Si el evento es un Cliente -> procesa su lista
            if(buffer.getList().get(i).idMarco == 0){
                
                System.out.println("\nCliente: " + buffer.getList().get(i).idCliente + " index: " + i);
                AppServer.fileReader("Terse_Jurassic.dat", buffer.getList().remove(i).idCliente); //Quitalo de la lista
                finLista++;
                addToBuffer();
              
                
             //Else si el evento es respuesta para cliente       
            }else if(buffer.getList().get(index).idMarco != 0 && buffer.getList().get(index).espera == 0){
                
                  AppCliente.VideoReader(buffer.getList().remove(index));
            }
        }
        
    }
    
    
    public static void addToBuffer(){
        
       //Se asigna el valor del final de la lista para no atender a clientes vacios 
        
        System.out.println("FinLista: " + finLista);
        //Mientras haya Clientes con listas 
        //boolean ivonne = true;
        while(inicioLista < finLista){
           Cliente auxCliente;     //Cliente Auxiliar
             
            BigDecimal quantum = new BigDecimal("0.01");
            BigDecimal time = new BigDecimal("0.0000");
            BigDecimal fijo = new BigDecimal("0.01");
            BigDecimal zero = new BigDecimal("0.0000");
            //double time = 0.0;
            int paquete = 0;
             //
     
            //Para cada cliente 
            for(int i=inicioLista; i < finLista; i++){
                auxCliente = Simulacion.readyList.get(i);
                System.out.println("\nAtendiendo cliente: " + auxCliente.idClient);
                
                
                    //Atiendelo por 0.5 segundos mientras su lista no este vacia y no estè borrado
                    while(((time.compareTo(quantum)) == -1) && (!auxCliente.getList().isEmpty())){
                       
                       // Simulacion.timeAux = Simulacion.timeAux.add(Simulacion.fijoAux);
                        Simulacion.time = Simulacion.time.add(Simulacion.fijoAux);
                                               
                            //Se agregan al buffer los paquetes si es que tiene espacio
                            //de lo contrario se pierden...
                            if(Simulacion.buffer.freeSpace()){
                                
                                //Si paso el error
                                if(Simulacion.errorCheck()){
                                    System.out.print( auxCliente.getList().get(paquete).getInfo());
                                    Buffer.buffer.add(auxCliente.getList().remove(paquete));
                                    //Se vuelve a llamar a lectura para ir vaciando el buffer **
                                    disminuyeTiempo();
                                    readFromBuffer(Simulacion.buffer);
                                    
                                    
                                }else{ //SI no pasa error tiralo
                                    System.out.print("\nBasura - size " + Buffer.buffer.size());
                                    auxCliente.getList().remove(paquete);
                                    disminuyeTiempo();
                                    Simulacion.totalRechazados++;
                                }

                            }else{ //Si no pasa por buffer lleno tiralo
                                System.out.print("\nBasura - size " + Buffer.buffer.size());
                                auxCliente.getList().remove(paquete);
                                disminuyeTiempo();
                                Simulacion.totalRechazados++;
                            }
                            
                            time = time.add(fijo);

                    }//Fin While
                    time = zero;
                    
                    //Pregunta si llego alguien
                    Simulacion.clientFinder();
                

                    
                    
                //Verificar si la lista de paquetes ya se acabo 
                //para sacar al cliente de la lista
                if(auxCliente.getList().isEmpty()){
                    System.out.print("\nBorradoID " + auxCliente.idClient); 
                   
                    //Simulacion.readyList.remove(auxCliente);
                    inicioLista++;
                    break; //Se tiene que reiniciar el for para que no salte a nadie
                   
                }
                
                
            }
         
        }
    }
    
      public static void disminuyeTiempo(){
        if(!Simulacion.buffer.getList().isEmpty()){
          //Se disminuye el tiempo de espera por paquete hasta que sea 0
            if (Simulacion.buffer.getList().get(0).espera > 0){

                for(int i=0; i < Simulacion.buffer.getList().size(); i++){
                    Simulacion.buffer.getList().get(i).espera--;
                }
               // System.out.println("\nDISMINUYE!!!!*** " + Simulacion.buffer.getList().get(0).espera);

            }        
          
      }
     }
    
}
