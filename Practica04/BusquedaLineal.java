import java.util.LinkedList;
import java.util.List;


public class BusquedaLineal {

    public static void Contiene(List<Integer> lista, int elemSearch) {
        int indicador = 0;

        for (int elemento: lista) {
            if (elemento == elemSearch) {
                indicador++;
            }
        }

        if (indicador != 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    
    public static void Posicion(List<Integer> lista, int elemSearch, int tam) {
        
        for (int i=0; i < tam; i++) {
            if (lista.get(i) == elemSearch) {
                System.out.println("Posicion: " + i);
            }
        }
    }


    public static void Repetido(List<Integer> lista, int elemSearch) {
        int i = 0;

        for(int elemento: lista) {
            if (elemento == elemSearch) i++;
        }

        System.out.println("Elemento repetido " + i + " veces");
    }

}