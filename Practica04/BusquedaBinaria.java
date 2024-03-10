import java.util.LinkedList;
import java.util.List;

public class BusquedaBinaria {

    public static void busqueda(List<Integer> lista, int elemSearch, int inicio, int fin) {
        if (inicio <= fin) {

            int mid = ((fin + inicio) / 2);
            //System.out.println("Inicio: " + inicio + " Fin: "+ fin + " Pivote: " + mid);
            
            if(elemSearch == lista.get(mid)) {
                System.out.println("Elemento encontrado\n");
            }

            if(elemSearch > lista.get(mid)) {
                busqueda(lista, elemSearch, mid + 1, fin);
            }

            if(elemSearch < lista.get(mid)) {
                busqueda(lista, elemSearch, inicio, mid - 1); 
            }   
        } else{
            System.out.println("El elemento no se encuentra");
        }
    }
}