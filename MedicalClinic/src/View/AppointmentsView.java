package View;

import Interface.IView;
import Model.Appointment;
import Model.AppointmentType;
import Model.Doctor;
import Model.Patient;
import java.util.Date;
import javax.swing.JButton;

public class AppointmentsView extends javax.swing.JFrame implements IView<Appointment> {

    public AppointmentsView() {
        initComponents();
        initComponentProperties();
        
        // Centraliza o form
        this.setLocationRelativeTo(null);
    }
    
    @Override
    public Long getId() {
        return Model.Base.parseId(idTextField.getText());
    }
    
    @Override
    public void setId(Long id) {
        idTextField.setText(id.toString());
    }    
    
    @Override
    public void modelToView(Appointment model) {
        if(model == null) {
            clear();
            return;
        }
        
        dateFormattedTextField.setValue(model.getAppoinmentDate());
        hourFormattedTextField.setValue(model.getAppointmentHour());
        appointmentTypeComboBox.setSelectedItem((AppointmentType)model.getAppointmentType());
        doctorComboBox.setSelectedItem((Doctor)model.getDoctor());
        patientComboBox.setSelectedItem((Patient)model.getPatient());
    }

    @Override
    public Appointment viewToModel(Appointment model) {
        model.setAppoinmentDate((Date)dateFormattedTextField.getValue());
        model.setAppointmentHour((Date)hourFormattedTextField.getValue());
        model.setAppointmentType((AppointmentType)appointmentTypeComboBox.getSelectedItem());
        model.setDoctor((Doctor)doctorComboBox.getSelectedItem());
        model.setPatient((Patient)patientComboBox.getSelectedItem());
        
        return model;
    }

    @Override
    public void clear() {
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        MedicalClinicPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MedicalClinicPU").createEntityManager();
        doctorQuery = java.beans.Beans.isDesignTime() ? null : MedicalClinicPUEntityManager.createQuery("SELECT d FROM Doctor d");
        doctorList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : doctorQuery.getResultList();
        patientQuery = java.beans.Beans.isDesignTime() ? null : MedicalClinicPUEntityManager.createQuery("SELECT p FROM Patient p");
        patientList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : patientQuery.getResultList();
        appointmentTypeQuery = java.beans.Beans.isDesignTime() ? null : MedicalClinicPUEntityManager.createQuery("SELECT a FROM AppointmentType a");
        appointmentTypeList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : appointmentTypeQuery.getResultList();
        idLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        hourLabel = new javax.swing.JLabel();
        hourFormattedTextField = new javax.swing.JFormattedTextField();
        dateLabel = new javax.swing.JLabel();
        dateFormattedTextField = new javax.swing.JFormattedTextField();
        doctorLabel = new javax.swing.JLabel();
        doctorComboBox = new javax.swing.JComboBox<>();
        patientLabel = new javax.swing.JLabel();
        patientComboBox = new javax.swing.JComboBox<>();
        appointmentTypeLabel = new javax.swing.JLabel();
        appointmentTypeComboBox = new javax.swing.JComboBox<>();
        retrieveButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        idLabel.setText("Código");

        hourLabel.setText("Hora");

        hourFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("hh:mm a"))));

        dateLabel.setText("Data");

        dateFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        doctorLabel.setText("Médico");

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, doctorList, doctorComboBox);
        bindingGroup.addBinding(jComboBoxBinding);

        patientLabel.setText("Paciente");

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, patientList, patientComboBox);
        bindingGroup.addBinding(jComboBoxBinding);

        appointmentTypeLabel.setText("Tipo");

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, appointmentTypeList, appointmentTypeComboBox);
        bindingGroup.addBinding(jComboBoxBinding);

        retrieveButton.setText("Consultar");

        addButton.setText("Cadastrar");

        editButton.setText("Editar");

        removeButton.setText("Remover");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idLabel)
                            .addComponent(hourLabel)
                            .addComponent(dateLabel)
                            .addComponent(doctorLabel)
                            .addComponent(patientLabel)
                            .addComponent(appointmentTypeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hourFormattedTextField)
                            .addComponent(dateFormattedTextField)
                            .addComponent(doctorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patientComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(retrieveButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(appointmentTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeButton)
                        .addGap(0, 151, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retrieveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appointmentTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appointmentTypeLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(removeButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Cadastro de Consultas");
        getAccessibleContext().setAccessibleDescription("Cadastro de Consultas");

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initComponentProperties() {
        doctorComboBox.setRenderer(new javax.swing.DefaultListCellRenderer() {
            @Override
            public java.awt.Component getListCellRendererComponent(javax.swing.JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Doctor) {
                    Doctor doctor = (Doctor)value;
                    setText(doctor.getName());
                }
                return this;
            }
        });
        
        patientComboBox.setRenderer(new javax.swing.DefaultListCellRenderer() {
            @Override
            public java.awt.Component getListCellRendererComponent(javax.swing.JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Patient) {
                    Patient patient = (Patient)value;
                    setText(patient.getName());
                }
                return this;
            }
        });
        
        appointmentTypeComboBox.setRenderer(new javax.swing.DefaultListCellRenderer() {
            @Override
            public java.awt.Component getListCellRendererComponent(javax.swing.JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof AppointmentType) {
                    AppointmentType appointmentType = (AppointmentType)value;
                    setText(appointmentType.getDescription());
                }
                return this;
            }
        });
    }
    
    public JButton getEditButton() {
        return editButton;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getRemoveButton() {
        return removeButton;
    }

    public JButton getRetrieveButton() {
        return retrieveButton;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager MedicalClinicPUEntityManager;
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox<String> appointmentTypeComboBox;
    private javax.swing.JLabel appointmentTypeLabel;
    private java.util.List<Model.AppointmentType> appointmentTypeList;
    private javax.persistence.Query appointmentTypeQuery;
    private javax.swing.JFormattedTextField dateFormattedTextField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JComboBox<String> doctorComboBox;
    private javax.swing.JLabel doctorLabel;
    private java.util.List<Model.Doctor> doctorList;
    private javax.persistence.Query doctorQuery;
    private javax.swing.JButton editButton;
    private javax.swing.JFormattedTextField hourFormattedTextField;
    private javax.swing.JLabel hourLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JComboBox<String> patientComboBox;
    private javax.swing.JLabel patientLabel;
    private java.util.List<Model.Patient> patientList;
    private javax.persistence.Query patientQuery;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton retrieveButton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
