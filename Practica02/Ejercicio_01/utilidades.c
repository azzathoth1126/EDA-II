#include "utilidades.h"
#include <stdio.h>

void swap(int* a, int* b){
    int t = *a;
    *a = *b;
    *b = t;
}

void printArray(int arr[],int size){
	int i;
  	for (i=0; i < size; i++)
       	printf("%d ", arr[i]);
    	printf("\n");
}

void printSubArray(int arr[],int low, int high){
    int i;
    printf("Sub array :  ");
	for (i=low; i <= high; i++)
       printf("%d ", arr[i]);
    printf("\n");
}


//Agregado en el laboratorio
int heapSize; ///


void Heapify(int* A, int i, int size) {
	int l = 2 * i + 1;
	int r = 2 * i + 2;
	int largest;

	if(l <= heapSize && A[l] > A[i])
    	largest = l;
  	else
    	largest = i;
  	if(r <= heapSize && A[r] > A[largest])
    	largest = r;
  	if(largest != i){
    	swap(&A[i],&A[largest]);
    	printArray(A,size);
    	Heapify(A, largest,size);
     }
     
}


void BuildHeap(int* A, int size) {
	heapSize = size - 1;
  	int i;
  	for(i = (size - 1) / 2; i >= 0; i--){
		Heapify(A, i,size);
  	}
	printf("Termin%c de construir el HEAP \n",162);
}


int partition (int arr[], int low, int high) {
   	int pivot = arr[high];    
	printf("Pivote: %d   \n ",pivot);
	int j,i = (low - 1);  
   	for (j = low; j <= high- 1; j++){
       	if (arr[j] <= pivot){
            		i++;    
            		swap(&arr[i], &arr[j]);
        	}
    	}
    	swap(&arr[i + 1], &arr[high]);
	return (i + 1);
}