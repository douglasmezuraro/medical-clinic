package View;

import Controller.AggravationsController;
import Controller.AppointmentsController;
import Controller.PatientRecordsController;
import Controller.PatientsController;
import Model.Doctor;
import Model.Secretary;

public class MainView extends javax.swing.JFrame {
    
    public MainView() {
        initComponents();
        
        // Maximiza o form
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        
        seed();
    }
    
    public static void seed() {
        new DAO.AgreementsDAO().seed();
        new DAO.AppointmentTypeDAO().seed();
        new DAO.DoctorsDAO().seed();
        new DAO.SecretariesDAO().seed();
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
        doctorMenu = new javax.swing.JMenu();
        patientRecordsMenuItem = new javax.swing.JMenuItem();
        aggravationsMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clínica Médica");
        setLocationByPlatform(true);
        setName(""); // NOI18N

        desktopPane.setBackground(new java.awt.Color(240, 240, 240));
        desktopPane.setToolTipText("");
        desktopPane.setName(""); // NOI18N

        userButtonGroup.add(doctorRadioButton);
        doctorRadioButton.setText("Médico");
        doctorRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorRadioButtonActionPerformed(evt);
            }
        });
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

        menuBar.add(SecretariesMenu);

        doctorMenu.setMnemonic('h');
        doctorMenu.setText("Médico");

        patientRecordsMenuItem.setText("Prontuários");
        patientRecordsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientRecordsMenuItemActionPerformed(evt);
            }
        });
        doctorMenu.add(patientRecordsMenuItem);

        aggravationsMenuItem.setMnemonic('a');
        aggravationsMenuItem.setText("About");
        aggravationsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggravationsMenuItemActionPerformed(evt);
            }
        });
        doctorMenu.add(aggravationsMenuItem);

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
        // TODO : Refatorar para algo melhor
        PatientsController controller = new PatientsController(new Secretary());
        controller.showView();
    }//GEN-LAST:event_patientsMenuItemActionPerformed

    private void appointmentsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentsMenuItemActionPerformed
        AppointmentsController controller = new AppointmentsController(new Secretary());
        controller.showView();
    }//GEN-LAST:event_appointmentsMenuItemActionPerformed

    private void patientRecordsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientRecordsMenuItemActionPerformed
        PatientRecordsController controller = new PatientRecordsController(new Doctor());
        controller.showView();
    }//GEN-LAST:event_patientRecordsMenuItemActionPerformed

    private void aggravationsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggravationsMenuItemActionPerformed
        AggravationsController controller = new AggravationsController(new Doctor());
        controller.showView();
    }//GEN-LAST:event_aggravationsMenuItemActionPerformed

    private void doctorRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorRadioButtonActionPerformed
        secretaryRadioButton.setEnabled(false);
    }//GEN-LAST:event_doctorRadioButtonActionPerformed
    
    public static void setLookAndFeel(String name) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (name.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {
        setLookAndFeel("Windows");
  
        java.awt.EventQueue.invokeLater(() -> {
            new MainView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu SecretariesMenu;
    private javax.swing.JMenuItem aggravationsMenuItem;
    private javax.swing.JMenuItem appointmentsMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu doctorMenu;
    private javax.swing.JRadioButton doctorRadioButton;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem patientRecordsMenuItem;
    private javax.swing.JMenuItem patientsMenuItem;
    private javax.swing.JRadioButton secretaryRadioButton;
    private javax.swing.ButtonGroup userButtonGroup;
    // End of variables declaration//GEN-END:variables

}
