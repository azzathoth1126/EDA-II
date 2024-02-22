import java.util.Scanner; //Librerias para ingresar datos desde teclado

public class Principal{

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in); //Crea un objeto para ingresar datos desde el teclado

        char[] letras = new char[20]; //Crea un arreglo de 20 espacios
        int tam = letras.length; //Tamaño del arreglo

        //Llena el arreglo
        System.out.println("Dame las letras del arreglo");
        for (int i =0; i<tam; i++){
            System.out.println("Elemento: " + (i + 1) + ": ");
            letras [i] = scanner.nextLine().charAt(0);
        }

        //Imprime el arreglo
        System.out.println("\nEl arreglo es: ");
        for(char letra:letras){
            System.out.println(letra + " ");
        }



    }
}