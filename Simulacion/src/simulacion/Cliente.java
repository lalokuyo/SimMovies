/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

/**
 *
 * @author Eduardo
 */
public class Cliente{
    
    //Variables
    Cliente nextCliente;
    int id;
    int ta;
    
    //Construye nodo
   public Cliente(int ide, int tiempo){
      id = ide;
      ta = tiempo;
   }

    
    //Obtiene info
   public String getInfo(){
      //System.out.print("id: " + id + "ta:" + ta);
      return id + " " + ta;
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
    
}
