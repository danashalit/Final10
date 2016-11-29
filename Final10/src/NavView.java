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
   //  JButton goodButton;
    
    NavView(NavModel model){
        super("Primary View");
        this.model = model;
                          
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        nVpanel = new NavViewPanel();
        
        add(nVpanel); 
    }

    public void switchToCDPanel(CDView c_view){
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeInfo();
        nVpanel.addCD(c_view); 
    }
    public void switchToMainPanel(MainView m_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeInfo();
        nVpanel.removeCD();
        nVpanel.addMain(m_view);        
    }       
    
    public void switchToInstructionPanel(InstructionsView in_view){
        nVpanel.removeSplash();
        nVpanel.removeInfo();
        nVpanel.removeCD();
        nVpanel.removeMain();
        nVpanel.addInstructions(in_view);
    }
    public void addMainButtonListener(ActionListener al) 
    {    
        nVpanel.menu.mainButton.addActionListener(al);
    } 
    public void addCDButtonListener(ActionListener al){
        
        nVpanel.menu.applyButton.addActionListener(al);
    }
    
    public void addCreditButtonListener(ActionListener al){
        nVpanel.menu.creditButton.addActionListener(al);
    }
    
    public void addInstructionsButtonListener(ActionListener al){
        nVpanel.menu.instructionsButton.addActionListener(al);
    }
    
    public void addOptionButtonListener(ActionListener al){
        nVpanel.menu.optionButton.addActionListener(al);
    }
   

    void switchToCreditPanel(CreditView cr_view) {
        nVpanel.removeSplash();
        nVpanel.removeCD();
        nVpanel.removeInfo();
        nVpanel.addCredit(cr_view);
    }

    void switchToOptionPanel(OptionView o_view) {
        nVpanel.removeSplash();
        nVpanel.removeInfo();
        nVpanel.removeCD();
        nVpanel.removeMain();
        nVpanel.removeCredit();
        nVpanel.addOption(o_view);
    }


}
