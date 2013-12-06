/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

/**
 *
 * @author Eduardo
 */
public class Evento{
    
    //Variables
    Evento nextEvento;
    
    int idCliente; 
    int idMarco;
    int ta;
    int size;
    int cantPaq; //cantidad de paquetes que tiene cada marco
    int espera = 22;
    
    //Construye nodo
   public Evento(int idCliente, int idMarco, int ta, int size, int cantPaq){
      this.idCliente = idCliente;
      this.idMarco = idMarco;
      this.ta = ta;
      this.size = size;
      this.cantPaq = cantPaq;
   }

    
    //Obtiene info
   public String getInfo(){
      //System.out.print("id: " + id + "ta:" + ta);
      return "IdCliente:" + idCliente + " idMarco:" + idMarco + " Ta:" + ta + " Size:" + size + " QP:" + cantPaq + "\n";
   }
    
   //Obtiene id del cliente
   public int getIdCliente(){
      //System.out.print("id: " + id + "ta:" + ta);
      return idCliente;
   }
   
      //Obtiene id del marco
   public int getIdMarco(){
      //System.out.print("id: " + id + "ta:" + ta);
      return idMarco;
   }
   
   
    //Obtiene ta
   public int getTa(){
      //System.out.print("id: " + id + "ta:" + ta);
      return ta;
   }
   
     //Obtiene Size
   public int getSize(){
      //System.out.print("id: " + id + "ta:" + ta);
      return size;
   }
   
   //Obtiene la cantidad de paquetes que hay en el marco
   public int getCantPaq(){
       return cantPaq;
   }
    
}
