package questao1;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Pessoa[] p = new Pessoa[3];
        
        for(int i = 0; i < p.length; i++){
            
            p[i] = new Pessoa();
            Pessoa.contador++;
            
            System.out.println("");
            System.out.println("Digite seu nome: ");
            p[i].setNome(scanner.nextLine());
            System.out.println("");
            
            System.out.println("Digite a sua altura: ");
            p[i].setAltura(scanner.nextDouble());
            System.out.println("");
            
            System.out.println("Digite o seu peso: ");
            p[i].setPeso(scanner.nextDouble());

            p[i].setImc(p[i].calcularImc());
        }
        for(int j = 2; j >= 0; j--){
            System.out.println("");
            System.out.println("Dados da pessoa " + (j+1));
            System.out.println("Nome: " + p[j].getNome());
            System.out.println("Peso: " + p[j].getPeso() + " kg");
            System.out.println("Altura: " + p[j].getAltura() + " m");
            System.out.println("IMC: " + p[j].getImc());
            
        
        }
            
    }

}
