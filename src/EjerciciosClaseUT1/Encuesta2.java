/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EjerciciosClaseUT1;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author penga
 */
public class Encuesta2 extends javax.swing.JFrame implements Runnable {

    Thread thread;
    boolean empezarPago = false;

    /**
     * Creates new form Encuesta
     */
    public Encuesta2() {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexoButtonGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        separator = new javax.swing.JSeparator();
        edadLabel = new javax.swing.JLabel();
        profesionTextField = new javax.swing.JTextField();
        sexoLabel = new javax.swing.JLabel();
        edadComboBox = new javax.swing.JComboBox<>();
        profesionLabel = new javax.swing.JLabel();
        numHermanosSpinner = new javax.swing.JSpinner();
        numHermanosLabel = new javax.swing.JLabel();
        sexoRadioButton1 = new javax.swing.JRadioButton();
        sexoRadioButton2 = new javax.swing.JRadioButton();
        deporteCheckBox = new javax.swing.JCheckBox();
        deporteScrollPane = new javax.swing.JScrollPane();
        deportesList = new javax.swing.JList<>();
        contadorLabel = new javax.swing.JLabel();
        aficcionLabel = new javax.swing.JLabel();
        gradoCineLabel = new javax.swing.JLabel();
        gradoComprasLabel = new javax.swing.JLabel();
        gradoTvLabel = new javax.swing.JLabel();
        cineSlider = new javax.swing.JSlider();
        comprasSlider = new javax.swing.JSlider();
        televisionSlider = new javax.swing.JSlider();
        empezarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        aceptarButton = new javax.swing.JButton();
        deporteLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.GridBagLayout());

        separator.setBackground(new java.awt.Color(204, 204, 204));
        separator.setForeground(new java.awt.Color(204, 204, 204));
        mainPanel.add(separator, new java.awt.GridBagConstraints());

        edadLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        edadLabel.setForeground(new java.awt.Color(0, 0, 0));
        edadLabel.setText("Edad: ");
        mainPanel.add(edadLabel, new java.awt.GridBagConstraints());

