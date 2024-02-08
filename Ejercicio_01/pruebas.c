#include <stdio.h>
//Primera prueba lista - lista
void selectionSort(int arreglo[], int n);
void printArray(int arr[],int size);
void swap(int* a, int* b);
//Segunda prueba - lista
void insertionSort(int a[], int n);
//Tercera prueba 
void bubbleSort(int a[], int n);

int main(){

    int arreglo[] = {3,21,7,2,95,23,1,0};
    int n = sizeof(arreglo)/sizeof(arreglo[0]);

    //selectionSort(arreglo, n);
    //insertionSort(arreglo, n);
    
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

		printf("\nIteracion numero %d \n",i+1);
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

		printf("\nIteracion numero %d \n",i);
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