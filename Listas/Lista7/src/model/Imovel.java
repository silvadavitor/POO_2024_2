/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


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

        if (finalidade == Finalidade.RESIDENCIAL) {
            if (area <= 100) {
                valorBase = 500; 
            } else if (area <= 400) {
                valorBase = 400;
            } else {
                valorBase = 400 + ((area - 400) * 1.00); 
            }
        }
        else if (finalidade == Finalidade.COMERCIAL) {
            if (area <= 100) {
                valorBase = 500; 
            } else if (area <= 400) {
                valorBase = 1000; 
            } else {
                valorBase = 1000 + ((area - 400) * 2.75); 
            }
        }
        else if (finalidade == Finalidade.INDUSTRIAL) {
            if (area <= 2000) {
                valorBase = 1000; 
            } else {
                valorBase = 1000 + ((area - 2000) * 0.65); 
            }
        }

        double iptu = valorBase * bairro.getCoeficienteIptu();

        return iptu;
    }

}
