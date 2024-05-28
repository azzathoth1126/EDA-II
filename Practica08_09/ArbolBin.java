import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edgar
 */
public class ArbolBin {

    Nodo raiz;
    
    public ArbolBin(){
        raiz=null;
    }
    

    public ArbolBin(int val){
        raiz = new Nodo(val);
    }
    

    public ArbolBin(Nodo root){
        this.raiz=root;
    }
    

    //Metodo para insertar un nodo
    public void add(Nodo padre, Nodo hijo, int lado){
	if(lado==0)
            padre.setIzq(hijo);
	else
            padre.setDer(hijo);
    }
    
    
    //Metodo para imprimir un valor
    protected void visit(Nodo n){
        System.out.print(n.valor + " ");
    }	


    //Recorrido en PreOrden 
    public void preOrden(Nodo nodo){
        if(nodo == null){
            return;
        }else{
           visit(nodo);
           preOrden(nodo.getIzq(nodo));
           preOrden(nodo.getDer(nodo));
        }
    }
    

    //Recorrido en InOrden
    public void inOrden(Nodo nodo){
        if(nodo == null){
            return;
        }else{
           inOrden(nodo.getIzq(nodo));
           visit(nodo);
           inOrden(nodo.getDer(nodo));
        }
    }


    //Recorrido en PostOrden 
    public void postOrden(Nodo nodo){
        if(nodo == null){
            return;
        }else{
           postOrden(nodo.getIzq(nodo));
           postOrden(nodo.getDer(nodo));
           visit(nodo);
        }
    }


    //Metod para insertar de manera recursiva
    public Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }
        if (raiz.izq == null) {
            raiz.izq = insertarRec(raiz.izq, valor);
        } else {
            raiz.der = insertarRec(raiz.der, valor);
        }
        return raiz;
    }


    public void eliminar(int valor) {
        this.raiz = eliminarRec(this.raiz, valor);
    }

    private Nodo eliminarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.izq = eliminarRec(raiz.izq, valor);
        } else if (valor > raiz.valor) {
            raiz.der = eliminarRec(raiz.izq, valor);
        } else {
            // Nodo con un solo hijo o sin hijos
            if (raiz.izq == null) {
                return raiz.der;
            } else if (raiz.der == null) {
                return raiz.izq;
            }

            // Nodo con dos hijos: Obtenga el sucesor en inorden (el más pequeño
            // en el subárbol derecho)
            raiz.valor = minValor(raiz.der);

            // Elimine el sucesor en inorden
            raiz.der = eliminarRec(raiz.der, raiz.valor);
        }

        return raiz;
    }

    private int minValor(Nodo raiz) {
        int minv = raiz.valor;
        while (raiz.izq != null) {
            minv = raiz.izq.valor;
            raiz = raiz.izq;
        }
        return minv;
    }

    public void breadthFrist(){
        Nodo r = raiz;
        Queue<Nodo> queue = new LinkedList();
        if(r!=null){
            queue.add(r);
            while(!queue.isEmpty()){
                r = (Nodo)queue.poll();
                visit(r);
                if(r.izq!=null)
                    queue.add(r.izq);
                if(r.der!=null)
                    queue.add(r.der);
            }
        }
    }

}
