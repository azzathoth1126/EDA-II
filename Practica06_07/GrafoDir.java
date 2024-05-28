import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GrafoDir {

    private int numVertices;
    private ArrayList<ArrayList<Integer>> adjList;

    public GrafoDir(int numVertices) {
        this.numVertices = numVertices;
        this.adjList = new ArrayList<ArrayList<Integer>>(numVertices);

        for (int i = 0; i < numVertices; i++) {
            this.adjList.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int src, int dest) {
        this.adjList.get(src).add(dest);

    }

    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[numVertices]; // Para rastrear los vértices visitados
        Queue<Integer> queue = new LinkedList<>(); // Cola para manejar el orden de visita

        visited[startVertex] = true; // Marca el vértice inicial como visitado
        queue.add(startVertex); // Agrega el vértice inicial a la cola

        while (!queue.isEmpty()) {
            int vertex = queue.poll(); // Desencola el siguiente vértice
            System.out.print(vertex + " "); // Procesa el vértice (imprimirlo en este caso)

            for (int adj : adjList.get(vertex)) { // Recorre todos los vértices adyacentes
                if (!visited[adj]) { // Si el vértice adyacente no ha sido visitado
                    visited[adj] = true; // Marcar como visitado
                    queue.add(adj); // Encolar el vértice adyacente
                }
            }
        }
    }

    public void dfs(int startVertex) {
        boolean[] visited = new boolean[numVertices]; // Para rastrear los vértices visitados
        dfsUtil(startVertex, visited); // Llama al método utilitario
    }

    // Método utilitario para DFS
    private void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true; // Marca el vértice como visitado
        System.out.print(vertex + " "); // Procesa el vértice (imprimirlo en este caso)

        for (int adj : adjList.get(vertex)) { // Recorre todos los vértices adyacentes
            if (!visited[adj]) { // Si el vértice adyacente no ha sido visitado
                dfsUtil(adj, visited); // Realiza DFS en el vértice adyacente
            }
        }
    }

    /*public static void main(String[] args) {

        GrafoDir g = new GrafoDir(5);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.addEdge(4, 0);//Añadido en clase

        
        g.printGraph();
    }*/
}