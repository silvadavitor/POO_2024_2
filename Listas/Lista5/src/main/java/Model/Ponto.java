/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Model;

/**
 *
 * @author vitor-nuvme
 */
public class Ponto {
    private int x;
    private int y;
    
    /**
     * Construtor que seta inicialmente x e y para 0
     */
    public Ponto(){
        setX(0);
        setY(0);
    }

    /**
     * Construtor que seta x e y conforme informado no método
     * @param x
     * @param y 
     */
    public Ponto(int x, int y){
        setX(x);
        setY(y);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Faz a verificação do quadrante e retorna em qual está ou nenhum
     * @return 
     */
    public Quadrante identificarQuadrante(){
        
        if (x == 0 || y == 0){
            return Quadrante.NENHUM;
        }
        else if (x > 0 && y > 0){
            return Quadrante.PRIMEIRO;

        }
        else if (x < 0 && y > 0){
            return Quadrante.SEGUNDO;

        }
        else if (x < 0 && y < 0){
            return Quadrante.TERCEIRO;
        
        }
        else if (x > 0 && y < 0){
            return Quadrante.QUARTO;
       
        }
        else{
            throw new IllegalArgumentException ("Valor incorreto: " + x + " ou " + y);
        }
        
     }
    
    /**
     * Testa se está Incidindo sobre X, caso verdade retorna true
     * @return 
     */
    public boolean estaIncidindoSobreX(){
        if (x == 0){
        return true;
        }
        else{
        return false;}
    }
    
    /**
     * Testa se está Incidindo sobre X, caso verdade retorna true
     * @return 
     */
    public boolean estaIncidindoSobreY(){
        if (y == 0){
        return true;
        }
        else{
        return false;}
    }
    
    /**
     * Recebe outro ponto como paremetro e chama a função calcularDistancia, que recebe this e outroPonto como paremetros
     * @param outroPonto
     * @return 
     */
    public double calcularDistancia(Ponto outroPonto){
        return calcularDistancia(this, outroPonto);
    }
    
    /**
     * Recebe this como p1 e outroPonto como p2 e faz o calculo da distancia e retorna ela
     * @param p1
     * @param p2
     * @return 
     */
    public static double calcularDistancia(Ponto p1,  Ponto p2){
        double dist = Math.sqrt((Math.pow(p2.x, 2) - Math.pow(p1.x, 2)) + (Math.pow(p2.y, 2) - Math.pow(p1.y, 2)));
        return dist;
    }
}
