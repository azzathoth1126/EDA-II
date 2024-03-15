public class Principal {

    public static void main(String []args) {
        
        //Creando arreglos
        int[] arreglo01 = new int[50];
        int[] arreglo02 = new int[50];

        //Menu
        Utilerias.menus();

        //Llenando arreglos
        Utilerias.llenarArray(arreglo01);
        Utilerias.duplicarArrays(arreglo01, arreglo02);

        //Utilizando Insertion Sort

        System.out.println("\nInsertion Sort");
        Insercion.insertionSort(arreglo01);
        System.out.println("\nSelection Sort");
        Seleccion.selectionSort(arreglo02);

        
    }

}