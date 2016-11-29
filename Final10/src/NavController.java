


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    
    InfoController i_controller;
    InfoModel i_model;
    InfoView i_view;
    
    CreditController cr_controller;
    CreditModel cr_model;
    CreditView cr_view;
    
    InstructionsController in_controller;
    InstructionsModel in_model;
    InstructionsView in_view;
    
    OptionController o_controller;
    OptionModel o_model;
    OptionView o_view;
    
    MainView m_view;
    
    public NavController(NavModel n_model, NavView n_view){
        this.n_model = n_model;
        this.n_view = n_view;
        
        c_model = new CDModel();        
        c_view = new CDView(c_model);
        c_controller = new CDController(c_model, c_view); 
        
        i_model = new InfoModel();
        i_view = new InfoView(i_model);
        i_controller = new InfoController(i_model, i_view);
        
        o_model = new OptionModel();
        o_view = new OptionView(o_model);
        o_controller = new OptionController(o_model, o_view);
        
        m_view = new MainView();
                
        c_view.addInfoButtonListener(new InfoButtonListener());
        n_view.addCDButtonListener(new CDButtonListener());
        n_view.addMainButtonListener(new MainButtonListener());
        n_view.addCreditButtonListener(new CreditButtonListener());
        n_view.addInstructionsButtonListener(new InstructionsButtonListener());
    }
    class InfoButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass an Options View object to our Navigation View
            c_view.switchToInfoPanel(i_view);
        }
    }     
    class CDButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            n_view.switchToCDPanel(c_view);
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
}
