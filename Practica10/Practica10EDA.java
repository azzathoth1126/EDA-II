//package practica10eda;

import java.io.IOException;
import java.util.Scanner;

public class Practica10EDA{

    
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner (System.in);
        int opcion;
        String nombre;
        Archivo arch = new Archivo();
        System.out.println("Archivos :D");
        do{
            System.out.println("\n1.Crear Archivo\n2.Sobreescribir en el archivo\n3.Añadir contenido en el archivo\n4.Informacion del archivo\n5.Elimina el archivo\n6.Salir\n");
            opcion=scanner.nextInt();
            switch(opcion){
                case 1:
                    arch.ubicarDirectorio();
                    break;
                case 2:
                    System.out.println("Ingresa el Nombre del archivo con su extension:");
                    nombre=scanner.next();
                    arch.escribir(nombre, false);
                    break;
                case 3:
                    System.out.println("Ingresa el Nombre del archivo con su extension:");
                    nombre=scanner.next();
                    arch.escribir(nombre, true);
                    break;
                case 4:
                    System.out.println("Ingresa el Nombre del archivo con su extension:");
                    nombre=scanner.next();
                    arch.info(nombre);
                    break;
                case 5:
                    System.out.println("Ingresa el Nombre del archivo con su extension:");
                    nombre=scanner.next();
                    arch.eliminar(nombre);
                    break;
                default:
                    if (opcion!=6){
                        System.out.println("Opción inválida.");
                    }
                    break;
            }
        }while(opcion!=6);
    }
    
}
