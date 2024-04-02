import java.util.Scanner;


public class Principal{

    public static void main(String []arrg) {

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {

            Utilerias.tipoGrafo();
            System.out.println("Opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Utilerias.grafoNDirigido();
                    System.out.println("Hola");
                    break;
                case 2:
                    Utilerias.grafoDirigido();
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

}