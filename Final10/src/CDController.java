
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasidha
 */
public class CDController {

    private CDModel c_model;
    private CDView c_view;
   
    
    CDController(CDModel c_model, CDView c_view){
    this.c_model = c_model;
    this.c_view = c_view;
    
    class SaveButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            JButton eventSource = (JButton)e.getSource();
            if(eventSource == c_view.saveButton){
                c_model.setfName(c_view.getfName());
                c_model.setlName(c_view.getlName());
                c_model.setAge(c_view.getAgeSlider().getValue());
                c_model.setCompanyName(c_view.getCompanyName());
                c_model.setDepartmentName(c_view.getDepartmentName());
                c_view.summaryLabel.setText("Company: " + c_model.getCompanyName() + " Department: " + c_model.getDepartmentName() + " Name: " + c_model.getfName() + "  " + c_model.getlName() + " Age: " + c_model.getAge());
            }
             }
        
    }
    c_view.addSaveButtonListener(new SaveButtonListener());
}
}
