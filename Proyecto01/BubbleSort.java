public class BubbleSort{    
    
    static void bubbleSort(int arreglo[]) {
        int accesosArreglo = 0, comparaciones = 0, cambios = 0, inserciones = 0;

        int n = arreglo.length;
        boolean ver = true;

        while (n>=1 && ver) {
            ver = false;

            for (int j = 0; j < n-1; j++) { 
                if (arreglo[j] > arreglo[j + 1]) {
                    
                    accesosArreglo+=2;
                    comparaciones++;

                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;

                    cambios++;
                    accesosArreglo+=4;

                    ver = true;
                }
            } 
            n--;
        }
        System.out.println("Accesos al arreglo: " + accesosArreglo);
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("inserciones: " + inserciones); 
        System.out.println("Cambios: " + cambios);
    }
}