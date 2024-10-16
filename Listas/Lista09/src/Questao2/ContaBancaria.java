package Questao2;

import java.util.ArrayList;

public class ContaBancaria {

    private String numero;
    private double saldo;
    private Cliente titular;
    private ArrayList<Movimento> movimentos;

    public ContaBancaria() {
        this.movimentos = new ArrayList<>();
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
    
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        incluirMovimento(new Movimento(valor, TipoMovimento.CREDITO)); 
    }
    
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            incluirMovimento(new Movimento(valor, TipoMovimento.DEBITO));
            setSaldo(getSaldo() - valor);
        } else {
            throw new IllegalArgumentException("Saldo insuficiente para saque.");
        }
    }
    
    public void transferir(ContaBancaria contaDestino, double valor) {
        setSaldo(getSaldo() - valor);
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        incluirMovimento(new Movimento(valor, TipoMovimento.DEBITO)); 
    }

    public ArrayList<Movimento> getMovimentos() {
        return movimentos;
    }
    
    protected void incluirMovimento(Movimento m) {
        this.movimentos.add(m);
    }
}
