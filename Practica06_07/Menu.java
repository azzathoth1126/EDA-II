import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu{

    public static void main(String []arrg) {

        Scanner scanner = new Scanner(System.in);

        boolean condition = true;

        while (condition) {

            Utilerias.cleanScrean();
            Utilerias.tipoGrafo();

            System.out.println("Opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Menu.menuGraDirigido();
                    break;

                case 2:
                    Menu.menuGraNDirigido();
                    break;

                case 3:
                    condition = false;
                    break;

                default:
                    System.out.println("\nOpción no válida. Por favor, seleccione una opción válida.");
                    break;

                }   
        }
        scanner.close();
    }


    private static void menuGraDirigido(){
        
        Utilerias.cleanScrean();//LImpir la pantalla

        Utilerias menu = new Utilerias();//Para llamar al menu
        Scanner scan = new Scanner(System.in);//Para ingresar datos

        System.out.println("Cuantos nodos vas a crear");
        int opc, numVer = scan.nextInt();

        GrafoDir grafo = new GrafoDir(numVer);//Para crear el grafo dirigido

        boolean condition = true;
        

        while (condition) {

            menu.grafoDirigido();
            opc = scan.nextInt();
            scan.nextLine();

            switch (opc) {
                case 1:
                    int verInc, verAdy;
                    
                    System.out.print("Vertice Inicial (0 a "+(numVer-1)+ "): ");
                    verInc = scan.nextInt();

                    System.out.print("Vertice adyacente: ");
                    verAdy = scan.nextInt();

                    grafo.addEdge(verInc, verAdy);

                    Utilerias.cleanScrean();
                    break;

                case 2:
                    System.out.println("\nGrafo Dirigido: ");
                    grafo.printGraph();
                    break;

                case 3:
                    System.out.println("\nAlgoritmo BFS iniciando del vertice 0\n");
                    grafo.bfs(0);
                    System.out.println(); // Salto de línea para la salida
                    break;


                case 4:
                    System.out.println("\nAlgoritmo DFS iniciando del vertice 0\n");
                    grafo.dfs(0);
                    System.out.println(); // Salto de línea para la salida
                    break;

                case 5:
                    System.out.println("\nSaliendo");
                    condition = false;
                    break;
            
                default:
                    System.out.println("\nSeleccione una opción válida.");
                    break;
            }
            
        }

        //scan.close();
    }


    private static void menuGraNDirigido(){

        Utilerias menu = new Utilerias();//Para el menu de grafo no dirigido
        Grafo grafo = new Grafo();//Para crear un grafo no dirigido
        Scanner scan = new Scanner(System.in);//Para ingresar datos

        List<List<Integer>> graph = new ArrayList<>();//Creando grafo no dirigido

        Utilerias.cleanScrean();//LImpia la pantalla

        boolean condition = true;
        int nVertices = 0;
        int opc;
        
        while (condition) {

            menu.grafoNDirigido();
            opc = scan.nextInt();
            scan.nextLine();

            switch (opc) {
                case 1:
                    grafo.addVertex(graph); 
                    System.out.println("Vertice añadido\n");

                    nVertices = graph.size();
                    System.out.println("Numero de vertices " +nVertices+ " ,inician en el cero.\n");
                    break;

                case 2:
                    if (nVertices<2){
                        System.out.println("No hay suficientes vertices\n");
                    } else{
                        System.out.println("\nVértices: " + grafo.getVertices(graph));
                        int ver1, ver2;

                        System.out.println("Entre que vertices quieres crear aristas: \n");
                        
                        System.out.print("Vertice: ");
                        ver1 = scan.nextInt();

                        System.out.print("Vertice: ");
                        ver2 = scan.nextInt();

                        grafo.addEdge(graph, ver1, ver2);
                    }
                    break;

                case 3:
                    System.out.println("\nVértices: " + grafo.getVertices(graph));
                    break;

                case 4:
                    System.out.println("\nAristas: " + grafo.getEdges(graph));
                    break;

                case 5:
                    System.out.println("\nSaliendo");
                    condition = false;
                    break;
            
                default:
                    System.out.println("\nSeleccione una opción válida.");
                    break;
            }
            
        }

        //scan.close();
    }

}