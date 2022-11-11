/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BeansPractica;

import java.util.EventListener;

/**
 *
 * @author penga
 */
public interface FinCuentaAtrasListener extends EventListener {
    public void capturarFinCuentaAtras (FinCuentaAtrasEvent ev);
}
