/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Model;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Vitor da Silva
 */

public class EstadiaTestes {
    
    public EstadiaTestes() {
    }
    
    /**
     *  Teste que verifica se o desconto é aplicado quando o hóspede fica mais
     *  que 7 dias em alta temporada
     * 
     */ 
    
    @Test
    public void teste1() {
        Estadia estadia = new Estadia(Periodo.ALTA_TEMPORADA, 8);
        assertEquals(1411.20, estadia.precoPagar(), 0.01);
    }
   
    
    /**
     *  Teste que verifica se o acréscimo é aplicado quando o hóspede fica 
     *  somente 1 dia em média temporada.
     * 
     */ 
    @Test
    public void teste2() {
        Estadia estadia = new Estadia(Periodo.MEDIA_TEMPORADA, 1);
        assertEquals(157.50, estadia.precoPagar(), 0.01);
    }
   
    /**
     *  Teste que verifica se o desconto é aplicado quando o hóspede fica 5 dias
     *  em baixa temporada.
     * 
     */ 
    @Test
    public void teste3() {
        Estadia estadia = new Estadia(Periodo.BAIXA_TEMPORADA, 5);
        assertEquals(525, estadia.precoPagar(), 0.01);
    }
    
    /**
     *  Teste que verifica se o valor é ajustado quando o hóspede fica 1 diária
     *  em baixa temporada.
     * 
     */    
    @Test
    public void teste4() {
        Estadia estadia = new Estadia(Periodo.BAIXA_TEMPORADA, 1);
        assertEquals(110.25, estadia.precoPagar(), 0.01);
    }
    
    /**
     *  Teste que verifica se o valor é calculado corretamente se o hóspede
     *  fica 3 dias em média temporada.
     * 
     */    
    @Test
    public void teste5() {
        Estadia estadia = new Estadia(Periodo.MEDIA_TEMPORADA, 3);
        assertEquals(450, estadia.precoPagar(), 0.01);
    }
}
