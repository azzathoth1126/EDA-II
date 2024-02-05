#include <stdio.h>

int main() {
    double list[] = {2, 3, 6, 1, 4, 8, 5, 9, 7, 10};
    int n = 10;
    printf("'\t-----Código de ordenamiento-----\n");
    printf("\t---------Insertion Sort---------\n");
    
    for(int i = 1; i < n; i++) {
        double index = list[i];
        int j = i - 1;
        
        while(j >= 0 && list[j] > index) {
            list[j + 1] = list[j];
            j = j - 1;
        }
        list[j + 1] = index;
    }
    
    printf("\t\n\n{");
    for(int a = 0; a < 10; a++) {
        printf("%.0f", list[a]);
        if (a < 9) {
            printf(", ");
        }
    }
    printf("}\n");
    
    return 0;
}
