/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BeansPractica;

import java.util.EventObject;

/**
 *
 * @author peng
 */

//Un objeto de evento que utilizará nuestro Listener
public class FinCuentaAtrasEvent extends EventObject{
    
    public FinCuentaAtrasEvent(Object source) {
        super(source);
    }
    
}
