//Librerias para ingresar datos desde teclado
import java.util.Scanner; 

//Clase principal
public class Principal{

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in); //Crea un objeto para ingresar datos desde el teclado
    
        char[] letras = new char[20]; //Crea un arreglo de 20 espacios
        int tam = letras.length; //Tamaño del arreglo
        int opcion = 0;

        Utilerias.menu();

        do {
            
            System.out.println("\nQue algoritmo quieres usar: ");
            opcion = scanner.nextInt();
            System.out.println("\n\n");


            switch(opcion) {

                case 1:
                    Utilerias.LLenadoArray(letras); //Llena el arreglo

                    System.out.println("\nArreglo desordenado: ");
                    Utilerias.PrintArray(letras, tam);
                    System.out.println("\n");
                    
                    CountingSort.countingSort(letras);

                    System.out.println("\nArreglo ordenado: ");
                    Utilerias.PrintArray(letras, tam);//Imprime el arreglo
                    System.out.println("\n");

                    break;

                case 2:

                    RadixSort.radixSort();
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            
            }
        } while(opcion != 1 && opcion != 2);

    }
}