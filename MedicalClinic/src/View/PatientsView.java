package View;

import Interface.IView;
import Model.Agreement;
import Utils.Constants;
import Model.Patient;
import java.util.Date;
import javax.swing.JButton;

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
        retrieveButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        idLabel.setText("Código");

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

        retrieveButton.setText("Consultar");
        retrieveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveButtonActionPerformed(evt);
            }
        });

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
                            .addComponent(agreementLabel)
                            .addComponent(nameLabel)
                            .addComponent(idLabel)
                            .addComponent(lastNameLabel)
                            .addComponent(birthLabel)
                            .addComponent(addressLabel)
                            .addComponent(contactLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthFormattedField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(retrieveButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(nameTextField)
                            .addComponent(lastNameTextField)
                            .addComponent(addressTextField)
                            .addComponent(contactTextField)
                            .addComponent(agreementComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthFormattedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactLabel)
                    .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agreementComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agreementLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(removeButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        agreementComboBox.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleName("Cadastro de Pacientes");
        getAccessibleContext().setAccessibleDescription("Cadastro de Pacientes");

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void retrieveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retrieveButtonActionPerformed

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

}
