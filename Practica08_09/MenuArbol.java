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

        boolean salir = false;
        int opcion = 0;
        int valor = 0;

        System.out.println("\n\n");
        System.out.println("            Menu Arbol Binario");

        System.out.println("\n  Crear Árbol");
        System.out.println("\nDame el valor del nodo Raiz: ");
        valor = scanner.nextInt();

        Nodo n1 = new Nodo(valor);

        ArbolBin arbolito = new ArbolBin(n1);
        
        valor = 0;

        while (!salir){

            System.out.println("\n    Que quieres hacer");
            System.out.println("1.  Agregar Dato");
            System.out.println("2.  Eliminar Dato");
            System.out.println("3.  Imprimir Dato (BFS)");
            System.out.println("4.  Notación Prefija (PreOrden)");
            System.out.println("5.  Notación Prefija (InOrden)");
            System.out.println("6.  Notación Prefija (PostOrden)");
            System.out.println("7.  Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    
                    System.out.println("\n Que valor lleva el nuevo nodo: ");
                    valor = scanner.nextInt();

                    Nodo n2 = new Nodo(valor);

                    if(valor > n1.valor){
                        arbolito.add(n1,n2,1);
                    }else{
                        arbolito.add(n1,n2,0);
                    }

                    break;

                case 2:
                    break;

                case 3:   

                    System.out.println("\n\n");
                    arbolito.breadthFrist();

                    break;

                case 4: // Lanzamiento Pre-Orden

                    System.out.println("\n\n");
                    System.out.println("Notacion PreOrden");
                    arbolito.preOrden(n1);
                    break;

                case 5: //Lanzamiento In-Orden

                    System.out.println("\n\n");
                    System.out.println("Notacion InOrden");
                    arbolito.inOrden(n1);
                    break;

                case 6: //Lanzamiento Post-Orden

                    System.out.println("\n\n");
                    System.out.println("Notacion PostOrden");
                    arbolito.postOrden(n1);
                    break;

                case 7: //Salir

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
        int valor = 0;

        System.out.println("\n\n");
        System.out.println("            Menu Arbol Binario de Busqueda");

        System.out.println("\n  Crear Árbol");
        System.out.println("\nDame el valor del nodo Raiz: ");
        valor = scanner.nextInt();

        Nodo n1 = new Nodo(valor);

        ArbolBinSearch arbolito = new ArbolBinSearch(n1);
        

        while (!salir){

            System.out.println("\n    Que quieres hacer");
            System.out.println("1.  Agregar Dato");
            System.out.println("2.  Eliminar Dato");
            System.out.println("3.  Buscar");
            System.out.println("4.  Imprimir Árbol");
            System.out.println("5.  Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("\n Que valor lleva el nuevo nodo: ");
                    valor = scanner.nextInt();

                    Nodo n2 = new Nodo(valor);

                    arbolito.add(n1,n2);

                    break;

                case 2:
                    break;

                case 3:    
                    break;

                case 4:

                    System.out.println("\n\n");
                    System.out.println("Notacion PreOrden");
                    arbolito.preOrden(n1);

                    break;

                case 5:
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