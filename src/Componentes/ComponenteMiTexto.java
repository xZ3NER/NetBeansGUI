/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package Componentes;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author penga
 */
public class ComponenteMiTexto extends JTextField implements Serializable {
    
    
    public ComponenteMiTexto() {
    }
    
    
        private Color color;

    /**
     * Get the value of color
     *
     * @return the value of color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Set the value of color
     *
     * @param color new value of color
     */
    public void setColor(Color color) {
        this.color = color;
    }

        private int ancho;

    /**
     * Get the value of ancho
     *
     * @return the value of ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * Set the value of ancho
     *
     * @param ancho new value of ancho
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

        private Font fuente;

    /**
     * Get the value of fuente
     *
     * @return the value of fuente
     */
    public Font getFuente() {
        return fuente;
    }

    /**
     * Set the value of fuente
     *
     * @param fuente new value of fuente
     */
    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }

}
