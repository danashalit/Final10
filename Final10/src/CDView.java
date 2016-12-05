/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasidha
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class CDView extends JPanel{
    
    JTextField companyName;
    JTextField departmentName;
    NavViewPanel nVpanel;
    JTextField fName;
    JTextField lName;
    JSlider ageSlider;
    JButton saveButton;
    JLabel EnterAge;
    
    CDModel c_model;
    CDView c_view;

    CDView(CDModel c_model) {
       this.c_model = c_model;
       nVpanel = new NavViewPanel();
       add(nVpanel);
       companyName = new JTextField("Enter Company Name");
       departmentName = new JTextField("Enter Department Name");
       fName = new JTextField("Enter First Name");
        lName = new JTextField("Enter Last Name");
        ageSlider = new JSlider(JSlider.HORIZONTAL, 20,60,40);
        ageSlider.setMajorTickSpacing(5);
        ageSlider.setPaintLabels(true);
        ageSlider.setPaintTicks(true);
        EnterAge = new JLabel("Age: ");
        saveButton = new JButton("Save Info");
       add(companyName);
       add(departmentName);
        add(fName);
        add(lName);
        add(EnterAge);
        add(ageSlider);
        add(saveButton);
       
       nVpanel.removeMenu();
       nVpanel.removeSplash();
       
       
       
    }
    
}
