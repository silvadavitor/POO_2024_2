package Questao2;

import java.util.ArrayList;

public class teste {
    public static void main(String[] args) {
        // Criação de uma nova conta especial
        ContaEspecial conta1 = new ContaEspecial();
        conta1.depositar(1000);

        // Exibir saldo inicial
        System.out.println("Saldo inicial: " + conta1.getSaldo());
        conta1.sacar(250);
        // Depósito de R$1000
        System.out.println("Saldo após depósito: " + conta1.getSaldo());
        
        // Saque de R$250
 
        System.out.println("Saldo após saque: " + conta1.getSaldo());
        
        // Obter os movimentos da conta
        ArrayList<Movimento> movimentos = conta1.getMovimentos();
        
        // Exibir informações sobre os movimentos
        System.out.println("Total de movimentos: " + movimentos.size());
        for (Movimento movimento : movimentos) {
            System.out.println("Movimento: Valor = " + movimento.getValor() +
                               ", Tipo = " + movimento.getTipoMovimento() +
                               ", Data = " + movimento.getData() +
                               ", Hora = " + movimento.getHora());
        }
    }
}
