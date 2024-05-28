import java.util.LinkedList;
import java.util.Queue;

public class ArbolBinSearch {

    Nodo raiz;
    

    public ArbolBinSearch(){
        raiz = null;
    }


    public ArbolBinSearch(int val){
        raiz = new Nodo(val);
    }


    public ArbolBinSearch(Nodo root){
        this.raiz=root;
    }


    public void insertar(int valor) {
        this.raiz = insertarRec(this.raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, int valor) {

        // Si el árbol está vacío, se crea un nuevo nodo
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        // Si el valor es menor que el valor de la raíz, se inserta en el subárbol izquierdo
        if (valor < raiz.valor) {
            raiz.izq = insertarRec(raiz.izq, valor);
        } else if (valor > raiz.valor) {// Si el valor es mayor que el valor de la raíz, se inserta en el subárbol derecho
            raiz.der = insertarRec(raiz.der, valor);
        }

        return raiz;
    }


    // Método para eliminar un valor del árbol de manera recursiva
    public void eliminar(int valor) {
        this.raiz = eliminarRec(this.raiz, valor);
    }

    private Nodo eliminarRec(Nodo raiz, int valor) {
        // Si el árbol está vacío, no hay nada que eliminar
        if (raiz == null) {
            return raiz;
        }

        // Si el valor a eliminar es menor que el valor de la raíz, se busca en el subárbol izquierdo
        if (valor < raiz.valor) {
            raiz.izq = eliminarRec(raiz.izq, valor);
        }
        // Si el valor a eliminar es mayor que el valor de la raíz, se busca en el subárbol derecho
        else if (valor > raiz.valor) {
            raiz.der = eliminarRec(raiz.der, valor);
        }
        // Si se encuentra el nodo a eliminar
        else {
            // Caso 1 y 2: Nodo con un solo hijo o sin hijos
            if (raiz.izq == null) {
                return raiz.der;
            } else if (raiz.der == null) {
                return raiz.izq;
            }

            // Caso 3: Nodo con dos hijos
            // Se encuentra el sucesor en inorden (el nodo con el valor mínimo en el subárbol derecho)
            raiz.valor = minValor(raiz.der);

            // Se elimina el sucesor en inorden del subárbol derecho
            raiz.der = eliminarRec(raiz.der, raiz.valor);
        }

        // Se retorna la raíz del subárbol modificado
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
    


    protected void visit(Nodo n){
        System.out.print(n.valor + " ");
    }	


    public void search(Nodo padre, int val){
        if (padre.valor == val){
            System.out.println("El nodo si esta en el arbol\n");
            return ;
        } else if(padre.valor>val){
            search(padre.izq, val);
        }else search(padre.der, val);
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
