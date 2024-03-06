import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class RadixSort {

    public static void radixSort(int numeros[], int tam) {
        Stack<Integer>[] digitStacks = new Stack[15];
        int exp = 1;

        for (int i = 0; i < 4; i++) {
            digitStacks[i] = new Stack<>();
            System.out.println("Pila "+ i + " " + digitStacks[i] + "\n");
        }

        for (int j=0; j<4; j++) {
            // Coloca los elementos en las pilas según el dígito actual
            for (int num : numeros) {
                int digit = (num / exp) % 10;
                digitStacks[digit - 3].push(num);
            }

            for(int i=0; i<4; i++) System.out.println("Pila "+ i + " con elementos: " + digitStacks[i]);
            
            for (Stack<Integer> stack : digitStacks) {
                int index = 15;
                if (stack != null) { // Verifica si la pila está inicializada
                    while (!stack.isEmpty()) {
                        numeros[--index] = stack.pop();
                    }
                }
            }

            System.out.println("\nArreglo modificado: ");
            Utilerias.PrintArrays(numeros, tam);
            exp = exp*10;
        }
    }
}