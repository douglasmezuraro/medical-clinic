package View;

import Model.Agreement;
import Utils.Constants;
import Model.Patient;
import javax.swing.JButton;

public class PatientsView extends javax.swing.JFrame {

    public PatientsView() {
        initComponents();
        initComponentProperties();
    }

    public void modelToView(Patient model) {
        if (model == null) {
            clearView();
            return;
        }

        IdTextField.setText(model.getId().toString());
        NameTextField.setText(model.getName());
        LastNameTextField.setText(model.getLastName());
        ContactTextField.setText(model.getContact());
        BirthFormattedField.setValue(model.getBirth());
        AddressTextField.setText(model.getAddress());
        AgreementComboBox.setSelectedItem((Agreement) model.getAgreement());
    }

    public Patient viewToModel(Patient model) {
        model.setName(NameTextField.getText());
        model.setLastName(LastNameTextField.getText());
        model.setContact(ContactTextField.getText());
        model.setAddress(AddressTextField.getText());
        model.setAgreement((Agreement) AgreementComboBox.getSelectedItem());

        return model;
    }

    public void clearView() {
        IdTextField.setText(Constants.EMPTY_STRING);
        NameTextField.setText(Constants.EMPTY_STRING);
        LastNameTextField.setText(Constants.EMPTY_STRING);
        ContactTextField.setText(Constants.EMPTY_STRING);
        BirthFormattedField.setText(Constants.EMPTY_STRING);
        AddressTextField.setText(Constants.EMPTY_STRING);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        MedicalClinicPUEntityManager0 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MedicalClinicPU").createEntityManager();
        agreementQuery = java.beans.Beans.isDesignTime() ? null : MedicalClinicPUEntityManager0.createQuery("SELECT a FROM Agreement a");
        agreementList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : agreementQuery.getResultList();
        EditorPanel = new javax.swing.JPanel();
        NameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        LastNameLabel = new javax.swing.JLabel();
        LastNameTextField = new javax.swing.JTextField();
        BirthLabel = new javax.swing.JLabel();
        BirthFormattedField = new javax.swing.JFormattedTextField();
        AddressLabel = new javax.swing.JLabel();
        AddressTextField = new javax.swing.JTextField();
        ContactLabel = new javax.swing.JLabel();
        ContactTextField = new javax.swing.JTextField();
        IdLabel = new javax.swing.JLabel();
        IdTextField = new javax.swing.JTextField();
        AgreementLabel = new javax.swing.JLabel();
        AgreementComboBox = new javax.swing.JComboBox<>();
        NewButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        RetrieveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NameLabel.setText("Nome");

        LastNameLabel.setText("Último nome");

        BirthLabel.setText("Nascimento");

        BirthFormattedField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        AddressLabel.setText("Endereço");

        ContactLabel.setText("Contato");

        IdLabel.setText("Código");

        AgreementLabel.setText("Convênio");

        AgreementComboBox.setToolTipText("");

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, agreementList, AgreementComboBox);
        bindingGroup.addBinding(jComboBoxBinding);

        NewButton.setText("Cadastrar");

        EditButton.setText("Editar");

        RemoveButton.setText("Remover");

        RetrieveButton.setText("Consultar");

        javax.swing.GroupLayout EditorPanelLayout = new javax.swing.GroupLayout(EditorPanel);
        EditorPanel.setLayout(EditorPanelLayout);
        EditorPanelLayout.setHorizontalGroup(
            EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditorPanelLayout.createSequentialGroup()
                        .addComponent(NewButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoveButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(EditorPanelLayout.createSequentialGroup()
                        .addGroup(EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BirthLabel)
                            .addComponent(AddressLabel)
                            .addComponent(ContactLabel)
                            .addComponent(LastNameLabel)
                            .addComponent(IdLabel)
                            .addComponent(NameLabel)
                            .addComponent(AgreementLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddressTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                            .addComponent(NameTextField)
                            .addComponent(LastNameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ContactTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BirthFormattedField)
                            .addGroup(EditorPanelLayout.createSequentialGroup()
                                .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RetrieveButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(AgreementComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        EditorPanelLayout.setVerticalGroup(
            EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdLabel)
                    .addComponent(RetrieveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LastNameLabel)
                    .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BirthLabel)
                    .addComponent(BirthFormattedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContactLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgreementComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgreementLabel))
                .addGap(108, 108, 108)
                .addGroup(EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditButton)
                    .addComponent(RemoveButton)
                    .addComponent(NewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        AgreementComboBox.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EditorPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initComponentProperties() {
        AgreementComboBox.setRenderer(new javax.swing.DefaultListCellRenderer() {
            @Override
            public java.awt.Component getListCellRendererComponent(javax.swing.JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Agreement) {
                    Agreement agreement = (Agreement)value;
                    setText(agreement.getName());
                }
                return this;
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JComboBox<String> AgreementComboBox;
    private javax.swing.JLabel AgreementLabel;
    private javax.swing.JFormattedTextField BirthFormattedField;
    private javax.swing.JLabel BirthLabel;
    private javax.swing.JLabel ContactLabel;
    private javax.swing.JTextField ContactTextField;
    private javax.swing.JButton EditButton;
    private javax.swing.JPanel EditorPanel;
    private javax.swing.JLabel IdLabel;
    private javax.swing.JTextField IdTextField;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameTextField;
    private javax.persistence.EntityManager MedicalClinicPUEntityManager0;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JButton NewButton;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton RetrieveButton;
    private java.util.List<Model.Agreement> agreementList;
    private javax.persistence.Query agreementQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public JButton getEditButton() {
        return EditButton;
    }

    public JButton getNewButton() {
        return NewButton;
    }

    public JButton getRemoveButton() {
        return RemoveButton;
    }

    public JButton getRetrieveButton() {
        return RetrieveButton;
    }

    public Long getId() {
        return Model.Base.parseId(IdTextField.getText());
    }

}
