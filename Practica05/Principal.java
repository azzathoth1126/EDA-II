import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal{

    public static void main(String []args) {

        //Variable mp que se inicializa con una instancia de HashMap<String, Integer>.
        Map<String,Integer> mp = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        //isEmpty() Devuelve true si la tabla esta vacio y false si la tabla tiene un elemento
        System.out.println("\nLa tabla contiene elementos: " + !mp.isEmpty());
        System.out.println("\nCuanto elementos contiene la tabla: " + mp.size());

        // Añadiendo elementos en la tabla Hash
        mp.put("Alexis", 22);
        mp.put("Maria", 43); 
        mp.put("Armando", 10);
        mp.put("Luz", 20);
        mp.put("Erina", 30);      

        System.out.println("\nElementos Agregados");  

        //Numeros de elementos en la tabla Hash
        System.out.println("\nCuanto elementos contiene la tabla: " + mp.size());

        //Imprimiendo elementos de la tabla Hash
        imprimir(mp);

        //containKey() Busca en la tabla si existe dicho DATO o NOMBRE o LLAVE
        System.out.println("\nExiste Alexis en la tabla: " + mp.containsKey("Alexis"));

        //containValue() Busca en la tabla si existe dicho DATO o EDAD o VALOR 
        System.out.println("\nAlguien tiene la edad de 79 años en la tabla: " + mp.containsValue(79));
        
        System.out.println("\nCual es la edad de Alexis " + mp.get("Alexis"));

    }


    public static void imprimir(Map<String,Integer> elemento) {
        System.out.println("\nTabla Hash: ");
        for(Map.Entry<String,Integer>entry : elemento.entrySet()){
            System.out.println("Nombre: " + entry.getKey() + ", Altura: " + entry.getValue());
        }
    }

}


/* 
        mp.put(3, p); // Añadimos un objeto persona al map
        p = new Persona("Yolanda",174);

        mp.put(4, p); // Añadimos un objeto persona al map
        p = new Persona("María Dolores",169);

        mp.put(4, p); // Esto crea una colisión ¡Dos objetos no pueden tener la misma clave!
*/ 