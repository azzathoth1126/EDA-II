import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Integer> lista1 = new LinkedList<>() ;

        int elemSearch = 26;

        //Comprobando si la lista esta vacia
 
        System.out.println("\nCuantos elementos tiene la lista: " + lista1.size());
        System.out.println("La lista esta vacia: " + lista1.isEmpty());

        //Agragando elementos a la lista
        lista1.add(15);
        //Elementos extra
        lista1.add(18);
        lista1.add(19);
        lista1.add(26);
        lista1.add(27);
        lista1.add(29);
        //Fin del los elementos extra
        lista1.add(80);

        System.out.println("\nElementos agregados");

        //Imprimiendo lista 1
        System.out.println("\n Lista 1");
        imprimirLista(lista1);
        System.out.println("\n *** ");

        //Agregando mas elementos
        lista1.add(2,300);
        lista1.add(4,500);
        lista1.add(5,700);

        System.out.println("\nElementos agregados");

        //Imprimiendo lista 1
        System.out.println("\n Lista 1");
        imprimirLista(lista1);
        System.out.println("\n *** ");

        //Cambiando elementos de la lista
        lista1.set(1, 14);
        lista1.set(2, 16);
        lista1.set(7, 18);

        System.out.println("\nElementos cambiados");

        System.out.println("\n Lista 1");
        imprimirLista(lista1);
        System.out.println("\n *** ");

        //Creando SubListas
        List<Integer> lista2, lista3;
        //Llenado SubListas
        lista2 = lista1.subList(2, 4);
        lista3 = lista1.subList(2, 4);

        //Imprimiendo listas 2 y 3
        System.out.println("\nLista 2");
        imprimirLista(lista2);
        System.out.println("\n *** ");

        System.out.println("\nLista 3");
        imprimirLista(lista3);
        System.out.println("\n *** ");

        //Comparando si la lista 1 y 2 son iguales
        System.out.println("\nSon la lista 1 y 2 iguales: ");
        System.out.println("\n" + lista1.equals(lista2));  

        //Eliminando elelmentos de la lista 1

        int tam = lista1.size();
        System.out.println("\nTamaño de la lista 1: " + tam);

        System.out.println("\n Lista 1");
        imprimirLista(lista1);
        System.out.println("\n *** ");

        //Busqueda secuencial
        System.out.println("\n Busqueda Lineal o Secuencial");

        System.out.println("\nBuscando el elemento " + elemSearch + " :");
        BusquedaLineal.Contiene(lista1, elemSearch);
        BusquedaLineal.Posicion(lista1, elemSearch,tam);
        BusquedaLineal.Repetido(lista1, elemSearch);

        //Ordenando la lista para la busqueda binaria
        Collections.sort(lista1);
        System.out.println("\n Lista 1 ordenada");
        imprimirLista(lista1);
        System.out.println("\n *** ");

        //Busqueda Binaria
        System.out.println("\n Busqueda Binaria");

        System.out.println("\nSe encuenta " + elemSearch + " en la lista: ");
        BusquedaBinaria.busqueda(lista1, elemSearch, 0, tam-1);

        //Agregando elemento repetido
        lista1.add(7, 26);
        Collections.sort(lista1);
        System.out.println("\n Lista 1 ordenada");
        imprimirLista(lista1);
        System.out.println("\n *** ");

        tam = lista1.size();
        BusquedaBinaria.busquedaRepetida(lista1, elemSearch, 0, tam);
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


/**
        System.out.println("\nImprimiendo lista 1");
        imprimirLista(lista1);
        System.out.println("\nImprimiendo lista 2");
        imprimirLista(lista2);
        System.out.println("\nImprimiendo lista 3");
        imprimirLista(lista3);
 */