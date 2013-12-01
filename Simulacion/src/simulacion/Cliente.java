/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulacion;

/**
 *
 * @author ivonne
 */
public class Cliente {
    
    //Variables
    Cliente nextCliente;
    
    int idClient; //Identificador de cliente
    int paqXmarco; //nùmero de paquetes que he recibido por marco
    int totalPaq; //Total paquetes que espero recibir en el marco
    int marcosCompletos; //La cantidad de marcos completos que he recibido
    int marcoActual; //Número de marco del que estoy recibiendo paquetes
    
    //Construye nodo
    public Cliente(int idClient, int paqXmarco, int totalPaq, int marcosCompletos, int marcoActual){
        this.idClient = idClient;
        this.paqXmarco = paqXmarco;
        this.totalPaq = totalPaq;
        this.marcosCompletos = marcosCompletos;
        this.marcoActual = marcoActual;
    }
    
    //Obtener Información de nodo 
    public String getInfo(){
    
        return "idClient:" + idClient + "paquetes por Marco:" + paqXmarco + " Total paquetes:" + totalPaq + "Marcos Completos:" + marcosCompletos + "Marco Actual:" + marcoActual + "\n";
    }
    
    //Obtiene el num de cliente
    public int getIdClient(){
        return idClient;
    }
    
    
    //Obtiene cantidad de paquetes que recibido por marco
    public int getPaqXmarco(){
        return paqXmarco;
    }
    
   //Fija cantidad de paquetes por que recibido por marco
    public void setPaqXmarco(int paqXmarco){
        this.paqXmarco = paqXmarco;
    }
    
    //Aumenta cuando llega un nuevo paquete de ese marco
    public void AumentaPaqXmarco(){
        paqXmarco++;
    }
    
    //Obtiene el total de paquetes que debe tener un marco
    public int getTotalPaq(){
        return totalPaq;
    }
    
    //Fija la cantidad de paquetes que debe tener ese marco
    public void setTotalPaq(int totalPaq){
        this.totalPaq = totalPaq;
    }
    
   /* public void AumentaTotalPaq(){
        totalPaq++;
    }*/
    
    //Obtiene la cantidad de Marcos Completos que recibieron de ese cliente
    public int getMarcosCompletos(){
        return marcosCompletos;
    }
    
    /*
    public void setMarcosCompletos(int marcosCompletos){
        this.marcosCompletos = marcosCompletos;
    }*/
    
    //Aumenta cada vez que haya llegado otro marco completo
    public void AumentaMarcosCompletos(){
        marcosCompletos++;    
    }
    
    //Obtiene el marco Actual
    public int getMarcoActual(){
        return marcoActual;
    }
    
    //Fija el marco Actual
    public void setMarcoActual(int marcoActual){
        this.marcoActual = marcoActual;
    }
    //Aumenta el Marco Actual
    public void AumentaMarcoActual(){
        marcoActual++;
    }
    
}

    


 