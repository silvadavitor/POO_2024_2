/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package questao1;

/**
 *
 * @author vitor-nuvme
 */


public class Retangulo {
    

    private int altura = 0;
    private int comprimento = 0;
    
    
    /**
     * Construtor padrão
     */
    public Retangulo(){
    }
    
    /**
     * Construtor que recebe comprimento e altura como parametro
     * @param comprimento
     * @param altura 
     */
    
    public Retangulo(int comprimento, int altura){
             
        setComprimento(comprimento);
        setAltura(altura);
        
    }

    /**
     * 
     * @return 
     */
    public int getAltura() {
        return altura;
    }
    
    
    /**
     * 
     * @param altura 
     */
    public void setAltura(int altura) {
        
        if (altura < 0) {
            throw new IllegalArgumentException ("Valor incorreto para altura: " + altura);}
        else{
        this.altura = altura;
        }
        
    }
    
    /**
     * 
     * @return 
     */
    public int getComprimento() {
        return comprimento;
    }
    
    /**
     * 
     * @param comprimento 
     */
    public void setComprimento(int comprimento) {
        if (comprimento < 0) {
            throw new IllegalArgumentException ("Valor incorreto para comprimento: " + comprimento);}
        else{
        this.comprimento = comprimento;
        }
    }
    
    /**
     * Calcula o Perimetro e retorna o valor
     * @return 
     */
    public int calcularPerimetro(){
        int perimetro = (altura*2) + (comprimento*2);
        return perimetro;
    }
    
    /**
     * Calcula a Area e retorna o valor
     * @return 
     */
    public int calcularArea(){
        int area = altura * comprimento;
        
        return area;
    }
}
