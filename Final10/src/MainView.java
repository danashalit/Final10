/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author DeeShalz
 */
public class MainView extends JPanel {
    NavViewPanel nVpanel;
    JButton mainButton;
    JLabel summaryLabel;

    MainView()
    { 
        JButton welcomeButton = new JButton("Welcome to the Application!");
        add(welcomeButton);
        
        mainButton = new JButton(new ImageIcon ("src/images/communical.png"));            
            add(mainButton); 
        
        nVpanel = new NavViewPanel();
        add(nVpanel);

        nVpanel.removeSplash();
        nVpanel.removeMenu();
        
        
    }

 
   
}