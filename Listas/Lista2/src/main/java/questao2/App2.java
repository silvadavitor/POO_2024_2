/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;
import java.util.Scanner;

/**
 *
 * @author vitor-nuvme
 */
public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ContaBancaria[] conta = new ContaBancaria[2];
        
        for(int i = 0; i < 2; i++){
            
            conta[i] = new ContaBancaria();
            
            System.out.println("");
            System.out.println("Digite seu Numero: ");
            conta[i].setNumero(scanner.nextLine());
            System.out.println("");
            
            System.out.println("Digite o titular: ");
            conta[i].setTitular(scanner.nextLine());
            System.out.println("");
        }
        conta[0].depositar(1000.00);
        conta[0].depositar(700.00);
        
        conta[1].depositar(5000.00);
        
        conta[1].sacar(3000.00);
        
        conta[1].transferir(conta[0], 1800.00);
        
        System.out.println("O titular " + conta[0].getTitular() +" possui " + conta[0].getSaldo() + " em sua conta");
        System.out.println("O titular " + conta[1].getTitular() +" possui " + conta[1].getSaldo() + " em sua conta");

    }
}
