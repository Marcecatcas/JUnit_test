package com.example.test;

import org.example.Calculadora;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculadoraTest {

    // Test para la suma
    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(5, 3);
        assertEquals(8, resultado);
    }

    // Test para la resta
    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado);
    }

    // Test para la multiplicación
    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(5, 3);
        assertEquals(15, resultado);
    }

    // Test para la división
    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dividir(6, 2);
        assertEquals(3, resultado);
    }

    // Test para la división por cero
    @Test
    public void testDividirPorCero() {
        Calculadora calculadora = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(6, 0));
    }
}