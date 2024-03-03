import java.util.Scanner;

public class Utilerias {


    //Imprime el Arreglo
    public static void PrintArray (char letras[], int tam) {
        for (int i = 0; i < tam; ++i)
            System.out.print(letras[i] + " ");
            System.out.println();
    }

    //LLena el arreglo de forma manual por el usuario
    public static void LLenadoArray (char letras[]) {
        Scanner scanner = new Scanner(System.in);//Para llamar al metodo nextLine de scanner
    
        System.out.println("Dame las letras del arreglo");
        for (int i = 0; i < 20; i++){
            System.out.println("Letra # " + (i + 1) + ": ");
            letras [i] = scanner.nextLine().charAt(0);
        }
    }

    //Menu del programa Principal
    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n--------------Programa de ordenamiento--------------");
        System.out.println("\n    Que algoritmo de ordenamiento quieres probar    ");
        System.out.println("\nCounting Sort -------- 1");
        System.out.println("Radix Sort ------------ 2");
    }

}