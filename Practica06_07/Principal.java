import java.util.Scanner;


public class Principal{

    public static void main(String []arrg) {

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {

            tipoGrafo();
            System.out.println("Opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hola");
                    break;
                case 2:
                    System.out.println("Hola");
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }


    public static void tipoGrafo() {

        System.out.println("   Que tipo de grafo quieres crear ");
        System.out.println("\n1-----Grafo no dirigido");
        System.out.println("2-----Grafo dirigido");
        System.out.println("3-----Salir");
        System.out.println("");
    }

}