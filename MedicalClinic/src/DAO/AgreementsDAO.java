package DAO;

import Model.Agreement;

public class AgreementsDAO extends DAO {

    public AgreementsDAO() {
        super(Agreement.class);
    }

    @Override
    public void seed() {
        if(!isEmpty()) return;
        for(String name: Agreement.seed()) {
            Agreement model = new Agreement();
            model.setName(name);
            this.add(model);
        }
    }
    
}
