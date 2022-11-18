/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenJavaBean;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author penga
 */
public class DigitalClock extends JLabel implements Serializable,ActionListener{
    
    //TODO More properties in our property editor pane, and a custom event handler.
    
    private Clock clock;
    private Timer timer;

private ClockEventListener clockEventListener;
    
    public DigitalClock() {

        initCustomFont();
        
         this.clock = new Clock(false,false,0,0,"");
         refreshClock();
        
        this.timer = new Timer(1000, this);
        timer.start();
    }
    
    private void initCustomFont() {
        
        try {
            InputStream inputStream= this.getClass().getResourceAsStream("ds-digi.ttf");
            
            Font digitalFont = Font.createFont(Font.TRUETYPE_FONT, inputStream);
            this.setFont(digitalFont.deriveFont(20f));
            
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(DigitalClock.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        repaint();
    }
    
    public Clock getClock() {
        return clock;
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }
    
    public void addClockEventListener(ClockEventListener clockEventListener) {
        this.clockEventListener = clockEventListener;
    }

    public void removeClockEventListener(ClockEventListener clockEventListener) {
        this.clockEventListener = null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (clock!=null) {
            refreshClock();
        }
        
        if (clock.isCustomAlert()) {
            if (clock.getCurrentTime().equals(clock.getAlertTime())) {
                clockEventListener.alarmEvent(new ClockEvent(this));
            }
        }
    }
    
    private void refreshClock() {
        this.setText(clock.getCurrentTime());
        repaint();
    }
}
