/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao2;


/**
 *
 * @author vitor-nuvme
 */
public class ContaEspecial extends ContaBancaria {
    private double limiteCredito;
    
    
    public ContaEspecial(){
        super();
    }
    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    @Override
    public void sacar(double valor){
        if (getSaldo() + getLimiteCredito() < valor){ 
            
            throw new RuntimeException("Sem dinheiro");

        }
        else{
           setSaldo(getSaldo() - valor);
           incluirMovimento(new Movimento(valor, TipoMovimento.DEBITO));

        }
        
    }
    
    
}
