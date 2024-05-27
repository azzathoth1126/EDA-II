import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/*
import java.util.Scanner;
*/
import java.util.Set;

public class Principal{

    public static void main(String []args) {

        //Variable mp que se inicializa con una instancia de HashMap<String, Integer>.
        HashMap<String,Integer> mp = new HashMap<>();

        //Obtiene toda la colección de valores del HashMap
        Collection<Integer> valores = mp.values();

        //Obtiene toda la colección de claves del HashMap
        Set<String> claves = mp.keySet();

        System.out.println("\nTabla Hash creada");

        // Añadiendo elementos en la tabla Hash
        mp.put("Alexis", 22);
        mp.put("Maria", 33); 
        mp.put("Armando", 10);
        mp.put("Luz", 20);
        mp.put("Erina", 30); 
        mp.put("Karla", 23); 
        mp.put("Fernando", 19); 
        mp.put("Jonathan", 21); 
        mp.put("Paola", 23); 
        mp.put("Ana", 22); 
        System.out.println("\nElementos Agregados");  


        //Verificando si la tabla esta vacia y cuantos elementos tiene
        if(!mp.isEmpty()){
            System.out.println("\nLa tabla si tiene elementos");
            System.out.println("Cuanto elementos contiene la tabla: " + mp.size());

            imprimir(mp); //Imprimiendo la tabla Hash
        }
        

        //Obteniendo datos de los elementos, agregando elementos y eliminando
        System.out.println("\nCual es la edad de Alexis " + mp.get("Alexis"));
        mp.put("Tere", 45);
        mp.remove("Ana");
        System.out.println("Cambios efecutados\n");
        imprimir(mp); //Imprimiendo la tabla Hash


        //Comparando elementos
        if (mp.get("Alexis").equals(mp.get("Tere"))){
            System.out.println("\nLos valores son iguales");
        }else System.out.println("\nLos elementos no son iguales");


        // Iterar los valores y los mostrarlos
        System.out.println("\nValores en el mapa:");
        for (Integer valor : valores) {
            System.out.println(valor);
        }


        //Itera las claves y las muestra
        System.out.println("\nClaves en el mapa:");
        for (String clave : claves) {
            System.out.println(clave);
        }

        //containKey() Busca en la tabla si existe dicho DATO o NOMBRE o LLAVE
        System.out.println("\nExiste Alexis en la tabla: " + mp.containsKey("Alexis"));

        //containValue() Busca en la tabla si existe dicho DATO o EDAD o VALOR 
        System.out.println("\nAlguien tiene la edad de 79 años en la tabla: " + mp.containsValue(79));
        
        

    }


    public static void imprimir(Map<String,Integer> elemento) {
        System.out.println("\nTabla Hash: ");
        for(Map.Entry<String,Integer>entry : elemento.entrySet()){
            System.out.println("Nombre: " + entry.getKey() + ", Edad: " + entry.getValue());
        }
    }

}


/* 
         •• containsKey
         •• containsValue
         •• equals
         •• get, put, remove
         •• size
        • otros 3 métodos de tablas hash y explicar su funcionamiento:
            isEmpty()
            Collection<V> values()
            Collection<C> claves()
*/ 