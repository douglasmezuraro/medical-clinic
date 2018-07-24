package View;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;

public class PrincipalView extends javax.swing.JFrame {
    
    public PrincipalView() {
        initComponents();
        
        // Maximiza o form
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
    }
   
    public JMenu getSecretariesMenu() {
        return SecretariesMenu;
    }

    public JMenuItem getAggravationsMenuItem() {
        return aggravationsMenuItem;
    }

    public JMenuItem getAppointmentsMenuItem() {
        return appointmentsMenuItem;
    }

    public JMenu getDoctorMenu() {
        return doctorMenu;
    }

    public JMenuItem getPatientRecordsMenuItem() {
        return patientRecordsMenuItem;
    }

    public JMenuItem getPatientsMenuItem() {
        return patientsMenuItem;
    }

    public JRadioButton getDoctorRadioButton() {
        return doctorRadioButton;
    }

    public JRadioButton getSecretaryRadioButton() {
        return secretaryRadioButton;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userButtonGroup = new javax.swing.ButtonGroup();
        desktopPane = new javax.swing.JDesktopPane();
        doctorRadioButton = new javax.swing.JRadioButton();
        secretaryRadioButton = new javax.swing.JRadioButton();
        menuBar = new javax.swing.JMenuBar();
        SecretariesMenu = new javax.swing.JMenu();
        patientsMenuItem = new javax.swing.JMenuItem();
        appointmentsMenuItem = new javax.swing.JMenuItem();
        secretaryReportsMenuItem = new javax.swing.JMenuItem();
        doctorMenu = new javax.swing.JMenu();
        patientRecordsMenuItem = new javax.swing.JMenuItem();
        aggravationsMenuItem = new javax.swing.JMenuItem();
        doctorReportsMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clínica Médica");
        setLocationByPlatform(true);
        setName(""); // NOI18N

        desktopPane.setBackground(new java.awt.Color(240, 240, 240));
        desktopPane.setToolTipText("");
        desktopPane.setName(""); // NOI18N

        userButtonGroup.add(doctorRadioButton);
        doctorRadioButton.setText("Médico");
        desktopPane.add(doctorRadioButton);
        doctorRadioButton.setBounds(10, 10, 59, 23);

        userButtonGroup.add(secretaryRadioButton);
        secretaryRadioButton.setText("Secretário");
        desktopPane.add(secretaryRadioButton);
        secretaryRadioButton.setBounds(10, 30, 75, 23);

        SecretariesMenu.setMnemonic('f');
        SecretariesMenu.setText("Secretário");

        patientsMenuItem.setMnemonic('o');
        patientsMenuItem.setText("Pacientes");
        patientsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientsMenuItemActionPerformed(evt);
            }
        });
        SecretariesMenu.add(patientsMenuItem);

        appointmentsMenuItem.setText("Consultas");
        appointmentsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentsMenuItemActionPerformed(evt);
            }
        });
        SecretariesMenu.add(appointmentsMenuItem);

        secretaryReportsMenuItem.setText("Relatórios");
        secretaryReportsMenuItem.setActionCommand("SecretaryReportsMenuItem");
        secretaryReportsMenuItem.setAutoscrolls(true);
        SecretariesMenu.add(secretaryReportsMenuItem);

        menuBar.add(SecretariesMenu);

        doctorMenu.setMnemonic('h');
        doctorMenu.setText("Médico");

        patientRecordsMenuItem.setText("Prontuários");
        doctorMenu.add(patientRecordsMenuItem);

        aggravationsMenuItem.setMnemonic('a');
        aggravationsMenuItem.setText("Agravamentos");
        aggravationsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggravationsMenuItemActionPerformed(evt);
            }
        });
        doctorMenu.add(aggravationsMenuItem);

        doctorReportsMenuItem.setText("Relatórios");
        doctorReportsMenuItem.setActionCommand("DoctorReportsMenuItem");
        doctorMenu.add(doctorReportsMenuItem);

        menuBar.add(doctorMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("Clínica Médica");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientsMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientsMenuItemActionPerformed

    private void appointmentsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentsMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appointmentsMenuItemActionPerformed

    private void aggravationsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggravationsMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aggravationsMenuItemActionPerformed

    public JMenuItem getDoctorReportsMenuItem() {
        return doctorReportsMenuItem;
    }

    public JMenuItem getSecretaryReportsMenuItem() {
        return secretaryReportsMenuItem;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu SecretariesMenu;
    private javax.swing.JMenuItem aggravationsMenuItem;
    private javax.swing.JMenuItem appointmentsMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu doctorMenu;
    private javax.swing.JRadioButton doctorRadioButton;
    private javax.swing.JMenuItem doctorReportsMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem patientRecordsMenuItem;
    private javax.swing.JMenuItem patientsMenuItem;
    private javax.swing.JRadioButton secretaryRadioButton;
    private javax.swing.JMenuItem secretaryReportsMenuItem;
    private javax.swing.ButtonGroup userButtonGroup;
    // End of variables declaration//GEN-END:variables

}
