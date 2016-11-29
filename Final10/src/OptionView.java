
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
   JSlider hourSlider;
   JLabel hourQuestion;
   JTextField salaryRequest;
   NavViewPanel nVpanel;
   JButton optionButton;
   OptionView o_view;
   
   OptionView(OptionModel o_model){
        nVpanel = new NavViewPanel();
        add(nVpanel);
        hourSlider = new JSlider(JSlider.HORIZONTAL, 0,20,2);
        hourSlider.setMajorTickSpacing(10);
        hourSlider.setPaintLabels(true);
        hourSlider.setPaintTicks(true);
        hourQuestion = new JLabel("How many hours a week would you like to work?");
        add(hourQuestion);
        add(hourSlider);
       

        salaryRequest = new JTextField("Enter desired salary");
        add(salaryRequest);
        
   }
   
  
}
