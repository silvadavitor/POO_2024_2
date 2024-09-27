/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1;
import java.util.Scanner;

/**
 *
 * @author vitor-nuvme
 */
public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        Funcionario[] funcionario = new Funcionario[5];

        for(int i = 0; i < 5; i++){

            funcionario[i] = new Funcionario();

            System.out.println("");
            System.out.println("Digite seu Nome: ");
            funcionario[i].setNome(scanner.next());
            System.out.println("");

            System.out.println("Digite o seu salario: ");
            funcionario[i].setSalario(scanner.nextDouble());
            System.out.println("");

        }
        for(int j = 0; j < 5; j++){
            System.out.println("");
            System.out.println("Dados da pessoa " + (j+1));
            System.out.println("Nome: " + funcionario[j].getNome());
            System.out.println("Salário: R$ " + funcionario[j].getSalario());
            System.out.println("IRPF: R$ " + funcionario[j].calcularIrpf());
        }

    scanner.close();
    }
}
