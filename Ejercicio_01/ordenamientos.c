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

//Agregado en la clase
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