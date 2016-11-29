
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
    
    JLabel developer1;
    JLabel developer2;
    JLabel developer3;
    NavViewPanel nVpanel;
    JButton creditButton;
    JLabel developers;
    CreditModel cr_model;
    CreditView cr_view;
    
    CreditView(CreditModel cr_model){
        this.cr_model = cr_model;
        nVpanel = new NavViewPanel();
        developers = new JLabel("Developers: ");
        developer1 = new JLabel("Dana Shalit");
        developer2 = new JLabel("Rasidha Rahman");
        developer3 = new JLabel("Cecelia Knaub");
        
        add(nVpanel);
        add(developers);
        add(developer1);
        add(developer2);
        add(developer3);
    }
    
    public void switchToCreditPanel(InfoView i_view){
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeCD();
        nVpanel.removeInfo();
        nVpanel.removeInstructions();
        nVpanel.removeOptions();
        cr_view.setVisible(true);
        nVpanel.addCredit(cr_view);
    } 
    
    public void addInfoButtonListener(ActionListener al){
        creditButton.addActionListener(al);
    }
}
