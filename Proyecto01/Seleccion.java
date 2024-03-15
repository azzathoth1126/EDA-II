public class Seleccion {  
   
    public static void selectionSort(int arr[]){ 
        int iteraciones = 0, comparaciones = 0, cambios = 0, inserciones = 0;

        int n = arr.length;
        for (int i = 0; i < n - 1; i++){  
            int min = i;
            inserciones++;  
            for (int j = i + 1; j < n; j++){  
                if (arr[j] < arr[min]){  
                    comparaciones++;
                    min = j;  
                    inserciones++;
                }                      
            }  
            Utilerias.intercambiar(arr, i,min);
            cambios++;  
        }

        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
        System.out.println("Inserciones: " + inserciones); 
    }  
}  