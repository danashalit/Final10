


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JSlider;
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
public class NavController {
    NavModel n_model;
    NavView n_view;
    
    CDController c_controller;
    CDModel c_model;
    CDView c_view;
    JButton credits;
    
    CreditController cr_controller;
    CreditModel cr_model;
    CreditView cr_view;
    
    InstructionsController in_controller;
    InstructionsModel in_model;
    InstructionsView in_view;
    
    OptionController o_controller;
    OptionModel o_model;
    OptionView o_view;
    JTextField fNameTF;
    JTextField lNameTF;
    JTextField departmentNameTF;
    JTextField companyNameTF;
    JSlider ageSlider;
    JButton saveButton;
    JLabel summaryLabel;
    
    MainView m_view;
    NavViewPanel nVpanel;
    
    public NavController(NavModel n_model, NavView n_view){
        this.n_model = n_model;
        this.n_view = n_view;
        
        c_model = new CDModel();        
        c_view = new CDView(c_model);
        c_controller = new CDController(c_model, c_view); 

        
        o_model = new OptionModel();
        o_view = new OptionView(o_model);
        o_controller = new OptionController(o_model, o_view);
        
        cr_model = new CreditModel();        
        cr_view = new CreditView(cr_model);
        cr_controller = new CreditController(cr_model, cr_view); 
        
        in_model = new InstructionsModel();        
        in_view = new InstructionsView(in_model);
        in_controller = new InstructionsController(in_model, in_view); 
        
        m_view = new MainView();
        nVpanel = new NavViewPanel();
        n_view.addCDButtonListener(new CDButtonListener());
        n_view.addMainButtonListener(new MainButtonListener());
        n_view.addCreditButtonListener(new CreditButtonListener());
        n_view.addInstructionsButtonListener(new InstructionsButtonListener());
        n_view.addOptionButtonListener(new OptionsButtonListener());
        
    }   
    class CDButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            n_view.switchToCDPanel(c_view);
            nVpanel.removeMain();
        }
    }
    class MainButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            n_view.switchToMainPanel(m_view);
            
        }
    } 
    class CreditButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            n_view.switchToCreditPanel(cr_view);
        }
    }
    class InstructionsButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            n_view.switchToInstructionPanel(in_view);
        }    
    }
    class OptionsButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            n_view.switchToOptionPanel(o_view);
        }
    }
    

}
