/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;

/**
 *
 * @author vitor-nuvme
 */
public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void depositar(double valor){
        if(valor < 0){
            throw new IllegalArgumentException ("VALOR INVALIDO");
        }
        else{
        saldo = saldo + valor;
        }
    }
    public void sacar(double valor){
        if(valor < 0 || (saldo - valor) < 0){
            throw new IllegalArgumentException ("OPERAÇÃO INVALIDA");
        }
        else{
        saldo = saldo - valor;
        }
    }
    public void transferir(ContaBancaria contaDestino, double valor){
        sacar(valor);
        contaDestino.depositar(valor);
        
    
    }
}