        profesionTextField.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        profesionTextField.setEnabled(false);
        profesionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesionTextFieldActionPerformed(evt);
            }
        });
        mainPanel.add(profesionTextField, new java.awt.GridBagConstraints());

        sexoLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        sexoLabel.setForeground(new java.awt.Color(0, 0, 0));
        sexoLabel.setText("Sexo: ");
        mainPanel.add(sexoLabel, new java.awt.GridBagConstraints());

        edadComboBox.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        edadComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entre 0 y 18 a??os", "Entre 18 y 30 a??os", "Entre 30 y 64 a??os" }));
        edadComboBox.setEnabled(false);
        mainPanel.add(edadComboBox, new java.awt.GridBagConstraints());

        profesionLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        profesionLabel.setForeground(new java.awt.Color(0, 0, 0));
        profesionLabel.setText("Profesi??n: ");
        mainPanel.add(profesionLabel, new java.awt.GridBagConstraints());

        numHermanosSpinner.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        numHermanosSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        numHermanosSpinner.setEnabled(false);
        mainPanel.add(numHermanosSpinner, new java.awt.GridBagConstraints());

        numHermanosLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        numHermanosLabel.setForeground(new java.awt.Color(0, 0, 0));
        numHermanosLabel.setText("N?? Hermanos: ");
        mainPanel.add(numHermanosLabel, new java.awt.GridBagConstraints());

        sexoButtonGroup.add(sexoRadioButton1);
        sexoRadioButton1.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        sexoRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        sexoRadioButton1.setText("MUJER");
        sexoRadioButton1.setEnabled(false);
        sexoRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoRadioButton1ActionPerformed(evt);
            }
        });
        mainPanel.add(sexoRadioButton1, new java.awt.GridBagConstraints());

        sexoButtonGroup.add(sexoRadioButton2);
        sexoRadioButton2.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        sexoRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        sexoRadioButton2.setText("HOMBRE");
        sexoRadioButton2.setEnabled(false);
        mainPanel.add(sexoRadioButton2, new java.awt.GridBagConstraints());

        deporteCheckBox.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        deporteCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        deporteCheckBox.setText("??Practica alg??n deporte?");
        deporteCheckBox.setEnabled(false);
        deporteCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deporteCheckBoxActionPerformed(evt);
            }
        });
        mainPanel.add(deporteCheckBox, new java.awt.GridBagConstraints());

        deporteScrollPane.setEnabled(false);

        deportesList.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        deportesList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "F??tbol", "Tenis", "Tenis de mesa", "Baloncesto", "Balonmano", "Volleyball" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        deportesList.setEnabled(false);
        deporteScrollPane.setViewportView(deportesList);

        mainPanel.add(deporteScrollPane, new java.awt.GridBagConstraints());

        contadorLabel.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        contadorLabel.setForeground(new java.awt.Color(255, 0, 51));
        mainPanel.add(contadorLabel, new java.awt.GridBagConstraints());

        aficcionLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        aficcionLabel.setForeground(new java.awt.Color(0, 0, 0));
        aficcionLabel.setText("Marque de 1 a 10 su grado de aficci??n a: ");
        mainPanel.add(aficcionLabel, new java.awt.GridBagConstraints());

        gradoCineLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        gradoCineLabel.setForeground(new java.awt.Color(0, 0, 0));
        gradoCineLabel.setText("Ir al cine: ");
        mainPanel.add(gradoCineLabel, new java.awt.GridBagConstraints());

        gradoComprasLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        gradoComprasLabel.setForeground(new java.awt.Color(0, 0, 0));
        gradoComprasLabel.setText("Compras: ");
        mainPanel.add(gradoComprasLabel, new java.awt.GridBagConstraints());

        gradoTvLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        gradoTvLabel.setForeground(new java.awt.Color(0, 0, 0));
        gradoTvLabel.setText("Ver la televisi??n: ");
        mainPanel.add(gradoTvLabel, new java.awt.GridBagConstraints());

        cineSlider.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
        cineSlider.setForeground(new java.awt.Color(0, 0, 0));
        cineSlider.setMajorTickSpacing(1);
        cineSlider.setMaximum(10);
        cineSlider.setMinorTickSpacing(1);
        cineSlider.setPaintLabels(true);
        cineSlider.setValue(5);
        cineSlider.setEnabled(false);
        mainPanel.add(cineSlider, new java.awt.GridBagConstraints());

        comprasSlider.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
        comprasSlider.setForeground(new java.awt.Color(0, 0, 0));
        comprasSlider.setMajorTickSpacing(1);
        comprasSlider.setMaximum(10);
        comprasSlider.setMinorTickSpacing(1);
        comprasSlider.setPaintLabels(true);
        comprasSlider.setValue(5);
        comprasSlider.setEnabled(false);
        mainPanel.add(comprasSlider, new java.awt.GridBagConstraints());

        televisionSlider.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
        televisionSlider.setForeground(new java.awt.Color(0, 0, 0));
        televisionSlider.setMajorTickSpacing(1);
        televisionSlider.setMaximum(10);
        televisionSlider.setMinorTickSpacing(1);
        televisionSlider.setPaintLabels(true);
        televisionSlider.setValue(5);
        televisionSlider.setEnabled(false);
        mainPanel.add(televisionSlider, new java.awt.GridBagConstraints());

        empezarButton.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
        empezarButton.setForeground(new java.awt.Color(0, 0, 0));
        empezarButton.setText("EMPEZAR");
        empezarButton.setToolTipText("Empezar?? la encuesta y un contador");
        empezarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empezarButtonMouseClicked(evt);
            }
        });
        empezarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empezarButtonActionPerformed(evt);
            }
        });
        mainPanel.add(empezarButton, new java.awt.GridBagConstraints());

        cancelarButton.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
        cancelarButton.setForeground(new java.awt.Color(0, 0, 0));
        cancelarButton.setText("CANCELAR");
        cancelarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarButtonMouseClicked(evt);
            }
        });
        mainPanel.add(cancelarButton, new java.awt.GridBagConstraints());

        aceptarButton.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
        aceptarButton.setForeground(new java.awt.Color(0, 0, 0));
        aceptarButton.setText("ACEPTAR");
        aceptarButton.setEnabled(false);
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });
        mainPanel.add(aceptarButton, new java.awt.GridBagConstraints());

        deporteLabel.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        deporteLabel.setForeground(new java.awt.Color(0, 0, 0));
        deporteLabel.setText("??C??al?");
        mainPanel.add(deporteLabel, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 2139, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profesionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profesionTextFieldActionPerformed

    private void sexoRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoRadioButton1ActionPerformed

    private void deporteCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deporteCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deporteCheckBoxActionPerformed

    private void empezarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empezarButtonActionPerformed

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void empezarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empezarButtonMouseClicked
        // TODO add your handling code here:

        aceptarButton.setEnabled(true);
        cineSlider.setEnabled(true);
        comprasSlider.setEnabled(true);
        deporteCheckBox.setEnabled(true);
        deporteScrollPane.setEnabled(true);
        deportesList.setEnabled(true);
        edadComboBox.setEnabled(true);
        empezarButton.setEnabled(false);
        numHermanosSpinner.setEnabled(true);
        profesionTextField.setEnabled(true);
        sexoRadioButton1.setEnabled(true);
        sexoRadioButton2.setEnabled(true);
        televisionSlider.setEnabled(true);
        
        if (empezarPago) {
            new CreditCardDialog(this ,true);
        }

        thread = new Thread(this);
        thread.start();
    }//GEN-LAST:event_empezarButtonMouseClicked

    private void cancelarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarButtonMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new MenuEncuesta();
    }//GEN-LAST:event_cancelarButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Encuesta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encuesta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encuesta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encuesta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encuesta2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JLabel aficcionLabel;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JSlider cineSlider;
    private javax.swing.JSlider comprasSlider;
    private javax.swing.JLabel contadorLabel;
    private javax.swing.JCheckBox deporteCheckBox;
    private javax.swing.JLabel deporteLabel;
    private javax.swing.JScrollPane deporteScrollPane;
    private javax.swing.JList<String> deportesList;
    private javax.swing.JComboBox<String> edadComboBox;
    private javax.swing.JLabel edadLabel;
    private javax.swing.JButton empezarButton;
    private javax.swing.JLabel gradoCineLabel;
    private javax.swing.JLabel gradoComprasLabel;
    private javax.swing.JLabel gradoTvLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel numHermanosLabel;
    private javax.swing.JSpinner numHermanosSpinner;
    private javax.swing.JLabel profesionLabel;
    private javax.swing.JTextField profesionTextField;
    private javax.swing.JSeparator separator;
    private javax.swing.ButtonGroup sexoButtonGroup;
    private javax.swing.JLabel sexoLabel;
    private javax.swing.JRadioButton sexoRadioButton1;
    private javax.swing.JRadioButton sexoRadioButton2;
    private javax.swing.JSlider televisionSlider;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        for (int j = 1; j >= 0; j--) {
            contadorLabel.setText("02:00s restantes");
            for (int i = 99; i >= 0; i--) {
                if (i < 10) {
                    contadorLabel.setText("0" + j + ":0" + i + "s restantes");
                } else {
                    contadorLabel.setText("0" + j + ":" + i + "s restantes");
                }

                try {
                    thread.sleep(9);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Encuesta2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        aceptarButton.setEnabled(false);
        cineSlider.setEnabled(false);
        comprasSlider.setEnabled(false);
        deporteCheckBox.setEnabled(false);
        deporteScrollPane.setEnabled(false);
        deportesList.setEnabled(false);
        edadComboBox.setEnabled(false);
        empezarButton.setEnabled(true);
        numHermanosSpinner.setEnabled(false);
        profesionTextField.setEnabled(false);
        sexoRadioButton1.setEnabled(false);
        sexoRadioButton2.setEnabled(false);
        televisionSlider.setEnabled(false);
        
        empezarButton.setText("5??? para otros 2seg");
        empezarPago = true;
    }
}
