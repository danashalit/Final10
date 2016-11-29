
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
    
    JLabel developer1;
    JLabel developer2;
    JLabel developer3;
    NavViewPanel nVpanel;
    
    CreditModel cc_model;
    CreditView cc_view;
    
    CreditView(CreditModel cc_model){
        this.cc_model = cc_model;
        nVpanel = new NavViewPanel();
        
        developer1 = new JLabel("Dana Shalit");
        developer2 = new JLabel("Rasidha Rahman");
        developer3 = new JLabel("Cecelia Knaub");
        
        add(nVpanel);
        add(developer1);
        add(developer2);
        add(developer3);
    }
}
