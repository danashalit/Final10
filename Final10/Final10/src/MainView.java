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
        nVpanel.removeSplash();
        nVpanel.removeMenu();
    }
   /* public void switchToMainPanel(MainView m_view){
        nVpanel.removeSplash();
        nVpanel.addMain(m_view);        
    } 
    public void addMainButtonListener(ActionListener al) {    
        nVpanel.removeSplash();
        nVpanel.menu.mainButton.addActionListener(al);
    } 
    public void switchToCDPanel(CDView c_view){
        nVpanel.removeSplash();
        nVpanel.addCD(c_view); 
    }      
    public void addCDButtonListener(ActionListener al){
        nVpanel.menu.applyButton.addActionListener(al);
    }

   public void switchToCreditPanel(CreditView cr_view) {
        nVpanel.removeSplash();
        nVpanel.addCredit(cr_view);
    }
    public void addCreditButtonListener(ActionListener al){
        nVpanel.menu.creditButton.addActionListener(al);
    }

    public void switchToInstructionPanel(InstructionsView in_view){
        nVpanel.removeSplash();
        nVpanel.addInstructions(in_view);
    }
    public void addInstructionsButtonListener(ActionListener al){
        nVpanel.menu.instructionsButton.addActionListener(al);
    }
    public void switchToOptionPanel(OptionView o_view) {
        nVpanel.removeSplash();
        nVpanel.addOption(o_view);
    }
    public void addOptionButtonListener(ActionListener al){
        nVpanel.menu.optionButton.addActionListener(al);
    }   */
}