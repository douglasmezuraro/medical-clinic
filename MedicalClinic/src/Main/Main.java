package Main;

import Controller.PrincipalController;
import View.PrincipalView;

public class Main {
    
    public static void setLookAndFeel(String name) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (name.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }    
    
    public static void seed() {
        new DAO.AgreementsDAO().seed();
        new DAO.AppointmentTypeDAO().seed();
        new DAO.DoctorsDAO().seed();
        new DAO.SecretariesDAO().seed();
    }
    
    public static void main(String args[]) {
        setLookAndFeel("Windows");
        seed();
        
        PrincipalController controller = new PrincipalController();
    }
    
}
