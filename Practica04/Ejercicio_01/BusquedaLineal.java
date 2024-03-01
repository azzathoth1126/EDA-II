import java.util.LinkedList;
import java.util.List;


public class BusquedaLineal {

    public static void VerFal(List<Integer> lista, int elemSearch) {
        int com = 0;

        for (int elemento: lista) if (elemento == elemSearch) com++;

        if (com == 1) System.out.println("True");    
        else System.out.println("False");
    }
    
    public static void Indices (List<Integer> lista, int elemSearch) {
        int i = 0;

        for(int elemento: lista) {
            if (elemento == elemSearch){
                System.out.println("Posicion: " + i);
            }
            i++;
        } 
    }


    public static void Repetidos (List<Integer> lista, int elemSearch) {
        int i = 0;

        for(int elemento: lista) if (elemento == elemSearch) i++;

        System.out.println("Numero de elementos iguales :" + i);
    }

}