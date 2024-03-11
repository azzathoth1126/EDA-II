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

    public static void busquedaRepetida(List<Integer> lista, int elemSearch, int inicio, int fin) {
        int index = 0;
        if (inicio <= fin) {

            int mid = ((fin + inicio) / 2);
            //System.out.println("Inicio: " + inicio + " Fin: "+ fin + " Pivote: " + mid);
            
            if(elemSearch == lista.get(mid)) searchrRepetida(lista, elemSearch, mid);
            
            if(elemSearch > lista.get(mid)) busqueda(lista, elemSearch, mid + 1, fin);

            if(elemSearch < lista.get(mid)) busqueda(lista, elemSearch, inicio, mid - 1);

        } else{
            System.out.println("El elemento no se encuentra");
        }
    }

    public static void searchrRepetida(List<Integer> lista, int elemSearch, int mid) {

        int pivote = mid;
        int repeticiones = 1;

        pivote--;
        while (elemSearch == lista.get(pivote)) {
            pivote--;
            repeticiones++;
        }

        pivote = mid + 1;
        while (elemSearch == lista.get(pivote)) {
            pivote++;
            repeticiones++;
        } 

        System.out.println("Hay "+ repeticiones + " veces el elemento " + elemSearch);
    }
}