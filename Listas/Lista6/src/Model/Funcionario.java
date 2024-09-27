
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Model;


/**
 *
 * @author vitor-nuvme
 */
public class Funcionario {

    private String nome;
    private double salario;
    private FaixaIrpf faixaEncontrada;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public FaixaIrpf getFaixaEncontrada() {
        return faixaEncontrada;
    }
    
    public double getSalario() {
        return salario;
    }
    public Funcionario(String nome, double salario){
        if (salario < 0) {
            throw new IllegalArgumentException ("SALARIO INVALIDO");}
        else{
        setSalario(salario);
        setNome(nome);
        this.faixaEncontrada = identificarFaixaIrpf(this.salario);  // Identifica a faixa APÓS o salário ser atribuído
    }}


    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException ("SALARIO INVALIDO");}
        else{
        this.salario = salario;
        }
    }
    
    public double calcularIrpf(){
        double irpf = 0;

       if (salario > 1903.98 & salario <= 2826.66){
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

    
    public FaixaIrpf identificarFaixaIrpf(double salario){
        if (salario <= 1903.98){
            return FaixaIrpf.PRIMEIRA;
                       
            }
         else if(salario < 2826.66){
            return FaixaIrpf.SEGUNDA;

         }

         else if (salario <= 3751.05){
            return FaixaIrpf.TERCEIRA;

         }

         else if (salario <= 4664.68){
            return FaixaIrpf.QUARTA;

         }
         else{
            return FaixaIrpf.QUINTA;

         }

        }
 }
