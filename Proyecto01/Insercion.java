public class Insercion{  
    
    /*public static void insertionSort(int array[]) {  
        int iteraciones = 0, comparaciones = 0, cambios = 0, inserciones = 0;

        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];
            inserciones++;  
            int i = j-1;  

            while ( (i > -1) && ( array [i] > key ) ) {  
                comparaciones = comparaciones+2;
                array [i+1] = array [i];  
                cambios++; inserciones++;
                i--;  
            }  
            array[i+1] = key;
            inserciones++;  
        }  

        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
        System.out.println("Inserciones: " + inserciones);

    
    }*/

    public static void insertionSort(int array[]) {  
        int accesosArreglo = 0, comparaciones = 0, cambios = 0, inserciones = 0;

        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];
            accesosArreglo++;  // Incremento cada vez que se accede al arreglo
            
            int i = j - 1;  
            while ((i > -1) && (array[i] > key)) {  
                comparaciones++; // Incremento por cada comparación de elementos del arreglo
                array[i + 1] = array[i];  
                cambios++; // Incremento por cada cambio de elementos
                inserciones++; // Incremento por cada cambio o inserción de un elemento del arreglo
                i--;  
            }  
            array[i + 1] = key;
            inserciones++; // Incremento por cada inserción realizada
        }  

        System.out.println("Accesos al arreglo: " + accesosArreglo);
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
        System.out.println("Inserciones: " + inserciones);   
    }
}