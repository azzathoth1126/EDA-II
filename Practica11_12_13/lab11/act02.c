#include <stdio.h>

int main(){

	#pragma omp parallel
	{
        int i;
		printf("\nHola Mundo\n");
		for(i=0; i<10; i++)
			printf("Iteracion: %d\n", i);
	}
	printf("\nAdios\n");
	return 0;
}
