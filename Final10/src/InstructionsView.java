
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ceciliaknaub
 */
public class InstructionsView extends JPanel{
    JLabel instructionsLabel;
    
    InstructionsModel in_model;
    NavViewPanel nVpanel;
    
    InstructionsView(InstructionsModel in_model){
        nVpanel = new NavViewPanel();
        
        instructionsLabel = new JLabel("Enter company names and departments "
                + "to view payroll. It's that simple!");
        add(instructionsLabel);
        add(nVpanel);
        nVpanel.removeSplash();
        nVpanel.removeMenu();
    }
}
