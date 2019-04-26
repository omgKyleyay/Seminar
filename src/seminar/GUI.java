/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seminar;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyle
 */
public class GUI extends javax.swing.JFrame {
    
    /**
     * Creates new form GUI
     */
    public GUI() {
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

        jTabbedPane4 = new javax.swing.JTabbedPane();
        EncryptJPanel = new javax.swing.JPanel();
        encryptjComboBoxLargeImg = new javax.swing.JComboBox<>();
        eLargeImgThumbnail_label = new javax.swing.JLabel();
        eSmallImg_label = new javax.swing.JLabel();
        takePictureBtn = new javax.swing.JButton();
        destinationEmail_text = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sendEmailBtn = new javax.swing.JButton();
        DecryptJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        jTabbedPane4.setBackground(new java.awt.Color(204, 204, 204));

        EncryptJPanel.setBackground(new java.awt.Color(204, 204, 204));

        encryptjComboBoxLargeImg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eLargeImgThumbnail_label.setAutoscrolls(true);
        eLargeImgThumbnail_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        eSmallImg_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        takePictureBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seminar/camera icon.png"))); // NOI18N
        takePictureBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takePictureBtnActionPerformed(evt);
            }
        });

        destinationEmail_text.setBackground(new java.awt.Color(255, 255, 255));
        destinationEmail_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationEmail_textActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Email account to send to");

        sendEmailBtn.setForeground(new java.awt.Color(0, 0, 0));
        sendEmailBtn.setText("Send");
        sendEmailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendEmailBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EncryptJPanelLayout = new javax.swing.GroupLayout(EncryptJPanel);
        EncryptJPanel.setLayout(EncryptJPanelLayout);
        EncryptJPanelLayout.setHorizontalGroup(
            EncryptJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptJPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(EncryptJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sendEmailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EncryptJPanelLayout.createSequentialGroup()
                        .addGroup(EncryptJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(takePictureBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(destinationEmail_text, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addComponent(eSmallImg_label, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(eLargeImgThumbnail_label, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(encryptjComboBoxLargeImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        EncryptJPanelLayout.setVerticalGroup(
            EncryptJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptJPanelLayout.createSequentialGroup()
                .addGroup(EncryptJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EncryptJPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(takePictureBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(destinationEmail_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(EncryptJPanelLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(encryptjComboBoxLargeImg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(EncryptJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eLargeImgThumbnail_label, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eSmallImg_label, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)))
                .addComponent(sendEmailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        jTabbedPane4.addTab("Encrypt", EncryptJPanel);
        EncryptJPanel.getAccessibleContext().setAccessibleName("EncryptTab");
        EncryptJPanel.getAccessibleContext().setAccessibleDescription("");

        DecryptJPanel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout DecryptJPanelLayout = new javax.swing.GroupLayout(DecryptJPanel);
        DecryptJPanel.setLayout(DecryptJPanelLayout);
        DecryptJPanelLayout.setHorizontalGroup(
            DecryptJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DecryptJPanelLayout.setVerticalGroup(
            DecryptJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Decrypt", DecryptJPanel);
        DecryptJPanel.getAccessibleContext().setAccessibleName("DecryptTab");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendEmailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendEmailBtnActionPerformed
        try {
            SendFileEmail.SendEmail();
            
        } catch (NoSuchAlgorithmException | InvalidKeySpecException | UnsupportedEncodingException | InvalidKeyException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_sendEmailBtnActionPerformed

    private void destinationEmail_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationEmail_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationEmail_textActionPerformed

    private void takePictureBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takePictureBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_takePictureBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DecryptJPanel;
    private javax.swing.JPanel EncryptJPanel;
    public static javax.swing.JTextField destinationEmail_text;
    private javax.swing.JLabel eLargeImgThumbnail_label;
    private javax.swing.JLabel eSmallImg_label;
    private javax.swing.JComboBox<String> encryptjComboBoxLargeImg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JButton sendEmailBtn;
    private javax.swing.JButton takePictureBtn;
    // End of variables declaration//GEN-END:variables
}
