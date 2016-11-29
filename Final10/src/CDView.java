/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasidha
 */


import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CDView extends JPanel{
    
    JTextField companyName;
    JTextField departmentName;
    JButton goodButton;
    NavViewPanel nVpanel;
    
    CDModel c_model;
    CDView c_view;

    CDView(CDModel c_model) {
       this.c_model = c_model;
       nVpanel = new NavViewPanel();
       
       companyName = new JTextField("Enter Company Name");
       departmentName = new JTextField("Enter Department Name");
       goodButton = new JButton("Next: Add Info");
       add(nVpanel);
       add(companyName);
       add(departmentName);
       add(goodButton);
       
    }
    public void switchToInfoPanel(InfoView i_view) {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeCD();
        nVpanel.addInfo(i_view); 
    }
    public void addInfoButtonListener(ActionListener al){
        goodButton.addActionListener(al);
    }
    
}
