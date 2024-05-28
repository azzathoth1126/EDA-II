/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;

public class Grafo {

    /*public static void main(String[] args) {
       
        //Creando una lista de listas de enteros (Integer)
        List<List<Integer>> graph = new ArrayList<>();

        addVertex(graph); // vértice 0
        addVertex(graph); // vértice 1
        addVertex(graph); // vértice 2

        addVertex(graph); // vértice 3 //Añadido en clase
        addVertex(graph); // vértice 4
        
        //Vertice para añadir
        //addVertex(graph);
        //addVertex(graph);
        //addVertex(graph);
        //addVertex(graph);
        //addVertex(graph);
        

       
        //Crean una arista en tre vestices de izquierda a derecha
        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);

        addEdge(graph, 2, 3);//Añadido en clase
        addEdge(graph, 3, 4);


        // Imprimir los vértices y las aristas
        System.out.println("Vértices: " + getVertices(graph));
        System.out.println("Aristas: " + getEdges(graph));


        //System.out.println(graph.get(2));
        //System.out.println(graph.get(3));
    }*/

    // Método para agregar un vértice al grafo
    public void addVertex(List<List<Integer>> graph) {
        graph.add(new ArrayList<>());
    }

    // Método para agregar una arista entre nodos
    public void addEdge(List<List<Integer>> graph, int vertex1, int vertex2) {
        graph.get(vertex1).add(vertex2);
        graph.get(vertex2).add(vertex1);
    }

    // Método para obtener los vértices del grafo
    public List<Integer> getVertices(List<List<Integer>> graph) {
        List<Integer> vertices = new ArrayList<>();
        for (int i = 0; i < graph.size(); i++) {
            vertices.add(i);
            //System.out.println(vertices.get(i));
        }
        return vertices;
    }

    // Método para obtener las aristas del grafo
    public List<String> getEdges(List<List<Integer>> graph) {
        List<String> edges = new ArrayList<>();
        for (int i = 0; i < graph.size(); i++) {
            for (int j : graph.get(i)) {
                if (!edges.contains(j + "-" + i)) {
                    edges.add(i + "-" + j);
                }
            }
        }
        return edges;
    }
}