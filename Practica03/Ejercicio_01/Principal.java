import java.util.Scanner; //Librerias para ingresar datos desde teclado

public class Principal{

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in); //Crea un objeto para ingresar datos desde el teclado
    
        char[] letras = new char[20]; //Crea un arreglo de 20 espacios
        int tam = letras.length; //Tamaño del arreglo

        //Llena el arreglo
        Utilerias.LLenadoArray(letras);
        

        //CountingSort.CountingSort(letras, tam);


        //Imprime el arreglo
        Utilerias.PrintArray(letras, tam);
    }
}