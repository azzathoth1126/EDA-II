#include "ordenamientos.h"
#include <stdio.h>
#include <stdbool.h>


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


void bubblesort(int a[], int n){
	int i = n, j;
	bool ver = true;

	while(i>=1 && ver == true) {
			ver = false;

			for(j=0; j<n; j++) {
				if(list[j]>list[j+1]) {
					swap(&list[j], &list[j+1])
					ver = true;
				}
			}
			i = i-1;
		
		printf("\nIteracion numero %d \n",i+1);
		printArray(arreglo,n);
	}
}	


//Agregado en el laboratorio
void HeapSort(int* A, int size) {
	BuildHeap(A,size);
  	int i;
  	for(i = size - 1; i > 0; i--){
    	swap(&A[0],&A[heapSize]);      
      	heapSize--;
      	printf("Iteracion HS: \n");
  	printArray(A,size);
	Heapify(A, 0,size);
   }
}


void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        int pi = partition(arr, low, high);
        printSubArray(arr,low,pi-1);
	  quickSort(arr, low, pi - 1);
        printSubArray(arr,pi+1,high);
	  quickSort(arr, pi + 1, high);
    }
}