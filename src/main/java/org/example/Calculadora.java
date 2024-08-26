package org.example;

public class Calculadora {

    // Método que suma dos números
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método que resta dos números
    public int restar(int a, int b) {
        return a - b;
    }

    // Método que multiplica dos números
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método que divide dos números
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero.");
        }
        return a / b;
    }
}
