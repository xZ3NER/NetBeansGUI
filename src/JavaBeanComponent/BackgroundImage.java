package JavaBeanComponent;

import java.io.File;
import java.io.Serializable;

/**
 *  Clase utilizada para almacenar las propiedades que cambiaremos de nuestro componente JPanelImage
 *  (También tendrá que implementar Serializable)
 * @author xZ3NER
 */
public class BackgroundImage implements Serializable {

    private File imagePath;
    private Float opacity;

    /*
    *   Priopiedades a modificar en forma de atributos, con sus Getter y Setter.
    */
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
