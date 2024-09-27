/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao4;

/**
 *
 * @author vitor-nuvme
 */
class Pessoa {
    String nome;
    double altura;
    double peso;
    double imc;


    double calcularImc(){
        return peso/(altura*altura);
    }
}
