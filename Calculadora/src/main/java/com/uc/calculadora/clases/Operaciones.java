package com.uc.calculadora.clases;

/**
 *
 * @author Universe Code
 * @since 2020-07-26
 */
public class Operaciones {

  String expresion;
  double va11;
  double val2;
  double resultado = 0;

  public Operaciones(String expresion) {
    this.expresion = expresion;
  }

  public double ejecutarOperacion() {
    String valor1 = "";
    String valor2 = "";
    char operando = 0;

    boolean primerNumeroLLeno = false;
    if (expresion.equals("")) {
      return 0;
    }
    char[] ch = expresion.toCharArray();
    for (char c : ch) {
      if (Character.isDigit(c) || c == '.') {

        if (!primerNumeroLLeno) {
          valor2 += c;
        } else {
          valor1 += c;
        }
      } else {
        if (c == '+' || c == '-' || c == '*' || c == '/') {
          operando = c;
          primerNumeroLLeno = true;
        }
      }
    }
    va11 = Double.parseDouble(valor1);
    val2 = Double.parseDouble(valor2);
    switch (operando) {
      case '+':
        resultado = suma(va11, val2);
        break;
      case '-':
        resultado = resta(va11, val2);
        break;
      case '*':
        resultado = multiplicacion(va11, val2);
        break;
      case '/':
        resultado = division(va11, val2);
        break;
    }
    return resultado;
  }

  public double suma(double numero1, double numero2) {
    resultado = numero1 + numero2;
    return resultado;
  }

  public double resta(double numero1, double numero2) {
    resultado = numero2 - numero1;
    return resultado;
  }

  public double multiplicacion(double numero1, double numero2) {
    resultado = numero1 * numero2;
    return resultado;
  }

  public double division(double numero1, double numero2) {
    resultado = numero2 / numero1;
    return resultado;
  }
}
