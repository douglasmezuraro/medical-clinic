package View;

import Interface.IView;
import Model.Patient;
import Utils.Constants;
import javax.swing.JButton;

public class AggravationsView extends javax.swing.JFrame implements IView<Patient> {

    public AggravationsView() {
        initComponents();
        
        // Centraliza o form
        this.setLocationRelativeTo(null);        
    }

    @Override
    public void modelToView(Patient model) {
        if(model == null) return;
        
        patientNameTextField.setText(model.getFullName());
        
        if(model.getAggravation() == null) return;
        
        smokeCheckBox.setSelected(model.getAggravation().isSmoker());
        drinkCheckBox.setSelected(model.getAggravation().isDrinker());
        heartDiceaseCheckBox.setSelected(model.getAggravation().hasHeartDicease());
        allergiesTextField.setText(model.getAggravation().getAllergies());
        surgeriesTextField.setText(model.getAggravation().getSurgeries());
    }

    @Override
    public Patient viewToModel(Patient model) {
        model.getAggravation().setDrinker(drinkCheckBox.isSelected());
        model.getAggravation().setSmoker(smokeCheckBox.isSelected());
        model.getAggravation().setHeartDicease(heartDiceaseCheckBox.isSelected());
        model.getAggravation().setAllergies(allergiesTextField.getText());
        model.getAggravation().setSurgeries(surgeriesTextField.getText());
        
        return model;
    }

    @Override
    public void clear() {
        smokeCheckBox.setSelected(false);
        drinkCheckBox.setSelected(false);
        heartDiceaseCheckBox.setSelected(false);
        allergiesTextField.setText(Constants.EMPTY_STRING);
        surgeriesTextField.setText(Constants.EMPTY_STRING);
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

        idLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        patientNameLabel = new javax.swing.JLabel();
        patientNameTextField = new javax.swing.JTextField();
        allergiesLabel = new javax.swing.JLabel();
        allergiesTextField = new javax.swing.JTextField();
        surgeriesLabel = new javax.swing.JLabel();
        surgeriesTextField = new javax.swing.JTextField();
        smokeCheckBox = new javax.swing.JCheckBox();
        drinkCheckBox = new javax.swing.JCheckBox();
        heartDiceaseCheckBox = new javax.swing.JCheckBox();
        retrieveButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        idLabel.setText("Código");

        patientNameLabel.setText("Paciente");

        patientNameTextField.setEditable(false);

        allergiesLabel.setText("Alergias");

        surgeriesLabel.setText("Cirurgias");

        smokeCheckBox.setText("Fuma?");

        drinkCheckBox.setText("Bebe?");

        heartDiceaseCheckBox.setText("Histórico de doença cardiáca?");

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
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(surgeriesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(surgeriesTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(patientNameLabel)
                            .addComponent(idLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(retrieveButton)
                                .addGap(0, 148, Short.MAX_VALUE))
                            .addComponent(patientNameTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(drinkCheckBox)
                                .addComponent(smokeCheckBox))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(heartDiceaseCheckBox)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(allergiesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(allergiesTextField)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel)
                    .addComponent(retrieveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(patientNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(allergiesLabel)
                    .addComponent(allergiesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surgeriesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surgeriesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(smokeCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drinkCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(heartDiceaseCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(removeButton))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel allergiesLabel;
    private javax.swing.JTextField allergiesTextField;
    private javax.swing.JCheckBox drinkCheckBox;
    private javax.swing.JButton editButton;
    private javax.swing.JCheckBox heartDiceaseCheckBox;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel patientNameLabel;
    private javax.swing.JTextField patientNameTextField;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton retrieveButton;
    private javax.swing.JCheckBox smokeCheckBox;
    private javax.swing.JLabel surgeriesLabel;
    private javax.swing.JTextField surgeriesTextField;
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
