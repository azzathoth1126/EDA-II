public class CountingSort {

    public static void countingSort (char[] arr) {
        int n = arr.length;//Tamaño del arreglo
        char[] output = new char[n];//Arrelgo auxliar

        // Inicializa el arreglo del conteo
        int[] count = new int[10]; // 10 por que el rango es de 'a' a 'j'

        // Contar la frecuencia de cada letra
        for (int i = 0; i < n; i++) {
            count[arr[i] - 'a']++;
        }

        // Calcular las posiciones finales de cada letra en el arreglo ordenado
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Construir el arreglo ordenado
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i] - 'a'] - 1] = arr[i];
            count[arr[i] - 'a']--;
        }

        // Copiar el arreglo ordenado al arreglo original
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}