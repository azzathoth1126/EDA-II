import java.util.Random;
import java.util.Scanner;

public class Utilerias {

    public static int tamArray() {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n\t1)...... 50");
            System.out.println("\t2)...... 100");
            System.out.println("\t3)...... 500");
            System.out.println("\t4)...... 800");
            System.out.println("\t5)...... 1000");
            System.out.println("\t6)...... 2000");
            System.out.println("\t7)...... 5000");
            System.out.println("\t8)...... 10000");
            System.out.println("\nIngrese una opción (1-8):");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste la opción 1");
                    return 50;

                case 2:
                    System.out.println("Seleccionaste la opción 2");
                    return 100;

                case 3:
                    System.out.println("Seleccionaste la opción 3");
                    return 500;

                case 4:
                    System.out.println("Seleccionaste la opción 4");
                    return 800;

                case 5:
                    System.out.println("Seleccionaste la opción 5");
                    return 1000;

                case 6:
                    System.out.println("Seleccionaste la opción 6");
                    return 2000;

                case 7:
                    System.out.println("Seleccionaste la opción 7");
                    return 5000;

                case 8:
                    System.out.println("Seleccionaste la opción 8");
                    return 10000;

                default:
                    System.out.println("\nOpción inválida. Por favor, ingrese un número entre 1 y 8.");
            }

        } while (opcion < 1 || opcion > 8);
        
        return 0;
    }


    public static void llenarArray(int arreglo[]) {
        Random rand = new Random();
        int tam = arreglo.length;

        for (int i = 0; i < tam; i++) {
            arreglo[i] = rand.nextInt(10000);
        }
    }


    public static void duplicarArrays(int arreglo01[], int arreglo02[]){
        int tam = arreglo01.length;

        for(int i=0; i<tam; i++){
            arreglo02[i] = arreglo01[i];
        }
    }


    public static void imprimirArray(int arreglo[]){
        int tam = arreglo.length;

        for(int i=0; i<tam; i++){
            System.out.println("Elemento "+ (i+1) + " :" +arreglo[i]);
        }
    }


    public static void intercambiar(int[] arr, int x, int y) {
        int temp = arr[x];   
        arr[x] = arr[y];  
        arr[y] = temp;
    }
}