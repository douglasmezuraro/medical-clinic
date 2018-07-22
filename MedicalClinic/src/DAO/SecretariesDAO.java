package DAO;

import Model.Secretary;

public class SecretariesDAO extends DAO<Secretary> {
    
    public SecretariesDAO() {
        super(Secretary.class);
    }

    @Override
    public void seed() {
        if(!this.isEmpty()) return;
        Secretary model = new Secretary();
        model.setName("Secretário");
        this.add(model);       
    }
    
}
