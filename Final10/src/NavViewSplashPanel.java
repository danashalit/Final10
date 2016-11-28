/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author DeeShalz
 */
public class NavViewSplashPanel extends JPanel {
    JButton splashButton;
    JLabel InfoLabel;
    NavViewSplashPanel()
    {
            splashButton = new JButton("Hello there");            
            add(splashButton);
            
            InfoLabel = new JLabel("No options selected yet.");
            add(InfoLabel);
    }   
}
