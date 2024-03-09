import java.util.LinkedList;
import java.util.List;

public class BusquedaBinaria {

    public static boolean busqueda(List<Integer> lista, int elemSearch, int fin, int inicio) {

        if (inicio <= fin) {

            int mid = ((fin + inicio) / 2);
            
            if(lista.get(mid) == elemSearch) return true;

            if(lista.get(mid) < elemSearch) busqueda(lista, elemSearch, mid-1, 0);

            if(lista.get(mid) > elemSearch) busqueda(lista, elemSearch, fin, mid+1);
        }

        return false;
    }
}