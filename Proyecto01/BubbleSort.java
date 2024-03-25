public class BubbleSort{    
    
    static void bubbleSort(int arreglo[]) {
        int accesosArreglo = 0, comparaciones = 0, cambios = 0;

        int n = arreglo.length;
        boolean ver = true;

        while (n>=1 && ver) {
            comparaciones++;
            ver = false;

            for (int j = 0; j < n-1; j++) { // Modificado para evitar el desbordamiento del arreglo
                if (arreglo[j] > arreglo[j + 1]) {
                    comparaciones++;

                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    cambios++;

                    ver = true;
                }
            } 
            accesosArreglo++;   n--;
        }
        System.out.println("Accesos al arreglo: " + accesosArreglo);
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
    }
}