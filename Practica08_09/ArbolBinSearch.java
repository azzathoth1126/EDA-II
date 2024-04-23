
public class ArbolBinSearch {

    Nodo root;
    

    public ArbolBinSearch(){
        root=null;
    }


    public ArbolBinSearch(int val){
        root = new Nodo(val);
    }


    public ArbolBinSearch(Nodo root){
        this.root=root;
    }


    public void add(Nodo nPadre, Nodo nHijo){

        if(nPadre.valor > nHijo.valor) {
            if(nPadre.der == null) {
                nPadre.der = nHijo;
                return;
            } else {
                add(nPadre.der,nHijo);
            }
        }else {
            if(nPadre.valor < nHijo.valor) {
                if(nPadre.izq == null) {
                    nPadre.izq = nHijo;
                    return;
                } else {
                    add(nPadre.izq,nHijo);
                    return;
                }
            }
        }

    }


    protected void visit(Nodo n){
        System.out.println(n.valor + " ");
    }	


    public void preOrden(Nodo nodo){
        if(nodo == null){
            return;
        }else{
           visit(nodo);
           preOrden(nodo.getIzq(nodo));
           preOrden(nodo.getDer(nodo));
        }
    }

}
