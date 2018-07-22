package DAO;

import Model.AppointmentType;

public class AppointmentTypeDAO extends DAO<AppointmentType> {

    public AppointmentTypeDAO() {
        super(AppointmentType.class);
    }

    @Override
    public void seed() {
        if(!isEmpty()) return;
      
        String[] values = {"Normal: duração de 1 hora", "Retorno: duração de 30 minutos"};
        
        for(String value: values) {
            AppointmentType model = new AppointmentType();
            model.setDescription(value);
            this.add(model);
        }        
    }
    
}
