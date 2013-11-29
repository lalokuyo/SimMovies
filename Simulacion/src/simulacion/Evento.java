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
    int id; 
    int ta;
    int size;
    
    //Construye nodo
   public Evento(int id, int ta, int size){
      this.id = id;
      this.ta = ta;
      this.size = size;
   }

    
    //Obtiene info
   public String getInfo(){
      //System.out.print("id: " + id + "ta:" + ta);
      return id + " " + ta + " " + size;
   }
    
   //Obtiene id
   public int getId(){
      //System.out.print("id: " + id + "ta:" + ta);
      return id;
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
