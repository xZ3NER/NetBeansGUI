/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MisPruebas;

import javax.swing.Icon;

/**
 *
 * @author penga
 */
public class MainFrame extends javax.swing.JFrame {
    
    int x;
    int y;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        mainPanel = new javax.swing.JPanel();
        usernameTextField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        loginPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        registerPanel = new javax.swing.JPanel();
        registerButton = new javax.swing.JLabel();
        topPane = new javax.swing.JPanel();
        closeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameTextField.setText("jTextField1");
        mainPanel.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 160, 30));

        usernameLabel.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(0, 0, 0));
        usernameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/usernameIcon.png"))); // NOI18N
        usernameLabel.setText("Username_");
        mainPanel.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        passwordLabel.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/passwordIcon.png"))); // NOI18N
        passwordLabel.setText("Password_");
        mainPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        passwordTextField.setText("jPasswordField1");
        mainPanel.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 160, 30));

        loginPanel.setLayout(new java.awt.BorderLayout());

        loginLabel.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(0, 0, 0));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/loginIcon.png"))); // NOI18N
        loginLabel.setText("Login_");
        loginLabel.setIconTextGap(8);
        loginLabel.setInheritsPopupMenu(false);
        loginPanel.add(loginLabel, java.awt.BorderLayout.CENTER);

        mainPanel.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 100, 50));

        registerPanel.setLayout(new java.awt.BorderLayout());

        registerButton.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        registerButton.setForeground(new java.awt.Color(0, 0, 0));
        registerButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/registerIcon.png"))); // NOI18N
        registerButton.setText("Register_");
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registerButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        registerButton.setIconTextGap(8);
        registerButton.setInheritsPopupMenu(false);
        registerPanel.add(registerButton, java.awt.BorderLayout.CENTER);

        mainPanel.add(registerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 140, 50));

        topPane.setBackground(new java.awt.Color(96, 2, 238));
        topPane.setForeground(new java.awt.Color(96, 2, 238));
        topPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        topPane.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topPaneMouseDragged(evt);
            }
        });
        topPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topPaneMousePressed(evt);
            }
        });
        topPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/closeIcon.png"))); // NOI18N
        closeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        closeLabel.setIconTextGap(20);
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeLabelMouseExited(evt);
            }
        });
        topPane.add(closeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        mainPanel.add(topPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/cruz.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(24, 24));
        mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 40, 560, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topPaneMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
        
    }//GEN-LAST:event_topPaneMousePressed

    private void topPaneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topPaneMouseDragged
        // TODO add your handling code here:
        
        int screenX = evt.getXOnScreen();
        int screenY = evt.getYOnScreen();
        
        this.setLocation(screenX - x, screenY - y);
    }//GEN-LAST:event_topPaneMouseDragged

    private void closeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseEntered
        // TODO add your handling code here:
       closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/closeIconHover.png")));
    }//GEN-LAST:event_closeLabelMouseEntered

    private void closeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseExited
        // TODO add your handling code here:
        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/closeIcon.png")));
    }//GEN-LAST:event_closeLabelMouseExited

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel registerButton;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JPanel topPane;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}