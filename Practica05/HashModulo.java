
import java.util.Scanner;

public class HashModulo {

    public static final int nElem = 20;

    public static void main(String []args){

        Scanner scan = new Scanner(System.in);

        
        
        int[][] tablaHas = new int[nElem][2];

        for(int i=0; i<nElem; i++){
            for(int j=0; j<1; j++){
                tablaHas[i][j] = 0;
            }
            tablaHas[i][0] = i+1;
        }

        boolean condition = true;
        int opcion;
        int num;

        System.out.println("\n    ******Menu******    ");

        while (condition) {
            System.out.println("\n1. Agregar elementos");
            System.out.println("2. Imprimir lista");
            System.out.println("3. Buscar elemento");
            System.out.println("4. Eliminar elemento");
            System.out.println("5. Salir");

            System.out.println("\nQue deseas hacer: ");
            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("\nDame un numero de 9 digitos: ");
                    num = scan.nextInt();
                    add(tablaHas, num);
                    break;

                case 2:
                    cleanScrean();

                    System.out.print("\n");
                    imprimir(tablaHas, 0, true);
                    break;

                case 3:
                    System.out.print("\nDame la llave del elemento que buscas: ");
                    int keyS = scan.nextInt();
                    imprimir(tablaHas, keyS, false);
                    break;

                case 4:
                    System.out.print("\nQue numero de llave quieres eliminar: ");
                    int keyR = scan.nextInt();
                    remov(tablaHas, keyR);
                    break;

                case 5:
                    condition = false;
                    System.out.println("\nSaliendo");
                    break;
            
                default:
                    System.out.println("\nEscoge una opción valida");
                    break;
            }

        }
        scan.close();
    }

    private static void add(int[][] arr, int val) {
        String cadena = Integer.toString(val);

        int num1 = Integer.parseInt(cadena.substring(0, 3));
        int num2 = Integer.parseInt(cadena.substring(3, 6));
        int num3 = Integer.parseInt(cadena.substring(6, 9));

        int num4 = num1+num2+num3;

        num4 = num4%17;

        fPlegamiento(arr, val, num4);

    }


    private static void imprimir(int[][] arr, int key, boolean modo){
        if (modo){
            for(int i=0; i<nElem; i++){
                if(arr[i][1] != 0){
                    System.out.println(" { " +arr[i][0]+ ", " +arr[i][1]+ "}");
                }
                
            }
        } else{
            if (arr[key][1] == 0) {
                System.out.println("\nEl elemento no existe\n");
            } else System.out.println("\nElemento * " +arr[key][1]+ " * encontrado");
        }
        
    }


    private static void remov(int[][] arr, int key){
        arr[key][0] = 0;
        arr[key][1] = 0;
        System.out.println("\nElemento eliminado");

    }


    private static void fPlegamiento(int[][] arr, int val, int mod){
        if(arr[mod][1] == 0){
            arr[mod][1] = val;
            arr[mod][0] = mod;
            System.out.println("\n " + val + " agregado en en la posicion: " + mod);

        } else if(mod>nElem){
            
            while(mod>nElem){
                mod--;
            }
            System.out.println("\nOcurrio una colision, arreglando el problema");
            fPlegamiento(arr, val, mod);
            
        } else if(mod<nElem){
            if(mod >= 0){
                while(arr[mod][1] != 0){
                    mod--;
                }

                arr[mod][1] = val;
                arr[mod][0] = mod;
                System.out.println("\n " + val + " agregado en en la posicion: " + mod);

            } else {
                System.out.println("\nTablaHash llena \nElimina una clave");
            }
        }
    }


    private static void cleanScrean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}