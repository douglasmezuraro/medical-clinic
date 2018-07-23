package View;

import Interface.IView;
import Model.Agreement;
import Utils.Constants;
import Model.Patient;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class PatientsView extends javax.swing.JFrame implements IView<Patient> {

    public PatientsView() {
        initComponents();
        initComponentProperties();
        
        // Centraliza o formulário
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
    public void modelToView(Patient model) {
        if(model == null) {
            clear();
            return;
        }

        idTextField.setText(model.getId().toString());
        nameTextField.setText(model.getName());
        lastNameTextField.setText(model.getLastName());
        contactTextField.setText(model.getContact());
        birthFormattedField.setValue(model.getBirth());
        addressTextField.setText(model.getAddress());
        agreementComboBox.setSelectedItem((Agreement) model.getAgreement());
    }

    @Override
    public Patient viewToModel(Patient model) {
        model.setName(nameTextField.getText());
        model.setLastName(lastNameTextField.getText());
        model.setContact(contactTextField.getText());
        model.setAddress(addressTextField.getText());
        model.setBirth((Date)birthFormattedField.getValue());
        model.setAgreement((Agreement) agreementComboBox.getSelectedItem());

        return model;
    }

    @Override
    public void clear() {
        idTextField.setText(Constants.EMPTY_STRING);
        nameTextField.setText(Constants.EMPTY_STRING);
        lastNameTextField.setText(Constants.EMPTY_STRING);
        contactTextField.setText(Constants.EMPTY_STRING);
        birthFormattedField.setText(Constants.EMPTY_STRING);
        addressTextField.setText(Constants.EMPTY_STRING);
        agreementComboBox.setSelectedIndex(Constants.SELECTED_NONE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        agreementQuery = java.beans.Beans.isDesignTime() ? null : Utils.EntityManagerSingleton.getInstance().getEntityManager().createQuery("SELECT a FROM Agreement a");
        agreementList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : agreementQuery.getResultList();
        idLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        retrieveButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        panesTabbedPane = new javax.swing.JTabbedPane();
        patientDataPane = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        birthLabel = new javax.swing.JLabel();
        birthFormattedField = new javax.swing.JFormattedTextField();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        contactLabel = new javax.swing.JLabel();
        contactTextField = new javax.swing.JTextField();
        agreementLabel = new javax.swing.JLabel();
        agreementComboBox = new javax.swing.JComboBox<>();
        aggravationPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        idLabel.setText("Código");

        retrieveButton.setText("Consultar");

        addButton.setText("Cadastrar");

        editButton.setText("Editar");

        removeButton.setText("Remover");

        nameLabel.setText("Nome");

        lastNameLabel.setText("Último nome");

        birthLabel.setText("Nascimento");

        birthFormattedField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        addressLabel.setText("Endereço");

        contactLabel.setText("Contato");

        agreementLabel.setText("Convênio");

        agreementComboBox.setToolTipText("");

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, agreementList, agreementComboBox);
        bindingGroup.addBinding(jComboBoxBinding);

        javax.swing.GroupLayout patientDataPaneLayout = new javax.swing.GroupLayout(patientDataPane);
        patientDataPane.setLayout(patientDataPaneLayout);
        patientDataPaneLayout.setHorizontalGroup(
            patientDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientDataPaneLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(patientDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agreementLabel)
                    .addComponent(contactLabel)
                    .addComponent(nameLabel)
                    .addComponent(lastNameLabel)
                    .addComponent(birthLabel)
                    .addComponent(addressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patientDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agreementComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addressTextField)
                    .addComponent(birthFormattedField)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(nameTextField)
                    .addComponent(contactTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        patientDataPaneLayout.setVerticalGroup(
            patientDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientDataPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patientDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patientDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patientDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthFormattedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patientDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patientDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactLabel)
                    .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patientDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agreementComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agreementLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        agreementComboBox.getAccessibleContext().setAccessibleName("");

        panesTabbedPane.addTab("Dados", patientDataPane);

        javax.swing.GroupLayout aggravationPaneLayout = new javax.swing.GroupLayout(aggravationPane);
        aggravationPane.setLayout(aggravationPaneLayout);
        aggravationPaneLayout.setHorizontalGroup(
            aggravationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        aggravationPaneLayout.setVerticalGroup(
            aggravationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        panesTabbedPane.addTab("Agravamentos", aggravationPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panesTabbedPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(retrieveButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addButton)
                                .addGap(2, 2, 2)
                                .addComponent(editButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addComponent(panesTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editButton)
                        .addComponent(removeButton))
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Cadastro de Pacientes");
        getAccessibleContext().setAccessibleDescription("Cadastro de Pacientes");

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initComponentProperties() {
        agreementComboBox.setRenderer(new javax.swing.DefaultListCellRenderer() {
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
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JPanel aggravationPane;
    private javax.swing.JComboBox<String> agreementComboBox;
    private javax.swing.JLabel agreementLabel;
    private java.util.List<Model.Agreement> agreementList;
    private javax.persistence.Query agreementQuery;
    private javax.swing.JFormattedTextField birthFormattedField;
    private javax.swing.JLabel birthLabel;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTabbedPane panesTabbedPane;
    private javax.swing.JPanel patientDataPane;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton retrieveButton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

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

    public JTabbedPane getPanes() {
        return panesTabbedPane;
    }

    public JPanel getAggravationPane() {
        return aggravationPane;
    }

    public JPanel getPatientDataPane() {
        return patientDataPane;
    }

}
