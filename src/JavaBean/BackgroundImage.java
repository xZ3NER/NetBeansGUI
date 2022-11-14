/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaBean;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author xZ3NER
 */
public class BackgroundImage implements Serializable {

    private File imagePath;
    private Float opacity;

    public BackgroundImage(File imagePath, Float opacity) {
        this.imagePath = imagePath;
        this.opacity = opacity;
    }

    public File getImagePath() {
        return imagePath;
    }

    public void setImagePath(File imagePath) {
        this.imagePath = imagePath;
    }

    public Float getOpacity() {
        return opacity;
    }

    public void setOpacity(Float opacity) {
        this.opacity = opacity;
    }

}
