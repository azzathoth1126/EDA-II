import java.util.LinkedList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Integer> lista1 = new LinkedList<>() ;

        int elemSearch = 19;

        lista1.add(15);
        //[Aquí agrega 5 instrucciones más de “add” con los elements que quieras]
        lista1.add(18);
        lista1.add(19);
        lista1.add(26);
        lista1.add(27);
        lista1.add(29);
        //Fin del los 5 elementos agregados
        lista1.add(80);

        System.out.println("\n Estado 1 ");
        imprimirLista(lista1);
        System.out.println("\n *** ");

        lista1.add(2,300);
        lista1.add(4,500);
        lista1.add(5,700);

        System.out.println("\n Estado 2 ");
        imprimirLista(lista1);
        System.out.println("\n *** ");

        lista1.set(1, 14);
        lista1.set(2, 16);
        lista1.set(7, 18);

        System.out.println("\n Estado 3 ");
        imprimirLista(lista1);
        System.out.println("\n *** ");

        List<Integer> lista2, lista3;
        lista2 = lista1.subList(2, 4);
        lista3 = lista1.subList(2, 4);
        imprimirLista(lista2);
        System.out.println("\n *** ");
        imprimirLista(lista3);
        System.out.println(lista1.equals(lista2));

        /*
        System.out.println("\nImprimiendo lista 1");
        imprimirLista(lista1);
        System.out.println("\nImprimiendo lista 2");
        imprimirLista(lista2);
        System.out.println("\nImprimiendo lista 3");
        imprimirLista(lista3);
        */

        System.out.println("\nBuscando el elemento " + elemSearch + " :");
        BusquedaLineal.VerFal(lista1, elemSearch);

    }

    public static void imprimirLista(List<Integer> listaPrint){
        int i = 0;
        for(Integer var : listaPrint){
            System.out.println("P " + i++ + ": " + var);
        }
    }

}


//add agrega un elemento en la lista en la posición que quieras
//set cambia un elemento de la lista en la posción que eliges

//          Elementos del metodo imprimirLista
//          System.out.println(var);
//          i++;