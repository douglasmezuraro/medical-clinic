package DAO;

import Model.Agreement;

public class AgreementsDAO extends DAO {

    public AgreementsDAO() {
        super(Agreement.class);
    }

    @Override
    public void seed() {
        if(!isEmpty()) return;
      
        String[] values = {"Particular", "Plano de saúde"};
        
        for(String value: values) {
            Agreement model = new Agreement();
            model.setName(value);
            this.add(model);
        }
    }
    
}
