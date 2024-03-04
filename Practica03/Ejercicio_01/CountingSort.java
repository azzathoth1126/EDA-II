public class CountingSort {

    public static void countingSort(char[] letras, int tam) {
        char[] letras2 = new char[tam];//Arrelgo auxliar

        // Inicializa el arreglo del conteo
        int[] count = new int[10]; // 10 por que el rango es de 'a' a 'j'

        int n = count.length;
        char a = 'a'; // Inicializamos 'a' con el carácter 'a'

        for (int i = 0; i < n; i++) {
            count[i] = 0; // Inicializamos el contador en cero para cada elemento del arreglo "count"
            for (int j = 0; j < tam; j++) {
                if (letras[j] == a) count[i]++;
            }
            System.out.println("Cantidad de elementos " + a + " es: " + count[i]);
            a++; // Incrementamos 'a' para pasar al siguiente carácter en la siguiente iteración del bucle externo
}

        // Calcular las posiciones finales de cada letra en el arreglo ordenado
        System.out.println("\n"); a = 'a';
        System.out.println("Posiciones de " + a + " es: " + count[0]);
        for (int i = 1; i < 10; i++) {
            a += 1;
            count[i] += count[i - 1];
            System.out.println("Posiciones de " + a + " es: " + count[i]);
            
        }

        // Construir el arreglo ordenado
        System.out.println("\n");
        for (int i = tam - 1; i >= 0; i--) {
            letras2[count[letras[i] - 'a'] - 1] = letras[i];
            count[letras[i] - 'a']--;
            System.out.println("Acomodo de arreglo auxiliar: ");
            Utilerias.PrintArray(letras2,tam);
        }

        // Copiar el arreglo ordenado al arreglo original
        for (int i = 0; i < tam; i++) {
            letras[i] = letras2[i];
        }
    }
}


// Contar la frecuencia de cada letra
//Estudiar para comprenderlo
        /*for (int i = 0; i < tam; i++) {
            count[letras[i] - 'a']++;
        }*/