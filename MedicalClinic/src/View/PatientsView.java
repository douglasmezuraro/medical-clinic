package View;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class PatientsView extends javax.swing.JFrame {

    public JButton getEditButton() {
        return EditButton;
    }

    public JButton getNewButton() {
        return NewButton;
    }

    public JButton getRemoveButton() {
        return RemoveButton;
    }

    public JButton getSaveButton() {
        return SaveButton;
    }

    public JButton getSearchButton() {
        return SearchButton;
    }

    public JTextField getAddressTextField() {
        return AddressTextField;
    }

    public void setAddressTextField(JTextField AddressTextField) {
        this.AddressTextField = AddressTextField;
    }

    public JFormattedTextField getBirthFormattedField() {
        return BirthFormattedField;
    }

    public void setBirthFormattedField(JFormattedTextField BirthFormattedField) {
        this.BirthFormattedField = BirthFormattedField;
    }

    public JTextField getContactTextField() {
        return ContactTextField;
    }

    public void setContactTextField(JTextField ContactTextField) {
        this.ContactTextField = ContactTextField;
    }

    public JTextField getIdTextField() {
        return IdTextField;
    }

    public void setIdTextField(JTextField IdTextField) {
        this.IdTextField = IdTextField;
    }

    public JTextField getLastNameTextField() {
        return LastNameTextField;
    }

    public void setLastNameTextField(JTextField LastNameTextField) {
        this.LastNameTextField = LastNameTextField;
    }

    public JTextField getNameTextField() {
        return NameTextField;
    }

    public void setNameTextField(JTextField NameTextField) {
        this.NameTextField = NameTextField;
    }

    public PatientsView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        SearchButton = new javax.swing.JButton();
        NewButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NameLabel.setText("Nome");

        LastNameLabel.setText("Último nome");

        BirthLabel.setText("Nascimento");

        BirthFormattedField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        AddressLabel.setText("Endereço");

        ContactLabel.setText("Contato");

        IdLabel.setText("Código");

        SearchButton.setText("Consultar");

        NewButton.setText("Novo");

        EditButton.setText("Editar");

        RemoveButton.setText("Remover");

        SaveButton.setText("Salvar");

        javax.swing.GroupLayout EditorPanelLayout = new javax.swing.GroupLayout(EditorPanel);
        EditorPanel.setLayout(EditorPanelLayout);
        EditorPanelLayout.setHorizontalGroup(
            EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditorPanelLayout.createSequentialGroup()
                        .addGroup(EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BirthLabel)
                            .addComponent(AddressLabel)
                            .addComponent(ContactLabel)
                            .addComponent(LastNameLabel)
                            .addComponent(IdLabel)
                            .addComponent(NameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddressTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                            .addComponent(NameTextField)
                            .addComponent(LastNameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ContactTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BirthFormattedField)
                            .addGroup(EditorPanelLayout.createSequentialGroup()
                                .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(EditorPanelLayout.createSequentialGroup()
                        .addComponent(SearchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SaveButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EditorPanelLayout.setVerticalGroup(
            EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchButton)
                    .addComponent(NewButton)
                    .addComponent(EditButton)
                    .addComponent(RemoveButton)
                    .addComponent(SaveButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EditorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EditorPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JTextField AddressTextField;
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
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JButton NewButton;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton SearchButton;
    // End of variables declaration//GEN-END:variables
}
