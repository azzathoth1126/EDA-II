#include <stdio.h>
#include <stdbool.h>

//Funciones de Ordenamiento
void insertionSort(int a[], int n);
void selectionSort(int arreglo[], int n);
void bubbleSort(int a[], int n);
//Funciones de Impresion en pantalla y cambio
void printArray(int arr[],int size);
void swap(int* a, int* b);
//Funciones de llenado de arreglos
void llenarArreManual(int a[]);

int main(){

    int arreglo[20], opcion;
	int n = sizeof(arreglo)/sizeof(arreglo[0]);

    printf("--------Progama de ordenamiento--------\n\n");
    
	llenarArreManual(arreglo);

    printf("\nEscoge un de los siguientes algoritmos de ordenamieto: ");
    printf("\n   1.- SelectionSort");
    printf("\n   2.- InsertionSort");
    printf("\n   3.- BubbleSort\n");
	printf("Algoritmo: ");
    scanf(" %d", &opcion);
    
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


void insertionSort(int a[], int n){
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


void selectionSort(int arreglo[], int n){
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


void bubbleSort(int a[], int n){
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


void printArray(int arr[],int size){
	int i;
  	for (i=0; i < size; i++)
       	printf("%d ", arr[i]);
    	printf("\n");
}

void swap(int* a, int* b){
    int t = *a;
    *a = *b;
    *b = t;
}

void llenarArreManual(int a[]) {
	int num;
	printf("Dame los 20 numeros del arreglo: \n");
    for(int i=0; i<20; i++){
    	printf("Numero %d: ", i+1);
        scanf(" %d", &num); 
		a[i] = num;
    }
}