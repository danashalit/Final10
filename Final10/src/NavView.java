/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author DeeShalz
 */
public class NavView extends JFrame {

    NavModel model;
    NavViewPanel nVpanel;
    
    NavView(NavModel model){
        super("Primary View");
        this.model = model;
                          
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        nVpanel = new NavViewPanel();
        
        add(nVpanel); 
    }
    public void switchToMainPanel(MainView m_view){
        nVpanel.removeCredit();
        nVpanel.removeInstructions();
        nVpanel.removeOptions();
        nVpanel.removeCD();
        nVpanel.removeSplash();
        nVpanel.addMain(m_view);        
    } 
    public void addMainButtonListener(ActionListener al) {    
        nVpanel.menu.mainButton.addActionListener(al);
    } 
    public void switchToCDPanel(CDView c_view){
        nVpanel.removeInstructions();
        nVpanel.removeCredit();
        nVpanel.removeOptions();
        nVpanel.removeMain();
        nVpanel.removeSplash();
        nVpanel.addCD(c_view); 
    }      
    public void addCDButtonListener(ActionListener al){
        nVpanel.menu.applyButton.addActionListener(al);
    }
    public void switchToInstructionPanel(InstructionsView in_view){
        nVpanel.removeCD();
        nVpanel.removeOptions();
        nVpanel.removeCredit();
        nVpanel.removeMain();
        nVpanel.removeSplash();
        nVpanel.addInstructions(in_view);
    }
    public void addInstructionsButtonListener(ActionListener al){
        nVpanel.menu.instructionsButton.addActionListener(al);
    }
    public void switchToCreditPanel(CreditView cr_view) {
        nVpanel.removeCD();
        nVpanel.removeMain();
        nVpanel.removeInstructions();
        nVpanel.removeOptions();
        nVpanel.removeSplash();
        nVpanel.addCredit(cr_view);
    }
    public void addCreditButtonListener(ActionListener al){
        nVpanel.menu.creditButton.addActionListener(al);
    }
    public void switchToOptionPanel(OptionView o_view) {
        nVpanel.removeCD();
        nVpanel.removeMain();
        nVpanel.removeInstructions();
        nVpanel.removeCredit();
        nVpanel.removeSplash();
        nVpanel.removeSplash();
        nVpanel.addOption(o_view);
    }
    public void addOptionButtonListener(ActionListener al){
        nVpanel.menu.optionButton.addActionListener(al);
    }



}
