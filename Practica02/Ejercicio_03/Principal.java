public class Principal {
    public static void main(String args[]){
        int[] arreglo = {100,9,14,3,2,43,11,58,22,10,15,4,3,44,12,59,23,99,32}; 
        int tam = arreglo.length; 
        
        System.out.println("\nArreglo Original: ");  
        Utilerias.printArray(arreglo);
        QuickSort.QuickSort(arreglo, 1, tam);

        //imprime el arreglo ordenado
    }
}