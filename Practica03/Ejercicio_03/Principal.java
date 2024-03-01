
public class Principal {

    public static void main(String args[]) {

        System.out.println("\n\n-------Bienvenido al metodo de ordenamiento MergSort-------");

        int[] arr = {530, 434, 146, 167, 234, 713, 145, 413, 415, 512, 251, 316, 234, 712, 173, 481, 421, 522, 612, 162};
        int tam = arr.length;

        MergeSort.sort(arr, 0, tam-1);

        Utilerias.printArray(arr);

    } 

} 
  