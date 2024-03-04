import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class RadixSort {

    public static void radixSort(int numeros[], int tam) {
        Stack<Integer>[] digitStacks = new Stack[10];
        for (int i = 0; i < 10; i++) {
            if (i >= 3 && i <= 6) {
                digitStacks[i] = new Stack<>();
            }
        }

        for (int exp = 1; tam / exp > 0; exp *= 10) {
            // Coloca los elementos en las pilas según el dígito actual
            for (int num : numeros) {
                int digit = (num / exp) % 10;
                digitStacks[digit].push(num);
            }
            //Utilerias.PrintArrays(numeros, 20);
        }

        for (int i =0; i<4; i++) {
            if (stack != null) { // Verifica si la pila está inicializada
                    while (!stack.isEmpty()) {
                        numeros[i++] = stack.pop();
                    }
            }
        }
        int index = 0;
            for (Stack<Integer> stack : digitStacks) {
                if (stack != null) { // Verifica si la pila está inicializada
                    while (!stack.isEmpty()) {
                        numeros[index++] = stack.pop();
                    }
                }
            }
    }
}