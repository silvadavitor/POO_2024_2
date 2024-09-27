/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package questao1;

/**
 *
 * @author vitor-nuvme
 */
public class Funcionario {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException ("SALARIO INVALIDO");}
        else{
        this.salario = salario;
        }
    }
    
    public double calcularIrpf(){
        double irpf = 0;
        
        if (salario > 1903.98 & salario <= 2826.65){
            irpf += (salario - 1903.98)* 0.075;
        }
        else if(salario > 2826.66 & salario <= 3751.05){
            irpf += (2826.65 - 1903.98)* 0.075;
            irpf += (salario - 2826.65)* 0.15;
        }
        
        else if (salario > 3751.05 & salario <= 4664.68){
            irpf += (2826.65 - 1903.98)* 0.075;
            irpf += (3751.05 - 2826.65)* 0.15;
            irpf += (salario - 3751.05)* 0.225;
        }
        
        else if (salario > 4664.68){
            irpf += (2826.65 - 1903.98)* 0.075;
            irpf += (3751.05 - 2826.65)* 0.15;
            irpf += (4664.68 - 3751.05)* 0.225;
            irpf += (salario - 4664.68)* 0.275;
        }
        
        
        return irpf;
    }
}
