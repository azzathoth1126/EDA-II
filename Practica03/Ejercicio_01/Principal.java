//Librerias para ingresar datos desde teclado
import java.util.Scanner;

//Clase principal
public class Principal{

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in); //Crea un objeto para ingresar datos desde el teclado
    
        char[] letras = new char[20]; //Crea un arreglo de 20 espacios
        int tam = letras.length; //Tamaño del arreglo
        int opcion, manera = 0;

        Utilerias.menuPrincipal();

        do {
            System.out.println("\nQue algoritmo quieres usar: ");
            opcion = scanner.nextInt();

            switch(opcion) {

                case 1:

                    Utilerias.formaDeLlenar();
                    manera = scanner.nextInt();
                    
                    if (manera == 1) {

                        Utilerias.LLenarArrayManual(letras, tam);

                        System.out.println("\nArreglo desordenado: ");
                        Utilerias.PrintArray(letras, tam);
                        
                        CountingSort.countingSort(letras, tam);

                        System.out.println("\nArreglo ordenado: ");
                        Utilerias.PrintArray(letras, tam);

                    } else{

                        Utilerias.LLenarArrayAleatorio(letras);

                        System.out.println("\nArreglo desordenado: ");
                        Utilerias.PrintArray(letras, tam);
                        
                        CountingSort.countingSort(letras, tam);

                        System.out.println("\nArreglo ordenado: ");
                        Utilerias.PrintArray(letras, tam);
                    }
                    
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