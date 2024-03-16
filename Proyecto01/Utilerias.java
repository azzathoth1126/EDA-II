import java.util.Random;
import java.util.Scanner;

public class Utilerias {

    public static void menus(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("\n***********  Proyecto 01 ***********");
        System.out.println("\n");
        System.out.println("Analisis de complejidad de algoritmos");
        System.out.println("\nDe que tamaño de arreglos quieres analizar la complejidad");

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

                    break;
                case 2:
                    System.out.println("Seleccionaste la opción 2");

                    break;
                case 3:
                    System.out.println("Seleccionaste la opción 3");

                    break;
                case 4:
                    System.out.println("Seleccionaste la opción 4");

                    break;
                case 5:
                    System.out.println("Seleccionaste la opción 5");

                    break;
                case 6:
                    System.out.println("Seleccionaste la opción 6");

                    break;
                case 7:
                    System.out.println("Seleccionaste la opción 7");

                    break;
                case 8:
                    System.out.println("Seleccionaste la opción 8");

                    break;
                default:
                    System.out.println("\nOpción inválida. Por favor, ingrese un número entre 1 y 8.");
            }
        } while (opcion < 1 || opcion > 8);
        
        scanner.close();

    }

    public static void llenarArray(int arreglo[]) {
        Random rand = new Random();
        int tam = arreglo.length;

        for (int i = 0; i < tam; i++) {
            arreglo[i] = rand.nextInt(10000);
        }
    }

    public static void imprimirArray(int arreglo[]){
        int tam = arreglo.length;

        for(int i=0; i<tam; i++){
            System.out.println("Elemento "+ (i+1) + " :" +arreglo[i]);
        }
    }

    public static void duplicarArrays(int arreglo01[], int arreglo02[]){
        int tam = arreglo01.length;

        for(int i=0; i<tam; i++){
            arreglo02[i] = arreglo01[i];
        }
    }

    public static void intercambiar(int[] arr, int x, int y) {
        int temp = arr[x];   
        arr[x] = arr[y];  
        arr[y] = temp;
    }

}