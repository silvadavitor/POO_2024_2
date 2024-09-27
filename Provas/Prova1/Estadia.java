
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Model;
import javax.swing.JOptionPane;


/**
 *
 * @author Vitor da Silva
 */

/**
 *
 * Classe Principal Estadia
 */
public class Estadia {

    private Periodo periodo;
    private int quantidadeDias;

    /**
     * Metodo para pegar a informação da variavel periodo, retornado o valor da mesma.
     * @return periodo
     */
    public Periodo getPeriodo() {
        return periodo;
    }

    /**
     *  Metodo para setar o periodo recebendo como parametro o enum Periodo e fazendo as validações. Caso seja vazio, retorna uma mensagem de exceção.
     * @param periodo
     */    
    public void setPeriodo(Periodo periodo) {
        if (periodo == null) {
            JOptionPane.showMessageDialog(null, "Período não pode ser vazio", "Erro", JOptionPane.ERROR_MESSAGE);               
            throw new IllegalArgumentException ("Período não pode ser vazio");
        }
        else{
        this.periodo = periodo;
        }
    }
    
    
    /**
     * Metodo para pegar a informação da variavel quantidadeDias, retornado o valor da mesma.
     * @return quantidadeDias
     */
    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    
    /**
     *  Metodo para setar a quantidade de dias, recebendo como parametro um inteiro e fazendo as validações.
     *  Se o periodo for de ALTA_TEMPORADA, precisa ter no minimo 5 dias de estadia, se não irá retornar uma exceção.
     *  E a quantidadeDias minima para os demais periodos precisa ser no minimo 1 dia. Caso contrário irá retornar uma exceção.
     * @param quantidadeDias
     */  
    
    public void setQuantidadeDias(int quantidadeDias) {
        if (periodo == periodo.ALTA_TEMPORADA && quantidadeDias < 5){
            JOptionPane.showMessageDialog(null, "A quantidade minima de diárias para a ALTA_TEMPORADA é de 5 diárias", "Erro", JOptionPane.ERROR_MESSAGE);            
            throw new IllegalArgumentException ("A quantidade minima de diárias para a ALTA_TEMPORADA é de 5 diárias");
        }
        else if (quantidadeDias <= 0){
            JOptionPane.showMessageDialog(null, "A quantidade minima é de 1 diária", "Erro", JOptionPane.ERROR_MESSAGE);                        
            throw new IllegalArgumentException ("A quantidade minima é de 1 diária");                 
        }
        else{
        this.quantidadeDias = quantidadeDias;
        }
    }
    
     /**
     * Construtor recebe já como parametro o periodo (enum Periodo) e quantidade de dias (inteiro). Faz os sets das variaveis.
     * @param periodo
     * @param quantidadeDias
     */
    
    public Estadia(Periodo periodo, int quantidadeDias){ 
        setPeriodo(periodo);
        setQuantidadeDias(quantidadeDias);
    }

    /**
     * Metodo que calcula e retorna o preco total a pagar. Baseado nessas regras:
     * Valor base da diária = 150;
     * Se for baixa temporada recebe desconto de 30%;
     * Se for em alta temporada recebe acréscimo de 20%;
     * Se ficar somente 1 dia recebe acréscimo de 5%;
     * Se ficar mais que 7 dias em alta temporada recebe desconto de 2%;
     * Demais casos não há acréscimos ou descontos.
     */
    public float precoPagar(){
        
        float valorBase = 150;
        valorBase = valorBase * quantidadeDias;
        
        if (periodo == Periodo.BAIXA_TEMPORADA){
            valorBase -= valorBase*0.3f;
        }
        else if(periodo == Periodo.ALTA_TEMPORADA){
            valorBase += (valorBase*0.2f);
            if (quantidadeDias > 7){
                valorBase -= (valorBase*0.02f);           
            }  
        }
        if (quantidadeDias == 1 ){
            valorBase += (valorBase*0.05f);
        }
        
        
        return valorBase;
    }

 
 }
