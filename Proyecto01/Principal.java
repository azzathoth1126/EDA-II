public class Principal {

    public static void main(String []args) {

        int tamArray = 0;

        //Menu
        System.out.println("\n***********  Proyecto 01 ***********");
        System.out.println("\n");
        System.out.println("Analisis de complejidad de algoritmos");
        System.out.println("\nDe que tamaño de arreglos quieres analizar la complejidad");

        //Tamaño arreglo
        int tamArreglo = Utilerias.tamArray();

        System.out.println(tamArreglo);

        //Creando arreglos de tamaño n
        int[] arreglo01 = new int[tamArreglo];
        int[] arreglo02 = new int[tamArreglo];
        /*
        int[] arreglo03 = new int[tamArreglo];
        int[] arreglo04 = new int[tamArreglo];
        int[] arreglo05 = new int[tamArreglo];
        */

        //Llenando arreglos
        Utilerias.llenarArray(arreglo01);
        Utilerias.duplicarArrays(arreglo01, arreglo02);
        /*
        Utilerias.duplicarArrays(arreglo01, arreglo03);
        Utilerias.duplicarArrays(arreglo01, arreglo04);
        Utilerias.duplicarArrays(arreglo01, arreglo05);
        */

        //Ordenando arreglos
        System.out.println("\nInsertion Sort");
        Insercion.insertionSort(arreglo01);

        System.out.println("\nSelection Sort");
        Seleccion.selectionSort(arreglo02);
        
    }

}