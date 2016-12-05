/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author DeeShalz
 */
public class NavViewPanel extends JPanel {
    NavViewBottomMenuPanel menu;
    NavViewSplashPanel splash;
    
    InfoView i_view;
    CDView c_view;
    MainView m_view;
    InstructionsView in_view;
    CreditView cr_view;
    OptionView o_view;
    CDViewPanel cDpanel;
    public NavViewPanel() {
        super();
        setLayout(new BorderLayout());     
        menu = new NavViewBottomMenuPanel();
        splash = new NavViewSplashPanel();
        add(menu, BorderLayout.SOUTH);        
        add(splash, BorderLayout.CENTER);                        
    }
   
    
    
    public void addInfo(InfoView i_view)
    {
        this.i_view = i_view;
        add(i_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void addMain(MainView m_view)
    {
        this.m_view = m_view; 
        add(m_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }    
    public void addCDPanel(CDViewPanel cDpanel){
        this.cDpanel = cDpanel;
        add(this.cDpanel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    public void addCD(CDView c_view){
        this.c_view = c_view;
        add(c_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    public void addSplash(NavView n_view)
    {
        add(n_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void addInstructions(InstructionsView in_view){
        this.in_view = in_view;
        add(in_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void addCredit(CreditView cr_view){
        this.cr_view = cr_view;
        add(cr_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    public void addOption(OptionView o_view) {
        this.o_view = o_view;
        add(o_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    public void removeInfo()
    {
        if (this.i_view != null)
            remove(this.i_view);
    }
    public void removeMain()
    {
        if (this.m_view != null)
            remove(this.m_view);
    }    
    
    public void removeSplash()
    {
        remove(splash);
    }
    public void removeCD(){
       if(this.c_view != null)
        remove(this.c_view);
    }
    public void removeCDPanel(){
        if(this.cDpanel != null)
        remove(this.cDpanel);
    }
    public void removeMenu(){
        remove(menu);
    }
    public void removeOptions(){
        if(this.o_view != null)
            remove(this.o_view);
    }

    public void removeInstructions(){
        if(this.in_view != null)
            remove(this.in_view);
    }
 
    public void removeCredit(){
        if(this.cr_view != null)
            remove(this.cr_view);
    }


}