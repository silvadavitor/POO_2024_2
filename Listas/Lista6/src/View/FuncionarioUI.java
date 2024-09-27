/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.Funcionario;
/**
 *
 * @author vitor-nuvme
 */
public class FuncionarioUI extends javax.swing.JFrame {

    /**
     * Creates new form FuncionarioUI
     */
    public FuncionarioUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btAvaliar = new javax.swing.JButton();
        lbSal = new javax.swing.JLabel();
        tfEnterSal = new javax.swing.JTextField();
        lbFaixa = new javax.swing.JLabel();
        lbImposto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btAvaliar.setText("Avaliar");
        btAvaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvaliarActionPerformed(evt);
            }
        });

        lbSal.setText("Salário:");

        tfEnterSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEnterSalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbSal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbImposto)
                    .addComponent(lbFaixa)
                    .addComponent(btAvaliar)
                    .addComponent(tfEnterSal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEnterSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSal))
                .addGap(57, 57, 57)
                .addComponent(btAvaliar)
                .addGap(89, 89, 89)
                .addComponent(lbFaixa)
                .addGap(44, 44, 44)
                .addComponent(lbImposto)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAvaliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvaliarActionPerformed
        Funcionario func = new Funcionario("vazio", Double.parseDouble(tfEnterSal.getText()));
        double valor = func.calcularIrpf();
        String textoFormatado = String.format("%.2f", valor);  // Formata com 2 casas decimais
        lbImposto.setText("O imposto a pagar é de R$" + textoFormatado);
        
         switch (func.identificarFaixaIrpf(func.getSalario())){
       
        case PRIMEIRA:

            lbFaixa.setText("O salário está na 1ª faixa");

            break;
            
        case SEGUNDA:

            lbFaixa.setText("O salário está na 2ª faixa");
            break;  
            
        case TERCEIRA:

            lbFaixa.setText("O salário está na 3ª faixa");
            break;
            
        case QUARTA:

            lbFaixa.setText("O salário está na 4ª faixa");
            break;  
                       
        default:
            lbFaixa.setText("O salário está na 5ª faixa");
        }


    }//GEN-LAST:event_btAvaliarActionPerformed

    private void tfEnterSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEnterSalActionPerformed
        
    }//GEN-LAST:event_tfEnterSalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FuncionarioUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAvaliar;
    private javax.swing.JLabel lbFaixa;
    private javax.swing.JLabel lbImposto;
    private javax.swing.JLabel lbSal;
    private javax.swing.JTextField tfEnterSal;
    // End of variables declaration//GEN-END:variables
}
