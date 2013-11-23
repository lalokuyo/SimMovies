/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

/**
 *
 * @author Eduardo
 */
public class Cliente {
    
    //Variables
    int id;
    int ta;
    
    //Construye nodo
   public Cliente(int num, int tiempo){
      id = num;
      ta = tiempo;
   }

    
    //Obtiene info
   public void getInfo(){
      System.out.print("id: " + id + "ta:" + ta);
   }
    
}
