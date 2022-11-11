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
 * @author peng
 */

//Un bean, tiene q implementar Serializable, y si va a tener una acción, pues un ActionListener.
//
//Si queremos modificar una propiedad creada por nosotros con el panel de propiedades, se hace
//mediante su setter. (setTiempo() -> la propiedad será tiempo)
public class TemporizadorBean extends JLabel implements Serializable,ActionListener {
    
    //private PropertyChangeSupport propertySupport;
    public static final String PROP_TIEMPO = "tiempo";
    
    //Valor de la propiedad tiempo
    protected int timerTime;
    
    //Instancia de nuestro Listener
    private FinCuentaAtrasListener receptor;
    //Para ejecutar un listener cada cierto tiempo (1s)
    private final Timer timer;

    public TemporizadorBean() {
        //propertySupport = new PropertyChangeSupport(this);
        
        //Inicia el valor del tiempo en 5.
        timerTime = 5;
        //Ejecutará el método actionPerformed cada segundo.
        timer = new Timer(1000, this);
        
        //Deja en activo el timer.
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
     * PERMITIRÁ MODIFICARLO EN EL PANEL DE PROPIEDADES.
     *
     * @param tiempo new value of timerTime
     */
    public void setTiempo(int tiempo) {
        this.timerTime = tiempo;
        this.setText(Integer.toString(tiempo));
        //Actualiza la vista de la interfaz gráfica
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
     * ACTIVA O DESACTIVA NUESTRO TIMER, SE PUEDE ACCEDER DESDE LAS PROPIEDADES
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
    
    //Método para asignar un listener a nuestro componente 
    //(es lo mismo que el .addActionListener() pero con un listener personalizado)
    //En los parámetros le pasaremos una interfaz con el método del receptor sobreescrito.
    public void addFinCuentaAtrasListener(FinCuentaAtrasListener receptor) {
        this.receptor = receptor;
    }
    
    public void removeFinCuentaAtrasListener(FinCuentaAtrasListener receptor){
        this.receptor = null;
    }

    //Se ejecutará cada segundo (por el timer que definimos)
    @Override
    public void actionPerformed(ActionEvent e) {
        this.setText(Integer.toString(timerTime));
        this.repaint();
        timerTime--;
        
        if (timerTime==0) {
            this.setText(Integer.toString(timerTime));
            this.repaint();
            
            setActivo(false);
            
            //Ejecuta el contenido del método que definimos al añadirle el .addFinCuentaAtrasListener()
            //Le pasamos el componente actual como parámetro a nuestro Evento
            receptor.capturarFinCuentaAtras(new FinCuentaAtrasEvent(this));
        }
    }
}
