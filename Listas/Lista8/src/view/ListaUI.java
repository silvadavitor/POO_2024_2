 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.Aluno;
import model.Professor;
import model.Turma;
import java.util.ArrayList;
/**
 *
 * @author vitor-nuvme
 */
public class ListaUI extends javax.swing.JFrame {
    private Turma turma;
    private int contador;
    
    
    /**
     * Creates new form GuiConsulta
     */
    public ListaUI(Turma turma) {
        this.turma = turma;
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        taTexto = new java.awt.TextArea();
        btConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Consulta");

        taTexto.setEditable(false);

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCancelar))
                    .addComponent(taTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btConsultar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        taTexto.append("------------Dados da Turma------------\n");
        if (turma.getTurno() != null) {
            taTexto.append("Disciplina: " + turma.getDisciplina() + "\n");
            taTexto.append(" Turno: " + turma.getTurno().toString() + "\n");
        }   
        else {           
            taTexto.append("Turno não definido ou disciplina vazia.");
            taTexto.append("\n"); 
        }
        
        Professor professor = turma.getProfessor();
        taTexto.append("\n------------Dados do Professor------------\n");
        if (professor != null) {            
            taTexto.append(" Nome: " + professor.getNome() + "\n");
            taTexto.append(" Email: " + professor.getEmail() + "\n");
            taTexto.append(" Titulação: " + professor.getTitulacao().toString() + "\n");
        }  
        else {
        taTexto.append("Professor, email ou titulacao não definidos.\n");
        }
        
        ArrayList<Aluno> alunos = turma.getAlunos();
        taTexto.append("\n------------Lista dos Alunos------------\n");
        for (Aluno aluno : alunos) {
            contador += 1;
            taTexto.append("" + "\n");
            taTexto.append("Aluno " + contador + ":" + "\n");
            taTexto.append(" Matricula: " + aluno.getMatricula() + "\n");
            taTexto.append(" Nome: " + aluno.getNome() + "\n");
            taTexto.append(" Nota Enem: " + aluno.getNotaEnem() + "\n");
        }
        
    }//GEN-LAST:event_btConsultarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JLabel jLabel1;
    private java.awt.TextArea taTexto;
    // End of variables declaration//GEN-END:variables
}
