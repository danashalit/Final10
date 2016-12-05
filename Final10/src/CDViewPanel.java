
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DeeShalz
 */
public class CDViewPanel extends JPanel{
JTextField companyName;
    JTextField departmentName;
    JButton goodButton;
    NavViewPanel nVpanel;
    
    CDModel c_model;
    CDView c_view;

    CDViewPanel() {
       this.c_model = c_model;
       nVpanel = new NavViewPanel();
       add(nVpanel);
       companyName = new JTextField("Enter Company Name");
       departmentName = new JTextField("Enter Department Name");
       goodButton = new JButton("Next: Add Info");
       
       add(companyName);
       add(departmentName);
       add(goodButton);
       
       nVpanel.removeMenu();
       nVpanel.removeSplash();
       
    }
    public void switchToInfoPanel(InfoView i_view) {
        nVpanel.addInfo(i_view); 
    }
    public void addInfoButtonListener(ActionListener al){
        goodButton.addActionListener(al);
    }
    public void addCD(CDView c_view){
        this.c_view = c_view;
        add(c_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
}