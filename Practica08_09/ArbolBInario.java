public class ArbolBInario {

    Nodo raiz;

    public ArbolBInario(){
        raiz = null;
    }


    public void insertar(int valor){

        if(this.raiz == null){
            this.raiz = new Nodo(valor);
        }else{
            this.raiz.insertar(valor);
        }
    }


    public void getValor(){

    }

    /*
    //Lanzamiento PreOrden
    public void preOrden(ArbolBin nodo){
        if(nodo == null){
            return;
        }else{
            System.out.println(nodo.getValor() + ", ");
            preOrden(nodo.getNodoIzq());
            preOrden(nodo.getNodoDer());
        }
    }

    //Lanzamiento InOrden
    public void inOrden(ArbolBin nodo){
        if(nodo == null){
            return;
        }else{
            inOrden(nodo.getNodoIzq());
            System.out.println(nodo.getValor() + ", ");
            inOrden(nodo.getNodoDer());
        }
    }


    //Lanzamiento PostOrden
    public void postOrden(ArbolBin nodo){
        if(nodo == null){
            return;
        }else{
            postOrden(nodo.getNodoIzq());
            postOrden(nodo.getNodoDer());
            System.out.println(nodo.getValor() + ", ");
        }
    }

     */

}