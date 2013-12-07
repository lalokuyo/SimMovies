/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;


import java.math.BigDecimal;
import java.util.*;

public class Simulacion {
    
    //************** VARIABLES DE TIEMPO DE SIMULACION ****************
    public static BigDecimal time = new BigDecimal("0.0000");
    public static BigDecimal fin = new BigDecimal("100.000");
    public static BigDecimal fijo = new BigDecimal("0.5");
    public static BigDecimal fijoAux = new BigDecimal("0.0001");
    public static BigDecimal otrofijoAux = new BigDecimal("0.1");
    public static BigDecimal aux;
    
    public static int       totalRechazados = 0;
    public static double    totalPaquetes = 0.0;
    public static int       numEvento= 0;
    public static int       size;
    
    //************** LISTAS Y BUFFER  ******************************************
    public static Buffer buffer = new Buffer(50);
    
    //Lista de clientes predefinidos
    public static List<Cliente> readyList = new ArrayList<Cliente>();
    //Lista de eventos de llegada 
    public static List<Evento> listaEvento = new ArrayList<Evento>();
     
    //************** VARIABLES SIMULACION *******************************
     public static double k = 20.0;  //NUMERO DE CLIENTES
     public static double valorRand_Trans = 0.0; 
     public static double E = 0.001;
     
     
    public static void main(String[] args) {    

        //****************** DEFINICION DE CLIENTES ***************************************
               
         //Clientes predefinidos
        for(int id=0; id < k; id++){
            Cliente cliente = new Cliente(id, 0, 0, 0, 0);
            readyList.add(cliente);
        }
        
         //Eventos predefinidos
        for(int id=0; id < k; id++){
           //Peticiones clientes nuevos (id, marco, time, size, maxPq.)
            Evento pet = new Evento(id, 0, id+2, 10, 0);
            listaEvento.add(pet);
        }
         
        //Tamaño de lista de peticiones
         size = listaEvento.size()-1;
         
  //*********************** CICLO PRINCIPAL **********************************************
         while ((time.compareTo(fin)) == -1){
            // System.out.print(time + " tAux: " + timeAux);
             System.out.print(time);
             clientFinder();
                 
             System.out.println(""); 
          
             time = time.add(otrofijoAux);
         }//Fin While
         
   //*********************** IMPRESION DE RESULTADOS **********************************************
         System.out.println("\nCLIENTES ATENDIDOS:");
         //Impresión de los elementos en la lista
         for(int i=0; i < readyList.size(); i++){
            System.out.print("Cliente " + readyList.get(i).getInfo() );
            System.out.println("UTILIZACION: " + ((double)readyList.get(i).marcosCompletos/(double)readyList.get(i).getMarcoActual()) );
            for(int j=0; j < readyList.get(i).getList().size(); j++){
                System.out.println(readyList.get(i).getList().get(i).idCliente);
            
            }
         }
         
         /*System.out.print("\nTotal Rechazados: " + totalRechazados );
         System.out.print("\nTotal Paquetes: " + totalPaquetes);
         System.out.print("\n% de Sat: " + (double)(totalRechazados*100)/(double)totalPaquetes);*/
         
         //Impresión de los elementos en la lista
         for(int i=0; i < buffer.getList().size(); i++){
           // System.out.print("El Buffer tiene:\n " + buffer.getList().get(i).getInfo());
         }
         
         
        
    }
    
    public static void clientFinder(){
        
        CapaRed.disminuyeTiempo();
        if(!listaEvento.isEmpty()){
        
        double tiempoTemp = (double)listaEvento.get(numEvento).getTa();
            aux = new BigDecimal(tiempoTemp); //Este es el Ta del evento convertido a BD

            //Se truncan los decimales del tiempo
            BigDecimal trunc = time.setScale(1,BigDecimal.ROUND_DOWN);
           // System.out.print(" Entra: " + trunc);
            //Si el tiempo de llegada es igual al tiempo del contador
            if(trunc.compareTo(aux) == 0){  
              System.out.println(" num: "+ listaEvento.get(numEvento).getTa());

              System.out.print("Entro a buffer: "+buffer.freeSpace());

             //Si el buffer tiene espacio se agrega un evento
             if(buffer.freeSpace()){
                 //Si su probabilidad es mayor a la probabilida de error 
                  if(Simulacion.errorCheck()){
                     buffer.getList().add(listaEvento.remove(numEvento));
                     //System.out.print("SE AGREGO!");
                     CapaRed.readFromBuffer(buffer);   //Se lee del buffer 
                  }
              }

              if(numEvento < size){                        
                //numEvento++;
              }
           }
            
        }else{
            CapaRed.readFromBuffer(buffer);   //Se lee del buffer 
        }
        
    }
    
    
    public static boolean errorCheck(){
                valorRand_Trans = Math.random();
                if(valorRand_Trans > (E*k)){
              //      System.out.println("Si se procesa");
                    return true;
                }else{
                    return false;
                }
    }
    
     
    
    
}
