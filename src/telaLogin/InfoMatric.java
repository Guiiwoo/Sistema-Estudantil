/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telaLogin;

/**
 *
 * @author Guilherme
 */
public class InfoMatric extends javax.swing.JFrame {

    /**
     * Creates new form InfoMatric
     */
    public InfoMatric() {
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

        painel1 = new javax.swing.JPanel();
        voltar = new javax.swing.JButton();
        imagem2 = new javax.swing.JLabel();
        imagem = new javax.swing.JLabel();
        painel2 = new javax.swing.JPanel();
        infoMatricText = new javax.swing.JLabel();
        icone = new javax.swing.JLabel();
        infoMatricText1 = new javax.swing.JLabel();
        painel3 = new javax.swing.JPanel();
        painel = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        painel1.add(imagem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 316, 170, 284));

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/planta2.png"))); // NOI18N
        imagem.setText("jLabel2");
        painel1.add(imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 177, 224));

        getContentPane().add(painel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 600));

        painel2.setBackground(new java.awt.Color(88, 154, 141));
        painel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoMatricText.setFont(new java.awt.Font("Yu Gothic UI", 3, 42)); // NOI18N
        infoMatricText.setText("Informações de matrícula");
        infoMatricText.setAutoscrolls(true);
        painel2.add(infoMatricText, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 26, 503, -1));

        icone.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/infoicon.png"))); // NOI18N
        painel2.add(icone, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 23, 69, 60));

        infoMatricText1.setFont(new java.awt.Font("Yu Gothic UI", 3, 42)); // NOI18N
        infoMatricText1.setForeground(new java.awt.Color(94, 94, 94));
        infoMatricText1.setText("Informações de matrícula");
        infoMatricText1.setAutoscrolls(true);
        painel2.add(infoMatricText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 28, 503, -1));

        getContentPane().add(painel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 590, 100));

        painel3.setBackground(new java.awt.Color(197, 220, 213));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(88, 154, 141));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Yu Gothic UI", 0, 29)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Nome: Guilherme de Lima Guimarães.\nSexo: Masculino.\nIdade: 20.\nCidade: São Bernardo do Campo.\nCurso: Sistemas de Informação.\nRA: 123.");
        jTextArea1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.white));
        painel.setViewportView(jTextArea1);

        javax.swing.GroupLayout painel3Layout = new javax.swing.GroupLayout(painel3);
        painel3.setLayout(painel3Layout);
        painel3Layout.setHorizontalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        painel3Layout.setVerticalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel3Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        getContentPane().add(painel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        SistemaAluno alu = new SistemaAluno();
        alu.setVisible(true);
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
            java.util.logging.Logger.getLogger(InfoMatric.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoMatric.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoMatric.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoMatric.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoMatric().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icone;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel imagem2;
    private javax.swing.JLabel infoMatricText;
    private javax.swing.JLabel infoMatricText1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane painel;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painel3;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}