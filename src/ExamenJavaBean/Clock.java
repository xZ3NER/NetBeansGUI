/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenJavaBean;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author xZ3NER
 */
public class Clock implements Serializable {

    private DateTimeFormatter dateTimeFormatter;
    private LocalTime localTime;
    private LocalTime alertTime;

    private boolean shortFormat;
    private boolean customAlert;
    private String alertText;

    private int hours;
    private int min;

    public Clock(boolean shortFormat, boolean customAlert, int hours, int minutes, String alertText) {
        this.shortFormat = shortFormat;
        this.alertText = alertText;
        this.customAlert = customAlert;
        this.hours = hours;
        this.min = minutes;

        setShortFormat();
    }

    public String getCurrentTime() {
        localTime = LocalTime.now();

        return dateTimeFormatter.format(localTime);
    }

    public boolean isShortFormat() {
        return shortFormat;
    }

    public void setShortFormat() {

        if (this.shortFormat) {
            dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        } else {
            dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        }
    }

    public boolean isCustomAlert() {
        return customAlert;
    }

    public void setCustomAlert(boolean customAlert) {
        this.customAlert = customAlert;
    }

    public String getAlertTime() {
        alertTime = LocalTime.of(hours, min, 0);

        return dateTimeFormatter.format(alertTime);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String getAlertText() {
        return alertText;
    }

    public void setAlertText(String alertText) {
        this.alertText = alertText;
    }

    
}
