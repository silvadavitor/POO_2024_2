package questao2;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Pessoa p1;
        p1 = new Pessoa();
        
        System.out.println("Digite a sua altura: ");
        p1.altura = scanner.nextDouble();
        
        System.out.println("Digite o seu peso: ");
        p1.peso = scanner.nextDouble();
  
        double imc = p1.calcularImc();
        
        System.out.println("");
        System.out.println("Seu imc é = " + imc);
        scanner.close();

    }

}
