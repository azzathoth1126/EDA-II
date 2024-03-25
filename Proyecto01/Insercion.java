public class Insercion{  

    public static void insertionSort(int array[]) {  
        int accesosArreglo = 0, comparaciones = 0, cambios = 0, inserciones = 0;

        int n = array.length;
        
        for (int j = 1; j < n; j++) {  

            int key = array[j];

            int i = j - 1;  

            comparaciones++;
            accesosArreglo+=2;

            while ((i > -1) && (array[i] > key)) {

                array[i + 1] = array[i]; 

                inserciones++; 
                accesosArreglo+=3;

                i--;  
            }  
            array[i + 1] = key;
            inserciones++;
            accesosArreglo++;
        }

        System.out.println("Accesos al arreglo: " + accesosArreglo);
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("inserciones: " + inserciones); 
        System.out.println("Cambios: " + cambios); 
    }
}