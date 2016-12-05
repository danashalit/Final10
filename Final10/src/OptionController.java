
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DeeShalz
 */
public class OptionController {
    private OptionModel o_model;
    private OptionView o_view;
   
    OptionController(OptionModel o_model, OptionView o_view){
    this.o_model = o_model;
    this.o_view = o_view;
 
    class SaveOptionsButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            JButton eventSource = (JButton)e.getSource();
            if(eventSource == o_view.saveOptionsButton){
                o_model.setSalaryRequest(o_view.getSalaryRequest());
                o_model.setHour(o_view.getHourSlider().getValue());
                o_view.summaryLabel.setText("Salary: " + o_model.getSalaryRequest() 
                + " Hours: " + o_model.getHour());
                }
            }
        
    }
    o_view.addSaveOptionsButtonListener(new SaveOptionsButtonListener());
}
}
