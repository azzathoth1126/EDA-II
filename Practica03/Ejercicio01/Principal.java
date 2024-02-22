import java.util.Scanner;

public class Principal{

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        char[] letras = new char[20];
        int tam = letras.length; 

        System.out.println("Dame las letras del arreglo");
        for (int i =0; i<tam; i++){
            System.out.println("Elemento: " + (i + 1) + ": ");
            letras [i] = scanner.nextLine().charAt(0);
        }

        System.out.println("\nEl arreglo es: ");
        for(char letra:letras){
            System.out.println(letra + " \t");
        }



    }
}