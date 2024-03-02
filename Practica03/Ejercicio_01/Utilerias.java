import java.util.Scanner; //Solo llama a scane

public class Utilerias {


    //Imprime el Arreglo
    public static void PrintArray (char letras[], int tam) {
        
        System.out.println("\n\nArreglo: ");

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

}