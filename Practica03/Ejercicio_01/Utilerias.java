import java.util.Scanner;
import java.util.Random;

public class Utilerias {


    //Imprime el Arreglo para Counting Sort
    public static void PrintArray(char letras[], int tam) {

        for (int i = 0; i < tam; ++i) System.out.print(letras[i] + " ");
        System.out.println("\n");
    }

    //Imprime el Arreglo para Radix Sort
    public static void PrintArrays(int numeros[], int tam) {

        for (int i = 0; i < tam; ++i) System.out.print(numeros[i] + " ");
        System.out.println("\n");
    }

    //LLena el arreglo de forma manual para Counting Sort
    public static void LLenarArrayManual(char letras[], int tam) {
        Scanner scanner = new Scanner(System.in);//Para llamar al metodo nextLine de scanner
        System.out.println("Dame las letras del arreglo");

        for (int i = 0; i < tam; i++){
            System.out.println("Letra # " + (i + 1) + ": ");
            letras[i] = scanner.nextLine().charAt(0);
        }
    }

    //LLena el arreglo de forma aleatoria para Counting Sort
    public static void LLenarArrayAleatorio(char letras[]) {
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = rand.nextInt(10); 
            char letraAleatoria = (char)('a' + numeroAleatorio);
            letras[i] = letraAleatoria; 
        }


    }

    //LLena el arreglo de forma manual para Radix Sort
    public static void LlenarArrayManual(int numeros[], int tam) {
        Scanner scanner = new Scanner(System.in);//Para llamar al metodo nextLine de scanner
        System.out.println("Dame los elemenos del arreglo");

        for (int i = 0; i < tam; i++){
            System.out.println("Elemento # " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
    }

    //LLena el arreglo de forma manual para Radix Sort
    public static void LlenarArrayAleatorio(int numeros[], int tam) {
        Random random = new Random();
        
        for (int i = 0; i < tam; i++) {
            StringBuilder numeroAleatorio = new StringBuilder();

            for (int j = 0; j < 4; j++) {
                int digito = random.nextInt(4) + 3;
                numeroAleatorio.append(digito);
            }
            numeros[i] = Integer.parseInt(numeroAleatorio.toString());
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