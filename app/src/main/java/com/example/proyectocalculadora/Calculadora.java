package com.example.proyectocalculadora;

import java.util.ArrayList;
import java.util.List;

public class Calculadora  {
        public double sumar(double num1, double num2) {
            return num1 + num2;
        }

        public double restar(double num1, double num2) {
            return num1 - num2;
        }

        public double multiplicar(double num1, double num2) {
            return num1 * num2;
        }

        public double dividir(double num1, double num2) {
            if (num2 != 0) {
                return num1 / num2;
            } else {
                return Double.NaN; // Manejo de división por cero
            }
        }

        public double potencia(double base, int exponente) {
            if (exponente == 0) {
                return 1;
            } else if (exponente < 0) {
                return 1 / (base * potencia(base, -exponente - 1));
            } else {
                return base * potencia(base, exponente - 1);
            }
        }

    public List<Integer> secuenciaFactorial(int n) {
        List<Integer> secuencia = new ArrayList<>();

        if (n < 0) {
            // Devolver una lista vacía para entrada negativa
            return secuencia;
        }

        for (int i = 0; i <= n; i++) {
            secuencia.add(factorial(i));
        }

        return secuencia;
    }


    public List<Integer> secuenciaFibonacci(int n) {
        List<Integer> secuencia = new ArrayList<>();

        if (n < 0) {

            return secuencia;
        }

        for (int i = 0; i <= n; i++) {
            secuencia.add(fibonacci(i));
        }

        return secuencia;
    }

    private int fibonacci(int n) {
        if (n < 0) {
            // Manejar entrada inválida, por ejemplo, retornar un valor especial o lanzar una excepción
            return -1; // Valor especial para indicar entrada inválida
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int fibNMenos1 = fibonacci(n - 1);
            int fibNMenos2 = fibonacci(n - 2);
            return fibNMenos1 + fibNMenos2;
        }
    }

    private int factorial(int n) {
        if (n < 0) {
            // Manejar entrada inválida
            return -1; // Retornar un valor especial para indicar entrada inválida
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}

