/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author vitor-nuvme
 */
public class Imovel {
    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;

    public Imovel(Bairro bairro){
        this.bairro = bairro;
        
    } 
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }
    
    public double calcularIptu() {
    if (finalidade == null) {
        throw new IllegalArgumentException("Finalidade do imóvel não definida");
    }
    if (area <= 0) {
        throw new IllegalArgumentException("Área do imóvel deve ser positiva");
    }

    double valorIPTU = 0.0;
    if (finalidade.equals(Finalidade.RESIDENCIAL)) {
        valorIPTU = area * 1.00;
    } 
    else if (finalidade.equals(Finalidade.COMERCIAL)) {
        if (area <= 100) {
            valorIPTU = 500.00; 
        } 
        else if (area <= 400) {
            valorIPTU = 1000.00; 
        } 
        else {
            valorIPTU = area * 2.55; 
        }
    } else {
        throw new IllegalArgumentException("Finalidade do imóvel inválida");
    }
    return valorIPTU;
}
}
