#include <stdio.h>

void selectionSort(int arreglo[], int n);
void printArray(int arr[],int size);

int main(){

    int arrelgo[] = {3,21,7,2,95,23,1,0};
    int n = sizeof(arreglo)/sizeof(list[0]);

    selectionSort(arreglo, tam);

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

void printArray(int arr[],int size){
	int i;
  	for (i=0; i < size; i++)
       	printf("%d ", arr[i]);
    	printf("\n");
}