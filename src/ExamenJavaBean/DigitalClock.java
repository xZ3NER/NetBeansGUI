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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author penga
 */
public class DigitalClock extends JLabel implements Serializable,ActionListener{
    
    private boolean longFormat;
    private boolean customWarning;
    
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private LocalDateTime localDateTime;
    
    private int clockHour;
    private int clockMinute;
    private int clockSeconds;
    
    private Timer timer;

    public DigitalClock() {

        initCustomFont();
        refreshClock();
        
        this.timer = new Timer(1000, this);
        timer.start();
    }
    
    private void initCustomFont() {
        
        try {
            InputStream inputStream= this.getClass().getResourceAsStream("ds-digi.ttf");
            
            Font digitalFont = Font.createFont(Font.TRUETYPE_FONT, inputStream);
            this.setFont(new Font("ds-digi.ttf",Font.PLAIN,15));
            
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(DigitalClock.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        repaint();
    }
    
    private void refreshClock() {
        localDateTime = LocalDateTime.now();
       this.setText(dateTimeFormatter.format(localDateTime));
        repaint();
    }

    public boolean isLongFormat() {
        return longFormat;
    }

    public void setLongFormat(boolean longFormat) {
        this.longFormat = longFormat;
    }

    public boolean isCustomWarning() {
        return customWarning;
    }

    public void setCustomWarning(boolean customWarning) {
        this.customWarning = customWarning;
    }

    public int getClockHour() {
        return clockHour;
    }

    public void setClockHour(int clockHour) {
        this.clockHour = clockHour;
    }

    public int getClockMinute() {
        return clockMinute;
    }

    public void setClockMinute(int clockMinute) {
        this.clockMinute = clockMinute;
    }

    public int getClockSeconds() {
        return clockSeconds;
    }

    public void setClockSeconds(int clockSeconds) {
        this.clockSeconds = clockSeconds;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        refreshClock();
    }
    
    
}
