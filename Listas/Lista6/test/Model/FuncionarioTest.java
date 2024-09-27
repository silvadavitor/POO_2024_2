/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Model;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author vitor-nuvme
 */
public class FuncionarioTest {
    
    public FuncionarioTest() {
    }
    @Test
    public void test1() {
        Funcionario func = new Funcionario("vitor", 850);
        assertEquals(FaixaIrpf.PRIMEIRA, func.getFaixaEncontrada());
    }

    @Test
    public void test2() {
        Funcionario func = new Funcionario("vitor", 850);
        assertEquals(0.00, func.calcularIrpf(), 0.01);
    }

    @Test
    public void test3() {
        Funcionario func = new Funcionario("vitor", 1903.98);
        assertEquals(FaixaIrpf.PRIMEIRA, func.getFaixaEncontrada());
    }

    @Test
    public void test4() {
        Funcionario func = new Funcionario("vitor", 1903.98);
        assertEquals(0.00, func.calcularIrpf(), 0.01);
    }

    @Test
    public void test5() {
        Funcionario func = new Funcionario("vitor", 1903.99);
        assertEquals(FaixaIrpf.SEGUNDA, func.getFaixaEncontrada());
    }

    @Test
    public void test6() {
        Funcionario func = new Funcionario("vitor", 1903.99);
        assertEquals(0.00, func.calcularIrpf(), 0.01);
    }

    @Test
    public void test7() {
        Funcionario func = new Funcionario("vitor", 2000);
        assertEquals(FaixaIrpf.SEGUNDA, func.getFaixaEncontrada());
    }

    @Test
    public void test8() {
        Funcionario func = new Funcionario("vitor", 2000);
        assertEquals(7.20, func.calcularIrpf(), 0.01);
    }

    @Test
    public void test9() {
        Funcionario func = new Funcionario("vitor", 2826.65);
        assertEquals(FaixaIrpf.SEGUNDA, func.getFaixaEncontrada());
    }

    @Test
    public void test10() {
        Funcionario func = new Funcionario("vitor", 2826.65);
        assertEquals(69.20, func.calcularIrpf(), 0.01);
    }

    @Test
    public void test11() {
        Funcionario func = new Funcionario("vitor", 2826.66);
        assertEquals(FaixaIrpf.TERCEIRA, func.getFaixaEncontrada());
    }

    @Test
    public void test12() {
        Funcionario func = new Funcionario("vitor", 2826.66);
        assertEquals(69.20, func.calcularIrpf(), 0.01);
    }

    @Test
    public void test13() {
        Funcionario func = new Funcionario("vitor", 3000);
        assertEquals(FaixaIrpf.TERCEIRA, func.getFaixaEncontrada());
    }

    @Test
    public void test14() {
        Funcionario func = new Funcionario("vitor", 3000);
        assertEquals(95.20, func.calcularIrpf(), 0.01);
    }

    @Test
    public void test15() {
        Funcionario func = new Funcionario("vitor", 3751.05);
        assertEquals(FaixaIrpf.TERCEIRA, func.getFaixaEncontrada());
    }

    @Test
    public void test16() {
        Funcionario func = new Funcionario("vitor", 3751.05);
        assertEquals(207.86, func.calcularIrpf(), 0.01);
    }

    @Test
    public void test17() {
        Funcionario func = new Funcionario("vitor", 3751.06);
        assertEquals(FaixaIrpf.QUARTA, func.getFaixaEncontrada());
    }

    @Test
    public void test18() {
        Funcionario func = new Funcionario("vitor", 3751.06);
        assertEquals(207.86, func.calcularIrpf(), 0.01);
    }

    @Test
    public void test19() {
        Funcionario func = new Funcionario("vitor", 4000);
        assertEquals(FaixaIrpf.QUARTA, func.getFaixaEncontrada());
    }

    @Test
    public void test20() {
        Funcionario func = new Funcionario("vitor", 4000);
        assertEquals(263.87, func.calcularIrpf(), 0.01);
    }

    @Test
    public void test21() {
        Funcionario func = new Funcionario("vitor", 4664.68);
        assertEquals(FaixaIrpf.QUARTA, func.getFaixaEncontrada());
    }

    @Test
    public void test22() {
        Funcionario func = new Funcionario("vitor", 4664.68);
        assertEquals(413.42, func.calcularIrpf(), 0.01);
    }

    @Test
    public void test23() {
        Funcionario func = new Funcionario("vitor", 4664.69);
        assertEquals(FaixaIrpf.QUINTA, func.getFaixaEncontrada());
    }

    @Test
    public void test24() {
        Funcionario func = new Funcionario("vitor", 4664.69);
        assertEquals(413.42, func.calcularIrpf(), 0.01);
    }

    @Test
    public void test25() {
        Funcionario func = new Funcionario("vitor", 5000);
        assertEquals(FaixaIrpf.QUINTA, func.getFaixaEncontrada());
    }

    @Test
    public void test26() {
        Funcionario func = new Funcionario("vitor", 5000);
        assertEquals(505.64, func.calcularIrpf(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test27() {
        Funcionario func = new Funcionario("vitor", -100);
        func.calcularIrpf();
    }
}
