/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edgar
 */

public class Nodo {
    
    int valor;
    Nodo izq = null;
    Nodo der = null;
    

    public Nodo(){
        izq = null;
        der = null;
    }


    public Nodo(int data){
        this(data,null,null);
    }


    public Nodo(int data, Nodo lt, Nodo rt){
        valor=data;
        izq = lt;
        der = rt;
    }   
    

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }
    
    
    public void setDer(Nodo der) {
        this.der = der;
    }


    //Obtener Nodo Derecho
    public Nodo getDer(Nodo nodo){
        return nodo.der;
    }


    //Obtener Nodo Izquierdo
    public Nodo getIzq(Nodo nodo){
        return nodo.izq;
    }

    
}
