import java.util.LinkedList;
import java.util.List;


public class BusquedaLineal {

    public static void VerFal(List<Integer> lista, int elemSearch) {
        int tam = lista.size();
        int com = 0;
        
        for (int elemento: lista) {
            if (elemento == elemSearch) com++;
        }

        if (com == 1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    /*
    public static void Indices (int list) {
    }


    public static void Retidas (int list) {
    }  
    */

}