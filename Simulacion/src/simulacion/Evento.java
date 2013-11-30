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
    
    //Construye nodo
   public Evento(int idCliente, int idMarco, int ta, int size){
      this.idCliente = idCliente;
      this.idMarco = idMarco;
      this.ta = ta;
      this.size = size;
   }

    
    //Obtiene info
   public String getInfo(){
      //System.out.print("id: " + id + "ta:" + ta);
      return "IdCliente:" + idCliente + " idMarco:" + idMarco + " Ta:" + ta + " Size:" + size + "\n";
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
    
}
