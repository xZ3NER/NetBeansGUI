/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaBeanComponent;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *  Utilizado para poder utilizar un panel personalizado (ImagePropertiesPanel) para la recogida de 
 * datos de los propiedades, y tiene que heredar de PropertyEditorSupport.
 * @author penga
 */
public class BgImagePropertyEditorSupport extends PropertyEditorSupport{
    
    /*Instancia que utilizaremos para acceder al Getter del objeto con las propiedades que creamos*/
    private ImagePropertiesPanel imagePanel = new ImagePropertiesPanel();

    /*
    *   Los siguientes métodos no se utilizarán para llamarlos, sino que serán llamados automáticamente
    *   y solo tendremos que modificar el valor de sus 'return'
    */
    
    /*
    *   Para indicar que utilizaremos un editor personalizado -> devolveremos true;
    */
    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    /*
    *   Para devolver el editor personalizado que estamos utilizando -> imagePanel;
    */
    @Override
    public Component getCustomEditor() {
        return imagePanel; 
    }
    
    /*
    *   Utilizado a la hora de inicializar el método setter de nuestra propiedad
    *   (En Main -> .setBgImage("Esto es lo que le debemos de pasar aquí"))
    */
    @Override
    public String getJavaInitializationString() {
        /*Instancia de nuestro objeto ya con las propiedades cargadas*/
        BackgroundImage backgroundImage = imagePanel.getBackgroundImage();
        
        /*
        *   Para controlar el fallo que daba con la ruta.
        */
        String path = backgroundImage.getImagePath().getAbsolutePath();
        path = path.replace('\\','/');
        
        /*
        *   Lo devolveremos como String, pero luego el programa lo escribirá sin las comillas de String
        *   (Tendremos que poner también el nombre del paquete para poder usar la clase)
        */
        return "new JavaBeanComponent.BackgroundImage("+"new java.io.File(\""+path+"\"), "+backgroundImage.getOpacity()+"f)"; 
    }

    /*
    *   Para devolver el valor de la propiedad (en este caso varias propiedades, contenidos en un objeto)
    *   (utilizaremos nuestro getter personalizado que hemos creado)
    */
    @Override
    public Object getValue() {
        
        return imagePanel.getBackgroundImage(); 
    }
    
}
