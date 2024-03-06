import java.util.Random;
import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] arreglo = new int[20];
        int tam = arreglo.length;

        boolean salir = false;

        System.out.println("\n\n-------Bienvenido al metodo de ordenamiento MergSort-------");

        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Llenar arreglo");
            System.out.println("2. Mostrar arreglo");
            System.out.println("3. Ordenar arreglo");
            System.out.println("4. Salir");
            System.out.print("\nSeleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < tam; i++) {
                        arreglo[i] = rand.nextInt(900) + 100; // Genera un número aleatorio entre 100 y 999
                    }
                    break;
                case 2:
                    if (arreglo != null) {
                        System.out.println("\n\t\t\t  ***   Arreglo  ***\n");
                        Utilerias.printArray(arreglo);
                    } else {
                        System.out.println("El arreglo aún no ha sido llenado.");
                    }
                    break;
                case 3:
                    if (arreglo != null) {
                        MergeSort.sort(arreglo, 0, tam-1);
                        System.out.println("\n      ***   Arreglo Ordenado  ***");
                    } else {
                        System.out.println("El arreglo aún no ha sido llenado.");
                    }
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, seleccione una opción válida.");
            }
        }
        scanner.close();
    }

} 
  