package View;

import Controller.AppointmentsController;
import Controller.PatientRecordsController;
import Controller.PatientsController;
import Model.Doctor;
import Model.Secretary;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        
        // Maximiza o form
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        
        seed();
    }
    
    /**
     *  Popula elementos iniciais no banco de dados
     */
    public static void seed() {
        new DAO.AgreementsDAO().seed();
        new DAO.AppointmentTypeDAO().seed();
        new DAO.DoctorsDAO().seed();
        new DAO.SecretariesDAO().seed();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jComboBox1 = new javax.swing.JComboBox<>();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        patientsMenuItem = new javax.swing.JMenuItem();
        appointmentsMenuItem = new javax.swing.JMenuItem();
        patientRecordsMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clínica Médica");
        setLocationByPlatform(true);
        setName(""); // NOI18N

        desktopPane.setBackground(new java.awt.Color(240, 240, 240));
        desktopPane.setToolTipText("");
        desktopPane.setName(""); // NOI18N

        jComboBox1.setMaximumRowCount(2);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Médico", "Secretário" }));
        desktopPane.add(jComboBox1);
        jComboBox1.setBounds(10, 10, 160, 20);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Cadastros");

        patientsMenuItem.setMnemonic('o');
        patientsMenuItem.setText("Pacientes");
        patientsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(patientsMenuItem);

        appointmentsMenuItem.setText("Consultas");
        appointmentsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(appointmentsMenuItem);

        patientRecordsMenuItem.setText("Prontuários");
        patientRecordsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientRecordsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(patientRecordsMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Ajuda");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

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

    public static void setLookAndFeel(String name) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (name.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {
        setLookAndFeel("Windows");
  
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem appointmentsMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem patientRecordsMenuItem;
    private javax.swing.JMenuItem patientsMenuItem;
    // End of variables declaration//GEN-END:variables

}
