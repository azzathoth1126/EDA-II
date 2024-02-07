#include <stdio.h>
#include <stdbool.h>

int main() {
    
    int list[] = {2, 3, 6, 1, 4, 8, 5, 9, 7, 10};
    int n = 10;
    int i = n;
    bool ver = true;

    printf("\n\n");
    printf("'\t-----Código de ordenamiento-----\n");
    printf("\t-----------Bubble Sort-----------\n");
    
    while(i>=1 && ver == true) {
        ver = false;

        for(int j=0; j<n; j++) {
            if(list[j]>list[j+1]) {
                int a = list[j];
                list[j] = list[j+1];
                list[j+1] = a;

                ver = true;
            }
        }
        i = i-1;
    }

    printf("\t\n\n{");
    for(int a = 0; a < 10; a++) {
        printf("%.d", list[a]);
        if (a < 9) {
            printf(", ");
        }
    }
    printf("}\n");
    
    return 0;
}