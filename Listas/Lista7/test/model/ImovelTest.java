/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;
import model.Bairro;
/**
 *
 * @author vitor-nuvme
 */
public class ImovelTest {
    
    public ImovelTest() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveLancarExcecaoParaAreaNegativa() {
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0), "-5", "Rua ABC", "RESIDENCIAL");
        imovel.calcularIptu();
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveLancarExcecaoParaCalculoSemArea() {
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0), "", "Rua ABC", "RESIDENCIAL");
        imovel.calcularIptu(); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveLancarExcecaoParaCalculoSemFinalidade() {
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0), "250", "Rua ABC", null);
        imovel.calcularIptu();
    }

    @Test
    public void deveCalcularIptuResidencial() {
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0), "400", "Rua ABC", "RESIDENCIAL");
        double iptu = imovel.calcularIptu();
        assertEquals(400.00, iptu, 0.01);  
    }

    @Test
    public void deveCalcularIptuComercialPequeno() {
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0), "80", "Rua ABC", "COMERCIAL");
        double iptu = imovel.calcularIptu();
        assertEquals(500.00, iptu, 0.01);  
    }

    @Test
    public void deveCalcularIptuComercialMedio() {
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0), "250", "Rua ABC", "COMERCIAL");
        double iptu = imovel.calcularIptu();
        assertEquals(1000.00, iptu, 0.01);  
    }

    @Test
    public void deveCalcularIptuComercialGrande() {
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0), "500", "Rua ABC", "COMERCIAL");
        double iptu = imovel.calcularIptu();
        assertEquals(1275.00, iptu, 0.01); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveLancarExcecaoParaFinalidadeInvalida() {
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0), "500", "Rua ABC", "INVALIDA");
        imovel.calcularIptu();  
    }
}