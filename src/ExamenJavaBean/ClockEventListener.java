/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ExamenJavaBean;

import java.util.EventListener;

/**
 *
 * @author penga
 */
public interface ClockEventListener extends EventListener{
        public void alarmEvent(ClockEvent evt);
}
