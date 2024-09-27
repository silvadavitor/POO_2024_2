/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao3;
import questao1.Retangulo;
import javax.swing.JOptionPane;
/**
 * 
 * @author vitor-nuvme
 */
public class AppQuestao3Ui {
    public static void main(String[] args) {
        Retangulo retangulo1;
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento: "));
        retangulo1 = new Retangulo(altura, comprimento);

        JOptionPane.showMessageDialog(null, "Area = " + retangulo1.calcularArea() + " e Perimetro = " + retangulo1.calcularPerimetro());
    }
}
