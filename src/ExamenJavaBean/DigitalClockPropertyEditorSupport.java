/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenJavaBean;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author xZ3NER
 */
public class DigitalClockPropertyEditorSupport extends PropertyEditorSupport {
    
    DigitalClockProperties propertyEditor = new DigitalClockProperties();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return propertyEditor;
    }

    @Override
    public String getJavaInitializationString() {
        Clock clock = propertyEditor.getClock();
        return "new ExamenJavaBean.Clock("+clock.isShortFormat()+","+clock.isCustomAlert()+","+clock.getHours()+","+clock.getMin()+",\""+clock.getAlertText()+"\")";
    }

    @Override
    public Object getValue() {
        return propertyEditor.getClock();
    }
    
    
}
