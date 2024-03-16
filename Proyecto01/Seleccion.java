public class Seleccion {  
   
    public static void selectionSort(int arr[]){ 
        int accesosArreglo = 0, comparaciones = 0, cambios = 0, inserciones = 0;

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {  
            int min = i;
            accesosArreglo++;  
            for (int j = i + 1; j < n; j++) {  
                comparaciones++;
                if (arr[j] < arr[min]) {  
                    min = j;  
                    accesosArreglo++;
                }                      
            }  
            Utilerias.intercambiar(arr, i, min);
            cambios++;
            inserciones++;
        }

        System.out.println("Accesos al arreglo: " + accesosArreglo);
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
        System.out.println("Incersiones: " + inserciones); 
    }  
}  