//Librerias para ingresar datos desde teclado
import java.util.Scanner;

//Clase principal
public class Principal{

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in); //Crea un objeto para ingresar datos desde el teclado
    
        int opcion, manera = 0, tam;

        Utilerias.menuPrincipal();

        do {
            System.out.println("\nQue algoritmo quieres usar: ");
            opcion = scanner.nextInt();

            switch(opcion) {

                case 1:

                    char[] letras = new char[20]; //Crea un arreglo de 20 espacios
                    tam = letras.length; //Tamaño del arreglo

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

                    int[] numeros = new int[15]; //Crea un arreglo de 20 espacios
                    tam = numeros.length; //Tamaño del arreglo

                    Utilerias.formaDeLlenar();
                    manera = scanner.nextInt();

                    if (manera == 1) {

                        Utilerias.LlenarArrayManual(numeros, tam);

                        System.out.println("\nArreglo desordenado: ");
                        Utilerias.PrintArrays(numeros, tam);

                        RadixSort.radixSort(numeros, tam);
                        

                    } else{

                        Utilerias.LlenarArrayAleatorio(numeros, tam);

                        System.out.println("\nArreglo desordenado: ");
                        Utilerias.PrintArrays(numeros, tam);

                        
                    }
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            
            }
        } while(opcion != 1 && opcion != 2);

    }
}