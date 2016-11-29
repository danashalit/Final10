/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author DeeShalz
 */
public class MainView extends JPanel {
    NavViewPanel nVpanel;
    MainView()
    {
        JButton welcomeButton = new JButton("Welcome to the Application!");
        add(welcomeButton);
        
        nVpanel = new NavViewPanel();
        add(nVpanel);
    }
    public void switchToCDPanel(CDView c_view){
        nVpanel.addCD(c_view); 
    }      
    public void addCDButtonListener(ActionListener al){
        nVpanel.menu.applyButton.addActionListener(al);
    }

    public void switchToInstructionPanel(InstructionsView in_view){
        nVpanel.addInstructions(in_view);
    }
    public void addInstructionsButtonListener(ActionListener al){
        nVpanel.menu.instructionsButton.addActionListener(al);
    }
}