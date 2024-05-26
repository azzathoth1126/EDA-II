
public class ArbolBin {
    Nodo raiz;


    public ArbolBin(){
        raiz = null;
    }


    public ArbolBin(String value){
        raiz = new Nodo(value);
    }
        
    
    //Imprime el valor del nodo indicado
    protected void visit(Nodo n){
        String valor = n.value;
        System.out.print(" " + valor);
    }	


    //Recorrido en InOrden del arbol
    public void inOrden(Nodo nodo){
        if(nodo == null){
            return;
        }else{
           inOrden(nodo.getIzq(nodo));
           visit(nodo);
           inOrden(nodo.getDer(nodo));
        }
    }
}