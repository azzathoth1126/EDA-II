import java.util.Scanner;

public class MenuArbol{

    public static void menuTree(){

        //MenuArbol  menuArbol = new MenuArbol();
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        int opcion = 0;

        System.out.println("            Menu Practica 08-09");

        while (!salir){

            System.out.println("\n    Que tipo de arbol quieres usar");
            System.out.println("\n1.  Arboles Binarios");
            System.out.println("2.  Arboles Binarios de busqueda");
            System.out.println("3.  Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuArbolBin();
                    break;

                case 2:
                    menuArbolBinBus();  
                    break;

                case 3:
                    salir = true;
                    break;

                default:
                    System.out.println("\nOpción no válida. Por favor, seleccione una opción válida.");
            }

        }
        

    }

    public static void menuArbolBin(){

        Scanner scanner = new Scanner(System.in);

        ArbolBInario arbolito = new ArbolBInario();

        boolean salir = false;
        int opcion = 0;
        int valor = 0;

        System.out.println("\n\n");
        System.out.println("            Menu Arbol Binario");

        System.out.println("\n  Crear Árbol");
        System.out.println("\nDame el valor del nodo Raiz: ");
        valor = scanner.nextInt();

        Nodo n1 = new Nodo(valor);

        arbolito.add(valor);
        
        valor = 0;

        while (!salir){

            System.out.println("\n    Que quieres hacer");
            System.out.println("\n1.  Crear Árbol");
            System.out.println("2.  Agregar Dato");
            System.out.println("3.  Eliminar Dato");
            System.out.println("4.  Imprimir Dato (BFS)");
            System.out.println("5.  Notación Prefija (PreOrden)");
            System.out.println("7.  Notación Prefija (InOrden)");
            System.out.println("7.  Notación Prefija (PostOrden)");
            System.out.println("8.  Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    
                    System.out.println("\n Que valor lleva el nuevo nodo: ");
                    valor = scanner.nextInt();

                    arbolito.add(valor);

                    break;

                case 2:
                    break;

                case 3:    
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7: 
                    salir = true;

                    break;
             
                default:
                    System.out.println("\nOpción no válida. Por favor, seleccione una opción válida.");
            }

        }
        

    }

    public static void menuArbolBinBus(){

        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        int opcion = 0;

        System.out.println("\n\n");
        System.out.println("            Menu Arbol Binario de Busqueda");

        while (!salir){

            System.out.println("\n    Que quieres hacer");
            System.out.println("\n1.  Crear Árbol");
            System.out.println("2.  Agregar Dato");
            System.out.println("3.  Eliminar Dato");
            System.out.println("4.  Buscar");
            System.out.println("5.  Imprimir Árbol");
            System.out.println("6.  Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:    
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    salir = true;
                    break;

                default:
                    System.out.println("\nOpción no válida. Por favor, seleccione una opción válida.");
            }

        }

    }

    /*
    public static void cerrarScanner(){
        scanner.close();
    }
    */

}