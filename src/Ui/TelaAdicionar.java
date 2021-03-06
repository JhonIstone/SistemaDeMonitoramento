/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import Sistema.Sistema;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jhoni
 */
public class TelaAdicionar extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdicionar
     */
    public TelaAdicionar() {
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

        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        txtAbscissa = new javax.swing.JTextField();
        txtOrdenada = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbAbscissa = new javax.swing.JLabel();
        lbOrdenada = new javax.swing.JLabel();
        btnVideo = new javax.swing.JCheckBox();
        btnTermometro = new javax.swing.JCheckBox();
        btnCo2 = new javax.swing.JCheckBox();
        btnMetano = new javax.swing.JCheckBox();
        btnAdicionarEuclidiana = new javax.swing.JButton();
        btnAdicionarManhattan = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        lbId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTitulo.setText("SISTEMA DE MONITORAMENTO");

        txtAbscissa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAbscissa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAbscissaActionPerformed(evt);
            }
        });

        txtOrdenada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Dados da unidade:");

        lbAbscissa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbAbscissa.setText("Abscissa");

        lbOrdenada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbOrdenada.setText("Ordenada");

        btnVideo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVideo.setText("Video");

        btnTermometro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTermometro.setText("Termometro");

        btnCo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCo2.setText("Co2");

        btnMetano.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMetano.setText("Metano");

        btnAdicionarEuclidiana.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdicionarEuclidiana.setText("Und Euclidiana");
        btnAdicionarEuclidiana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarEuclidianaActionPerformed(evt);
            }
        });

        btnAdicionarManhattan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdicionarManhattan.setText("Und Manhattan");
        btnAdicionarManhattan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarManhattanActionPerformed(evt);
            }
        });

        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        lbId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbId.setText("Id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMetano)
                            .addComponent(btnCo2)
                            .addComponent(btnTermometro)
                            .addComponent(btnVideo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtOrdenada, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAbscissa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbAbscissa)
                                    .addComponent(lbOrdenada)))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbId))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lbTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdicionarEuclidiana)
                .addGap(20, 20, 20)
                .addComponent(btnAdicionarManhattan)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAbscissa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAbscissa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrdenada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbOrdenada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVideo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTermometro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMetano)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarEuclidiana)
                    .addComponent(btnAdicionarManhattan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAbscissaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAbscissaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAbscissaActionPerformed

    private void btnAdicionarEuclidianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarEuclidianaActionPerformed
        // TODO add your handling code here:
        Sistema sistema = null;
        try {
            sistema = new Sistema();
            String retorno;
            retorno = sistema.addUnidadeEuclidiana(Integer.parseInt(txtId.getText()), Float.parseFloat(txtAbscissa.getText()),Float.parseFloat(txtOrdenada.getText()), btnVideo.isSelected(), btnTermometro.isSelected(), btnCo2.isSelected(), btnMetano.isSelected());
            JOptionPane.showMessageDialog(null, retorno);
            
            JFrame menuprincipal = new MenuPrincipal();
            menuprincipal.setLocationRelativeTo(null);
            menuprincipal.setVisible(true);
            this.dispose();
            
        } catch (NumberFormatException e){
        JOptionPane.showMessageDialog(rootPane, "Verifique o formato:\n"
            + "ID (INTEIRO)\n"
            + "ABSCISSA (DECIMAL)\n"
            + "ORDENADA (DECIMAL)\n");
        } catch (Exception ex) {
            Logger.getLogger(TelaAdicionar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdicionarEuclidianaActionPerformed

    private void btnAdicionarManhattanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarManhattanActionPerformed
        // TODO add your handling code here:
    	Sistema sistema = null;
        try {
            sistema = new Sistema();
            String retorno;
            retorno = sistema.addUnidadeManhatan(Integer.parseInt(txtId.getText()), Float.parseFloat(txtAbscissa.getText()),Float.parseFloat(txtOrdenada.getText()), btnVideo.isSelected(), btnTermometro.isSelected(), btnCo2.isSelected(), btnMetano.isSelected());
            JOptionPane.showMessageDialog(null, retorno);
            
            JFrame menuprincipal = new MenuPrincipal();
            menuprincipal.setLocationRelativeTo(null);
            menuprincipal.setVisible(true);
            this.dispose();
        } catch (NumberFormatException e){
        JOptionPane.showMessageDialog(rootPane, "Verifique o formato:\n"
            + "ID (INTEIRO)\n"
            + "ABSCISSA (DECIMAL)\n"
            + "ORDENADA (DECIMAL)\n");
        } catch (Exception ex) {
            Logger.getLogger(TelaAdicionar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdicionarManhattanActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdicionar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarEuclidiana;
    private javax.swing.JButton btnAdicionarManhattan;
    private javax.swing.JCheckBox btnCo2;
    private javax.swing.JCheckBox btnMetano;
    private javax.swing.JCheckBox btnTermometro;
    private javax.swing.JCheckBox btnVideo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAbscissa;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbOrdenada;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtAbscissa;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtOrdenada;
    // End of variables declaration//GEN-END:variables
}
