/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telaLogin;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class SistemaAluno extends javax.swing.JFrame {


    public SistemaAluno() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoM = new javax.swing.JButton();
        infoC = new javax.swing.JButton();
        painel1 = new javax.swing.JPanel();
        voltar = new javax.swing.JButton();
        imagem2 = new javax.swing.JLabel();
        imagem = new javax.swing.JLabel();
        painel2 = new javax.swing.JPanel();
        msg1 = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();
        painel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoM.setBackground(new java.awt.Color(88, 154, 141));
        infoM.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        infoM.setText("Visualizar informações de Matrícula");
        infoM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoMActionPerformed(evt);
            }
        });
        getContentPane().add(infoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 420, 80));

        infoC.setBackground(new java.awt.Color(88, 154, 141));
        infoC.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        infoC.setText("Visualizar informações de Curso");
        infoC.setBorder(null);
        infoC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoCActionPerformed(evt);
            }
        });
        getContentPane().add(infoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 420, 80));

        painel1.setBackground(new java.awt.Color(20, 101, 81));
        painel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltar.setBackground(new java.awt.Color(88, 154, 141));
        voltar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        voltar.setText("<<<");
        voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        painel1.add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 31));

        imagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/planta.png"))); // NOI18N
        painel1.add(imagem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 316, 183, 284));

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/planta2.png"))); // NOI18N
        imagem.setText("jLabel2");
        painel1.add(imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 177, 224));

        getContentPane().add(painel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 600));

        painel2.setBackground(new java.awt.Color(88, 154, 141));
        painel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msg1.setFont(new java.awt.Font("Yu Gothic UI", 3, 48)); // NOI18N
        msg1.setText("Bem-vindo Guilherme!");
        painel2.add(msg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 24, 504, 60));

        msg.setFont(new java.awt.Font("Yu Gothic UI", 3, 48)); // NOI18N
        msg.setForeground(new java.awt.Color(94, 94, 94));
        msg.setText("Bem-vindo Guilherme!");
        painel2.add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 26, 504, 60));

        getContentPane().add(painel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 590, 100));

        painel3.setBackground(new java.awt.Color(197, 220, 213));

        javax.swing.GroupLayout painel3Layout = new javax.swing.GroupLayout(painel3);
        painel3.setLayout(painel3Layout);
        painel3Layout.setHorizontalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        painel3Layout.setVerticalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(painel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void infoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoMActionPerformed
        InfoMatric mat = new InfoMatric();
        mat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_infoMActionPerformed

    private void infoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoCActionPerformed
        InfoCurs curs = new InfoCurs();
        curs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_infoCActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        TelaLogin lgn = new TelaLogin();
        lgn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(SistemaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel imagem2;
    private javax.swing.JButton infoC;
    private javax.swing.JButton infoM;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel msg1;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painel3;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
