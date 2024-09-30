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
    public void test1() {
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0), "-5", "Rua ABC", "RESIDENCIAL");
        imovel.calcularIptu();
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2() {
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0), "", "Rua ABC", "RESIDENCIAL");
        imovel.calcularIptu(); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3() {
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0), "250", "Rua ABC", null);
        imovel.calcularIptu();
    }

    @Test
    public void test4() {
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0), "400", "Rua ABC", "RESIDENCIAL");
        double iptu = imovel.calcularIptu();
        assertEquals(400.00, iptu, 0.01);  
    }

    @Test
    public void test5() {
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0), "80", "Rua ABC", "COMERCIAL");
        double iptu = imovel.calcularIptu();
        assertEquals(500.00, iptu, 0.01);  
    }

    @Test
    public void test6() {
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0), "250", "Rua ABC", "COMERCIAL");
        double iptu = imovel.calcularIptu();
        assertEquals(1000.00, iptu, 0.01);  
    }

    @Test
    public void test7() {
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0), "500", "Rua ABC", "COMERCIAL");
        double iptu = imovel.calcularIptu();
        assertEquals(1275.00, iptu, 0.01); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void test8() {
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0), "500", "Rua ABC", "INVALIDA");
        imovel.calcularIptu();  
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test9() {
        Imovel imovel = new Imovel(null, "400", "Rua ABC", "RESIDENCIAL");
        imovel.calcularIptu();
    }

    @Test
    public void test10() {
        
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0), "2000", "Rua ABC", "INDUSTRIAL");
        double iptu = imovel.calcularIptu();
        assertEquals(1000.00, iptu, 0.01);
    }

    @Test
    public void test11() {
        
        Imovel imovel = new Imovel(new Bairro("Centro", 1.0), "3000", "Rua ABC", "INDUSTRIAL");
        double iptu = imovel.calcularIptu();
        assertEquals(1650.00, iptu, 0.01);
    }

    @Test
    public void test12() {
        Imovel imovel = new Imovel(new Bairro("Bairro Alto", 2.5), "500", "Rua ABC", "RESIDENCIAL");
        double iptu = imovel.calcularIptu();
        assertEquals(1250.00, iptu, 0.01);
    }    
}