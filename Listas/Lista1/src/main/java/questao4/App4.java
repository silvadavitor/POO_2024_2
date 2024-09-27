package questao4;
import java.util.Scanner;


public class App4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Pessoa[] p = new Pessoa[3];
        
        for(int i = 0; i < p.length; i++){
            
            p[i] = new Pessoa();
            
            System.out.println("");
            System.out.println("Digite seu nome: ");
            p[i].nome = scanner.next();
            System.out.println("");
            
            System.out.println("Digite a sua altura: ");
            p[i].altura = scanner.nextDouble();
            System.out.println("");
            
            System.out.println("Digite o seu peso: ");
            p[i].peso = scanner.nextDouble();

            p[i].imc = p[i].calcularImc();
        }
        for(int j = 2; j >= 0; j--){
            System.out.println("");
            System.out.println("Dados da pessoa " + (j+1));
            System.out.println("Nome: " + p[j].nome);
            System.out.println("Peso: " + p[j].peso + " kg");
            System.out.println("Altura: " + p[j].altura + " m");
            System.out.println("IMC: " + p[j].imc);
            
        
        }
            
    }

}
