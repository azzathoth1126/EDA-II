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
    Nodo root;
    
    public ArbolBin(){
        root=null;
    }
    
    public ArbolBin(int val){
        root = new Nodo(val);
    }
    
    public ArbolBin(Nodo root){
        this.root=root;
    }
    
    public void add(Nodo padre, Nodo hijo, int lado){
	if(lado==0)
            padre.setIzq(hijo);
	else
            padre.setDer(hijo);
    }
    
    protected void visit(Nodo n){
        System.out.println(n.valor + " ");
    }	

    public void preOrden(Nodo nodo){
        if(nodo == null){
            return;
        }else{
           visit(nodo);
           System.out.println(", ");
           preOrden(nodo.getIzq(nodo));
           preOrden(nodo.getDer(nodo));
        }
    }
    

    public void inOrden(Nodo nodo){
        if(nodo == null){
            return;
        }else{
           inOrden(nodo.getIzq(nodo));
           visit(nodo);
           System.out.println(", ");
           inOrden(nodo.getDer(nodo));
        }
    }


    public void postOrden(Nodo nodo){
        if(nodo == null){
            return;
        }else{
           postOrden(nodo.getIzq(nodo));
           postOrden(nodo.getDer(nodo));
           visit(nodo);
           System.out.println(", ");
        }
    }


    public void breadthFrist(){
        Nodo r = root;
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
