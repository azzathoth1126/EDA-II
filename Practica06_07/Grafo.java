/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;

public class Grafo {

    public static void main(String[] args) {
       
        List<List<Integer>> graph = new ArrayList<>();

        addVertex(graph); // vértice 0
        addVertex(graph); // vértice 1
        addVertex(graph); // vértice 2
        //Añadido en clase
        addVertex(graph); // vértice 3
        addVertex(graph);

       
        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        //Añadido en clase
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);


        // Imprimir los vértices y las aristas
        System.out.println("Vértices: " + getVertices(graph));
        System.out.println("Aristas: " + getEdges(graph));


        //System.out.println(graph.get(2));
        //System.out.println(graph.get(3));
    }

    // Método para agregar un vértice al grafo
    private static void addVertex(List<List<Integer>> graph) {
        graph.add(new ArrayList<>());
    }

    // Método para agregar una arista al grafo
    private static void addEdge(List<List<Integer>> graph, int vertex1, int vertex2) {
        graph.get(vertex1).add(vertex2);
        //graph.get(vertex2).add(vertex1);
    }

    // Método para obtener los vértices del grafo
    private static List<Integer> getVertices(List<List<Integer>> graph) {
        List<Integer> vertices = new ArrayList<>();
        for (int i = 0; i < graph.size(); i++) {
            vertices.add(i);
            //System.out.println(vertices.get(i));
        }
        return vertices;
    }

    // Método para obtener las aristas del grafo
    private static List<String> getEdges(List<List<Integer>> graph) {
        List<String> edges = new ArrayList<>();
        for (int i = 0; i < graph.size(); i++) {
            for (int j : graph.get(i)) {
                if (!edges.contains(j + "-" + i)) {
                    edges.add(i + "-" + j);
                    System.out.println(i + "-" + j);
                }
            }
        }
        return edges;
    }
}