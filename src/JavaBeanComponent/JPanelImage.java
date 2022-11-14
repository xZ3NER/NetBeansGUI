package JavaBeanComponent;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Componente personalizado (tiene que implementar la interfaz Serializable)
 *
 * @author xZ3NER
 */
public class JPanelImage extends JPanel implements Serializable {

    /*
    *   Tendrá una propiedad que podremos modificar (bgImage), y le pasaremos los datos que requiere
    *   nuestra clase BackgroundImage (una imagen y una opacidad) utilizando sus atributos.
    *
    *   Para pasarle modificar más de un dato en una misma propiedad, tendremos que crear nuestra 
    *   propia vista para que el usuario modifique los 2 valores en una misma vista.
    *   Para ello, utilizaremos como vista 'ImagePropertiesPanel.java' (tiene que ser un form de Panel),
    *   y 'BgImagePropertyEditorSupport.java' (un PropertyEditorSupport), que se encargará de abrir
    *   nuestra vista personalizada para la elección de las propiedades y otras funciones.
     */
    private BackgroundImage bgImage;

    /*
    *   Un componente Bean, SIEMPRE tendrá un constructor SIN parámetros.
     */
    public JPanelImage() {

    }

    /*
    *   BackgroundImage Getter
     */
    public BackgroundImage getBgImage() {
        return bgImage;
    }

    /*
     *  BackgroundImage Setter (utilizado en el main, para inicializar el objeto con sus atributos)
     */
    public void setBgImage(BackgroundImage bgImage) {
        this.bgImage = bgImage;
    }

    /*
    *   Utilizado para poder pintar sobre un componente, como un Canvas.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        /*Control de errores*/
        if (bgImage != null) {
            if (bgImage.getImagePath() != null && bgImage.getImagePath().exists()) {
                /*g2d utilizado para la opacidad de la imagen.*/
                Graphics2D g2d = (Graphics2D) g;
                
                /*Obtendremos la imagen a partir del ImageIcon.*/
                ImageIcon imageIcon = new ImageIcon(bgImage.getImagePath().getAbsolutePath());

                /*Opacidad*/
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, bgImage.getOpacity()));

                /*Dibuja sobre nuestro componente (JPanel), la imagen cargada, en la posición 0,0 (x,y)*/
                g.drawImage(imageIcon.getImage(), 0, 0, null);

                /*Opacidad*/
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
            }
        }

    }

}
