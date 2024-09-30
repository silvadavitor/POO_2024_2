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

    public Imovel(Bairro bairro, String area, String endereco, String finalidade){
        setBairro(bairro);
        if (area == null) {
            throw new IllegalArgumentException("Sem área");
        }        
        setArea(Integer.parseInt(area));
        setEndereco(endereco);
        if (finalidade == null){
            throw new IllegalArgumentException("Sem finalidade");
        }
        setFinalidade(Finalidade.valueOf(finalidade)); 
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
        if (area < 0) {
        throw new IllegalArgumentException("Área não pode ser negativa.");
        }
        else{
        this.area = area;
    
        }
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
        if (bairro == null) {
            throw new IllegalArgumentException("Bairro não foi definido.");
        }
        if (finalidade == null) {
            throw new IllegalArgumentException("Finalidade do imóvel não foi definida.");
        }

        double valorBase = 0;

        // Corrigindo a lógica para o cálculo do IPTU residencial
        if (finalidade == Finalidade.RESIDENCIAL) {
            if (area <= 100) {
                valorBase = 500; // IPTU base para área <= 100 m²
            } else if (area <= 400) {
                valorBase = 400; // IPTU base para área de 400 m²
            } else {
                valorBase = 400 + ((area - 400) * 2.55); // A partir de 400 m²
            }
        }
        else if (finalidade == Finalidade.COMERCIAL) {
            if (area <= 100) {
                valorBase = 500; // IPTU base para área <= 100 m²
            } else if (area <= 400) {
                valorBase = 1000; // IPTU base para área <= 400 m²
            } else {
                // Mudar para refletir 1275.00 total
                valorBase = 1000 + ((area - 400) * 2.75); // Ajuste o valor por m² para 2.75, por exemplo.
            }
        }
        else if (finalidade == Finalidade.INDUSTRIAL) {
            if (area <= 2000) {
                valorBase = 1000; // IPTU base para área <= 2000 m²
            } else {
                valorBase = 1000 + ((area - 2000) * 0.55); // A partir de 2000 m²
            }
        }

        // Aplicar o coeficiente ao valor base
        double iptu = valorBase * bairro.getCoeficienteIptu();

        // Retorna o IPTU calculado
        return iptu;
    }
}
