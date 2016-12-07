
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
public class OptionView extends JPanel {
   private JSlider hourSlider;
   private JTextField salaryRequest;
   private JTextField experienceLevel;
   JLabel summaryLabel;
   JLabel hourQuestion;
   JButton saveOptionsButton;
   NavViewPanel nVpanel;
   JButton optionButton;
   

   OptionView o_view;
    
   private Object o_model;
   
   OptionView(OptionModel o_model){
       this.o_model = o_model;
       
        nVpanel = new NavViewPanel();
        add(nVpanel);
        hourSlider = new JSlider(JSlider.HORIZONTAL, 0,40,2);
        hourSlider.setMajorTickSpacing(10);
        hourSlider.setPaintLabels(true);
        hourSlider.setPaintTicks(true);
        hourQuestion = new JLabel("How many hours a week would you like to work?");
        add(hourQuestion);
        add(hourSlider);
        
        experienceLevel = new JTextField("Enter experience Level");
        add(experienceLevel);
        
        salaryRequest = new JTextField("Enter desired salary");
        add(salaryRequest);
        
        saveOptionsButton = new JButton("Save Options");
        add(saveOptionsButton);
        
        summaryLabel = new JLabel();
        add(summaryLabel);
                  
        nVpanel.removeSplash();
        nVpanel.removeMenu();
   }
   
    public void addSaveOptionsButtonListener(ActionListener al){
        getSaveOptionsButton().addActionListener(al);
    }
    
    public JButton getSaveOptionsButton() {
        return saveOptionsButton;
    }

    public JSlider getHourSlider() {
        return hourSlider;
    }

    public String getSalaryRequest() {
        return salaryRequest.getText();
    }

    public JLabel getSummaryLabel() {
        return summaryLabel;
    }
    
    public String getExperienceLevel(){
        return experienceLevel.getText();
    }
    
}
