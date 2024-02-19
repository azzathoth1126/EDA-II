public class Principal {
    public static void main(String args[]){
        int[] arr = {100,9,14,3,2,43,11,58,22,10,15,4,3,44,12,59,23,99,32,2}; 
        int tam = arr.length; 
        
        System.out.println("\nArreglo Original: ");  
        Utilerias.printArray(arr);

        Quicksort.Quicksort(arr, 0, tam-1);

        System.out.println("\nArreglo Ordenado: ");  
        Utilerias.printArray(arr);
    }
}