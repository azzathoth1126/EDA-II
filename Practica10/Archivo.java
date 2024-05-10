
//package practica10eda;

import java.io.*;
import java.util.Scanner;


public class Archivo {
    
    public void crearArchivo(String nombre) throws IOException{
        File archivo = new File (nombre);
        if (archivo.exists()){
            System.out.println("Ya existe el archivo.\n");

            /*System.out.println("Nombre de Archivo: " + archivo.getName());
            System.out.println("Absolute path: " + archivo.getAbsolutePath());
            System.out.println("Permisos de escritura: " + archivo.canWrite());
            System.out.println("Permisos de lectura: " + archivo.canRead());
            System.out.println("Tamaño del archivo: " + archivo.length());
            System.out.println("Carpeta contenedora: " + archivo.getParent());
            System.out.println("Es archivo: " + archivo.isFile());
            System.out.println("Es directorio " + archivo.isDirectory());
            System.out.println("Es oculto: " + archivo.isHidden());*/

        } else{
            FileWriter fw = new FileWriter(archivo);
            System.out.println("Se creó el archivo exitosamente.\n");  
            escribir(nombre, false);
            fw.close();      

        }
        
    }

    public void crearDirectorio(String ubicacion) throws IOException{
        File director = new File (ubicacion);
        if (director.exists()){
            System.out.println("Esta ubicacion ya existe");
        }else{
            
        }
    }
    
    public void escribir(String nombre, boolean modo) throws IOException{
        File archivo = new File (nombre);
        if(archivo.exists()){
            FileWriter fw = new FileWriter(archivo, modo);
            Scanner sc= new Scanner(System.in);
            String cadena;
            System.out.println("Añadir contenido: ");
            cadena=sc.nextLine();
            fw.write(cadena);
            fw.close();
        }
        else{
            System.out.println("No existe el archivo.");
        }
        
    }     
    
    public void eliminar(String nombre) throws IOException{
        File archivo = new File (nombre);
        if(archivo.exists()){
            archivo.delete();
        }
        else{
            System.out.println("No existe el archivo.");
        }
    }
    
}

//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html
//https://docs.oracle.com/en/java/javase/11/docs/api/allclasses.html
    