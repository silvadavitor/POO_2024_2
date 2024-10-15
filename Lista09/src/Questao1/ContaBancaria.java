/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Questao1;

/**
 *
 * @author vitor-nuvme
 */
public class ContaBancaria {

    private String numero;
    private double saldo;
    private Cliente titular;
    
    
    public ContaBancaria() {
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    public void depositar(double valor){
        setSaldo(getSaldo() + valor);
    }
    
    public void sacar(double valor){
        setSaldo(getSaldo() - valor);
        
    }
    
    public void transferir(ContaBancaria contaDestino, double valor){
        setSaldo(getSaldo() - valor);
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        
    }
    
}
