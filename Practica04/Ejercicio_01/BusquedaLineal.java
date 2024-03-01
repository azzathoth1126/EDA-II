import java.util.LinkedList;
import java.util.List;


public class BusquedaLineal {

    public static void VerFal(List<Integer> lista, int elemSearch) {
        int tam = lista.size();
        
        for (int elemento: lista) {
            if (elemento == elemSearch){
                System.out.println("\nTrue");
            }
        }

    }
    /*
    public static void Indices (int list) {
    }


    public static void Retidas (int list) {
    }  
    */

}