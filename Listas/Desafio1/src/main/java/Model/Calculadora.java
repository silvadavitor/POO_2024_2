/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Model;

/**
 *
 * @author vitor-nuvme
 */
public class Calculadora {
    private double resultado = 0;

 
    private char operador = ' ';
    
    public double getResultado() {
        return resultado;
    }    

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public void Calcular(String valor) {
        if (valor.contains("+")) {
            operador = '+';
        } else if (valor.contains("-")) {
            operador = '-';
        } else if (valor.contains("*")) {
            operador = '*';
        } else if (valor.contains("/")) {
            operador = '/';
        }

        String[] partes = valor.split("\\" + operador);
        double numero1 = Double.parseDouble(partes[0]);
        double numero2 = Double.parseDouble(partes[1]);

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero2 != 0 ? numero1 / numero2 : Double.NaN;
                break;
        }

        setResultado(resultado);
    }
}