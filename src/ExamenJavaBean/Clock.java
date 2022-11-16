/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenJavaBean;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author xZ3NER
 */
public class Clock implements Serializable {

    private DateTimeFormatter dateTimeFormatter;
    private LocalDateTime localDateTime;

    private boolean longFormat;
    private boolean customWarning;

    private String currentTime;

    public Clock(boolean longFormat) {
        if (longFormat) {
            dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        } else {
            dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        }
    }

    public String getCurrentTime() {
        localDateTime = LocalDateTime.now();
        currentTime = dateTimeFormatter.format(localDateTime);

        return currentTime;
    }

    public boolean isLongFormat() {
        return longFormat;
    }

    public void setLongFormat(boolean longFormat) {
        if (longFormat) {
            dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        } else {
            dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        }
        this.longFormat = longFormat;
    }

    public boolean isCustomWarning() {
        return customWarning;
    }

    public void setCustomWarning(boolean customWarning) {
        this.customWarning = customWarning;
    }
}
