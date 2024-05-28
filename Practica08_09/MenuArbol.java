import java.util.Scanner;

public class MenuArbol{

    //Menu Principal
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        boolean condition = true;
        int opcion = 0;

        System.out.println("\n      ******Menu Arboles******");

        while (condition){

            System.out.println("\n    Que tipo de arbol quieres usar\n");
            System.out.println("1.  Árboles Binarios");
            System.out.println("2.  Árboles Binarios de busqueda");
            System.out.println("3.  Árbol B");
            System.out.println("4.  Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    MenuArbol.cleanScrean();
                    menuArbolBin();
                    MenuArbol.cleanScrean();
                    break;

                case 2:
                    MenuArbol.cleanScrean();
                    menuArbolBinBus(); 
                    MenuArbol.cleanScrean(); 
                    break;

                case 3:
                    MenuArbol.cleanScrean();
                    menuArbolB();
                    MenuArbol.cleanScrean();;
                    break;

                case 4:
                    condition = false;
                    break;

                default:
                    System.out.println("\nSelecciona una opción válida.");
            }
        }
        scanner.close();
    }

    //Menu para el arbol binario
    public static void menuArbolBin(){

        Scanner scanner = new Scanner(System.in);//Para ingresar datos

        boolean condition = true;
        int opcion = 0;
        int num = 0;
        int valor = 0;


        System.out.println("\n\n     ******Menu Arbol Binario******     \n");
        System.out.println("  Creando Árbol Binario\n");

        System.out.print("Dame el valor del nodo Raiz: ");
        valor = scanner.nextInt();

        Nodo n1 = new Nodo(valor);//creando nodo raiz

        ArbolBin arbolito = new ArbolBin(n1);//Creando estructura de arbol
        
        valor = 0;

        while (condition){
            System.out.println("\n    *****Menu Arbol Binario*****    \n");
            System.out.println("1.  Agregar Dato");
            System.out.println("2.  Eliminar Dato");
            System.out.println("3.  Imprimir Dato (BFS)");
            System.out.println("4.  Notación Prefija (PreOrden)");
            System.out.println("5.  Notación Prefija (InOrden)");
            System.out.println("6.  Notación Prefija (PostOrden)");
            System.out.println("7.  Salir\n");

            System.out.print("Que quieres hacer: ");
            opcion = scanner.nextInt();


            switch (opcion) {
                case 1://Agregar elemento
                    System.out.println("\n\n");
                    System.out.print("Que valor quieres agregar: ");
                    num = scanner.nextInt();

                    arbolito.insertarRec(n1, num);
                    break;

                case 2://Eliminar elemento
                    System.out.println("\n\n");
                    System.out.print("Que valor quieres eliminar: ");
                    num = scanner.nextInt();

                    arbolito.eliminar(num);
                    break;

                case 3://Recorrido BFS
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
                    condition = false;
                    break;
             
                default:
                    System.out.println("\nOpción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    //Menu para le arbol binario de busqueda
    public static void menuArbolBinBus(){

        Scanner scanner = new Scanner(System.in);

        boolean condition = true;
        int opcion = 0;
        int valor = 0;

        System.out.println("\n\n     ******Menu - Arbol Binario de Busqueda******     \n");
        System.out.println("  Creaando Árbol Binario de Busqueda\n");

        System.out.print("Dame el valor del nodo Raiz: ");
        valor = scanner.nextInt();

        Nodo n1 = new Nodo(valor);//creando nodo raiz

        ArbolBinSearch arbolito = new ArbolBinSearch(n1);//Creando estructura de arbol binario de busqueda
        
        while (condition){
            
            System.out.println("\n1.  Agregar Dato");
            System.out.println("2.  Eliminar Dato");
            System.out.println("3.  Imprimir Árbol BFS");
            System.out.println("4.  Buscar un valor");
            System.out.println("5.  Salir\n");

            System.out.print("Que quieres hacer: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1://Agregando elemento
                    System.out.println("\n\n");
                    System.out.print("Que valor quieres Agregar: ");
                    valor = scanner.nextInt();
                    arbolito.insertar(valor);
                    break;

                case 2://Eliminando elemento
                    System.out.println("\n\n");
                    System.out.print("Que valor quieres eliminar: ");
                    valor = scanner.nextInt();
                    arbolito.eliminar(valor);
                    break;

                case 3://Recorrido BFS
                    System.out.println("\n\n");
                    System.out.println("Algoritmo BFS");
                    arbolito.breadthFrist();
                    System.out.println("\n");
                    break;

                case 4://Busque de elemento
                    System.out.println("\n\n");
                    System.out.print("Que valor quieres buscar: ");
                    valor = scanner.nextInt();
                    arbolito.search(n1, valor);
                    System.out.println("\n");
                    break;

                case 5://Salido
                    condition = false;
                    break;

                default:
                    System.out.println("\nOpción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }


    //Menu del arbol B
    public static void menuArbolB(){
        Scanner scanner = new Scanner(System.in);
        
        boolean condition = true;
        int opcion;
        int valor;

        System.out.println("\n\n     ******Menu - Arbol B******     \n");
        System.out.println("  Creaando Árbol B\n");

        System.out.print("Dame el orden del Árbol B:  ");
        valor = scanner.nextInt();
        BTree arbolito = new BTree(valor);

        while (condition) {

            
            System.out.println("\n1. Agregar un valor");
            System.out.println("2. Buscar un valor");
            System.out.println("3. Imprimir arbol");
            System.out.println("4. Salir\n");

            System.out.print("Que quieres hacer: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1: 
                    System.out.println("\n\n");
                    System.out.print("Dame el valor a ingresar: ");
                    valor = scanner.nextInt();
                    arbolito.add(valor);
                    
                    break;

                case 2:
                    System.out.println("\n\n");
                    System.out.print("Dame el valor a buscar: ");
                    valor = scanner.nextInt();
                    if (arbolito.find(valor)) {
                        System.out.println("Valor " + valor + " encontrado en el árbol.\n");
                    } else System.out.println("Valor " + valor + " no encontrado en el árbol.\n");
                    break;

                case 3:
                    System.out.println("\n\n");
                    System.out.println("Imprimien Árbol B: \n");
                    arbolito.mostrarArbol();
                    break;

                case 4:
                    System.out.println("\n\n");
                    System.out.println("Saliendo\n");
                    condition = false;
                    break;
            
                default:
                System.out.println("\nElige una opcion valida\n\n");
                    break;
            }
        }


    }

    private static void cleanScrean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}