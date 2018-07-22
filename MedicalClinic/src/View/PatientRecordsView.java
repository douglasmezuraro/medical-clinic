package View;

import Interface.IView;
import Model.Patient;
import Model.PatientRecord;
import Utils.Constants;
import javax.swing.JButton;

public class PatientRecordsView extends javax.swing.JFrame implements IView<PatientRecord> {

    public PatientRecordsView() {
        initComponents();
        initComponentsProperties();
    }

    @Override
    public void modelToView(PatientRecord model) {
        if(model == null) {
            clear();
            return;
        }
        
        patientComboBox.setSelectedItem((Patient)model.getPatient());
        symptomsTextField.setText(model.getSymptoms());
        diagnosisTextField.setText(model.getDiagnosis());
        treatmentTextField.setText(model.getTreatment());
    }

    @Override
    public PatientRecord viewToModel(PatientRecord model) {
        model.setPatient((Patient)patientComboBox.getSelectedItem());
        model.setSymptoms(symptomsTextField.getText());
        model.setDiagnosis(diagnosisTextField.getText());
        model.setTreatment(treatmentTextField.getText());
        
        return model;
    }

    @Override
    public void clear() {
        patientComboBox.setSelectedIndex(Constants.SELECTED_NONE);
        symptomsTextField.setText(Constants.EMPTY_STRING);
        diagnosisTextField.setText(Constants.EMPTY_STRING);
        treatmentTextField.setText(Constants.EMPTY_STRING);
    }

    @Override
    public Long getId() {
        return Model.Base.parseId(idTextField.getText());
    }

    @Override
    public void setId(Long id) {
        idTextField.setText(id.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        patientQuery = java.beans.Beans.isDesignTime() ? null : Utils.EntityManagerSingleton.getInstance().getEntityManager().createQuery("SELECT p FROM Patient p");
        patientList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : patientQuery.getResultList();
        idLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        patientLabel = new javax.swing.JLabel();
        patientComboBox = new javax.swing.JComboBox<>();
        symptomsLabel = new javax.swing.JLabel();
        symptomsTextField = new javax.swing.JTextField();
        diagnosisLabel = new javax.swing.JLabel();
        diagnosisTextField = new javax.swing.JTextField();
        treatmentLabel = new javax.swing.JLabel();
        treatmentTextField = new javax.swing.JTextField();
        retrieveButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        idLabel.setText("Código");

        patientLabel.setText("Paciente");

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, patientList, patientComboBox);
        bindingGroup.addBinding(jComboBoxBinding);

        symptomsLabel.setText("Sintomas");

        diagnosisLabel.setText("Diagnóstico");

        treatmentLabel.setText("Tratamento");

        retrieveButton.setText("Consultar");

        addButton.setText("Cadastrar");

        editButton.setText("Editar");

        removeButton.setText("Remover");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(patientLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(diagnosisLabel)
                                .addComponent(treatmentLabel)
                                .addComponent(symptomsLabel))
                            .addComponent(idLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(symptomsTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(diagnosisTextField)
                    .addComponent(treatmentTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retrieveButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(patientComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editButton)
                .addGap(2, 2, 2)
                .addComponent(removeButton)
                .addContainerGap(161, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(symptomsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(symptomsLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diagnosisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(diagnosisLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(treatmentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(treatmentLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeButton)
                    .addComponent(editButton)
                    .addComponent(addButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel diagnosisLabel;
    private javax.swing.JTextField diagnosisTextField;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JComboBox<String> patientComboBox;
    private javax.swing.JLabel patientLabel;
    private java.util.List<Model.Patient> patientList;
    private javax.persistence.Query patientQuery;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton retrieveButton;
    private javax.swing.JLabel symptomsLabel;
    private javax.swing.JTextField symptomsTextField;
    private javax.swing.JLabel treatmentLabel;
    private javax.swing.JTextField treatmentTextField;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void initComponentsProperties() {
        patientComboBox.setRenderer(new javax.swing.DefaultListCellRenderer() {
            @Override
            public java.awt.Component getListCellRendererComponent(javax.swing.JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Patient) {
                    Patient patient = (Patient) value;
                    setText(patient.getName());
                }
                return this;
            }
        });
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getEditButton() {
        return editButton;
    }

    public JButton getRemoveButton() {
        return removeButton;
    }

    public JButton getRetrieveButton() {
        return retrieveButton;
    }
    
}
