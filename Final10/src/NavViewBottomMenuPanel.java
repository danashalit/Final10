/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class NavViewBottomMenuPanel extends JPanel{
    JButton mainButton;
    JButton applyButton; 
    JButton creditButton;
    JButton instructionsButton;
    public NavViewBottomMenuPanel() {
        super();       
        mainButton = new JButton("Main");
        applyButton = new JButton("Apply Now");
        creditButton = new JButton("Credits");
        instructionsButton = new JButton("Instructions");
                                  
        add(mainButton);
        add(applyButton);
        add(creditButton);
        add(instructionsButton);
 
        

    }          
}
