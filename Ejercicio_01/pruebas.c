#include <stdio.h>
#include <stdbool.h>

//Primera prueba lista - lista
void selectionSort(int arreglo[], int n);
void printArray(int arr[],int size);
void swap(int* a, int* b);
//Segunda prueba - lista
void insertionSort(int a[], int n);
//Tercera prueba - lista
void bubbleSort(int a[], int n);

int main(){

    //int arreglo[] = {20,34,754,1,46,74,23,74,12,42,1,72,0,3,1,6,72,40,91,321};
    int arreglo[20];

    printf("--------Progama de ordenamiento--------\n\n");
    printf("Dame los 20 numeros del arreglo: ");
    for(int i=0; i<20; i++){
        printf("Numero %d", i);
        scanf("%d", &arreglo[i]); 
        printf("\n");  
    }
    
    int n = sizeof(arreglo)/sizeof(arreglo[0]);
    int opcion;

    printf("Escoge un de los siguientes algoritmos de ordenamieto: ");
    printf("\n   1.- SelectionSort");
    printf("\n   2.- InsertionSort");
    printf("\n   3.- BubbleSort\n");
    scanf("Algoritmo: %d", &opcion);
    
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