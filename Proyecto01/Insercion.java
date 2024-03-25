public class Insercion{  

    public static void insertionSort(int array[]) {  
        int accesosArreglo = 0, comparaciones = 0, cambios = 0;

        int n = array.length; //Tamaño del arreglo
        
        for (int j = 1; j < n; j++) {  
            int key = array[j];
            int i = j - 1;  

            while ((i > -1) && (array[i] > key)) {  

                comparaciones++; // Incremento por cada comparación de elementos del arreglo
                array[i + 1] = array[i];  
                cambios++; // Incremento por cada cambio de elementos
                i--;  
            }  
            array[i + 1] = key;
        }accesosArreglo++;  // Incremento cada vez que se accede al arreglo

        System.out.println("Accesos al arreglo: " + accesosArreglo);
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios); 
    }
}