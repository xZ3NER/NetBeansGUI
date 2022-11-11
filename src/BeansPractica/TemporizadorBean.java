/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package BeansPractica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author penga
 */
public class TemporizadorBean extends JLabel implements Serializable,ActionListener {
    
    //private PropertyChangeSupport propertySupport;
    public static final String PROP_TIEMPO = "tiempo";
    protected int timerTime;
    
    private FinCuentaAtrasListener receptor;
    private final Timer timer;

    public TemporizadorBean() {
        //propertySupport = new PropertyChangeSupport(this);
        
        timerTime = 5;
        timer = new Timer(1000, this);
        
        setActivo(true);
    }

    /**
     * Get the value of timerTime
     *
     * @return the value of timerTime
     */
    public int getTiempo() {
        return timerTime;
    }

    /**
     * Set the value of timerTime
     *
     * @param tiempo new value of timerTime
     */
    public void setTiempo(int tiempo) {
        this.timerTime = tiempo;
        this.setText(Integer.toString(tiempo));
        repaint();
    }

    /**
     * Get the value of activo
     *
     * @return the value of activo
     */
    public boolean getActivo() {
        return timer.isRunning();
    }

    /**
     * Set the value of activo
     *
     * @param activo new value of activo
     */
    public void setActivo(boolean activo) {
        if(activo == true) {
            timer.start();
        }else{
            timer.stop();
        }
    }
    
    public void addFinCuentaAtrasListener(FinCuentaAtrasListener receptor) {
        this.receptor = receptor;
    }
    
    public void removeFinCuentaAtrasListener(FinCuentaAtrasListener receptor){
        this.receptor = null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setText(Integer.toString(timerTime));
        this.repaint();
        timerTime--;
        
        if (timerTime==0) {
            this.setText(Integer.toString(timerTime));
            this.repaint();
            
            setActivo(false);
            receptor.capturarFinCuentaAtras(new FinCuentaAtrasEvent(this));
        }
    }
}
