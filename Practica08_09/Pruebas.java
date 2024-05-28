/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edgar
 */
public class Pruebas {
    
    public static void main(String args[]){
        ArbolBin arbol;
        
        Nodo n7 = new Nodo(7);
        Nodo n9 = new Nodo(9);
        Nodo n1 = new Nodo(1,n7,n9);
        Nodo n15 = new Nodo(15);
        Nodo n8 = new Nodo(8);
        Nodo n4 = new Nodo(4);
        Nodo n2 = new Nodo(2);
        Nodo n16 = new Nodo(16);
        Nodo n3 = new Nodo(3);
        
        arbol = new ArbolBin(n1);

        arbol.add(n7,n15,0);
        arbol.add(n7,n8,1);
        arbol.add(n9,n4,0);
        arbol.add(n9,n2,1);
        arbol.add(n15,n16,1);
        arbol.add(n8,n3,0);

        //Recorrido BFS
        System.out.println("\n\nRecorrido BFS");
        arbol.breadthFrist();


        System.out.println("\n\n");
        System.out.println("Notacion PreOrden");
        arbol.preOrden(n1);

        System.out.println("\n\n");
        System.out.println("Notacion InOrden");
        arbol.inOrden(n1);

        System.out.println("\n\n");
        System.out.println("Notacion PostOrden");
        arbol.postOrden(n1);

        System.out.println("\n\n");

        Pruebas.segundo();
    }


    private static void segundo(){

        ArbolBin arbol;
        
        Nodo n99 = new Nodo(99);
        Nodo n59 = new Nodo(59);
        Nodo n20 = new Nodo(20,n99,n59);
        Nodo n13 = new Nodo(13);
        Nodo n26 = new Nodo(26);
        Nodo n18 = new Nodo(18);
        Nodo n45 = new Nodo(45);
        Nodo n36 = new Nodo(36);
        Nodo n97 = new Nodo(97);
        Nodo n56 = new Nodo(56);
        Nodo n100 = new Nodo(100);
        Nodo n81 = new Nodo(81);
        Nodo n27 = new Nodo(27);
        Nodo n76 = new Nodo(76);
        Nodo n48 = new Nodo(48);


        arbol = new ArbolBin(n20);

        arbol.add(n99,n13,0);
        arbol.add(n99,n45,1);
        arbol.add(n59,n56,0);
        arbol.add(n59,n27,1);
        arbol.add(n13,n26,0);
        arbol.add(n13,n18,1);
        arbol.add(n45,n97,0);
        arbol.add(n45,n36,1);
        arbol.add(n56,n100,0);
        arbol.add(n56,n81,1);
        arbol.add(n27,n48,0);
        arbol.add(n27,n76,1);

        //Recorrido BFS
        System.out.println("\n\nRecorrido BFS");
        arbol.breadthFrist();


        System.out.println("\n\n");
        System.out.println("Notacion PreOrden");
        arbol.preOrden(n20);

        System.out.println("\n\n");
        System.out.println("Notacion InOrden");
        arbol.inOrden(n20);

        System.out.println("\n\n");
        System.out.println("Notacion PostOrden");
        arbol.postOrden(n20);

        System.out.println("\n\n");

    }

}
