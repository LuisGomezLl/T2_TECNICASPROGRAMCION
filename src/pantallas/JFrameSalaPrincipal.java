/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

/**
 *
 * @author USER
 */
public class JFrameSalaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFrameSalaPrincipal
     */
    public JFrameSalaPrincipal() {
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

        btnestudiantes = new javax.swing.JButton();
        btnturnos = new javax.swing.JButton();
        btnasistencias = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));

        btnestudiantes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnestudiantes.setText("ABRIR ESTUDIANTES");
        btnestudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnestudiantesActionPerformed(evt);
            }
        });

        btnturnos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnturnos.setText("ABRIR TURNOS");
        btnturnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnturnosActionPerformed(evt);
            }
        });

        btnasistencias.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnasistencias.setText("ABRIR ASISTENCIAS");
        btnasistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnasistenciasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("SALA PRINCIPAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnestudiantes)
                            .addComponent(btnasistencias)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnturnos)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(btnestudiantes)
                .addGap(59, 59, 59)
                .addComponent(btnturnos)
                .addGap(63, 63, 63)
                .addComponent(btnasistencias)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnestudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnestudiantesActionPerformed
        
        JFrameEstudiantes primero=new JFrameEstudiantes();
        primero.setVisible(true);
        
        
    }//GEN-LAST:event_btnestudiantesActionPerformed

    private void btnturnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnturnosActionPerformed
        
        JFrameTurnos segundo=new JFrameTurnos();
        segundo.setVisible(true);
        
    }//GEN-LAST:event_btnturnosActionPerformed

    private void btnasistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnasistenciasActionPerformed
        
        JFrameAsistencia tercero=new JFrameAsistencia();
        tercero.setVisible(true);
        
    }//GEN-LAST:event_btnasistenciasActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameSalaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameSalaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameSalaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameSalaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameSalaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnasistencias;
    private javax.swing.JButton btnestudiantes;
    private javax.swing.JButton btnturnos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}