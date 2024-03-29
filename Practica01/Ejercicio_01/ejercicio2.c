#include <stdbool.h>  //Para usar variables booleanas
#include <stdio.h>    //Para imprimir en pantalla
#include <stdlib.h>	  //Para generar numeros aleatorios
#include <time.h>	  //Complemento para generar numeros aleatorios

//Funciones de Ordenamiento
void insertionSort(int a[], int n);
void selectionSort(int arreglo[], int n);
void bubbleSort(int a[], int n);
//Funciones de Impresion en pantalla y cambio
void printArray(int arr[],int size);
void swap(int* a, int* b);
//Funciones de llenado de arreglos
void arregloManual(int a[]);
void arregloAleatorio(int a[]);


//Funcion principal
int main(){

    int arreglo[20], opcion;
	int n = sizeof(arreglo)/sizeof(arreglo[0]);//Tamaño del arreglo

	//Menu - Como llenar el arreglo
    printf("\n\n--------Progama de ordenamiento--------\n\n");
	printf("De que manera quieres llenas tu arreglo: ");
	printf("\nDe manera manual ------------------1");
	printf("\nDe manera de manera aleatoria -----2\n");
	printf("\nOpcion: ");
	scanf(" %d", &opcion);
    
	//Seleccion de forma de llenar el arreglo
	if (opcion == 1) {
		arregloManual(arreglo);
	}
	else {
		arregloAleatorio(arreglo);
	}

	//Menu de algoritmo de ordenamiento a escoger
    printf("\n\nEscoge un de los siguientes algoritmos de ordenamieto: ");
    printf("\n   1.- SelectionSort");
    printf("\n   2.- InsertionSort");
    printf("\n   3.- BubbleSort\n");
	opcion = 0;
	printf("\nAlgoritmo: ");
    scanf(" %d", &opcion);
    
	//Seleccion de forma de ordenar el arreglo
    switch (opcion) {
        case 1:
            selectionSort(arreglo, n);
            break;
        case 2:
            insertionSort(arreglo, n);
            break;
        case 3:
            bubbleSort(arreglo, n);
            break;
    }

    return 0;
}


//Algoritmo de ordenamiento
void insertionSort(int a[], int n) {
	int i,j,k;
	int aux;

	for(i=1; i<n; i++){
		j=i;
		aux=a[i];
		while (j>0 && aux < a[j-1]){
			a[j] = a[j-1];
			j--;
		}
		a[j]=aux;

		printf("\nInsertionSort - Iteracion numero %d \n",i);
		printArray(a,n);
	}
}


//Algoritmo de ordenamiento
void selectionSort(int arreglo[], int n) {
	int indiceMenor, i, j;
	for (i=0; i<n-1; i++){
		indiceMenor=i;
		for(j = i+1; j<n; j++){
			if(arreglo[j]<arreglo[indiceMenor])
				indiceMenor=j;
		}
		if (i!=indiceMenor){
			swap(&arreglo[i],&arreglo[indiceMenor]);
		}

		printf("\nSelectionSort- Iteracion numero %d \n",i+1);
		printArray(arreglo,n);
	}
}


//Algoritmo de ordenamiento
void bubbleSort(int a[], int n) {
	int i = n, j;
	bool ver = true;

	while(i>=1 && ver == true) {
			ver = false;

			for(j=0; j<n; j++) {
				if(a[j]>a[j+1]) {
					swap(&a[j], &a[j+1]);
					ver = true;
				}
			}
			i = i-1;
		
		printf("\nBubbleSort - Iteracion numero %d \n",i+1);
		printArray(a,n);
	}
}


//Funcion de impresion de iteraciones de arreglos
void printArray(int arr[],int size) {
	int i;
  	for (i=0; i < size; i++)
       	printf("%d ", arr[i]);
    	printf("\n");
}


//Funcion de cambio de elementos
void swap(int* a, int* b) {
    int t = *a;
    *a = *b;
    *b = t;
}


//Funcion de llenado de arreglos
void arregloManual(int a[]) {
	int num;
	printf("Dame los 20 numeros del arreglo: \n");
    for(int i=0; i<20; i++){
    	printf("Numero %d: ", i+1);
        scanf(" %d", &num); 
		a[i] = num;
    }
}


//Funcion de llenado de arreglos
void arregloAleatorio(int a[]) {
	srand(time(NULL));

    // Llenar el arreglo con números aleatorios del 1 al 100
    for (int i = 0; i < 20; i++) {
        a[i] = rand() % 100 + 1;
    }
}