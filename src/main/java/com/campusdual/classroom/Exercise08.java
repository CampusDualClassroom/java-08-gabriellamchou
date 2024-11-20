package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {
        whileLoop(10);
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    public static void whileLoop(int num) {
        int count = 0;
        while (count < num) {
            System.out.println(count + " < " + num + ". El proximo ciclo valdra: " + (count + 1));
            count ++;
        }
    }
}