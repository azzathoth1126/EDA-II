import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Integer> lista1 = new LinkedList<>() ;

        lista1.add(15);
        //[Aquí agrega 5 instrucciones más de “add” con los elements que quieras]
        lista1.add(18);
        lista1.add(19);
        lista1.add(26);
        lista1.add(5);
        lista1.add(19);
        //Fin del los 5 elementos agregados
        lista1.add(80);

        System.out.println(" Estado 1 ");
        imprimirLista(lista1);
        System.out.println(" *** ");

        lista1.add(2,300);
        lista1.add(4,500);
        lista1.add(5,700);

        System.out.println(" Estado 2 ");
        imprimirLista(lista1);
        System.out.println(" *** ");

        lista1.set(1, 14);
        lista1.set(2, 16);
        lista1.set(7, 18);

        System.out.println(" Estado 3 ");
        imprimirLista(lista1);
        System.out.println(" *** ");

        List<Integer> lista2, lista3;
        lista2 = lista1.subList(2, 4);
        lista3 = lista1.subList(2, 4);
        imprimirLista(lista2);
        System.out.println(" *** ");
        imprimirLista(lista3);
        System.out.println(lista1.equals(lista2));

    }

    public static void imprimirLista(List<Integer> listaPrint){
        for(Integer var : listaPrint){
            System.out.println(var);
        }
    }
}