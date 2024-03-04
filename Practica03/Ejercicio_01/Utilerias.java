import java.util.Scanner;
import java.util.Random;

public class Utilerias {


    //Imprime el Arreglo
    public static void PrintArray(char letras[], int tam) {

        for (int i = 0; i < tam; ++i) System.out.print(letras[i] + " ");
        System.out.println("\n");
    }

    //LLena el arreglo de forma manual por el usuario
    public static void LLenarArrayManual(char letras[], int tam) {
        Scanner scanner = new Scanner(System.in);//Para llamar al metodo nextLine de scanner
        System.out.println("Dame las letras del arreglo");

        for (int i = 0; i < tam; i++){
            System.out.println("Letra # " + (i + 1) + ": ");
            letras [i] = scanner.nextLine().charAt(0);
        }
    }

    //Llena el arreglo de manera aleatoria
    public static void LLenarArrayAleatorio(char letras[]) {
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = rand.nextInt(10); 
            char letraAleatoria = (char)('a' + numeroAleatorio);
            letras[i] = letraAleatoria; 
        }


    }

    //Menu del programa Principal
    public static void menuPrincipal() {
        System.out.println("\n\n--------------Programa de ordenamiento--------------");
        System.out.println("\n    Que algoritmo de ordenamiento quieres probar    ");
        System.out.println("\nCounting Sort ----------- 1");
        System.out.println("Radix Sort -------------- 2");
    }

    public static void formaDeLlenar(){
        System.out.println("\nFormas de llenar el arreglo : ");
        System.out.println("\nManual -------- 1");
        System.out.println("Aleatoria ----- 2");

        System.out.println("\nComo lo quieres llenar: ");
    }

}