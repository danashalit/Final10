
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasidha
 */
public class CreditView extends JPanel {
    
   
    NavViewPanel nVpanel;
    JButton creditButton;
    JLabel developers;
    CreditModel cr_model;
    CreditView cr_view;
    NavViewBottomMenuPanel n_view;
    
    CreditView(CreditModel cr_model){
        nVpanel = new NavViewPanel();
        developers = new JLabel("Developers: Dana Shalit, Rasidha Rahman, Cecilia Knaub");
        add(nVpanel);
        add(developers);
        nVpanel.removeSplash();
        nVpanel.removeMenu();
        
    }
    
   
}
