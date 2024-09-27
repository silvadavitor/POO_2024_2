/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;
import model.Bairro;
import model.Finalidade;
/**
 *
 * @author vitor-nuvme
 */
public class ImovelTest {
    
    public ImovelTest() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveLancarExcecaoParaAreaNegativa() {
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0));
        imovel.setFinalidade(Finalidade.RESIDENCIAL);  
        imovel.setArea(-5);
        imovel.calcularIptu();  
}


//    // Teste para verificar exceção quando o cálculo é realizado sem especificar a área
//    @Test(expected = IllegalArgumentException.class)
//    public void deveLancarExcecaoParaCalculoSemArea() {
//        Imovel imovel = new Imovel(new Bairro("Centro", 1.0));
//        imovel.setFinalidade(Finalidade.RESIDENCIAL);
//        imovel.calcularIptu();  // Sem especificar a área, deve lançar a exceção
//    }
//
//    // Teste para verificar exceção quando o cálculo é realizado sem finalidade definida
//    @Test(expected = IllegalArgumentException.class)
//    public void deveLancarExcecaoParaCalculoSemFinalidade() {
//        Imovel imovel = new Imovel(new Bairro("Centro", 1.0));
//        imovel.setArea(250);
//        imovel.calcularIptu();  // Sem finalidade definida, deve lançar a exceção
//    }
//
//    // Teste para cálculo de IPTU residencial
//    @Test
//    public void deveCalcularIptuResidencial() {
//        Imovel imovel = new Imovel(new Bairro("Centro", 1.0));
//        imovel.setArea(400);
//        imovel.setFinalidade(Finalidade.RESIDENCIAL);
//        double iptu = imovel.calcularIptu();
//        assertEquals(400.00, iptu, 0.01);  // Valor do IPTU deve ser 400.00
//    }
//
//    // Teste para cálculo de IPTU comercial com área até 100 m²
//    @Test
//    public void deveCalcularIptuComercialPequeno() {
//        Imovel imovel = new Imovel(new Bairro("Centro", 1.0));
//        imovel.setArea(80);
//        imovel.setFinalidade(Finalidade.COMERCIAL);
//        double iptu = imovel.calcularIptu();
//        assertEquals(500.00, iptu, 0.01);  // Valor do IPTU deve ser 500.00
//    }
//
//    // Teste para cálculo de IPTU comercial com área entre 100 e 400 m²
//    @Test
//    public void deveCalcularIptuComercialMedio() {
//        Imovel imovel = new Imovel(new Bairro("Centro", 1.0));
//        imovel.setArea(250);
//        imovel.setFinalidade(Finalidade.COMERCIAL);
//        double iptu = imovel.calcularIptu();
//        assertEquals(1000.00, iptu, 0.01);  // Valor do IPTU deve ser 1000.00
//    }
//
//    // Teste para cálculo de IPTU comercial com área acima de 400 m²
//    @Test
//    public void deveCalcularIptuComercialGrande() {
//        Imovel imovel = new Imovel(new Bairro("Centro", 1.0));
//        imovel.setArea(500);
//        imovel.setFinalidade(Finalidade.COMERCIAL);
//        double iptu = imovel.calcularIptu();
//        assertEquals(1275.00, iptu, 0.01);  // Valor do IPTU deve ser 1275.00
//    }
//
//    // Teste para exceção quando o cálculo é realizado com finalidade inválida
//    @Test(expected = IllegalArgumentException.class)
//    public void deveLancarExcecaoParaFinalidadeInvalida() {
//        Imovel imovel = new Imovel(new Bairro("Centro", 1.0));
//        imovel.setArea(500);
//        imovel.setFinalidade(null);  // Finalidade inválida
//        imovel.calcularIptu();  // Deve lançar exceção IllegalArgumentException
//    }
}