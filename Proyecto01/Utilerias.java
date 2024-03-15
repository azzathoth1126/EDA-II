import java.util.Random;

public class Utilerias {

    public static void menus(){
        System.out.println("\n***********  Proyecto 01 ***********");

    }

    public static void llenarArray(int arreglo[]) {
        Random rand = new Random();
        int tam = arreglo.length;

        for (int i = 0; i < tam; i++) {
            arreglo[i] = rand.nextInt(10000);
        }
    }

    public static void imprimirArray(int arreglo[]){
        int tam = arreglo.length;

        for(int i=0; i<tam; i++){
            System.out.println("Elemento "+ (i+1) + " :" +arreglo[i]);
        }
    }

    public static void duplicarArrays(int arreglo01[], int arreglo02[]){
        int tam = arreglo01.length;

        for(int i=0; i<tam; i++){
            arreglo02[i] = arreglo01[i];
        }
    }

    public static void intercambiar(int[] arr, int x, int y) {
        int temp = arr[x];   
        arr[x] = arr[y];  
        arr[y] = temp;
    }

}