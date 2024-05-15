
//package practica10eda;

import javax.swing.JFileChooser;
import java.io.*;
import java.util.Scanner;


public class Archivo {
    
    public void crearArchivo(File directorio) throws IOException{
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Ingresa el nombre del archivo con su extencion: ");
        String nombre = scanner.nextLine();

        File archivo = new File (directorio, nombre);
        
        if (archivo.exists()){
            System.out.println("Ya existe el archivo.\n");
        } 
        else{

            FileWriter fw = new FileWriter(archivo);

            System.out.println("Se creó el archivo exitosamente.\n");
            System.out.println("\nArchivo creado en: " + archivo.getAbsolutePath());
            escribir(nombre, false);
            fw.close();      

        }
        
    }


    public void ubicarDirectorio() throws IOException{

        Scanner scanner= new Scanner(System.in);
        File directorio = new File("/workspace/EDA-II/");
  
        System.out.print("\nIngresa el nombre del directorio donde se guardara el archivo ");
        String nomDiretorio = scanner.nextLine();
             
        File directoriaReal = new File(directorio, nomDiretorio);

        if (directoriaReal.exists()) {
            System.out.println("Directorio ubicado");
            crearArchivo(directoriaReal);
        } else {
            System.out.println("\nEl directorio no existe.");
            System.out.println("Dame un directorio valido");
            ubicarDirectorio();
            
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
        }else{
            System.out.println("No existe el archivo.");
        }
        
    }     
    

    public void eliminar(String nombre) throws IOException{

        File archivo = new File (nombre);

        if(archivo.exists()){
            archivo.delete();
        }else{
            System.out.println("No existe el archivo.");
        }
    }


    public void info(String nombre) throws IOException{

        File archivo = new File (nombre);

        if (archivo.exists()){

            System.out.println("\nNombre de Archivo: " + archivo.getName());
            System.out.println("Absolute path: " + archivo.getAbsolutePath());
            System.out.println("Permisos de escritura: " + archivo.canWrite());
            System.out.println("Permisos de lectura: " + archivo.canRead());
            System.out.println("Tamaño del archivo: " + archivo.length());
            System.out.println("Carpeta contenedora: " + archivo.getParent());
            System.out.println("Es archivo: " + archivo.isFile());
            System.out.println("Es directorio " + archivo.isDirectory());
            System.out.println("Es oculto: " + archivo.isHidden());
        }else{
            System.out.println("\nEl archivo no existe");
        }
    }
    
}

//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html
//https://docs.oracle.com/en/java/javase/11/docs/api/allclasses.html
    