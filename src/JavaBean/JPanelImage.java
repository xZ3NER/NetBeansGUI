/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaBean;

import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author xZ3NER
 */
public class JPanelImage extends JPanel implements Serializable {

    private BackgroundImage bgImage;

    public JPanelImage() {

    }

    public BackgroundImage getBgImage() {
        return bgImage;
    }

    public void setBgImage(BackgroundImage bgImage) {
        this.bgImage = bgImage;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (bgImage.getImagePath() != null && bgImage.getImagePath().exists()) {
            ImageIcon imageIcon = new ImageIcon(bgImage.getImagePath().getAbsolutePath());
            g.drawImage(imageIcon.getImage(), 0, 0, null);
        }

    }

}
