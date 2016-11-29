
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
 * @author ceciliaknaub
 */
public class InfoView extends JPanel {
    JTextField fName;
    JTextField lName;
    JSlider ageSlider;
    JButton saveButton;
    JLabel EnterAge;

    InfoModel i_model;
    
    InfoView(InfoModel i_model){
        this.i_model = i_model;
        
        fName = new JTextField("Enter First Name");
        lName = new JTextField("Enter Last Name");
        ageSlider = new JSlider(JSlider.HORIZONTAL, 20,60,40);
        ageSlider.setMajorTickSpacing(5);
        ageSlider.setPaintLabels(true);
        ageSlider.setPaintTicks(true);
        EnterAge = new JLabel("Enter Age: ");

  
        add(fName);
        add(lName);
        add(EnterAge);
        add(ageSlider);
    }

}

