package com.example.proyectocalculadora;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.List;

public class TestCalculadora {
    @Test
    public void testSuma() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.sumar(2.0, 3.0);
        assertEquals(5.0, resultado, 0.001);
    }

    public void testSuma2() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.sumar(8.0, 3.0);
        assertEquals(11.0, resultado, 0.001);
    }

    @Test
    public void testResta() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.restar(5.0, 2.0);
        assertEquals(3.0, resultado, 0.001);
    }

    @Test
    public void testMultiplicacion() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(5.0, 2.0);
        assertEquals(10.0, resultado, 0.001);
    }

    @Test
    public void testDivision() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir(6.0, 2.0);
        assertEquals(3.0, resultado, 0.001);
    }

    @Test
    public void testPotencia() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.potencia(2.0, 3);
        assertEquals(8.0, resultado, 0.001);
    }


    @Test
    public void testSecuenciaFibonacci() {
        Calculadora calculadora = new Calculadora();


        List<Integer> secuencia0 = calculadora.secuenciaFibonacci(0);
        assertEquals(List.of(0), secuencia0);


        List<Integer> secuencia1 = calculadora.secuenciaFibonacci(1);
        assertEquals(List.of(0, 1), secuencia1);


        List<Integer> secuencia5 = calculadora.secuenciaFibonacci(5);
        assertEquals(List.of(0, 1, 1, 2, 3, 5), secuencia5);


    }

    @Test
    public void testFactorial(){
        Calculadora calculadora = new Calculadora();

        List<Integer> resultadoSF0 = calculadora.secuenciaFactorial(0);
        assertEquals(List.of(1), resultadoSF0);

        List<Integer> resultadoSF1 = calculadora.secuenciaFactorial(1);
        assertEquals(List.of(1,1), resultadoSF1);

        List<Integer> resultadoSF3 = calculadora.secuenciaFactorial(3);
        assertEquals(List.of(1,1,2,6), resultadoSF3);

        List<Integer> resultadoSF5 = calculadora.secuenciaFactorial(5);
        assertEquals(List.of(1,1,2,6,24,120), resultadoSF5);

        List<Integer> resultadoSF7 = calculadora.secuenciaFactorial(7);
        assertEquals(List.of(1,1,2,6,24,120, 720, 5040), resultadoSF7);

    }

}



