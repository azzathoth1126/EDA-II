public class Utilerias{
    
    public static void tipoGrafo() {
        System.out.println("\n    Que tipo de grafo quieres crear ");
        System.out.println("\n1.   Grafo dirigido");
        System.out.println("2.   Grafo no dirigido");
        System.out.println("3.   Salir\n");
    }


    public void grafoDirigido() {
        System.out.println("\n1.  Añadir nodo");
        System.out.println("2.  Ver Grafo Dirigido");    
        System.out.println("3.  Algoritmo BFS");
        System.out.println("4.  Algoritmo DFS");
        System.out.println("5.  Salir\n\n");

        System.out.println("Que quieres hacer:  ");
    }


    public void grafoNDirigido() {
        System.out.println("\n1.  Añadir vertice");
        System.out.println("2.  Añadir aristas");
        System.out.println("3.  Ver vertices");
        System.out.println("4.  Ver aristas");
        System.out.println("5.  Salir\n\n");

        System.out.println("Que quieres hacer:  ");
    }

    public static void cleanScrean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}