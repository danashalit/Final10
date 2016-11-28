
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
    private JLabel instructionsLabel;
    
    InstructionsModel inst_model;
    
    InstructionsView(InstructionsModel inst_model){
        this.inst_model = inst_model;
        instructionsLabel = new JLabel("Enter company names and departments"
                + "to view payroll. It's that simple!");
        
        
    }
}
