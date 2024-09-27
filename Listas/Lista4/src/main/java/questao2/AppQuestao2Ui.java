/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;
import questao1.Retangulo;
import javax.swing.JOptionPane;
/**
 *
 * @author vitor-nuvme
 */
public class AppQuestao2Ui {
    public static void main(String[] args) {
        Retangulo retangulo1;
        retangulo1 = new Retangulo();
        retangulo1.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: ")));
        retangulo1.setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento: ")));
       
        JOptionPane.showMessageDialog(null, "Area = " + retangulo1.calcularArea() + " e Perimetro = " + retangulo1.calcularPerimetro());
    }
}
