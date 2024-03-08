import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal{

    public static void main(String []args) {

        Map<String,Integer> mp = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        //isEmpty() Devuelve true si la tabla esta vacio y false si la tabla tiene un elemento
        System.out.println("\nLa tabla contiene elementos: " + !mp.isEmpty());
        System.out.println("\nCuanto elementos contiene la tabla: " + mp.size());

        // Añadiendo elementos en la tabla Hash
        mp.put("Alexis", 22);
        mp.put("Maria", 43); 
        mp.put("Armando", 10);
        mp.put("Danai", 20);
        mp.put("Kaori", 30);      

        System.out.println("\nElementos Agregados");  

        System.out.println("\nCuanto elementos contiene la tabla: " + mp.size());

        System.out.println("\nTabla Hash: ");
        for(Map.Entry<String,Integer>entry : mp.entrySet()){
            System.out.println("Nombre: " + entry.getKey() + ", Altura: " + entry.getValue());

        }

        //containKey() Busca en la tabla si existe dicho DATO o NOMBRE o LLAVE
        System.out.println("\nExiste Alexis en la tabla: " + mp.containsKey("Alexis"));

        //containValue() Busca en la tabla si existe dicho DATO o EDAD o VALOR 
        System.out.println("\nAlguien tiene la edad de 79 años en la tabla: " + mp.containsValue(79));
        
        System.out.println("\nCual es la edad de Alexis " + mp.get("Alexis"));

    }

}

/* 
    .put(key, value) Ingresa los datos en la tabla
    .size() Devuelve el numero de datos en la tabla
    .containKey() Devuelve true si dicha llave (Key) esta en la tabla, en caso contrario devuelve false
    .containValue() Devuelve true si dicho valor (Value) esta en la tabla, en caso contrario devuelve false
*/ 

/* 
        mp.put(3, p); // Añadimos un objeto persona al map
        p = new Persona("Yolanda",174);

        mp.put(4, p); // Añadimos un objeto persona al map
        p = new Persona("María Dolores",169);

        mp.put(4, p); // Esto crea una colisión ¡Dos objetos no pueden tener la misma clave!
*/ 