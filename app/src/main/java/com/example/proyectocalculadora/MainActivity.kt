package com.example.proyectocalculadora

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var resultado: TextView? = null
    private var input = ""
    private var num1 = 0.0
    private var num2 = 0.0
    private var operador = ' '
    private val calculadora = Calculadora()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultado = findViewById(R.id.resultado)
    }

    fun botonNumeroClick(view: View) {
        val boton = view as Button
        val textoBoton = boton.text.toString()

        // Evitar que se ingresen múltiples ceros al principio
        if (input == "0") {
            input = textoBoton
        } else {
            input += textoBoton
        }
        resultado!!.text = input
    }

    fun botonOperadorClick(view: View) {
        val boton = view as Button
        if (!input.isEmpty()) {
            num1 = input.toDouble()
            operador = boton.text.toString()[0]

            // Mostrar num1, operador y un espacio en el TextView
            resultado!!.text = "$num1 $operador "

            // Reiniciar input para capturar num2
            input = ""
        }
    }

    fun puntoDecimalClick(view: View?) {
        if (!input.contains(".")) {
            input += "."
            resultado!!.text = input
        }
    }

    fun botonIgualClick(view: View?) {
        if (!input.isEmpty()) {
            num2 = input.toDouble()
            var resultadoCalculado = 0.0 // Inicializa el resultado a cero
            resultadoCalculado = when (operador) {
                '+' -> calculadora.sumar(num1, num2)
                '-' -> calculadora.restar(num1, num2)
                '×' -> calculadora.multiplicar(num1, num2)
                '÷' -> calculadora.dividir(num1, num2)
                '^' -> calculadora.potencia(num1, num2.toInt())
                else ->                     // Manejo de operador desconocido
                    Double.NaN
            }
            input = resultadoCalculado.toString()
            if (java.lang.Double.isNaN(resultadoCalculado)) {
                resultado!!.text = "ERROR"
            } else {
                resultado!!.text = input
            }
        }
    }

    fun botonResetearClick(view: View?) {
        num1 = 0.0
        num2 = 0.0
        operador = ' '
        input = ""
        resultado!!.text = "0"
    }

    fun botonFibonacciClick(view: View?) {
        if (!input.isEmpty()) {
            //obtener numero digitado
            val numeroFibonacci = input.toInt()

            //crear lista
            val secuenciaFibonacci = calculadora.secuenciaFibonacci(numeroFibonacci)

            //crear intent
            val intent = Intent(this, ActivityResultadoFibonacci::class.java)

            //agregar al intent putExtra y convertir lista to string
            intent.putExtra("resultadoFibonacci", secuenciaFibonacci.toString())

            //inicializar intent
            startActivity(intent)
        }
    }

    fun botonFactorialClick(view: View?) {
        if (!input.isEmpty()) {
            //obtener numero digitado
            val numeroFactorial = input.toInt()

            //crear lista
            val secuenciaFactorial = calculadora.secuenciaFactorial(numeroFactorial)

            //crear intent
            val intent = Intent(this, ActivityResultadoFactorial::class.java)

            //agregar al intent putExtra y convertir lista to string
            intent.putExtra("resultadoFactorial", secuenciaFactorial.toString())

            //inicializar intent
            startActivity(intent)
        }
    }
}